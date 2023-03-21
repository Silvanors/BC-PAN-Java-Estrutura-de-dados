package one.digitalinnovation;

public class NoDuplo<T> {

    private T conteudo;
    private NoDuplo<T> noProximo;
    private NoDuplo<T> noPrevio;

    //1º) criar o construtor para passar "conteudo" tipo genérico
    public NoDuplo(T conteudo){
        //o "conteudo" ao lado de "this" se refere a variável da classe e o "conteudo" sem o this se refere
        //do parêmetro do construtor
        this.conteudo = conteudo;
    }

    //2º) criar os metter e setter para o conteudo e nós de referência
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoDuplo<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoDuplo<T> noProximo) {
        this.noProximo = noProximo;
    }

    public NoDuplo<T> getNoPrevio() {
        return noPrevio;
    }

    public void setNoPrevio(NoDuplo<T> noPrevio) {
        this.noPrevio = noPrevio;
    }

    //3º) criar o método chamado toString do "conteudo" para imprimir o conteudo do nó
    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
