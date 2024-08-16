package models;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> listaItems;

    public CarrinhoDeCompras(){
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

    public void calcularValorTotal(){
        double valorItem;
        double valorTotal = 0d;
        if(!listaItems.isEmpty()){
            for(Item i: listaItems){
                valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            System.out.println("Valor total das compras: "+valorTotal);
        }else{
            System.out.println("Carrinho de compras vazio!");
        }
    }

    public void exibirLista(){
        if(!listaItems.isEmpty()){
            for(Item i: listaItems){
                System.out.println(i);
            }
        }else{
            System.out.println("Lista vazia!");
        }        
    }
}
