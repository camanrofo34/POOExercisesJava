/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Personal
 */
public class Cliente extends Usuario {
    private String email;
    private int puntos;
    // Constructor que recibe todos los datos, incluyendo los heredados de Usuario
    public Cliente (String documento, String nombre, String apellido, String email, int puntos) {
        // Llama al constructor de la clase base (Usuario) para inicializar sus atributos heredados
        super(documento, nombre, apellido);

        // Inicializa el atributo adicional de Operador
        this.email=email;
        this.puntos = puntos;
    }

    public String getEmail() {
        return email;
    }

    public int getPuntos() {
        return puntos;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
