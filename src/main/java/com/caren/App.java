package com.caren;

import com.caren.clasePersona.Person;

public class App {

    public static void main(String[] args) {
        Person caren = new Person("Caren", "Salles", "1316494646Z", 1984, "Brasil", 'M');
        Person valentina = new Person("Valentina", "Salles", "416484464Z", 2017, "Brasil", 'M');
        Person gabriela = new Person("Valentin", "Fernadez", "4545487871Z", 1976, "Argentina", 'M');

        System.out.println(caren.render());
        System.out.println(valentina.render());
        System.out.println(gabriela.render());
    }

}
