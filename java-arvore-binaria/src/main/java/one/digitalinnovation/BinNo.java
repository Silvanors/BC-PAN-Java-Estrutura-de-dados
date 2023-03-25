package one.digitalinnovation;

//Para garantir a comparabilidade de objetos na árvore deve-se usar a interface "Comparable"
public class BinNo<T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> noEsq;
    private BinNo<T> noDir;

    //1º) criar o construtor passando só o "conteudo"
    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        //nós noEsq e noDir começando com nulo
        noEsq = noDir = null;
    }

    //3º) criar um constudor padrão simples da Clase BinNo(){}, sem passar nenhum parâmetro
    public BinNo() {
    }

    //4º) criar os métodos getter e setter de todos os atributos desta classe
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNo<T> noDir) {
        this.noDir = noDir;
    }

    //5º)criar o método toString apenas com o "conteudo"
    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }

}
