package br.com.pablo.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void deveSomarNumerosPositivos() {
        assertEquals(8, calculadora.somar(5, 3));
    }

    @Test
    void deveSomarNumerosNegativos() {
        assertEquals(-8, calculadora.somar(-5, -3));
    }

    @Test
    void deveSomarComZero() {
        assertEquals(5, calculadora.somar(5, 0));
    }

    @Test
    void deveSubtrairNumerosPositivos() {
        assertEquals(2, calculadora.subtrair(5, 3));
    }

    @Test
    void deveSubtrairNumerosNegativos() {
        assertEquals(-2, calculadora.subtrair(-5, -3));
    }

    @Test
    void deveSubtrairComZero() {
        assertEquals(5, calculadora.subtrair(5, 0));
    }

    @Test
    void deveMultiplicarNumerosPositivos() {
        assertEquals(15, calculadora.multiplicar(5, 3));
    }

    @Test
    void deveMultiplicarNumerosNegativos() {
        assertEquals(15, calculadora.multiplicar(-5, -3));
    }

    @Test
    void deveMultiplicarPorZero() {
        assertEquals(0, calculadora.multiplicar(5, 0));
    }

    @Test
    void deveDividirNumerosPositivos() {
        assertEquals(2, calculadora.dividir(6, 3));
    }

    @Test
    void deveDividirNumerosNegativos() {
        assertEquals(2, calculadora.dividir(-6, -3));
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.dividir(10, 0)
        );
    }
}