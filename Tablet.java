import java.util.Scanner;
/**
 * Clase Tablet para los métodos de confirmación del buen uso de la tableta.
 */
//package org.arapp.model;

/**
 * @author Mario Guerra, Linda Jiménez.
 */

public class Tablet extends SmartPhone{

    Scanner scan = new Scanner(System.in);
    
    @Override
	public void takePic() { //Método para tomar fotografías.
		System.out.println("Foto tomada");
	}

	@Override
	public void browseInInternet(String url) { //Método para investigar en internet.
		System.out.println("Ingrese la url de la página que desea ingresar.");
		url = scan.next();
		System.out.println("Visitando la direccion: " + url + "desde mi: " + this.deviceType + " " + this.getManufacturer());
	}

	@Override
	public void playVideo(String fileName) { //Método para reproducir videos.
		System.out.println("Video reproduciéndose");
	}
}
