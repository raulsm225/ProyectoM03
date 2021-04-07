/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creacionyescritura;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Creacionyescritura {
    // ------------- COMIENZO CODIGO CREAR NUEVA LINEA --------------------------
    public static void main(String[] args) {
        File fichero = new File("C:/ProyectoM03/sprint2/classroom2.txt");
        
        try {
            FileWriter writer = new FileWriter(fichero);
            
            writer.write("Línea 1\n");
            writer.write("Línea 2\n");
            writer.write("Línea 3\n");
            
            writer.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al crear/escribir en el fichero");
        }
    }
    
    //------------- COMIENZO DEL CODIGO Eliminar línea -------------------------------------------------------
    public static void main(String[] args) {
        File fichero = new File("C:/ProyectoM03/sprint2/classroom2.txt");
        ArrayList<String> lineas = new ArrayList<>();   
        try {
            Scanner lectorFichero = new Scanner(fichero);
                      
            while(lectorFichero.hasNext()) {
                lineas.add(lectorFichero.nextLine());
            }   
            lectorFichero.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/leer el fichero");
        }   
        try {
            FileWriter writer = new FileWriter(fichero);
            
            for (String linea : lineas) {
                if (!"Línea 3".equals(linea)) {
                    writer.write(linea + "\n");
                }
            }    
            writer.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/sobreescribir el fichero");
        }
    }
    // -------------FINAL DEL CODIGO Eliminar línea--------------------------
    
    // -------------COMIENZO CODIGO actualizar linea--------------------------
    public static void main(String[] args) {
        File fichero = new File("C:/ProyectoM03/sprint2/classroom2.txt");
        ArrayList<String> lineas = new ArrayList<>();
        try {
            Scanner lectorFichero = new Scanner(fichero);
            while(lectorFichero.hasNext()) {
                lineas.add(lectorFichero.nextLine());
            } 
            lectorFichero.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/leer el fichero");
        }
        try {
            FileWriter writer = new FileWriter(fichero);  
            for (String linea : lineas) {
                if ("Línea 4".equals(linea)) {
                    writer.write("Nueva Línea 4\n");
                } else {
                    writer.write(linea + "\n");
                }
            }
            writer.close();
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al abrir/sobreescribir el fichero");
        }
    }
    // FINAL CODIGO actualizar linea
}
