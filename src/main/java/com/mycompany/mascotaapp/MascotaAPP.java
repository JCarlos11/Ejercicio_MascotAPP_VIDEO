/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mascotaapp;

import mascotapp_servicioss.ServicioMascota;

/**
 *
 * @author JCarlos
 */
public class MascotaAPP {

    public static void main(String[] args) {
        
        ServicioMascota servMasc = new ServicioMascota();
        
        servMasc.fabricaChiquitos(140);
        
        servMasc.mostrarMascotas();
    }
}
