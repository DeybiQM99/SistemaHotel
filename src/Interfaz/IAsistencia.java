package Interfaz;

import java.time.LocalDate;
import java.util.List;

public interface IAsistencia {
    void registrarHorasDiarias(LocalDate fecha, List<Integer> horas);
    void registrarAsistencia(LocalDate fecha, boolean presente);
    int obtenerFaltasSemana();
}
