/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

        Path resultadosPath = Paths.get("archivos/resultados.csv");
        System.out.println(resultadosPath.toAbsolutePath());
        for(String linea : Files.readAllLines(resultadosPath.toAbsolutePath()))
            System.out.println(linea);
            
    }
    
}
