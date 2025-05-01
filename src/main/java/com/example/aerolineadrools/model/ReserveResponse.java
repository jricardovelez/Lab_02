package com.example.aerolineadrools.model;

public class ReserveResponse {
    private String message;
    private boolean upgrade;
    private boolean priority;
    private boolean discount;
    private boolean passengerEligible;
    private boolean compensation;
    private int loyaltyPoints;
    private boolean luggageAllowed;
    private boolean vipAccess;
    private String seatType;

    public ReserveResponse() {
    }

    public ReserveResponse(String message, boolean upgrade, boolean priority, boolean discount, boolean passengerEligible, boolean compensation, int loyaltyPoints, boolean luggageAllowed, boolean vipAccess, String seatType) {
        this.message = message;
        this.upgrade = upgrade;
        this.priority = priority;
        this.discount = discount;
        this.passengerEligible = passengerEligible;
        this.compensation = compensation;
        this.loyaltyPoints = loyaltyPoints;
        this.luggageAllowed = luggageAllowed;
        this.vipAccess = vipAccess;
        this.seatType = seatType;
    }

    public String getMessage() {
        return message;
    }

    public boolean isUpgrade() {
        return upgrade;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUpgrade(boolean upgrade) {
        this.upgrade = upgrade;
    }

    public boolean isPriority() {
        return priority;
    }
    public void setPriority(boolean priority) {
        this.priority = priority;
    }
    public boolean isDiscount() {
        return discount;
    }
    public void setDiscount(boolean discount) {
        this.discount = discount;
    }
    public boolean isPassengerEligible() {
        return passengerEligible;
    }
    public void setPassengerEligible(boolean passengerEligible) {
        this.passengerEligible = passengerEligible;
    }
    public boolean getCompensation() {
        return compensation;
    }
    public void setCompensation(boolean compensation) {
        this.compensation = compensation;
    }
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }
    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }
    public boolean isLuggageAllowed() {
        return luggageAllowed;
    }
    public void setLuggageAllowed(boolean luggageAllowed) {
        this.luggageAllowed = luggageAllowed;
    }

    public boolean isVipAccess() {
        return vipAccess;
    }
    public void setVipAccess(boolean vipAccess) {
        this.vipAccess = vipAccess;
    }
    public String getSeatType() {
        return seatType;
    }
    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
}

