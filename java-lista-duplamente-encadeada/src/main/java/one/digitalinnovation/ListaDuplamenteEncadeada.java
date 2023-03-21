package one.digitalinnovation;

public class ListaDuplamenteEncadeada<T> {

    //variáveis da classe
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanhoLista;
    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

   //3º) criar o método get() para pegar o elemento tipo genérico no índice "n" que será passado
    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    //4º) criar o método add() recebe um "elemento" genérico
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoProximo(ultimoNo);
        if(primeiroNo == null){
            primeiroNo = novoNo;
        }
        if(ultimoNo !=null){
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    //2º) criar o método getNo()
    private NoDuplo<T> getNo(int index){
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    //1º) criar o método size()
    public int size(){
        return this.tamanhoLista;
    }
}
