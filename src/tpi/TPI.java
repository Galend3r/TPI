/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marce
 */
public class TPI {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        
//        for (String arg : args) {
//            System.out.println(arg);con esto repaso los elementos que entran por consola
//        }
        
        List<Partido> partidos = new ArrayList<>();
        List<Pronostico> pronosticos = new ArrayList<>();
        List<Ronda> rondas = new ArrayList<>();
        List<Participante> participantes = new ArrayList();
        
        String[] lectura;
        Resultado resultado = null;
        Participante participante = null;
        String rondaAnterior = "1";
        String rondaActual = "1";
        String participanteActual = null;
        String participanteAnterior = null;
        Ronda ronda = new Ronda(rondaActual);
        
        //lectura de resultados
        Path resultadosPath = Paths.get("archivos/resultados.csv");
        for(String linea : Files.readAllLines(resultadosPath.toAbsolutePath()))
        {
            lectura = linea.split(",");
            rondaActual = lectura[0];
            if(rondaActual.equals(rondaAnterior))
            {
                Partido readPartido = new Partido(lectura[1],lectura[4],Integer.parseInt(lectura[2]),Integer.parseInt(lectura[3]));
                partidos.add(readPartido);
            }else{
                ronda.setPartidos(partidos);
                rondas.add(ronda);
                rondaAnterior = rondaActual;
                ronda = new Ronda(rondaActual);
                partidos = new ArrayList<>();
                Partido readPartido = new Partido(lectura[1],lectura[4],Integer.parseInt(lectura[2]),Integer.parseInt(lectura[3]));
                partidos.add(readPartido);
            }
        }
        ronda.setPartidos(partidos);
        rondas.add(ronda);

        //lectura de pronosticos
        Path pronosticosPath = Paths.get("archivos/pronosticos.csv");
        for(String linea : Files.readAllLines(pronosticosPath.toAbsolutePath()))
        {
            lectura = linea.split(",");
            participanteActual = lectura[0];
            if(participanteActual.equals(participanteAnterior))
            {
                if("X".equals(lectura[2]))
                    resultado = Resultado.GANA1;
                if("X".equals(lectura[3]))
                    resultado = Resultado.EMPATE;
                if("X".equals(lectura[4]))
                    resultado = Resultado.GANA2;
                Pronostico readPronostico = new Pronostico(lectura[1],lectura[5],resultado);
                pronosticos.add(readPronostico);
            }else{
                if(participanteAnterior==null)
                {
                    participante = new Participante(participanteActual);
                    if("X".equals(lectura[2]))
                        resultado = Resultado.GANA1;
                    if("X".equals(lectura[3]))
                        resultado = Resultado.EMPATE;
                    if("X".equals(lectura[4]))
                        resultado = Resultado.GANA2;
                    Pronostico readPronostico = new Pronostico(lectura[1],lectura[5],resultado);
                    pronosticos.add(readPronostico);
                    participanteAnterior = participanteActual;
                }
                else{
                    participante.setPronosticos(pronosticos);
                    participantes.add(participante);
                    participanteAnterior = participanteActual;
                    participante = new Participante(participanteActual);
                    pronosticos = new ArrayList<>();
                    if("X".equals(lectura[2]))
                        resultado = Resultado.GANA1;
                    if("X".equals(lectura[3]))
                        resultado = Resultado.EMPATE;
                    if("X".equals(lectura[4]))
                        resultado = Resultado.GANA2;
                    Pronostico readPronostico = new Pronostico(lectura[1],lectura[5],resultado);
                    pronosticos.add(readPronostico);
                }
            }           
        }
        participante.setPronosticos(pronosticos);
        participantes.add(participante);
        
        //calculo puntaje
        for (Participante participante1 : participantes) {
            participante1.setPuntos(rondas);
            System.out.println("Nombre: " + participante1.getNombre() + ", Pronosticos acertados : "+ participante1.getPuntos() +", Puntos ganados: " + participante1.getPuntos());
        }
        } 
    }
