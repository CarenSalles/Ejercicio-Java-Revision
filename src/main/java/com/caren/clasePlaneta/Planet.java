package com.caren.clasePlaneta;

public class Planet {

    private String name = null;
    private int salelite = 0;
    private double gross = 0;
    private double volume = 0;
    private int diameter = 0;
    private int distance = 0;
    private boolean size = false;

    public Planet(String name, int salelite, double gross, double volume, int diameter, int distance, boolean size) {
        this.name = name;
        this.salelite = salelite;
        this.gross = gross;
        this.volume = volume;
        this.diameter = diameter;
        this.distance = distance;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalelite() {
        return salelite;
    }

    public void setSalelite(int salelite) {
        this.salelite = salelite;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isSize() {
        return size;
    }

    public void setSize(boolean size) {
        this.size = size;
    }

    public void render() {
        System.out.println(this.getName());
        System.out.println(this.getSalelite());
        System.out.println(this.getGross());
        System.out.println(this.getVolume());
        System.out.println(this.getDiameter());
        System.out.println(this.getDistance());

        // public boolean es_exterior((distaciaalsol)) {
        // if distaciaalsol > 1447777 {
        // return true;

        // }
        // else
        // return false;
    }

}
