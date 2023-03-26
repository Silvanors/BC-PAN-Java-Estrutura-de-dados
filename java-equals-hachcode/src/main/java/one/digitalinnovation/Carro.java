package one.digitalinnovation;

import java.util.Objects;

public class Carro {

    String marca;

    //1º)Contrutor carro e marca

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
}
