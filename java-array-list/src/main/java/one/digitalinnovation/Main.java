package one.digitalinnovation;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //criar uma lista de carros
        List<Carro> listCarros = new ArrayList<>();

        //addicionar carros na lista de carros
        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));
        listCarros.add(new Carro("Peugeot"));

        //verificar se existe o "Ford" na lista
        System.out.println(listCarros.contains(new Carro("Ford")));

        //verificar qual é o carro do índice 2
        System.out.println(listCarros.get(2));

        //verifica em qual índice está o carro da "Fiat"
        System.out.println(listCarros.indexOf(new Carro("Fiat2")));

        //remover o conteúdo de índice 2
        System.out.println(listCarros.remove(2));

        System.out.println(listCarros);


    }
}
