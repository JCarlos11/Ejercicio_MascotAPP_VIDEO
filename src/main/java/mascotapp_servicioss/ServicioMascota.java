/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotapp_servicioss;

import java.util.ArrayList;
import java.util.Scanner;
import mascotapp_entidades.Mascota;

/**
 *
 * @author JCarlos
 */
public class ServicioMascota {
    
    private Scanner leer;
    
    private ArrayList<String> mascotas;
    
    public ServicioMascota(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    public void crearMascota(){
       
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Intoducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        String mascota = nombre + " " + apodo + " " + tipo;
        
        mascotas.add(mascota);
        
    }
    
    public void mostrarMascotas(){
    
        System.out.println("Las mascotas actuales de la Lista Mascotas son: ");
        for(String aux : mascotas){
            System.out.println(aux);
        }
        System.out.println("Cantidad = " + mascotas.size());
    }
    
}
