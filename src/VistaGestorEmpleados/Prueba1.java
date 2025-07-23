package VistaGestorEmpleados;

import GestionEmpleados.Area;
import GestionEmpleados.Empleado;
import GestionEmpleados.Enum.TipoContrato;
import GestionEmpleados.Enum.TipoIncidencia;
import GestionEmpleados.GestorEmpleados;
import GestionEmpleados.Jefe;
import GestionEmpleados.Operario;
import GestionEmpleados.RegistroPago;
import GestionEmpleados.Supervisor;
import static VistaGestorEmpleados.Prueba.gestor;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Prueba1 {
    
    
    // 1) Crear el gestor (su constructor hace cargarDatos())
    static GestorEmpleados gestor = new GestorEmpleados();

    public static void main(String[] args) {

        // 2) Primera ejecución: inicializar datos de prueba y guardar
        if (gestor.getMisEmpleados().isEmpty()) {
            inicializarDatosDePrueba();
            gestor.guardarDatos();
            System.out.println("Datos de prueba inicializados y guardados.");
        } else {
            System.out.println("Datos existentes cargados: "
                + gestor.getMisEmpleados().size() + " empleados.");
        }

        // 3) Mostrar menú
        System.out.println("""
            ¿Qué menú ingresar?
            -> 1. Empleado
            -> 2. Gerente
            """);
        String res = new Scanner(System.in).nextLine();

        if (res.equalsIgnoreCase("1")) {
            new MenuEmpleado(gestor).setVisible(true);
        } else {
            new MenuGerente(gestor).setVisible(true);
        }
    }

    private static void inicializarDatosDePrueba() {
        // Operarios (Temporal: ingreso y término; renovación = null)
        gestor.addEmpleado(new Operario(1, 15.0, 101, "Luis",   "Pérez",  "luis.perez@empresa.com",   "12345678A",
            LocalDate.of(2022,  1, 10), LocalDate.of(2025,  1, 10), null,
            TipoContrato.TEMPORAL, 201));
        gestor.addEmpleado(new Operario(1, 16.0, 102, "Ana",    "Gómez",  "ana.gomez@empresa.com",    "12345679B",
            LocalDate.of(2022,  2,  5), LocalDate.of(2025,  2,  5), null,
            TipoContrato.TEMPORAL, 202));
        gestor.addEmpleado(new Operario(2, 17.0, 103, "Carlos", "López",  "carlos.lopez@empresa.com", "12345680C",
            LocalDate.of(2022,  3,  1), LocalDate.of(2025,  3,  1), null,
            TipoContrato.TEMPORAL, 203));
        gestor.addEmpleado(new Operario(2, 18.0, 104, "María",  "Ramírez","maria.ramirez@empresa.com","12345681D",
            LocalDate.of(2022,  4, 10), LocalDate.of(2025,  4, 10), null,
            TipoContrato.TEMPORAL, 204));
        gestor.addEmpleado(new Operario(3, 19.0, 105, "Jorge",  "Torres", "jorge.torres@empresa.com",  "12345682E",
            LocalDate.of(2022,  5, 15), LocalDate.of(2025,  5, 15), null,
            TipoContrato.TEMPORAL, 205));

        
        
        // Supervisores (Indefinido: ingreso; término y renovación nulos)
        gestor.addEmpleado(new Supervisor(1,25.0,201,"Ricardo","Díaz","ricardo.diaz@empresa.com","22345678A",
            LocalDate.of(2021,6,1), null, null,
            TipoContrato.INDEFINIDO,301));
        gestor.addEmpleado(new Supervisor(1,26.0,202,"Laura","Herrera","laura.herrera@empresa.com","22345679B",
            LocalDate.of(2021,7,10), null, null,
            TipoContrato.INDEFINIDO,302));
        gestor.addEmpleado(new Supervisor(2,27.0,203,"Sofía","Vega","sofia.vega@empresa.com","22345680C",
            LocalDate.of(2021,8,15), null, null,
            TipoContrato.INDEFINIDO,303));
        gestor.addEmpleado(new Supervisor(2,28.0,204,"Eduardo","Salinas","eduardo.salinas@empresa.com","22345681D",
            LocalDate.of(2021,9,20), null, null,
            TipoContrato.INDEFINIDO,304));
        gestor.addEmpleado(new Supervisor(3,29.0,205,"Patricia","Muñoz","patricia.munoz@empresa.com","22345682E",
            LocalDate.of(2021,10,25), null, null,
            TipoContrato.INDEFINIDO,305));

        Supervisor sup = (Supervisor)gestor.getEmpleado(201);
        sup.setIdJefe(301);
        sup = (Supervisor)gestor.getEmpleado(202);
        sup.setIdJefe(302);
        sup = (Supervisor)gestor.getEmpleado(203);
        sup.setIdJefe(303);
        sup = (Supervisor)gestor.getEmpleado(204);
        sup.setIdJefe(304);
        sup = (Supervisor)gestor.getEmpleado(205);
        sup.setIdJefe(305);
        
        
        // Jefes (Renovable: ingreso, término, renovación)
        gestor.addEmpleado(new Jefe(1,40.0,301,"Fernando","Ortiz","fernando.ortiz@empresa.com","32345678A",
            LocalDate.of(2020,1,1),  LocalDate.of(2025,1,1),  LocalDate.of(2024,12,31),
            TipoContrato.RENOVABLE));
        gestor.addEmpleado(new Jefe(1,41.0,302,"Verónica","Salazar","veronica.salazar@empresa.com","32345679B",
            LocalDate.of(2020,2,1),  LocalDate.of(2025,2,1),  LocalDate.of(2024,12,31),
            TipoContrato.RENOVABLE));
        gestor.addEmpleado(new Jefe(2,42.0,303,"Miguel","Ramos","miguel.ramos@empresa.com","32345680C",
            LocalDate.of(2020,3,1),  LocalDate.of(2025,3,1),  LocalDate.of(2024,12,31),
            TipoContrato.RENOVABLE));
        gestor.addEmpleado(new Jefe(2,43.0,304,"Antonia","Flores","antonia.flores@empresa.com","32345681D",
            LocalDate.of(2020,4,1),  LocalDate.of(2025,4,1),  LocalDate.of(2024,12,31),
            TipoContrato.RENOVABLE));
        gestor.addEmpleado(new Jefe(3,44.0,305,"Ricardo","Blanco","ricardo.blanco@empresa.com","32345682E",
            LocalDate.of(2020,5,1),  LocalDate.of(2025,5,1),  LocalDate.of(2024,12,31),
            TipoContrato.RENOVABLE));
        
        Empleado emp = gestor.getEmpleado(301);
        emp.setTipoIncidencia(TipoIncidencia.LEVE);
        emp.setTextIncidencia("INCUMPLIMIENTO DE NORMAS.");
        emp.setTextObservacion("Mejorar urgentemente.");
        emp.setFechaInc(LocalDate.now());
        
        // Creación de pagos// Pagos para el empleado 101
        gestor.addRegistroPago(new RegistroPago(1, 101, LocalDate.of(2025, 1, 15), 450.0,60,40, RegistroPago.MedioPago.TRANSFERENCIA));
        gestor.addRegistroPago(new RegistroPago(2, 101, LocalDate.of(2025, 2, 15), 460.0,80,60, RegistroPago.MedioPago.TRANSFERENCIA));
        gestor.addRegistroPago(new RegistroPago(3, 101, LocalDate.of(2025, 3, 15), 470.0,40,30, RegistroPago.MedioPago.EFECTIVO));
        gestor.addRegistroPago(new RegistroPago(4, 101, LocalDate.of(2025, 4, 15), 480.0,80,35, RegistroPago.MedioPago.EFECTIVO));
        gestor.addRegistroPago(new RegistroPago(5, 101, LocalDate.of(2025, 5, 15), 490.0,20,15, RegistroPago.MedioPago.EFECTIVO));

        // Pagos para el empleado 102
        gestor.addRegistroPago(new RegistroPago(6, 102, LocalDate.of(2025, 1, 10), 430.0,10,35, RegistroPago.MedioPago.EFECTIVO));
        gestor.addRegistroPago(new RegistroPago(7, 102, LocalDate.of(2025, 2, 10), 440.0,90,40, RegistroPago.MedioPago.TRANSFERENCIA));
        gestor.addRegistroPago(new RegistroPago(8, 102, LocalDate.of(2025, 3, 10), 450.0,40,32, RegistroPago.MedioPago.EFECTIVO));
        gestor.addRegistroPago(new RegistroPago(9, 102, LocalDate.of(2025, 4, 10), 460.0,30,38, RegistroPago.MedioPago.EFECTIVO));
        gestor.addRegistroPago(new RegistroPago(10, 102, LocalDate.of(2025, 5, 10), 470.0,20,39, RegistroPago.MedioPago.TRANSFERENCIA));
        
        //Areas para los empleados
        gestor.addArea(new Area(1, "Recepcion"));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(101));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(102));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(201));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(202));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(301));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(302));
        
        
        gestor.addArea(new Area(2, "Limpieza"));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(103));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(104));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(203));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(204));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(303));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(304));
        
        
        gestor.addArea(new Area(3, "Cocina"));
        gestor.getArea(3).addEmpleado(gestor.getEmpleado(105));
        gestor.getArea(3).addEmpleado(gestor.getEmpleado(205));
        gestor.getArea(3).addEmpleado(gestor.getEmpleado(305));
        
        //Insertar Ingresos
        gestor.getEmpleado(101).registrarHorasDiarias(LocalDate.now(), Arrays.asList(1,5,6,7,9));
        gestor.getEmpleado(102).registrarHorasDiarias(LocalDate.now(), Arrays.asList(1,8));
        gestor.getEmpleado(103).registrarHorasDiarias(LocalDate.now(), Arrays.asList(2,4,5,7,8,10,13));
        
        gestor.getEmpleado(101).registrarAsistencia(LocalDate.now(), true);
        gestor.getEmpleado(102).registrarAsistencia(LocalDate.now(), true);
        gestor.getEmpleado(103).registrarAsistencia(LocalDate.now(), true);
    }
}