/**
 * Class SerieDeTV
 */
package uni1a;
import java.util.*;
// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    Scanner sn =new Scanner (System.in);
    private ArrayList<Temporada> listaTemporadas;

    public SerieDeTV (){
    super("",0,"");
    this.listaTemporadas = new ArrayList<>();
    }
    public SerieDeTV(String titulo, double duracionEnMinutos, String genero) {
        super(titulo, duracionEnMinutos, genero);
        this.listaTemporadas = new ArrayList<>();
        
    }
        public void ingresarDatos (){
        System.out.println("Registro Serie TV ");
        System.out.println("Ingrese el titulo ");
        titulo = sn.next();
        System.out.println("Ingrese la duracion en minutos ");
        duracionEnMinutos = sn.nextDouble();
        System.out.println("Ingrese el genero ");
        genero = sn.next();
        
    }
        public void agregarTemporada(Temporada tem) {
        this.listaTemporadas.add(tem);
    }
   
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la pelicula:");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("Genero: " + getGenero());
        System.out.println(" Temporadas Registradas ");
        for (Temporada t : listaTemporadas) {
            System.out.println(t);
        }
        System.out.println();
    }
}