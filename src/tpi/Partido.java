/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpi;

/**
 *
 * @author Marce
 */
public class Partido {
    private String Equipo1;
    private String Equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private Resultado resultado;

    public Partido(String Equipo1, String Equipo2, int golesEquipo1, int golesEquipo2) {
        this.Equipo1 = Equipo1;
        this.Equipo2 = Equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
        this.resultado = setResultado();
    }

    public String getEquipo1() {
        return Equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public Resultado getResultado() {
        return resultado;
    }

    private Resultado setResultado() {
        if (this.golesEquipo1>this.golesEquipo2)
            this.resultado = Resultado.GANA1;
        if(this.golesEquipo2>this.golesEquipo1)
            this.resultado = Resultado.GANA2;
        if(this.golesEquipo1 == this.golesEquipo2)
            this.resultado = Resultado.EMPATE;
        return this.resultado;
    }

    @Override
    public String toString() {
        return "Partido{" + "Equipo1=" + Equipo1 + ", Equipo2=" + Equipo2 + ", golesEquipo1=" + golesEquipo1 + ", golesEquipo2=" + golesEquipo2 + ", resultado=" + resultado + '}';
    }
    
    
}
