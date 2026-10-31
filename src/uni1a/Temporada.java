/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uni1a;

/**
 *
 * @author PERSONAL
 */
public class Temporada {
    private int numeroTemporada; 
    private int cantidadEpisodio;

 

    public Temporada(int numeroTemporada, int cantidadEpisodio) {
        this.numeroTemporada = numeroTemporada;
        this.cantidadEpisodio = cantidadEpisodio;
    }

    public int getNumeroTemporada() {
        return numeroTemporada;
    }

    public void setNumeroTemporada(int numeroTemporada) {
        this.numeroTemporada = numeroTemporada;
    }

    public int getCantidadEpisodio() {
        return cantidadEpisodio;
    }

    public void setCantidadEpisodio(int cantidadEpisodio) {
        this.cantidadEpisodio = cantidadEpisodio;
    }

    @Override
    public String toString() {
        return "Temporada{" + "numeroTemporada=" + numeroTemporada + ", cantidadEpisodio=" + cantidadEpisodio + '}';
    }
    
}
