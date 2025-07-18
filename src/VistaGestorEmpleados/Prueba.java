package VistaGestorEmpleados;

import GestionEmpleados.Area;
import GestionEmpleados.Enum.TipoContrato;
import GestionEmpleados.GestorEmpleados;
import GestionEmpleados.Jefe;
import GestionEmpleados.Operario;
import GestionEmpleados.RegistroPago;
import GestionEmpleados.Supervisor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class Prueba {
    
    public static GestorEmpleados gestor = new GestorEmpleados();
    
    public static void main(String[] args) {
        System.out.println("""
                           Que menu ingresar?
                           -> 1. Empleado
                           -> 2. Gerente""");
        
        Scanner read = new Scanner(System.in);
        
                
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
        
        for(int i = 201; i <= 205; i++){
            Supervisor sup = (Supervisor) gestor.getEmpleado(i);
            
            sup.add(i - 100);
        }

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
        
        for(int i = 301; i <= 305; i++){
            Jefe sup = (Jefe) gestor.getEmpleado(i);
            
            sup.add(i - 100);
        }
        
        // Creación de pagos// Pagos para el empleado 101
        gestor.addRegistroPago(new RegistroPago(1, 101, LocalDateTime.of(2025, 1, 15, 10, 30), 450.0, RegistroPago.MedioPago.TRANSFERENCIA));
        gestor.addRegistroPago(new RegistroPago(2, 101, LocalDateTime.of(2025, 2, 15, 10, 30), 460.0, RegistroPago.MedioPago.TRANSFERENCIA));
        gestor.addRegistroPago(new RegistroPago(3, 101, LocalDateTime.of(2025, 3, 15, 10, 30), 470.0, RegistroPago.MedioPago.EFECTIVO));
        gestor.addRegistroPago(new RegistroPago(4, 101, LocalDateTime.of(2025, 4, 15, 10, 30), 480.0, RegistroPago.MedioPago.EFECTIVO));
        gestor.addRegistroPago(new RegistroPago(5, 101, LocalDateTime.of(2025, 5, 15, 10, 30), 490.0, RegistroPago.MedioPago.EFECTIVO));

        // Pagos para el empleado 102
        gestor.addRegistroPago(new RegistroPago(6, 102, LocalDateTime.of(2025, 1, 10, 9, 15), 430.0, RegistroPago.MedioPago.EFECTIVO));
        gestor.addRegistroPago(new RegistroPago(7, 102, LocalDateTime.of(2025, 2, 10, 9, 15), 440.0, RegistroPago.MedioPago.TRANSFERENCIA));
        gestor.addRegistroPago(new RegistroPago(8, 102, LocalDateTime.of(2025, 3, 10, 9, 15), 450.0, RegistroPago.MedioPago.EFECTIVO));
        gestor.addRegistroPago(new RegistroPago(9, 102, LocalDateTime.of(2025, 4, 10, 9, 15), 460.0, RegistroPago.MedioPago.EFECTIVO));
        gestor.addRegistroPago(new RegistroPago(10, 102, LocalDateTime.of(2025, 5, 10, 9, 15), 470.0, RegistroPago.MedioPago.TRANSFERENCIA));
        
        //Areas para los empleados
        gestor.addArea(new Area(1, "Producción"));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(101));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(102));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(201));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(202));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(301));
        gestor.getArea(1).addEmpleado(gestor.getEmpleado(302));
        
        
        gestor.addArea(new Area(2, "Calidad"));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(103));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(104));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(203));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(204));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(303));
        gestor.getArea(2).addEmpleado(gestor.getEmpleado(304));
        
        
        gestor.addArea(new Area(3, "Administración"));
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
        
        String res = read.nextLine();
        
        if (res.equalsIgnoreCase("1")){
            MenuEmpleado menu = new MenuEmpleado(gestor);

            menu.setVisible(true);
        } else {
            MenuGerente menu = new MenuGerente(gestor);

            menu.setVisible(true);
        }
        
        System.out.println("Menu generado...");
    }

}
