package com.caren.figuras;

public class Triangulo {

    private double baseEnCm;
    private double alturaEnCm;
    private double hipotenusaEnCm;

    public Triangulo(double baseEnCm, double alturaEnCm, double hipotenusaEnCm) {
        this.baseEnCm = baseEnCm;
        this.alturaEnCm = alturaEnCm;
        this.hipotenusaEnCm = hipotenusaEnCm;
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

    public double getHipotenusaEnCm() {
        return hipotenusaEnCm;
    }

    public void setHipotenusaEnCm(double hipotenusaEnCm) {
        this.hipotenusaEnCm = hipotenusaEnCm;
    }

    public void render() {
        System.out.println(this.getAlturaEnCm());
        System.out.println(this.getBaseEnCm());
        System.out.println(this.getHipotenusaEnCm());

    }

    public double areaTriangulo(double baseEnCm, double alturaEnCm) {
        return (baseEnCm * alturaEnCm) / 2;
    }

    public double perimetroTriangulo(double baseEnCm) { // Perímetro calculado para un triángulo equilátero
        return 3 * baseEnCm;
    }

    public double calculoHipotenusa(double baseEnCm, double alturaEnCm, double hipotenusaEnCm) {
        return Math.sqrt((baseEnCm * baseEnCm) + (alturaEnCm * alturaEnCm));
    }

    public void determinarTipoTriangulo() {
        if ((baseEnCm == alturaEnCm) && (baseEnCm == hipotenusaEnCm) && (alturaEnCm == hipotenusaEnCm))
            System.out.println("Es un triángulo equilátero");

        else if ((baseEnCm != alturaEnCm) && (baseEnCm != hipotenusaEnCm) && (alturaEnCm != hipotenusaEnCm))
            System.out.println("Es un triángulo escaleno");

        else
            System.out.println("Es un triangulo isósceles");
    }
}
