/**
 * Class Documental
 */
package uni1a;

// Subclase Documental que extiende de ContenidoAudiovisual

import java.util.Scanner;

public class Documental extends ContenidoAudiovisual {
    Scanner sn = new Scanner(System.in);
    private String tema;
    public Documental(){
    super("",0,"");
            }
    public Documental(String titulo, int duracionEnMinutos, String genero, String tema) {
        super(titulo, duracionEnMinutos, genero);
        this.tema = tema;
    }
          public void ingresarDatos (){
        System.out.println("Registro Documental");
        System.out.println("Ingrese el titulo ");
        titulo = sn.next();
        System.out.println("Ingrese la duracion en minutos ");
        duracionEnMinutos = sn.nextDouble();
        System.out.println("Ingrese el genero ");
        genero = sn.next();
        System.out.println("Ingrese el tema");
        tema = sn.next();
        
    }
    
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del documental:");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println("Tema: " + this.tema);
        System.out.println();
    }
}