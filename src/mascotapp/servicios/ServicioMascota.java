/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author A305649
 */
public class ServicioMascota {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota() {
        
        System.out.println("Introducti nombre");
        String nombre = leer.next();
        
        System.out.println("Introducti apodo");
        String apodo = leer.next();
        
        System.out.println("Introducti tipo");
        String tipo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
        
    }
}
