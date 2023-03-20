package com.caren.claseCar;

public class Car {

    private String marca;
    private int modelo;
    private double volumeEnLitros;
    private int puertas;
    private int asientos;
    private double velocidadMaxEnKmPorHora;
    private double velocidadActual = 0;

    public enum tipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODISIEL, GASNATURAL;
    }

    public enum tipoAutomovil {
        CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV;
    }

    public enum tipoColor {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA;
    }

    private tipoCombustible combustible;
    private tipoAutomovil automovil;

    private tipoColor color;

    public Car(String marca, int modelo, double volumeEnLitros, int puertas, int asientos,
            double velocidadMaxEnKmPorHora, double velocidadActual, tipoAutomovil automovil,
            tipoCombustible combustible, tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.volumeEnLitros = volumeEnLitros;
        this.puertas = puertas;
        this.asientos = asientos;
        this.velocidadMaxEnKmPorHora = velocidadMaxEnKmPorHora;
        this.velocidadActual = velocidadActual;
        this.automovil = automovil;
        this.combustible = combustible;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getVolumeEnLitros() {
        return volumeEnLitros;
    }

    public void setVolumeEnLitros(double volumeEnLitros) {
        this.volumeEnLitros = volumeEnLitros;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public double getVelocidadMaxEnKmPorHora() {
        return velocidadMaxEnKmPorHora;
    }

    public void setVelocidadMaxEnKmPorHora(double velocidadMaxEnKmPorHora) {
        this.velocidadMaxEnKmPorHora = velocidadMaxEnKmPorHora;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public tipoAutomovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(tipoAutomovil automovil) {
        this.automovil = automovil;
    }

    public tipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(tipoCombustible combustible) {
        this.combustible = combustible;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public void render() {
        System.out.println(this.getMarca());
        System.out.println(this.getModelo());
        System.out.println(this.getVolumeEnLitros());
        System.out.println(this.getPuertas());
        System.out.println(this.getAsientos());
        System.out.println(this.getVelocidadMaxEnKmPorHora());
        System.out.println(this.getVelocidadActual());
        System.out.println(this.getAutomovil());
        System.out.println(this.getColor());
        System.out.println(this.getClass());

    }

}
