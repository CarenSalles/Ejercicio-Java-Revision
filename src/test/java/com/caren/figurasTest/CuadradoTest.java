package com.caren.figurasTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.caren.figuras.Cuadrado;

public class CuadradoTest {
    // Como los atributos da clase cuadrado es privado, para seren testeados
    // necesitan de getter y setter.
    @Test
    void test_cuadrado_tiene_longitud() {
        Cuadrado cuadrado = new Cuadrado(5);
        assertEquals(5, cuadrado.getLongitudEnCm());

    }

    @Test
    void testAtributes() {
        Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.setLongitudEnCm(8);
        assertEquals(8, cuadrado.getLongitudEnCm());

    }

}
