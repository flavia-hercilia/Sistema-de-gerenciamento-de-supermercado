package br.ufrpe.supermercado.negocio;

import java.util.List;

// Classe Cliente que herda de Pessoa
public class Cliente extends Pessoa {
    private List<Venda> pedidosRealizados;

    public String toString() {
        return "Cliente: " + getNomeCompleto() + "\n"
                + "CPF: " + getCPF() + "\n"
                + "Data de Nascimento: " + getDataNascimento() + "\n";
    }

    public List<Venda> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(List<Venda> pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }

}