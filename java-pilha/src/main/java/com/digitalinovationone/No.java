package com.digitalinovationone;

public class No {

    //variáveis da classe No : int "dado" e No "refNo"
    private int dado;
    private No refNo = null;

    //construtor da variável "dado"
    public No(int dado) {
        this.dado = dado;
    }

    //construtor vazio
    public No() {
    }

    // getting e setting de todos os atributos do nó

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    //toString() para variável "dado"


    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
