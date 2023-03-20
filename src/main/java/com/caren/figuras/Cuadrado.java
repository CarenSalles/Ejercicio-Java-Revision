package com.caren.figuras;

public class Cuadrado {

    private double longitudEnCm;

    public Cuadrado(double longitudEnCm) {
        this.longitudEnCm = longitudEnCm;
    }

    public double getLongitudEnCm() {
        return longitudEnCm;
    }

    public void setLongitudEnCm(double longitudEnCm) {
        this.longitudEnCm = longitudEnCm;
    }

    public void render() {
        System.out.println(this.getLongitudEnCm());
    }

    public double areaCuadrado(double longitudEnCm) {
        return longitudEnCm * longitudEnCm;
    }

    public double perimetroCuadrado(double longitudEnCm) {
        return 2 * longitudEnCm;
    }

}
