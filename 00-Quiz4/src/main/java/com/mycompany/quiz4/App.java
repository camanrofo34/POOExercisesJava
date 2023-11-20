/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quiz4;

import Clases.Boleta;
import Clases.Cliente;
import Clases.Funcion;
import Clases.Operador;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {
    static ArrayList<Funcion> cartelera = new ArrayList<>();
    static ArrayList<Cliente> usuarios = new ArrayList<>();
    static ArrayList<Operador> operadores = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                
        // Solicitar y crear un objeto Operador con los datos ingresados
        System.out.println("Ingrese los datos del operador:");
        System.out.print("Documento: ");
        String documentoOperador = scanner.nextLine();
        System.out.print("Nombre: ");
        String nombreOperador = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellidoOperador = scanner.nextLine();
        System.out.print("Horario: ");
        String horarioOperador = scanner.nextLine();
        // Crear un objeto Operador con los datos ingresados
        Operador nuevoOperador = new Operador(documentoOperador, nombreOperador, apellidoOperador, horarioOperador);

        // Agregar el nuevo operador a la lista de operadores
        operadores.add(nuevoOperador);
        boolean comprador = true;
    while (comprador){
        boolean other = true;
        // Bucle para agregar funciones a la cartelera
        while (other) {
            // Solicitar datos de la función y crear un objeto Funcion
            System.out.println("Ingrese los datos de la función:");
            System.out.print("Película: ");
            String pelicula = scanner.nextLine();
            System.out.print("Horario: ");
            String horarioFuncion = scanner.nextLine();
            System.out.print("Sala: ");
            int sala = Integer.parseInt(scanner.nextLine());
            System.out.print("Capacidad: ");
            int capacidad = Integer.parseInt(scanner.nextLine());

            // Crear un objeto Funcion con los datos ingresados
            Funcion nuevaFuncion = new Funcion(pelicula, horarioFuncion, sala, capacidad);

            // Agregar la nueva función a la lista de cartelera
            cartelera.add(nuevaFuncion);
            System.out.println("¿Desea agregar una función a la cartelera? (S/N):");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("N")) {
                other=false; // Salir del bucle si la respuesta es "N"
            }
        }
        Cliente clienteEncontrado=null;
            // Bucle principal del programa
        boolean aceptado=true;
            while (aceptado) {
                System.out.println("¿Es usted un cliente registrado? (S/N):");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("S")) {
                // Cliente registrado, buscar por documento
                System.out.print("Ingrese el documento del cliente: ");
                String documentoCliente = scanner.nextLine();

                // Buscar al cliente en la lista de usuarios
                clienteEncontrado = buscarClientePorDocumento(documentoCliente);

                    if (clienteEncontrado != null) {
                        System.out.println("Bienvenido, " + clienteEncontrado.getNombre() + " " + clienteEncontrado.getApellido() + "!");
                        aceptado=false;
                    } else {
                    System.out.println("Cliente no encontrado.");
                    }
                } else if (respuesta.equalsIgnoreCase("N")) {
                    // Cliente no registrado, solicitar todos los datos y crear un objeto Cliente
                    System.out.println("Ingrese los datos del cliente:");
                    System.out.print("Documento: ");
                    String documentoCliente = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellidoCliente = scanner.nextLine();
                    System.out.print("Email: ");
                    String emailCliente = scanner.nextLine();

                    // Crear un objeto Cliente con los datos ingresados
                    Cliente nuevoCliente = new Cliente(documentoCliente, nombreCliente, apellidoCliente, emailCliente, 0);

                    // Agregar el nuevo cliente a la lista de usuarios
                    usuarios.add(nuevoCliente);
                    System.out.println("Cliente registrado exitosamente.");
                    
                } else {
                    System.out.println("Respuesta no válida. Por favor, ingrese S o N.");
                }            
        }
            // Solicitar al cliente la compra de boletas
        System.out.println("¿Desea comprar boletas? (S/N):");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("S")) {
            System.out.println("Cartelera de funciones:");
            for (int i = 0; i < cartelera.size(); i++) {
                Funcion funcion = cartelera.get(i);
                System.out.println((i + 1) + ". Película: " + funcion.getPelicula() + " - Horario: " + funcion.getHorario() + " - Sala: " + funcion.getSala() + " - Capacidad: " + funcion.getCapacidad());
            }
            // Solicitar al cliente seleccionar una función
            System.out.print("Seleccione el número de la función que desea: ");
            int numeroFuncion = Integer.parseInt(scanner.nextLine()) - 1; // Restamos 1 para ajustar al índice de la lista
            if (numeroFuncion < 0 || numeroFuncion >= cartelera.size()) {
                System.out.println("Número de función no válido.");
            }
            else{
            Funcion funcionSeleccionada = cartelera.get(numeroFuncion);

            // Solicitar al cliente la cantidad de boletas
            System.out.print("Ingrese la cantidad de boletas que desea comprar: ");
            int cantidadBoletas = Integer.parseInt(scanner.nextLine());

                if (cantidadBoletas <= 0 || cantidadBoletas > funcionSeleccionada.getCapacidad()) {
                    System.out.println("Cantidad de boletas no válida.");
                }
                else{
                // Calcular el precio total
                int precioTotal = cantidadBoletas * 2; // Precio por boleta es de 2 dólares

                // Crear un objeto Boleta con los detalles de la compra
                Boleta boleta = new Boleta(
            "Fecha", // Debes reemplazar con la fecha actual o la que desees
            clienteEncontrado.getDocumento(),
            clienteEncontrado.getNombre(),
            clienteEncontrado.getApellido(),
            nuevoOperador.getNombre(), // Puedes obtener el nombre del operador desde el objeto objOpr
          funcionSeleccionada.getPelicula(),
           funcionSeleccionada.getHorario(),
             cantidadBoletas,
             funcionSeleccionada.getSala(),
           precioTotal
);

// Imprimir la boleta
        System.out.println("Boleta de Compra:");
        System.out.println("Fecha: " + boleta.getFecha());
        System.out.println("Cliente: " + boleta.getClNom() + " " + boleta.getClApl() + " (Documento: " + boleta.getClDoc() + ")");
        System.out.println("Operador: " + boleta.getOpNom());
        System.out.println("Película: " + boleta.getPelicula());
        System.out.println("Horario: " + boleta.getHorario());
        System.out.println("Cantidad de Boletas: " + boleta.getCant());
        System.out.println("Sala: " + boleta.getSala());
        System.out.println("Precio Total: $" + boleta.getPrecio());

        // Restar la cantidad de boletas compradas de la capacidad de la función
        funcionSeleccionada.actCapacidad(cantidadBoletas);
        }
        }  
        }
        System.out.print ("¿Ha acabado ya su turno? (S/N):");
        String turno = scanner.nextLine();
        if (turno.equalsIgnoreCase("N")) comprador=false;
            
        
        }
        
        System.out.println("Gracias por usar el sistema.");
    }
    public static Cliente buscarClientePorDocumento(String documento) {
    for (Cliente cliente : usuarios) {
        if (cliente.getDocumento().equalsIgnoreCase(documento)) {
            return cliente; // Devuelve el cliente si se encuentra
        }
    }
    return null; // Devuelve null si no se encuentra el cliente
    }
}

