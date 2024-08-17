package br.ufrpe.supermercado.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda{
    private int numeroVenda;
    private Date dataDaVenda;
    private List<ItemVenda> itensVendidos;
    private static int vendasTotal = 0;
    
    
    public Venda() {
        this.numeroVenda = ++vendasTotal;
        this.dataDaVenda = new Date();
        this.itensVendidos = new ArrayList<>();
    }

    public void realizarVenda(ItemVenda itemVenda) {
        itensVendidos.add(itemVenda);
        this.dataDaVenda = new Date();

        System.out.println("Venda #" + numeroDaVenda + " realizada com sucesso!");
        System.out.println("Data: " + dataDaVenda);
        System.out.println("Cliente: " + itemVenda.getCliente().getNome());
        System.out.println("Vendedor: " + itemVenda.getVendedor().getNome());
        System.out.println("Quantidade de Itens: " + itemVenda.getQtdeDeItem());
        System.out.println("Valor Total: " + itemVenda.getValorTotal());

    }

    public int getNumeroVenda() {
        return numeroVenda;
    }
    public void setNumeroVenda(int numeroVenda) {
        this.numeroVenda = numeroVenda;
    }

    public Date getDataDaVenda() {
        return dataDaVenda;
    }
    public void setDataDaVenda(Date dataDaVenda) {
        this.dataDaVenda = dataDaVenda;
    }

    public List<ItemVenda> getItensVendidos() {
        return itensVendidos;
    }
    public void setItensVendidos(List<ItemVenda> itensVendidos) {
        this.itensVendidos = itensVendidos;
    }
    



}
