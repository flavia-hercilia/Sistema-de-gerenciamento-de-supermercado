package br.ufrpe.supermercado.negocio;

import br.ufrpe.supermercado.excecoes.CpfInvalidoExcecao;

public abstract class Pessoa {
    private String CPF;
    private int dataNascimento;
    private String nomeCompleto;
    
    
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) throws CpfInvalidoExcecao{
        cPF = trataStrings(cPF);
        if (cPF == null || cPF.isEmpty() || !isCPFvalido(cPF)){
            throw new CpfInvalidoExcecao();
        }
        this.CPF = cPF;
    }

    private boolean isCPFvalido(String cPF){

        if (cPF.length() != 11) {
            return false;
        }

        int[] cpfArray = CPFtoArray(cPF);

        boolean digitosIguais = true;

        for(int i=1; i < cpfArray.length; i++){
            if(cpfArray[i] != cpfArray[0]){
                digitosIguais = false;
                break;
            }
        }

        if(digitosIguais){
            return false;
        }

        return(verificaDigitos(1, cpfArray));

    }

    //TRATAMENTO DE STRING
    private String trataStrings(String  CPF){
        if(CPF != null){
            CPF = CPF.replace(".","");
            CPF = CPF.replace("-","");
            CPF = CPF.replace(" ","");
        }
        return CPF;
    }

    //TRANSFORMA A STRING CPF EM UM ARRAY
    private int[] CPFtoArray(String cpf) {
        int[] cpfArray = new int[11];
        for (int i = 0; i < cpf.length(); i++) {
            cpfArray[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
        }
        return cpfArray;
    }

    private boolean verificaDigitos(int posicaoCodigo, int[] Cpf) {
        int j;
        if (posicaoCodigo == 1) {
            j = 10; 
        } else {
            j = 11; 
        }
    
        int indexParameter = 7 + posicaoCodigo;
        
        int resultado = 0;
        for (int i = 0; i <= indexParameter; i++) {
            resultado += j * Cpf[i];
            j--;
        }
    
        int restoDiv = resultado % 11;
        int digitoEsperado;
        
        if (restoDiv < 2) {
            digitoEsperado = 0; 
        } else {
            digitoEsperado = 11 - restoDiv; 
        }
    
        if (Cpf[indexParameter + 1] == digitoEsperado) {
            if (posicaoCodigo == 1) {
                return verificaDigitos(2, Cpf); 
            } else {
                return true; 
            }
        } else {
            return false;
        }
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