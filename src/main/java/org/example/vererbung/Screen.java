package org.example.vererbung;
public class Screen extends ElectronicDevice{

    int resolutionX;
    int resolutionY;
    int inch;

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public int getInch() {
        return inch;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }
}