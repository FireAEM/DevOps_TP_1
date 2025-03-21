package com.example.devops_tp1;

public class Car {
    private String plateNumber;
    private String brand;
    private int price;
    private boolean rented;
    private String rentBegin;
    private String rentEnd;

    public Car() { }

    public Car(String plateNumber, String brand, int price) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.price = price;
        this.rented = false;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public String getRentBegin() {
        return rentBegin;
    }

    public void setRentBegin(String rentBegin) {
        this.rentBegin = rentBegin;
    }

    public String getRentEnd() {
        return rentEnd;
    }

    public void setRentEnd(String rentEnd) {
        this.rentEnd = rentEnd;
    }
}
