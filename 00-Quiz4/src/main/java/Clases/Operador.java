/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Personal
 */
public class Operador extends Usuario{
    private String horario; // Atributo adicional para Operador

    // Constructor que recibe todos los datos, incluyendo los heredados de Usuario
    public Operador(String documento, String nombre, String apellido, String horario) {
        // Llama al constructor de la clase base (Usuario) para inicializar sus atributos heredados
        super(documento, nombre, apellido);

        // Inicializa el atributo adicional de Operador
        this.horario = horario;
    }

    public String getHorario() {
        return horario;
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

    public void setHorario(String horario) {
        this.horario = horario;
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
