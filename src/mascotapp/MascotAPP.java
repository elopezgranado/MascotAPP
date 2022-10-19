/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

import mascotapp.entidades.Mascota;
//import mascotapp.servicios.ServicioMascota;

/**
 *
 * @author A305649
 */
public class MascotAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1 = sm.crearMascota();
        
        System.out.println(m1);
        
        m1 = null;
        */
        
        int a = 10;
        
        Mascota mm = new Mascota();
        
        modificador(a, mm);
        
        System.out.println("a "+a);
        System.out.println("Mascota "+mm);
    }
    
    public static void modificador(int num, Mascota m) {
        num = 100;
        m.setApodo("Mascota Referencia");
    }
}
