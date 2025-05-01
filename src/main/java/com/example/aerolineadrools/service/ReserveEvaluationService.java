package com.example.aerolineadrools.service;

import com.example.aerolineadrools.model.ReserveRequest;
import com.example.aerolineadrools.model.ReserveResponse;
import com.example.aerolineadrools.model.Seat;
import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReserveEvaluationService {

    @Autowired
    private KieContainer kieContainer;

    public ReserveResponse reserve(ReserveRequest reserveRequest) {
        // Crear una respuesta inicial
        ReserveResponse reserveResponse = new ReserveResponse();

        // Crear una sesión de Drools
        var kieSession = kieContainer.newKieSession();

        try {
            // Insertar los hechos (request y response) en la sesión
            kieSession.insert(new Seat(1, "Emergencia", true));
            kieSession.insert(new Seat(2, "Normal", true));
            kieSession.insert(new Seat(3, "Familiar", true));
            kieSession.insert(new Seat(4, "Emergencia", false));
            kieSession.insert(new Seat(5, "Normal", true));

            kieSession.insert(reserveRequest);
            kieSession.insert(reserveResponse);

            // Ejecutar todas las reglas
            kieSession.fireAllRules();
        } finally {
            // Liberar la sesión
            kieSession.dispose();
        }

        return reserveResponse;
    }
}
