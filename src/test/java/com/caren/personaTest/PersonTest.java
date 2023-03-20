package com.caren.personaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.caren.clasePersona.Person;

public class PersonTest {

    @Test
    void testRender() {
        Person caren = new Person("Caren", "Salles", "1316494646Z", 1984, "Brasil", 'M');
        String result = caren.render(); // <El metodo redender() devolve el string que yo queira.
        assertEquals("Name: Caren, Surname: Salles, id Number: 1316494646Z, Born Year: 1984, Country:Brasil, Genre: M",
                result);
    }

    // Los atributos privados para seren testeados necesitan de un getter o un
    // setter.
    // Ya los publicos poden ser testeados sin los getters o setters.

    @Test
    void testAtributes() {
        Person caren = new Person("Caren", "Salles", "1316494646Z", 1984, "Brasil", 'M');
        caren.setName("Cristina");
        assertEquals("Cristina", caren.getName());
    }

}

// Para hacer testes unitários debemos eliminar las dependecias externas pq si
// no seria testes de integración.