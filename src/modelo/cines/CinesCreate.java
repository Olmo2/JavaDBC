package modelo.cines;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.util.BDConect;
import negocio.beans.CineBean;

public class CinesCreate {

	
	public void createCine(CineBean cine) {
		Connection conexion = BDConect.getConexion(); 
       	PreparedStatement stmt;
       	
       	String sql = 	"INSERT INTO `cines`.`cines` (`idcines`, `nombre`, `direccion`, `responsable`, `telefono`)"
       					+ " VALUES ("
       					+ "'"+cine.getIdCine()+"', "
       					+ "'"+cine.getNombre()+"', "
       					+ "'"+cine.getDireccion()+"', "
       					+ "'"+cine.getTelefono()+"', "
       					+ "'"+cine.getResponsable()+"')";
       	
     System.out.println(sql);
		try {
			stmt = conexion.prepareStatement(sql);
	       	stmt.execute();	       	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}	
}
