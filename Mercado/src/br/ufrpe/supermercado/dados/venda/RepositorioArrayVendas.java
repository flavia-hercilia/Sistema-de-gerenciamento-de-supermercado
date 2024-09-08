package br.ufrpe.supermercado.dados.venda;

import java.util.ArrayList;
import java.util.List;

import br.ufrpe.supermercado.negocio.*;

@SuppressWarnings("unused")
public class RepositorioArrayVendas {
    private int tamanhoAtual;
    private Venda vendas[];
    // private List<Venda> vendas = new ArrayList<>();

    private void redimensionarArray() {
        Venda[] novoArray = new Venda[vendas.length * 2];
        for (int i = 0; i < vendas.length; i++) {
            novoArray[i] = vendas[i];
        }
        vendas = novoArray;
    }

    public void registrarVenda(Venda venda) {
        if(tamanhoAtual == vendas.length){
            redimensionarArray();
        }
        vendas[tamanhoAtual] = venda;
        tamanhoAtual++;
    }

    public void listarVendas() {

        for (int i = 0; i < tamanhoAtual; i++) {
            System.out.println(vendas[i]);
        }
        
    }
}
