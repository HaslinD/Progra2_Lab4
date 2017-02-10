/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package haslindavila_.lab3;

/**
 *
 * @author Franklin Garcia
 */

public class jugadores {
    private String nombre,usuario,puntos,nacimiento,sexo;
    private int edad;

    public jugadores() {
    }

    public jugadores(String nombre, String usuario, String puntos, String nacimiento, String sexo, int edad) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.puntos = puntos;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "jugadores{" + "nombre=" + nombre + ", usuario=" + usuario + ", puntos=" + puntos + ", nacimiento=" + nacimiento + ", sexo=" + sexo + ", edad=" + edad + '}';
    }
    
}
