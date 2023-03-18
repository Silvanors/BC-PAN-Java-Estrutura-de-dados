package one.digitalinnovation;

public class Main {

    public static void main(String[] args) {
        //usando a lista encadeada
        ListaEncadeada<String> minhaListaEncadeada = new ListaEncadeada<>();

        minhaListaEncadeada.add("teste 1");
        minhaListaEncadeada.add("teste 2");
        minhaListaEncadeada.add("teste 3");
        minhaListaEncadeada.add("teste 4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        //imprime o método toString contruído na Classe ListaEncadeada
        System.out.println(minhaListaEncadeada);

        //remover o nó de indice 3
        System.out.println(minhaListaEncadeada.remove(3));

        //imprime o método toString contruído na Classe ListaEncadeada
        System.out.println(minhaListaEncadeada);



    }
}
