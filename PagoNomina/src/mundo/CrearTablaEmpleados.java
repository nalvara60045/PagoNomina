/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundo;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import java.sql.SQLException;

/**
 *
 * @author nicoa
 */
// Esta modulo solo debe de ejecutarse una vez.
public class CrearTablaEmpleados 
{
    public static void main(String[] args) throws Exception
    {
        // Se crea la conexión a la base de datos
        ConnectionSource conexion;
        // Se requiere una url para la base de datos generada localmente dentro del proyecto
        String url = "jdbc:h2:file:./data/misempleados";
        // Se realiza la conexion de la base de datos a la URL
        conexion = new JdbcConnectionSource(url);
        System.out.println("Conexión realizada!");
        // Se crea efectivamente la tabla
        TableUtils.createTable(conexion, Empleado.class);
        System.out.println("Tabla creada");
        // Se cierra la conexion.
        conexion.close();
        
    }
    
}
