package Interfaz;

import java.time.LocalDateTime;

public interface IAsistencia {
    void registrarHorasDiarias(LocalDateTime fecha, int horasTrabajadas);
    void registrarAsistencia(LocalDateTime fecha, boolean presente);
    int obtenerFaltasSemana();
}
