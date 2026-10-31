/**
 * Class Pelicula
 */
package uni1a;

// Subclase Pelicula que extiende de ContenidoAudiovisual

import java.util.Scanner;

public class Pelicula extends ContenidoAudiovisual {
    Scanner sn = new Scanner(System.in);
    private String estudio;

    public Pelicula() {
        super("", 0, "");
        
    }

   
    public Pelicula(String titulo, double duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }
    public void ingresarDatos (){
        System.out.println("Registro Peliculas ");
        System.out.println("Ingrese el titulo ");
        titulo = sn.next();
        System.out.println("Ingrese la duracion en minutos ");
        duracionEnMinutos = sn.nextDouble();
        System.out.println("Ingrese el genero ");
        genero = sn.next();
        System.out.println("Ingrese el estudio en el que se grabo ");
        estudio = sn.next();
    }
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la pelicula:");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Estudio: " + estudio);
        System.out.println();
    }
}