package one.digitalinnovation.model;

public abstract class ObjArvore<T> implements Comparable<T>  {
    //variáveis
    public abstract boolean equals(Object o);
    public abstract int haschCode();
    public abstract int compareTo(T outro);
    public abstract String toString();

}
