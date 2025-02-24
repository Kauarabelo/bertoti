package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

    private List<Compra> compra = new ArrayList<>();

    public void addCompra(Compra compra) {
        this.compra.add(compra);
    }

    public List<Compra> getCompra() {
        return compra;
    }

    public List<Compra> buscaCompra(String item) {
        List<Compra> encontrados = new ArrayList<>();
        for (Compra compra : compra) {
            if (compra.getItem().equalsIgnoreCase(item)){
                encontrados.add(compra);
            }
        }
        return encontrados;
    }

}
