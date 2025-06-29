package VistaGestorEmpleados;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        System.out.println("""
                           Que menu ingresar?
                           -> 1. Empleado
                           -> 2. Gerente""");
        
        Scanner read = new Scanner(System.in);
        
        String res = read.nextLine();
        
        if (res.equalsIgnoreCase("1")){
            MenuEmpleado menu = new MenuEmpleado();

            menu.setVisible(true);
        } else {
            MenuGerente menu = new MenuGerente();

            menu.setVisible(true);
        }
        
        System.out.println("Menu generado...");
    }

}
