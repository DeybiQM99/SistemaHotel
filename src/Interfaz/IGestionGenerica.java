package Interfaz;

public interface IGestionGenerica <T> {
    void add(T item);
    void drop(int idItem);
    void drop(T item);
}