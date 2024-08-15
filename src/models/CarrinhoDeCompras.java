package models;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> listaItems;

    public CarrinhoDeCompras(List<Item>listaItems){
        listaItems = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItems.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome, double preco, int quantidade){
        List<Item> segundaLista = new ArrayList<>();
        for(Item i: listaItems){    
            if(i.getNome().equalsIgnoreCase(nome)){
                if(i.getPreco() == preco){
                    if(i.getQuantidade() == quantidade){
                        segundaLista.add(i);

                    }
                }
            }
        }
        listaItems.removeAll(segundaLista);
    }

    public void calcularValorTotal(String nome, double preco, int quantidade){
        
    }


}
