package com.caren.clasePersona;

// Crear la clase persona.
// Crear los atributos de la clase persona.
// Crear el constructor.
//Crear los getters y setters
//Crear el metodo main

public class Person { // Crear la clase persona.

    // Crear los atributos de la clase persona. La mayoria de las veces los
    // atributos son privados.
    private String name;
    private String surname;
    private String idNumber;
    private int bornYear;
    private String country;
    private char genre;

    public Person(String name, String surname, String idNumber, int bornYear, String country, char genre) { // Crear el
                                                                                                            // constructor.

        this.name = name;
        this.surname = surname;
        this.idNumber = idNumber;
        this.bornYear = bornYear;
        this.country = country;
        this.genre = genre;

    }

    // Crear los getters y setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public int getBornyear() {
        return bornYear;
    }

    public void setBornyear(int bornYear) {
        this.bornYear = bornYear;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public char getGenre() {
        return genre;
    }

    public void setGenre(char genre) {
        this.genre = genre;
    }

    public String render() {

        // Crear un método main , viene abajo del constructor y abajo de getters y
        // setters. Método main es estático que nos permite correr la aplicación.
        // También puede crealo en App.java

        // Crear método para imprimir en pantalla todos los atributos
        // Desta manera imprimimos cada atributo por su getter.

        // public static void main(String[] args) {
        // Person caren = new Person("Caren", "Salles", "1316494646Z", 1984);
        // Person valentina = new Person("Valentina", "Salles", "416484464Z", 2017);

        // caren.render();
        // valentina.render();
        // }

        // Desta manera renderizamos y creamos un método en una linea que imprima en
        // pantalla todos los atributos de la clase
        // Creamos una cadena con la salida usnado el método "String.format"

        String out = String.format("Name: %s, Surname: %s, id Number: %s, Born Year: %d, Country: %s, Genre:%c", name,
                surname, idNumber, bornYear, country, genre);
        // System.out.println(out);
        return out;
    }

}

// Toda clase tiene cuatro partes, pero ni siempre están configuradas.
// la parte de los atributos
// La parte del constructor.
// La parte de los getters y setters.
// Por ultimo tine las acciones que son los métodos , neste caso el metodo
// Main() y el metodo render().
