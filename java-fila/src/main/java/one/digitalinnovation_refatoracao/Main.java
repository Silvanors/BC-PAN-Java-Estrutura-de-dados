package one.digitalinnovation_refatoracao;

//para utilizar a Classe Fila
public class Main {

    public static void main(String[] args){
        //Instanciar(criar um objeto chamado minhaFila) uma fila
        Fila minhaFila = new Fila();
        //enfileirar o novo nó
        minhaFila.enqueue(new No("primeiro"));
        minhaFila.enqueue(new No("segundo"));
        minhaFila.enqueue(new No("terceiro"));
        minhaFila.enqueue(new No("quarto"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        minhaFila.enqueue(new No("último"));

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());

        System.out.println(minhaFila);


    }
}
