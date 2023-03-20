package com.caren.figurasTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.caren.figuras.Triangulo;

public class TrianguloTest {

    @Test
    void test_triangulo_tiene_base_y_altura_y_hipotenusa() {
        Triangulo triangulo = new Triangulo(3, 1, 5);
        assertEquals(3, triangulo.getBaseEnCm());
        assertEquals(1, triangulo.getAlturaEnCm());
        assertEquals(5, triangulo.getHipotenusaEnCm());
    }

    @Test
    void testAtributes() {
        Triangulo triangulo = new Triangulo(2.458, 3.157, 5);
        triangulo.setAlturaEnCm(5);
        assertEquals(5, triangulo.getAlturaEnCm());
        triangulo.setBaseEnCm(1.547);
        assertEquals(1.547, triangulo.getBaseEnCm());
        triangulo.setHipotenusaEnCm(9.4);
        assertEquals(9.4, triangulo.getHipotenusaEnCm());

    }

}
