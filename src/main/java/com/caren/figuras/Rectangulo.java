package com.caren.figuras;

public class Rectangulo {

    private double baseEnCm;
    private double alturaEnCm;

    public Rectangulo(double baseEnCm, double alturaEnCm) {
        this.baseEnCm = baseEnCm;
        this.alturaEnCm = alturaEnCm;
    }

    public double getBaseEnCm() {
        return baseEnCm;
    }

    public void setBaseEnCm(double baseEnCm) {
        this.baseEnCm = baseEnCm;
    }

    public double getAlturaEnCm() {
        return alturaEnCm;
    }

    public void setAlturaEnCm(double alturaEnCm) {
        this.alturaEnCm = alturaEnCm;
    }

    public void render() {

        System.out.println(this.getAlturaEnCm());
        System.out.println(this.getBaseEnCm());

    }

    public double areaRectangulo(double baseEnCm, double alturaEnCm) {

        return baseEnCm * alturaEnCm; // Area= b x h
    }

    public double perimetroRectangulo(double baseEnCm, double alturaEnCm) {
        return (2 * baseEnCm) + (2 * alturaEnCm);
    }

}