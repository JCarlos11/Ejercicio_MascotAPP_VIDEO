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
    
    private ArrayList<Mascota> mascotas;
    
    public ServicioMascota(){
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    public Mascota crearMascota(){
       
        System.out.println("Introducir nombre");
        String nombre = leer.next();
        
        System.out.println("Intoducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        Mascota m = new Mascota(nombre,apodo, tipo);  
        
        mascotas.add(m);
    
        return m;    
    }
    
    public void mostrarMascotas(){
    
        System.out.println("Las mascotas actuales de la Lista Mascotas son: ");
        for(Mascota aux : mascotas){
            System.out.println(aux.toString());
        }
        System.out.println("Cantidad = " + mascotas.size());
    }
    
    public void fabricaChiquitos(int cantidad){
        
        for (int i = 0; i < cantidad; i++) {
              
            mascotas.add(new Mascota("Fer", "Chiquito", "Beagle"));
        }
    }
    
    public void fabricaMascota(int cantidad){
        for (int i = 0; i <cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            
            System.out.println(mascotaCreada.toString());
        }
    }
}
