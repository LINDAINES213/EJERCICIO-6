import java.util.Scanner;
/**
 * Clase SmartPhone para los métodos de confirmación del buen uso del smartphone.
 */
//package org.arapp.model;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * @author moises.alonso
 * Modificado por Mario Guerra y Linda Jiménez.
 */
public class SmartTV extends Device {

	Scanner scan = new Scanner(System.in);
	
	@Override
	public void browseInInternet(String url) {
		System.out.println("Ingrese la url de la página que desea ingresar.");
		url = scan.next();
		System.out.println("Visitando la direccion: " + url + "desde mi: " + this.deviceType + " " + this.getManufacturer());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playVideo(String fileName) {
		System.out.println("Video reproduciéndose");
		// TODO Auto-generated method stub

	}
}
