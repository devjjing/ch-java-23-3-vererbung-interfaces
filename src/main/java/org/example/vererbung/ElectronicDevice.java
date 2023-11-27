package org.example.vererbung;
public class ElectronicDevice {
    private int priceInCent;
    private int energyConsumptionInWatt;
    private String name;

    public int getEnergyConsumptionInWatt() {
        return energyConsumptionInWatt;
    }

    public int getPriceInCent() {
        return priceInCent;
    }

    public String getName() {
        return name;
    }

    public void setPriceInCent(int priceInCent) {
        this.priceInCent = priceInCent;
    }

    public void setEnergyConsumptionInWatt(int energyConsumptionInWatt) {
        this.energyConsumptionInWatt = energyConsumptionInWatt;
    }

    public void setName(String name) {
        this.name = name;
    }
}


