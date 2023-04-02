package one.digitalinnovation;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //criar um conjunto de carros
        Set<Carro> hashSetCarros =  new HashSet<>();

        //inserir a lista de carros
        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Fiat"));
        hashSetCarros.add(new Carro("Peugeot"));
        hashSetCarros.add(new Carro("Zip"));
        hashSetCarros.add(new Carro("Alfa Romeu"));

        //o Set não preserva a ordem de inserção
        System.out.println(hashSetCarros);

        ///criar um treeSet de carros (vem de árvore)
        Set<Carro> treeSetCarros = new TreeSet<>();

        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Fiat"));
        treeSetCarros.add(new Carro("Peugeot"));
        treeSetCarros.add(new Carro("Zip"));
        treeSetCarros.add(new Carro("Alfa Romeu"));

        System.out.println(treeSetCarros);
    }
}
