/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marce
 */
public class Participante {
    private String nombre;
    private int puntos;
    private List<Pronostico> pronosticos;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.pronosticos = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Ronda> rondas) {
        List<Partido> partidos = new ArrayList<>();
        for(Ronda ronda1 : rondas){
            for(Partido partido1 : ronda1.getPartidos()){
               partidos.add(partido1);
            }
        }
        
        for(int i = 0 ; i<partidos.size() ; i++){
            if(partidos.get(i).getResultado() == pronosticos.get(i).getResultado())
                this.puntos += 1; 
        }
        
    }

    public List<Pronostico> getPronosticos() {
        return pronosticos;
    }

    public void setPronosticos(List<Pronostico> pronosticos) {
        this.pronosticos = pronosticos;
    }

    @Override
    public String toString() {
        return "Participante{" + "nombre=" + nombre + ", puntos=" + puntos + ", pronosticos=" + pronosticos + '}';
    }
    
}
