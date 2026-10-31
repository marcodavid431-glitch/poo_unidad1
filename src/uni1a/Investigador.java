/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni1a;

/**
 *
 * @author PERSONAL
 */
public class Investigador {
    private String nombre; 
    private String especialidad;
    private String anosLab; 

   

    public Investigador(String nombre, String especialidad, String anosLab) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.anosLab = anosLab;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getAnosLab() {
        return anosLab;
    }

    public void setAnosLab(String anosLab) {
        this.anosLab = anosLab;
    }

    @Override
    public String toString() {
        return "Investigador{" + "nombre=" + nombre + ", especialidad=" + especialidad + ", anosLab=" + anosLab + '}';
    }
    
    
}
