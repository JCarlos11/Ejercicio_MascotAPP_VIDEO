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
    private String color;
    private Integer edad;
    private boolean cola;
    private String raza;
    
    private int energia;

    public Mascota() {
        this.energia = 1000;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Mascota{" + "apodo=" + apodo + ", tipo=" + tipo + ", nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + '}';
    }
    
    

    
    
    
    
    
}
