/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cine.user;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Diego
 */
public class GestionUsuario {

    public static void getResultados()
    {
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            Cliente[] resultados = objectMapper.readValue(new File("src/main/resources/Cliente.json"), Cliente[].class);

            for (Cliente res : resultados) {
                System.out.println("Cliente: " + res.getEmail());
                System.out.println("Cliente: " + res.getNombre());
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getUltimoResultado()
    {
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            Cliente[] resultados = objectMapper.readValue(new File("src/main/resources/Resultado.json"), Cliente[].class);
            Cliente ultimoResultado = resultados[resultados.length - 1];

            System.out.println("Aciertos: " + ultimoResultado.getEmail());
            System.out.println("Errores: " + ultimoResultado.getNombre());
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void actualizar(Cliente res)
    {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Cliente> resultados = new ArrayList<>();

        try {

            Cliente[] resultadosArray = objectMapper.readValue(new File("src/main/resources/Cliente.json"), Cliente[].class);
            resultados.addAll(Arrays.asList(resultadosArray));

            resultados.add(res);

            String jsonActualizado = objectMapper.writeValueAsString(resultados);

            FileWriter fileWriter = new FileWriter("src/main/resources/Cliente.json");
            fileWriter.write(jsonActualizado);
            fileWriter.close();

            System.out.println("Archivo actualizado con éxito.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
