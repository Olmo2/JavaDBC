package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Iterator;

import negocio.beans.CineBean;
import negocio.controlador.Cinesa;
import view.cines.ModificarCineView;

public class StartView {

	private Cinesa cines;
	
	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader (isr);
	
	
	public StartView(Cinesa cines) {
		
		this.cines = cines;
	}
	
	
	
	
	
	public void go() throws NumberFormatException, IOException {
		
		
		
		int numero = 1000;
		
		while(numero!=0) {
			
			System.out.println("\n\n\n\nMenu");
			System.out.println("_____________________");
			System.out.println("1) Modificar Cine");
			System.out.println("2) Lista de Cines");
			System.out.println("3) Crear Cine");
			System.out.println("\n");
			System.out.println("0) SALIR");
			numero = Integer.parseInt (br.readLine());
			
			switch(numero) {
			
				case 1: modificarCine(); break;
				case 2: listarCines(); break;
				case 3: crearCine();break;
			}
		}
	}
	
	
	
	
	
	/**
	 * Lista los cines disponibles
	 * PRIVADO
	 */
	private void listarCines() {
		
		Iterator<CineBean> listado =  cines.getCines();
		while(listado.hasNext()) {
			
			CineBean unCine = listado.next();
			System.out.println("["+unCine.getIdCine()+"] "+unCine.getNombre());
		}
	}



	
	/**
	 * Modifica un cine
	 * PRIVADO
	 * @throws NumberFormatException
	 * @throws IOException
	 */
	private void modificarCine() throws NumberFormatException, IOException {
		
		// recorro la lista de cines imprimiendo lo que hay		
		Iterator<CineBean> listado =  cines.getCines();
		while(listado.hasNext()) {
			
			CineBean unCine = listado.next();
			System.out.println("["+unCine.getIdCine()+"] "+unCine.getNombre());
		}
		
		// solicito un ID
		System.out.println("Seleccione el ID del cine que quiere modificar");
		int numero = Integer.parseInt (br.readLine());
		
		// recojo el cine se lo paso a la parte de la view que lo modifica
		CineBean unCine = cines.getCine(numero);
		ModificarCineView.modificarCine(unCine);
}
		
		
	
	private void crearCine() throws NumberFormatException, IOException {
		// recorro la lista de cines imprimiendo lo que hay		
				System.out.println("Estos son los cines actuales");
				Iterator<CineBean> listado =  cines.getCines();
				while(listado.hasNext()) {
					
					CineBean unCine = listado.next();
					System.out.println("["+unCine.getIdCine()+"] "+unCine.getNombre());
				}
				
				// solicito un ID
				System.out.println("Seleccione el Id del nuevo cine, debe ser distinta a las existentes");
				int resp = Integer.parseInt (br.readLine());
				
				// recojo el cine se lo paso a la parte de la view que lo crea
				if(cines.getCine(resp)==null) {
					CineBean unCine =new CineBean();
					resp = Integer.parseInt (br.readLine());
					unCine.setIdCine(resp);
					ModificarCineView.crearCine(unCine);
				}
		
	}
	
}
