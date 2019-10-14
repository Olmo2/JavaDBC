package view.cines;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import modelo.cines.CinesCreate;
import modelo.cines.CinesDelete;
import modelo.cines.CinesUpdate;
import negocio.beans.CineBean;

public class ModificarCineView {

	public static void modificarCine(CineBean cine) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// presentamos los valores anteriores
		System.out.println("Este cine tiene los siguiente valores");
		System.out.println(cine);

		// leemos cada uno de los atributos del Cine
		System.out.println("Nuevo Nombre?");
		String cadena = br.readLine();
		if (cadena.length() > 0) {

			cine.setNombre(cadena);
		}

		// leemos cada uno de los atributos del Cine
		System.out.println("Nuevo responsable?");
		cadena = br.readLine();
		if (cadena.length() > 0) {

			cine.setResponsable(cadena);
		}

		// leemos cada uno de los atributos del Cine
		System.out.println("Nuevo telefono?");
		cadena = br.readLine();
		if (cadena.length() > 0) {

			cine.setTelefono(cadena);
		}

		// leemos cada uno de los atributos del Cine
		System.out.println("Nuevo direccion?");
		cadena = br.readLine();
		if (cadena.length() > 0) {

			cine.setDireccion(cadena);
		}
		CinesUpdate cu = new CinesUpdate();
		cu.updateCine(cine);

	}

	public static void crearCine(CineBean cine) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// presentamos los valores anteriores
		System.out.println("Id del cine");
		System.out.println(cine.getIdCine());

		// leemos cada uno de los atributos del Cine
		System.out.println("Nombre del cine");
		 String cadena = br.readLine();
		if (cadena.length() > 0) {

			cine.setNombre(cadena);
		}

		// leemos cada uno de los atributos del Cine
		System.out.println("Responsable del cine");
		cadena = br.readLine();
		if (cadena.length() > 0) {

			cine.setResponsable(cadena);
		}

		// leemos cada uno de los atributos del Cine
		System.out.println("Telefono del cine");
		cadena = br.readLine();
		if (cadena.length() > 0) {

			cine.setTelefono(cadena);
		}

		// leemos cada uno de los atributos del Cine
		System.out.println("Direccion del cine");
		cadena = br.readLine();
		if (cadena.length() > 0) {

			cine.setDireccion(cadena);
		}
		CinesCreate cc = new CinesCreate();
		cc.createCine(cine);

	}
	
	
	public static void borrarCine(CineBean cine) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		// presentamos los valores anteriores
		System.out.println("Id del cine");
		System.out.println(cine.getIdCine());
		
		CinesDelete cd=new CinesDelete();
		cd.deleteCine(cine);

		

	}

}
