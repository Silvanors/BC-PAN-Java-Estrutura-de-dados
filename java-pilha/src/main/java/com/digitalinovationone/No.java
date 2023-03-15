package com.digitalinovationone;

public class No {
    private int dado;
    private No reNo = null;

    //construtor do dado
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
        this.reNo = refNo;
    }

    //toString() do dado


    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
