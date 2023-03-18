package one.digitalinnovation_refatoracao;

//refatorando o No com <T> usando generics
public class No<T> {

    //Tipo Object LNI engloba todos os objetos do java herdam desse objeto, pode utilizar qualquer objeto
    private T object;
    private No<T> refNo;

    //Construtor padrão abaixo
    public No(){
    }

    //Abaixo é o construtor recebendo o Object
    //O "object" é a parte útil ou conteúdo que será usado no nó
    public No(T object) {
        this.refNo = null;
        this.object = object;
    }

    //Implementar os getter e setter da Classe No, ou seja as variáveis do tipo Object e No
    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }

    //Implementar toString da variáveis do tipo Object
    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
