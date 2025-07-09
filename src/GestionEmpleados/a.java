/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionEmpleados;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
public class a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> horasPares = Arrays.asList(1,2,5,10,15,20,21);
        
        System.out.println(horasPares.toString());
        
        int sumHoras = 0;
        
        for (int i = 0; i < horasPares.size() - 1; i += 2) {
            int difHoras = horasPares.get(i + 1) - horasPares.get(i);
            
            sumHoras += difHoras;
            
            System.out.println("Trabajo: " + difHoras);
        }
        
        System.out.println("Trabajo en total: " + sumHoras);
    }
    
}
