package one.digitalinnovation;

//1º) criar lista encadeada com tipo genérico "<T>"
public class ListaEncadeada<T> {
    //2º) criar a referência de nó de entrada na lista
    No<T> referenciaEntrada;

    //3º) criar um construtor padrão
    public ListaEncadeada(){
        this.referenciaEntrada =  null;
    }

    //6º) criar o método "add" para receber um "conteudo"(tipo genérico),
    //vai criar um novo nó(tipo genérico) e adicionar na lita
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
            for(int i = 0; i < this.size()-1; i++){
                noAuxiliar = noAuxiliar.getProximoNo();
            }

            noAuxiliar.setProximoNo(novoNo);
    }

    //9º) criar o método chamada "get()" para retornar o conteúdo
    public T get(int index){
        return getNo(index).getConteudo();
    }

    //7º) criar o método chamado "getNo()"
    //método privado pq é um método interno da classe
    private No<T> getNo(int index){
        //Testar se o índice informado é maior que o tamanho da lista
       validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    //10º) criar o método "remove()" para retornar o conteúdo do nó que o método removeu
    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    //5º) criar o método "size()" para retornar o tamanho da lista
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProximoNo() != null){
                    referenciaAux = referenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoLista;
    }

    //8º) criar método "validaIndice()" para validar o índice
    private void validaIndice(int index){
        //Testar se o índice informado é maior que o tamanho da lista
        if(index >= size()){
            int ultimoIndice = size()-1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice" + index + "desta lista. Esta lista só vai até o índice " + ultimoIndice + '.' );
        }
    }

    //4º) criar o método "isEmpty()" para verificar se a referencia de entrada está vazia ou não
    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    //11º) criar o método "toString()"
    @Override
    public String toString() {
        String strRetorno = "";
        //lógica para correr toda a lista
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++){
            //"+=" serve para concatenar
            strRetorno += "[No{conteúdo=" + noAuxiliar.getConteudo() + "}--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
