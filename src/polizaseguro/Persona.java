/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polizaseguro;

/**
 *
 * @author Empar Ibáñez
 */
public class Persona {
    String nombre, apellido1, apellido2, dni, direccion;
    int edad;
    Persona conyuge;

    public Persona(String nombre, String apellido1, String apellido2, String dni, String direccion, int edad, Persona conyuge) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.direccion = direccion;
        this.edad = edad;
        this.conyuge = conyuge;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getConyuge() {
        return conyuge;
    }

    public void setConyuge(Persona conyuge) {
        this.conyuge = conyuge;
    }
    
    public Persona() {
        
    }
    
}
