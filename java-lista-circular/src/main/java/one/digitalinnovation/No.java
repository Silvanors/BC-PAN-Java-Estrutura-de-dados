package one.digitalinnovation;

public class No<T> {

    private T conteudo;
    private No<T> NoProximo;

    //1º) criar o construtor para passar o "conteudo"
    public No(T conteudo) {
        this.NoProximo = null;
        this.conteudo = conteudo;
    }

    //2º) criar os métodos getter e setter do "conteudo" como do "NoProximo"

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getNoProximo() {
        return NoProximo;
    }

    public void setNoProximo(No<T> noProximo) {
        NoProximo = noProximo;
    }

    //3º) criar o método toString para apenas o "conteudo"
    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }
}
