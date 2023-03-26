package one.digitalinnovation.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj> {

    Integer meuValor;

    //1º) construtor
    public Obj(Integer meuValor){
        this.meuValor = meuValor;
    }

    //2º) implementar os Overrides Methods pelo "generate" do equals, haschCode, compareTo e ToString


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(meuValor, obj.meuValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int haschCode() {
        return 0;
    }

    @Override
    public int compareTo(Obj outro) {
        int i = 0;
        //
        if(this.meuValor > outro.meuValor){
            i = 1;
        }else if(this.meuValor < outro.meuValor){
            i =-1;
        }
        return i;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
