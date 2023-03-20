package com.caren.figurasTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.caren.figuras.Circulo;

public class CirculoTest {

    @Test
    void test_circulo_tiene_radio() {
        Circulo circulo = new Circulo(1.2489);
        assertEquals(1.2489, circulo.getRadioEnCm());

    }

    @Test
    void testAtributes() {
        Circulo circulo = new Circulo(2.618);
        circulo.setRadioEnCm(6);
        assertEquals(6, circulo.getRadioEnCm());

    }

    @Test
    void testAreaCirculo() {
        Circulo circulo = new Circulo(1);
        assertEquals(Math.PI, circulo.areaCirculo());

    }

    @Test
    void testPerimetroCirculo() {
        Circulo circulo = new Circulo(1);
        assertEquals(2 * Math.PI, circulo.perimetroCirculo());

    }

}
