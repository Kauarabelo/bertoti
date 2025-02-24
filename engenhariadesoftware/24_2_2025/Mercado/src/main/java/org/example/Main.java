package org.example;

import org.junit.jupiter.api.Test;

public class Main {

    public static void main(String[] args) {
        Mercado mercado = new Mercado();
        mercado.addCompra(new Compra(1,"Arroz", "Mantiqueira", "10,99"));
        mercado.addCompra(new Compra(2,"Arroz", "Pereira", "22,99"));

        System.out.println(mercado.getCompra());

        System.out.println(mercado.buscaCompra("Arroz"));

    }
}
