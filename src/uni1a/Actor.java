/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni1a;

/**
 *
 * @author PERSONAL
 */
public class Actor {
    private String nombe;
    private String personaje; 

    public Actor(String nombe, String personaje) {
        this.nombe = nombe;
        this.personaje = personaje;
    }

    public String getNombe() {
        return nombe;
    }

    public void setNombe(String nombe) {
        this.nombe = nombe;
    }

    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombe=" + nombe + ", personaje=" + personaje + '}';
    }
    
    
    
}
