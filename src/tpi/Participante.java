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
    private List<Partido> partidos;

    public Participante(String nombre) {
        this.nombre = nombre;
        this.partidos = new ArrayList<>();
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }
    
    
    
}
