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
        String[] lectura;
        List<Partido> partidos = new ArrayList<>();
        List<Pronostico> pronosticos = new ArrayList<>();
        Resultado resultado = null;
        int puntos = 0;
        
        //lectura de resultados
        Path resultadosPath = Paths.get("archivos/resultados.csv");
        for(String linea : Files.readAllLines(resultadosPath.toAbsolutePath()))
        {
            lectura = linea.split(",");
            Partido readPartido = new Partido(lectura[0],lectura[3],Integer.parseInt(lectura[1]),Integer.parseInt(lectura[2]));
            partidos.add(readPartido);
        }
        
        System.out.println(partidos.get(0));
        System.out.println(partidos.get(1));
        
        //lectura de pronosticos
        Path pronosticosPath = Paths.get("archivos/pronosticos.csv");
        for(String linea : Files.readAllLines(pronosticosPath.toAbsolutePath()))
        {
            lectura = linea.split(",");
            if("X".equals(lectura[1]))
                resultado = Resultado.GANA1;
            if("X".equals(lectura[2]))
                resultado = Resultado.EMPATE;
            if("X".equals(lectura[3]))
                resultado = Resultado.GANA2;
            
            Pronostico readPronostico = new Pronostico(lectura[0],lectura[4],resultado);
            pronosticos.add(readPronostico);
        }
        
        System.out.println(pronosticos.get(0));
        System.out.println(pronosticos.get(1));
        
        for (Partido partido : partidos) 
        {
            for (Pronostico pronostico : pronosticos) 
            {
                if( partido.getResultado() == pronostico.getResultado() )
                    puntos+=1;
            }
        }
        System.out.println("Los puntos obtenidos son: " + puntos);
    }
}
