package com.caren.cuentaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.caren.cuantaBancaria.Cuenta;
import com.caren.cuantaBancaria.Cuenta.tipoCuenta;

public class cuentaTest {

    @Test
    void testAtributes() {
        Cuenta cuenta = new Cuenta("Caren", "Salles", 21458224, tipoCuenta.AHORROS);
        cuenta.setName("Cristina");
        assertEquals("Cristina", cuenta.getName());
    }

    @Test
    void test_consultar_saldo() {
        Cuenta cuentacaren = new Cuenta(100);
        assertEquals(100, cuentaCaren.consultarSaldo());
    }

}
