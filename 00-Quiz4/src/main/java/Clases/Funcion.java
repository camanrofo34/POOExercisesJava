/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Personal
 */
public class Funcion {
    private String pelicula, horario;
    private int sala, capacidad;

    public Funcion(String pelicula, String horario, int sala, int capacidad) {
        this.pelicula = pelicula;
        this.horario = horario;
        this.sala = sala;
        this.capacidad = capacidad;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getHorario() {
        return horario;
    }

    public int getSala() {
        return sala;
    }

    public int getCapacidad() {
        return capacidad;
    }
    
    public void actCapacidad(int cambio){
        capacidad-=cambio;
    }
}
