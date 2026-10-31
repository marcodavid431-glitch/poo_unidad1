
package uni1a;
import java.util.*;
public class VideoJuego extends ContenidoAudiovisual{
    Scanner sn = new Scanner(System.in);
    private String plataforma;
    private String categoria ;
    public VideoJuego() {
    super("",0,"");
    
    }
    
    public VideoJuego(String titulo, int duracionEnMinutos, String genero, String plataforma ,String categoria) {
        super(titulo, duracionEnMinutos, genero);
        this.plataforma = plataforma;
        this.categoria = categoria;
    }
    public void ingresarDatos() {
        System.out.println("VIDEO JUEGOS ");
        System.out.println("Ingrese el titulo ");
        titulo = sn.next();
        System.out.println("Ingrese la categoria  ");
        categoria = sn.next();
        System.out.println("Ingrese la plataforma (PC ,PLEYSTATION) ");
        plataforma = sn.next();
        System.out.println("Ingrese el tiempo que dura el juego ");
        duracionEnMinutos = sn.nextInt();
        System.out.println("Ingrese el genero ");
        genero = sn.next();
    }
    @Override
    public void mostrarDetalles() {
        System.out.println("TITULO"+ titulo);
        System.out.println("La categoria es :"+ categoria);
        System.out.println("La plataforma es  :"+ plataforma);
        System.out.println("El tiempo de juego es : "+ duracionEnMinutos);
        System.out.println("el genero es ::  "+ genero); 
    }
    
}
