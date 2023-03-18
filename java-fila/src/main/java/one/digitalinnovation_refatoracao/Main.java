package one.digitalinnovation_refatoracao;

//para utilizar a Classe Fila
public class Main {

    public static void main(String[] args){
        //Instanciar(criar um objeto chamado minhaFila) uma fila
        Fila<String> minhaFila = new Fila<>();
        //enfileirar o novo nó
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue("último");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);


    }
}
