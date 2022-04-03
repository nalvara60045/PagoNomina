/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author nicoa
 */
@DatabaseTable(tableName = "empleados")
public class Empleado 
{
    // aca identificamos que el id es la llave primaria de nuestra base de datos.
    @DatabaseField (id = true)
    private int id;
    
    @DatabaseField (canBeNull = false)
    private String nombre;
    
    @DatabaseField (canBeNull = false)
    private String apellidos;
    
    @DatabaseField (canBeNull = false)
    private String cargo;
    
    @DatabaseField (canBeNull = false)
    private float salariobase;
    
    @DatabaseField (canBeNull = false)
    private String horasContrato;
    
    
    // Se crea un constructor vacio ya que ormLite solicita la ejecución de 2 constructores.
    public Empleado() {}
    // Se construye el constructor con los atributos
    public Empleado(int id, String nombre, String apellidos, String cargo, float salariobase, String horasContrato) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.cargo = cargo;
        this.salariobase = salariobase;
        this.horasContrato = horasContrato;
    }
    // Se generan los Getter y Setter de cada atributo para su correcto funcionamiento
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalariobase() {
        return salariobase;
    }

    public void setSalariobase(float salariobase) {
        this.salariobase = salariobase;
    }

    public String getHorasContrato() {
        return horasContrato;
    }

    public void setHorasContrato(String horasContrato) {
        this.horasContrato = horasContrato;
    }
    
    
    
    
    
    
}
