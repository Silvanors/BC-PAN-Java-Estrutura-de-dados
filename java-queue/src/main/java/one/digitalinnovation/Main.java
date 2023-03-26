package one.digitalinnovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Queue ou fila de carros com new LindedList.
        //Métodos utilizados add(), offer(), peek(), poll(), isEmpty(), size()
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        //O método add () se consegur adicionar retorna true
        System.out.println(queueCarros.add(new Carro("Peugeot")));//se consegur adicionar retorna true
        System.out.println(queueCarros);

        //O método add() retorna false se não conseguir executar. O add dá erro quando não consegue. o offer quando não consegue
        //O método offer() não retorna erro retorna false

        System.out.println(queueCarros.offer(new Carro("Renaut")));
        System.out.println(queueCarros);

        //O método peek() mostra o primeiro da fila, mas não remove
        System.out.println(queueCarros.peek());
        System.out.println(queueCarros);

        //O método poll() mostra o primeiro da fila e remove
        System.out.println(queueCarros.poll());
        System.out.println(queueCarros);

        //O método isEmpty() mostra se a fila está vazia
        System.out.println(queueCarros.isEmpty());

        //O método size() mostra o tamanho da fila
        System.out.println(queueCarros.size());









    }
}
