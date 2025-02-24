package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MercadoTest {

    @Test
    void testAddAndSearchCompra() {
        Mercado mercado = new Mercado();

        Compra compra1 = new Compra(1, "Arroz", "Tio João", "10.99");
        Compra compra2 = new Compra(2, "Feijão", "Camil", "8.50");

        mercado.addCompra(compra1);
        mercado.addCompra(compra2);

        assertEquals(2, mercado.getCompra().size());

        List<Compra> resultados = mercado.buscaCompra("Arroz");
        assertEquals(1, resultados.size());
        assertEquals("Tio João", resultados.get(0).getDescricao());
    }
}
