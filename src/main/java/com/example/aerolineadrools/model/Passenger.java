package com.example.aerolineadrools.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Passenger {
    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(min = 2,max = 100, message = "El nombre debe tener entre 2 y 100 caracteres")
    private String name;

    @NotNull(message = "La edad es obligatoria")
    private int age;

    @NotBlank(message = "La preferencia es obligatoria")
    private String preferences;
    public Passenger() {}

    public Passenger(String name, int age, String preferences) {
        this.name = name;
        this.age = age;
        this.preferences = preferences;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPreferences() {
        return preferences;
    }
    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }
}
