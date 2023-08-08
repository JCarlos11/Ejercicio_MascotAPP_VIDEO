/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotapp_entidades;

import java.util.Objects;

/**
 *
 * @author JCarlos
 */
public class Mascota implements Comparable<Mascota> {
    
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

    //Sirve para generar un codigo numerico con base en la clase
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.apodo);
        hash = 53 * hash + Objects.hashCode(this.tipo);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.color);
        hash = 53 * hash + Objects.hashCode(this.edad);
        hash = 53 * hash + (this.cola ? 1 : 0);
        hash = 53 * hash + Objects.hashCode(this.raza);
        hash = 53 * hash + this.energia;
        return hash;
    }

    //Sirve para comparar una clase mascota con otra clase mascota
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (this.cola != other.cola) {
            return false;
        }
        if (this.energia != other.energia) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        return Objects.equals(this.edad, other.edad);
    }
    
    

    @Override
    public String toString() {
        return "Mascota{" + "apodo=" + apodo + ", tipo=" + tipo + ", nombre=" + nombre + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + '}';
    }
    

    @Override
    public int compareTo(Mascota o) {
        return o.getNombre().compareTo(this.nombre);
    }
    
    

    
    
    
    
    
}
