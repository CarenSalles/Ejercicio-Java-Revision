package com.caren.figuras;

public class Circulo {

    private double radioEnCm;

    public Circulo(double radioEnCm) {
        this.radioEnCm = radioEnCm;
    }

    public double getRadioEnCm() {
        return radioEnCm;
    }

    public void setRadioEnCm(double radioEnCm) {
        this.radioEnCm = radioEnCm;
    }

    public void render() {
        System.out.println(this.getRadioEnCm());
    }

    public double areaCirculo() {
        return Math.PI * radioEnCm * radioEnCm; // Como calcular la Area del circulo= Pi x rdio x radio

    }

    public double perimetroCirculo(double radioEnCm) {
        return 2 * Math.PI * radioEnCm; // como calcular el Perimetro del circulo.
    }
}
