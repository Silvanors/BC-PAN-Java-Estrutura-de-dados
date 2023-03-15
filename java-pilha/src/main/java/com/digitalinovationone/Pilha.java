package com.digitalinovationone;

public class Pilha {

    private No refNoEntradaPilha;

    //criar um construtor vazio
    //depois atribuir "null" na variável refNoEntradaPilha

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    //metodo push()
    public void push(No novoNo){
            No refAuxiliar = refNoEntradaPilha;
            refNoEntradaPilha = novoNo;
            refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    //metodo
    public No pop(){
        if(!this.isEmpty()){
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    //metodo top
    public No top(){
        return refNoEntradaPilha;
    }

    //metodo isEmpty()
    public boolean isEmpty(){

        /*if(refNoEntradaPilha == null){
            return true;
        }
        return false;*/
    //o if acima poderia ser escrito numa linha só
    return refNoEntradaPilha == null ? true : false;

    }



}
