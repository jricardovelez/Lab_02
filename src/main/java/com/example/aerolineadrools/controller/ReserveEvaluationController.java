package com.example.aerolineadrools.controller;

import com.example.aerolineadrools.model.Passenger;
import com.example.aerolineadrools.model.ReserveRequest;
import com.example.aerolineadrools.model.ReserveResponse;
import com.example.aerolineadrools.service.ReserveEvaluationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reserve")
public class ReserveEvaluationController {

    @Autowired
    private ReserveEvaluationService reserveEvaluationService;

    @PostMapping("/api/evaluate")
    @ResponseBody
    public ReserveResponse evaluateReserveApi(@Valid @RequestBody ReserveRequest request, BindingResult result) {
        if (result.hasErrors()) {
            String errorMessage = result.getAllErrors().stream()
                    .map(error -> error.getDefaultMessage())
                    .reduce((msg1, msg2) -> msg1 + "; " + msg2)
                    .orElse("Errores de validación");
            return new ReserveResponse("Error de validación: " + errorMessage, false, false, false, false, false, 0, false, false, "");
        }
        return reserveEvaluationService.reserve(request);
    }

    @GetMapping("/form")
    public String showReserveForm(Model model) {
        ReserveRequest reserveRequest = new ReserveRequest();
        reserveRequest.setPassenger(new Passenger());
        model.addAttribute("reserveRequest", reserveRequest);
        return "reserve_form";
    }

    @PostMapping("/evaluate")
    public String evaluateReserveWeb(@Valid ReserveRequest reserveRequest, BindingResult result, Model model) {
        if (result.hasErrors()) {
            // Si hay errores de validación, volver al formulario con los errores
            return "reserve_form";
        }
        ReserveResponse response = reserveEvaluationService.reserve(reserveRequest);
        model.addAttribute("reserveResponse", response);
        return "reserve_result";
    }
}
