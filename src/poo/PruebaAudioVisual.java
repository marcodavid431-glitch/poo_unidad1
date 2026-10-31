package poo;
import java.util.*;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);
            int opcion=0; 
        do { 
            System.out.println(" MENU ");
            System.out.println("1) Registrar pelicula  ");
            System.out.println("2) Registrar serie de tv ");
            System.out.println("3) Registrar  documental ");
            System.out.println("4) Registrar Podcas ");
            System.out.println("5) Registrar Video juego ");
            System.out.println("6) salir ");
            opcion = sn.nextInt();
            switch(opcion){
                case 1 : { 
                    
                   int num=0; 
                   Pelicula peli = new Pelicula (); 
                  do{ 
                    
                    System.out.println("1) Registrar pelicula  ");
                    System.out.println("2) MOstrar  ");
                    System.out.println("3) salir ");
                    num= sn.nextInt();
                    switch(num){
                        case 1:{
                            peli.ingresarDatos();
                        } 
                        break; 
                        case 2:{
                            peli.mostrarDetalles();
                        } 
                        break;
                        default: 
                            System.out.println("opcion invalida  ");   
                        
                    }} 
                  while (num!=3);
                    System.out.println("salir ");
                  }  
                break; 
                case 2 : {
                int num=0; 
                SerieDeTV tv = new SerieDeTV();
                
                do{
                    System.out.println("Serie de TV ");
                    System.out.println("1) Ingresar Serie ");
                    System.out.println("2) Agregar temporada");
                    System.out.println("3) Mostrar series y temporadas ");
                    System.out.println("4) salir  ");
                    num= sn.nextInt();
                    switch(num){
                        case 1 : 
                            tv.ingresarDatos();
                            break; 
                        case 2 : 
                            System.out.println("Numuerode temporadas");
                            int numeroTem = sn.nextInt();
                            System.out.println("Numuerode episodios");
                            int numeroEpi = sn.nextInt();
                            Temporada tem = new Temporada(numeroTem , numeroEpi);
                            tv.agregarTemporada(tem);
                            System.out.println("Temporada agregada");
                            break;
                        case 3 : 
                            tv.mostrarDetalles();
                             break;
                        case 4 : 
                            System.out.println("Saliendooo");
                            break; 
                        default : 
                            System.out.println("Opcion invalida ");
                    }
                }
                while(num!=4);
                    System.out.println("opcion invalida ");
                }
                break;
                case 3 : {
                    int num=0;
                    Documental doc = new Documental(); 
                    do{
                        System.out.println("Menu documental");
                        System.out.println("1) Registrar documental");
                        System.out.println("2) Mostrar informacion ");
                        System.out.println("3) salir");
                        num= sn.nextInt();
                        switch(num){
                            case 1 :
                                doc.ingresarDatos();
                                break;
                            case 2:
                                doc.mostrarDetalles();
                                break; 
                            case 3: 
                                System.out.println("Salir ");
                                break ; 
                        }
                    
                    
                    }
                    while (num!=3);
                    System.out.println("opcion invalida ");
                }
                break;
                case 4 : {
                    int num =0; 
                    Podcats podcast = new Podcats();
                    do {
                     System.out.println("Menu Podcats");
                     System.out.println("1) Registrar Podcast");
                     System.out.println("2) Mostrar");
                     System.out.println("3) Salir");
                     num = sn.nextInt();
                     switch(num){
                        case 1:
                            podcast.ingresarDatos(); 
                        break; 
                        case 2:
                            podcast.imprimirDatos();
                        break;
                        case 3:
                             System.out.println("Saliendoo");
                         break;
                        default:
                            System.out.println("Opcion invaida");
                        }
                } while (num != 3);
                    System.out.println("Opcion invalida ");
                }
                break;
                case 5: {
                    int num = 0;
                    VideoJuego juego = new VideoJuego();
    
                    do {
                    System.out.println(" Menu de juegos ");
                    System.out.println("1) Registrar Videojuego");
                    System.out.println("2) Mostrar");
                    System.out.println("3) Salir");
                    num = sn.nextInt();

                    switch(num){
                        case 1:
                            juego.ingresarDatos();
                         break; 
                         case 2:
                             juego.mostrarDetalles();
                        break;
                        case 3:
                             System.out.println("Saliendo...");
                          break;
                         default:
                            System.out.println("Opción inválida");
                         }
                        } while (num != 3);
                        System.out.println("Opcion invalida  ");
                break;
                }
                case 6 : {
                    System.out.println("Salir ");}
                break;
                default:
                    System.out.println("opcion invalida ");
            
            }
    }
     while(opcion!=7) ; 
            System.out.println("opcion invalida  ");
        
}}