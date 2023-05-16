package sesion43AccesoAbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Controlador {

	public static void main(String[] args) {
		
		
		Connection conexion=null;
		Statement sentenciaSQL = null;
		ResultSet rs = null;
		int numero=0;
		
		try {
			//conectar con la base de datos
			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection("jdbc:mysql://localhost/series",
					"root", "");// proporcionamos la dirección, el administrador y la clave
			
			//creamos sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();
			
			//almaceno el resultado de la sql en un resulset (conjunto de registros)
			 rs = sentenciaSQL.executeQuery("SELECT count(*) FROM tiulo");
		     // chequeo que el result set no sea vacío, moviendo el cursor a la 
		     // primer fila. (El cursor inicia antes de la primer fila)
		     if(rs.next()) {
		       //Si hay resultados obtengo el valor. 
		        numero= rs.getInt(1);
		        System.out.println(numero);
		     }
			
		} catch (SQLException ex) {
			ex.printStackTrace();
			//System.out.println("Error");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Conectado/desconectado");
	}
}
