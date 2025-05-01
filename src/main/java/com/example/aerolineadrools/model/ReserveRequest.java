package com.example.aerolineadrools.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ReserveRequest {
    @NotNull(message = "El pasajero es obligatorio")
    @Valid
    private Passenger passenger;

    @NotBlank(message = "El status es obligatorio")
    private String status;

    @NotBlank(message = "La clase del vuelo es obligatoria")
    private String classFlight;

    @NotNull(message = "La duración del vuelo es obligatoria")
    private int flightDelay;

    @NotNull(message = "Ingrese el peso de su equipaje")
    private int weightlubbage;

    @NotNull(message = "La duración del vuelo es obligatoria")
    private int flightDuration;

    @NotBlank(message = "Es obligatorio espeficicar si se viaja con niños")
    private String children;

    public ReserveRequest(){}

    public ReserveRequest(Passenger passenger, String status, String classFlight, int flightDelay, int weightlubbage, int flightDuration, String children) {
        this.passenger = passenger;
        this.status = status;
        this.classFlight = classFlight;
        this.flightDelay = flightDelay;
        this.weightlubbage = weightlubbage;
        this.flightDuration = flightDuration;
        this.children = children;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getStatus() {
        return status;
    }

    public String getClassFlight() {
        return classFlight;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setClassFlight(String classFlight) {
        this.classFlight = classFlight;
    }

    public int getFlightDelay() {
        return flightDelay;
    }

    public void setFlightDelay(int flightDelay) {
        this.flightDelay = flightDelay;
    }

    public int getWeightlubbage() {
        return weightlubbage;
    }

    public void setWeightlubbage(int weightlubbage) {
        this.weightlubbage = weightlubbage;
    }
    public int getFlightDuration() {
        return flightDuration;
    }
    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }
    public String getChildren() {
        return children;
    }
    public void setChildren(String children) {
        this.children = children;
    }
}
