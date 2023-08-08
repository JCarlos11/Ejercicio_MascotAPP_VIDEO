/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mascotaapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import mascotapp.utilidades.Comparadores;
import mascotapp_entidades.Mascota;
import mascotapp_servicioss.ServicioMascota;

/**
 *
 * @author JCarlos
 */
public class MascotaAPP {

    public static void main(String[] args) {
        
        
        TreeSet<Mascota> mascotas = new TreeSet();
        
        mascotas.add(new Mascota("Chiquito", "Perro", "Fer"));
        mascotas.add(new Mascota("Chiquito", "Perro", "Fer"));
        mascotas.add(new Mascota("Chiquito", "Perro", "Fer"));
        mascotas.add(new Mascota("Chiquito", "Perro", "Fer"));
        mascotas.add(new Mascota("Chiquito", "Perro", "Fer"));
        mascotas.add(new Mascota("Lola", "Gato", "Pepa"));
        mascotas.add(new Mascota("Lola", "Gato", "Pepa"));
        mascotas.add(new Mascota("Lola", "Gato", "Pepa"));
        mascotas.add(new Mascota("Lola", "Gato", "Pepa"));
        mascotas.add(new Mascota("Lola", "Gato", "Pepa"));
        mascotas.add(new Mascota("Chiquito", "Perro", "Fer"));
        mascotas.add(new Mascota("Chiquito", "Perro", "Fer"));
        mascotas.add(new Mascota("Chiquito", "Perro", "Fer"));
        mascotas.add(new Mascota("Chiquito", "Perro", "Fer"));
        
//        Collections.sort(mascotas,Comparadores.ordenarPorNombreDesc);
//        
//        Collections.shuffle(mascotas);
//        
        for (Mascota mascota : mascotas) {
            System.out.println(mascota);
        }
        
//        ServicioMascota servMasc = new ServicioMascota();
//        
//        servMasc.fabricaMascota(2);
//        
//        servMasc.mostrarMascotas();
//        
//        servMasc.actualizarMascota(0);
//        
//        servMasc.eliminarMascota(0);
//        
//         servMasc.mostrarMascotas(); 
    }
}
