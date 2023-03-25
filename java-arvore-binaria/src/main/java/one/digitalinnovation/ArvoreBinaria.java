package one.digitalinnovation;

//Para garantir a comparabilidade de objetos na árvore deve-se usar a interface "Comparable"
public class ArvoreBinaria<T extends Comparable<T>> {

    private BinNo<T> raiz;

    //toda vez que for instanciada a árvore binária a gente vai saber que a raíz vai ser nula;
    public ArvoreBinaria(){
        this.raiz = null;
    }

    //1º.b) criar o método publico para inserir nó inserir()
    public void inserir(T conteudo){
        BinNo<T> novoNo = new BinNo<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }
    //1º.a) criar o método privado para inserir nó inserir()
    private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
        if(atual == null){
            return novoNo;
        }
        //comparar se o "conteudo" do novo nó é menor que o "conteudo" do nó atual, e vai retornar 0 ou 1.
         else if(novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
             //o nó atual recebe o novo nó
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else {
            //ou...
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }
         return atual;
    }
    //2º criar a exibição InOrdem
    //2º.a) criar o método publico "exibirInOrdem"()
    public void exibirInOrdem(){
        System.out.println("\n Exibindo InOrdem");
        //chamar método privado passando a raiz
        exibirInOrdem(this.raiz);
    }

    //2º.b) criar o método privado exibirInOrdem(){} passando/recebendo a raiz;
    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    //3º criar a exibição PosOrdem
    //3º.a) criar o método publico "exibirPosOrdem"()
    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        //chamar método privado passando a raiz
        exibirPosOrdem(this.raiz);
    }

    //3º.b) criar o método privado exibirPosOrdem(){} passando/recebendo a raiz;
    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ");

        }
    }

    //4º criar a exibição PreOrdem
    //4º.a) criar o método publico "exibirPreOrdem"()
    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        //chamar método privado passando a raiz
        exibirPreOrdem(this.raiz);
    }

    //4º.b) criar o método privado exibirPreOrdem(){} passando/recebendo a raiz;
    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.println(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }

}
