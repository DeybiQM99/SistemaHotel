package GestionEmpleados;
//Hello Sekai
//Goodbye Sekai
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
    
public class Area implements Serializable{
    
    // Identificador único del área
    private final int idArea;
    
    // Nombre descriptivo del área
    private String nombre;
    
    // Lista de IDs de empleados asignados al área
    private final List<Integer> listaEmpleadoIds;
    
    // Constructor principal.
    public Area(int idArea, String nombre) {
        this.idArea = idArea;
        this.nombre = nombre;
        this.listaEmpleadoIds = new ArrayList<>();
    }
    
    // Agrega un empleado al área.
    public void addEmpleado(Empleado empleado) {
        listaEmpleadoIds.add(empleado.getId());
    }

    // Elimina un empleado del área por su objeto.
    public void dropEmpleado(Empleado empleado) {
        if (empleado != null)
            dropEmpleado(empleado.getId());
    }

    // Elimina un empleado del área por su identificador.
    public void dropEmpleado(int idEmpleado) {
        listaEmpleadoIds.remove(idEmpleado);
    }    
            
    // Devuelve a un empleado, en caso de que este pertenezca a la área correspondiente.
    public Empleado getEmpleado(int idEmpleado, GestorEmpleados gestor) {
        Empleado empleado = null;

        if(!listaEmpleadoIds.isEmpty()){
            for(Integer id : listaEmpleadoIds){
                if(id == idEmpleado){
                    empleado = gestor.getEmpleado(idEmpleado);
                    return empleado;
                }
            }
        }

        return empleado;
    }

    // Devuelve a un empleado, en caso de que este pertenezca a la área correspondiente.
    public Empleado getEmpleado(Empleado empleado, GestorEmpleados gestor) {
        Empleado resultado = null;

        if (empleado != null && !listaEmpleadoIds.isEmpty()) {
            for (Integer id : listaEmpleadoIds) {
                if (id == empleado.getId()) {
                    resultado = gestor.getEmpleado(id);
                    return resultado;
                }
            }
        }

        return resultado;
    }
    
    // Cuenta cuántos empleados tiene asignados el área.
    public int contarEmpleados() {
        return listaEmpleadoIds.size();
    }

    
    // Obtiene la lista de IDs de empleados asignados (solo lectura), evitando enlazar las listas.
    public List<Integer> getListaEmpleadoIds() {
        return List.copyOf(listaEmpleadoIds);
    }

    // Obtiene el identificador del área.
    public int getIdArea() {
        return idArea;
    }

    // Obtiene el nombre descriptivo del área.
    public String getNombre() {
        return nombre;
    }

    // Establece un nuevo nombre para el área.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


