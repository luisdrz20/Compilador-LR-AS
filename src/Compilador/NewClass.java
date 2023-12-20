/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compilador;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Luis David
 */
public class NewClass {
    
       public static void main(String[] args) {        // Crear un HashMap que almacena nombres como claves y listas de edades como valores
        HashMap<String, List<Integer>> mapaEdades = new HashMap<>();

        // Agregar elementos al HashMap
        // Agregar varias edades para "Juan"
        mapaEdades.computeIfAbsent("Juan", k -> new ArrayList<>()).add(25);
        mapaEdades.computeIfAbsent("Juan", k -> new ArrayList<>()).add(30);
        mapaEdades.computeIfAbsent("Juan", k -> new ArrayList<>()).add(35);

        // Agregar varias edades para "María"
        mapaEdades.computeIfAbsent("María", k -> new ArrayList<>()).add(30);
        mapaEdades.computeIfAbsent("María", k -> new ArrayList<>()).add(35);

        // Agregar varias edades para "Pedro"
        mapaEdades.computeIfAbsent("Pedro", k -> new ArrayList<>()).add(22);
        mapaEdades.computeIfAbsent("Pedro", k -> new ArrayList<>()).add(24);

        // Acceder a las edades de "Juan"
       // List<Integer> edadesDeJuan = mapaEdades.get("Juan");
        System.out.println("Edades de Juan: " + mapaEdades.get("Juan"));

        // Acceder a las edades de "María"
   
        System.out.println("Edades de María: " + mapaEdades.get("María"));

        // Acceder a las edades de "Pedro"

        System.out.println("Edades de Pedro: " + mapaEdades.get("Pedro"));
        
           System.out.println(mapaEdades);
           
           // Verificar si una clave existe en el HashMap
        boolean existeJuan = mapaEdades.containsKey("Juajn");
        System.out.println("¿Existe Juan en el mapa? " + existeJuan);
        
        
        //List<Integer> edadesDeJuan = mapaEdades.get("Juan");
if (mapaEdades.get("Juan") != null && mapaEdades.get("Juan").size() >= 2) {
    int segundaEdadDeJuan = mapaEdades.get("Juan").get(1);
    System.out.println("La segunda edad de Juan es: " + segundaEdadDeJuan);
} else {
    System.out.println("No hay una segunda edad registrada para Juan.");
}
    }
        
    }

