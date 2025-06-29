package Interfaz;

import GestionEmpleados.Empleado;

public interface IGestionGenerica <T extends Empleado> {
    void add(T item);
    void drop(int idItem);
    void drop(T item);
}