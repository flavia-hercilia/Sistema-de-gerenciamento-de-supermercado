package br.ufrpe.supermercado.negocio;

import br.ufrpe.supermercado.excecoes.CpfInvalidoExcecao;

public class Pessoa {
    private String CPF;
    private int dataNascimento;
    private String nomeCompleto;
    
    // Classe Pessoa que serve de base para Cliente e Funcionario    
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) throws CpfInvalidoExcecao{
        if (cPF == null || cPF.isEmpty() || cPF.length() != 11){
            throw new CpfInvalidoExcecao();
        }
        this.CPF = cPF;
    }
    
    public int getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    
}