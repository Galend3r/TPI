/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi;

/**
 *
 * @author Marce
 */
public class Pronostico {
    private String Equipo1;
    private String Equipo2;
    private Resultado resultado;

    public Pronostico(String Equipo1, String Equipo2, Resultado resultado) {
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.resultado = resultado;
    }

    public String getEquipo1() {
        return Equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public Resultado getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "Pronostico{" + "Equipo1=" + Equipo1 + ", Equipo2=" + Equipo2 + ", resultado=" + resultado + '}';
    }
    
    
}

