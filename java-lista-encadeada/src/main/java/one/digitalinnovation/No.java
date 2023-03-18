package one.digitalinnovation;

public class No<T> {

    private T conteudo;
    private No proximoNo;

    //ciar um construtor vazio, um construtor passando só o conteúdo e um construtor
    // com os dois parâmetros da Classe No
    public No() {
        this.proximoNo = null;
    }

    public No(T conteudo) {
        this.proximoNo = null;
        this.conteudo = conteudo;
    }

    public No(T conteudo, No proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    //criar os métodos getter e setter dos dois parâmetros da Classe No

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }

    //criar o método toString só no parâmetro "conteudo"


    @Override
    public String toString() {
        return "No{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado(){
        String str = "No{" +
                "conteudo" + conteudo +
                '}';

        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else {
            str += ">null";
        }
        return str;
    }
}
