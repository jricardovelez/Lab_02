package com.example.aerolineadrools.model;

public class Seat {
    private int code;
    private String type;
    private boolean available;

    public Seat() {
    }

    public Seat(int code, String type, boolean available) {
        this.code = code;
        this.type = type;
        this.available = available;
    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

}
