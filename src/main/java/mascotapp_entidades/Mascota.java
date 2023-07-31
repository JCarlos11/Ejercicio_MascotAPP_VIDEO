/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotapp_entidades;

/**
 *
 * @author JCarlos
 */
public class Mascota {
    
    private String apodo;
    private String tipo;
    private String nombre;

    public Mascota() {
    }

    public Mascota(String apodo, String tipo, String nombre) {
        this.apodo = apodo;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Mascota{" + "apodo=" + apodo + ", tipo=" + tipo + ", nombre=" + nombre + '}';
    }
    
    
}
