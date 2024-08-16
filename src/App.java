import models.Item;

import java.util.ArrayList;
import java.util.List;

import models.CarrinhoDeCompras;

public class App {
    public static void main(String[] args) throws Exception {
        
       CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

       carrinhoDeCompras.adicionarItem("Maquina do tempo", 999.9, 2);
       carrinhoDeCompras.adicionarItem("bons tempos", 777.7, 1);


        carrinhoDeCompras.exibirLista();

        carrinhoDeCompras.calcularValorTotal();

    }
}
