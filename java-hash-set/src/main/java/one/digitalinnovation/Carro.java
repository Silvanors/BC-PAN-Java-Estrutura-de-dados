package one.digitalinnovation;

import java.util.Comparator;
import java.util.Objects;

public class Carro implements Comparable<Carro> {

    String marca;

    //1º)Contrutor e marca

    public Carro(String marca) {
        this.marca = marca;
    }

    //2º)criar com o "generate" o getter e setter
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //3º)criar com o "generate" o equals e hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {

        return Objects.hash(marca);

    }

    //4º) adicionar o método toString()

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    //método para comparar por tamanho
    /**@Override
    public int compareTo(Carro o) {
        //comparar pelo tamanho da string
        //o "o" = outro na comparação
        if(this.marca.length() < o.marca.length()){
            return -1;
        }else if(this.marca.length() > o.marca.length()){
            return 1;
        }
        return 0;
        //return 0;
    }*/

    //método alfabético
    @Override
    public int compareTo(Carro o) {
        //comparar com ordem alfabética
        return this.getMarca().compareTo(o.getMarca());
        //return 0;
    }


}
