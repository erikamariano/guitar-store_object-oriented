package com.erika.guitarstore.git;

public class Guitar {
    private String serialNumber;   
    private double price;
    private GuitarSpec spec;

    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec; //contract
        
    } 

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(float newPrice){
        this.price = newPrice;
    }

    public GuitarSpec getSpec() {
        return spec;
    }

    @Override
    public String toString() {
        return "Guitar{" + "serialNumber=" + serialNumber + ", price=" + price + ", spec=" + spec + '}';
    }
}
