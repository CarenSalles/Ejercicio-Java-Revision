package com.caren.figurasTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.caren.figuras.Rectangulo;

public class RectanguloTest {

    @Test
    void test_rectangulo_tiene_base_y_altura() {
        Rectangulo rectangulo = new Rectangulo(8, 3.18);
        assertEquals(8, rectangulo.getBaseEnCm());
        assertEquals(3.18, rectangulo.getAlturaEnCm());

    }

    @Test
    void testAtributes() {
        Rectangulo rectangulo = new Rectangulo(8, 3.18);
        rectangulo.setBaseEnCm(5.35);
        assertEquals(5.35, rectangulo.getBaseEnCm());
        rectangulo.setAlturaEnCm(4.38);
        assertEquals(4.38, rectangulo.getAlturaEnCm());

    }

}
