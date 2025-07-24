package VistaGestorEmpleados;

import GestionEmpleados.GestorEmpleados;
import VistaHotel.CargaInicio;
import java.util.Scanner;

public class Prueba {
    
    public static GestorEmpleados gestor = new GestorEmpleados();
    
    public static void main(String[] args) {
        
        CargaInicio car = new CargaInicio();
        car.setVisible(true);
        
        /*System.out.println("""
                           Que menu ingresar?1
                           -> 1. Empleado
                           -> 2. Gerente""");
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Archivos de persistencia:");
        System.out.println("  empleados.dat existe?    " 
            + new java.io.File("empleados.dat").exists());
        System.out.println("  areas.dat existe?        " 
            + new java.io.File("areas.dat").exists());
        System.out.println("  registros.dat existe?   " 
            + new java.io.File("registros.dat").exists());

        System.out.println("Empleados cargados: " 
            + gestor.getMisEmpleados().size());
        
        String res = read.nextLine();
        
        if (res.equalsIgnoreCase("1")){
            MenuEmpleado menu = new MenuEmpleado(gestor);

            menu.setVisible(true);
        } /*else {
            MenuGerente menu = new MenuGerente(gestor);

            menu.setVisible(true);
        }
        
        System.out.println("Menu generado...");
    }*/
}
}
