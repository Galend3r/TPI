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
public class Ronda {
    private String ronda;
    private List<Partido> partidos;

    public Ronda(String ronda) {
        this.ronda = ronda;
        this.partidos = new ArrayList<>();
    }

    public String getRonda() {
        return ronda;
    }

    public void setRonda(String ronda) {
        this.ronda = ronda;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    @Override
    public String toString() {
        return "Ronda{" + "ronda=" + ronda + ", partidos=" + partidos + '}';
    }
}
