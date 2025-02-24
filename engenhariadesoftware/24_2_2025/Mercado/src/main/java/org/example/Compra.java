package org.example;

import lombok.Data;

@Data
public class Compra {

    int Id;
    String Item;
    String Descricao;
    String Valor;

    public Compra(int id, String item, String descricao, String valor) {
        Id = id;
        Item = item;
        Descricao = descricao;
        Valor = valor;
    }
}
