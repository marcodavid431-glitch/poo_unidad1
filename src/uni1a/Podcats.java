/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package uni1a;

import java.util.*;

public class Podcats  extends ContenidoAudiovisual{
    Scanner sn = new Scanner(System.in);
    
    private int numeroEpisodio;
    private String invitadoEspecial;
    private String tematica;
       public Podcats() {
        super("", 0, "");
        
    }    
  
    public Podcats( int numeroEpisodio, String invitadoEspecial, String tematica, String titulo , int duracionEnMinutos , String genero) {
        super(titulo, duracionEnMinutos,genero);
        this.numeroEpisodio = numeroEpisodio;
        this.invitadoEspecial = invitadoEspecial;
        this.tematica = tematica;
    }
    public void ingresarDatos(){
        System.out.println("PODCATS ");
        System.out.println("Ingrese el titulo ");
        titulo = sn.next();
        System.out.println("Ingrese la duracion en minutos ");
        duracionEnMinutos = sn.nextDouble();
        System.out.println("Ingrese el genero ");
        genero = sn.next();
        System.out.println("ingrese el numero del episodio");
        numeroEpisodio = sn.nextInt();
        System.out.println(" Ingrese el nombre del inivitado especial  ");
        invitadoEspecial = sn.next();
        System.out.println("Ingrese la tematica  ");
        tematica = sn.next();
    }
    public void imprimirDatos() {
        System.out.println("Los datos son");
        System.out.println("Titulo : "+ titulo);
        System.out.println("La duracion es "+ duracionEnMinutos);
        System.out.println("El genero al  que corresponde es "+ genero );
        System.out.println("El episodio es " + numeroEpisodio);
        System.out.println("El nombre del invitado especial es  " + invitadoEspecial);
        System.out.println("La tematica es "+ tematica);
        
    
    }
    @Override
    public void mostrarDetalles() {
        System.out.println(" LOS DETALLES SON  ");
        
    }

    
   
   




}
