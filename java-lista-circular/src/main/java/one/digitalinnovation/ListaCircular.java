package one.digitalinnovation;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    //7º) criar um construtor padrão
    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    //6º) criar o método add() que adiciona no início da lista circular
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        //testar se a lista está vazia
        if(tamanhoLista == 0) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            //setar a referência de próximo nó da cabeça para a cauda
            this.cabeca.setNoProximo(cauda);
        }else {
            //novo nó atrás da cauda
            novoNo.setNoProximo(this.cauda);
            //cabeca aponta para o novoNo
            this.cabeca.setNoProximo(novoNo);
            //e cauda aponta para o novoNo
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    //5º) criar o método remover() passando o índice de quem vai ser removido
    public void remove(int index) {
        //testar se o índice é maior ou igual o tamanho da lista
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");
        No<T> noAuxiliar = cauda;
        if(index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }else if(index == 1){
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }else {
            //correr a lista para se não for "zero" e nem "um" deve correr o meio da lista
            for(int i = 0; i < index-1; i++){
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    //4º) criar o método get()
    public T get(int index){
        //retornar o "conteudo" do nó
        return getNo(index).getConteudo();

    }

    //3º) criar o método interno getNo() recebendo o index
    private No<T> getNo(int index){
        //verificar se a lista está vazia
        if(isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia");
        // verificar se a lista é "zero"
        if(index == 0 ){
            return this.cauda;
        }
        //caso não seja "zero"
        No<T> noAuxiliar = this.cauda;
        for(int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    //2º) criar o método isEmpty() para testar se a lista está vazia ou não
    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }

    //1º) criar o método size() para retornar o tamanho da lista
    public int size() {
        return this.tamanhoLista;
    }

    //8º) criar o método toString()
    @Override
    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.cauda;
        //correr a lista
        for(int i = 0; i < size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += size() != 0 ? "(Retorna ao início)" : "[]";

        return strRetorno;
    }
}
