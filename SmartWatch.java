import java.util.Scanner;
/**
 * Clase SmartWatch para los métodos de confirmación del buen uso del reloj inteligente.
 */
//package org.arapp.model;

/**
 * @author Mario Guerra, Linda Jiménez.
 */
public class SmartWatch extends SmartPhone{

    Scanner scan = new Scanner(System.in);

    @Override
	public void makePhoneCall(int phoneNumber) { //Método para llamar al número de teléfono.
		System.out.println("Ingrese numero de telefono");
		phoneNumber = scan.nextInt();
		System.out.println("Llamando al numero: " + phoneNumber + " desde mi: " + this.deviceType + " " + this.getManufacturer());
	}

    @Override
	public void takePic() { //Método para tomar fotografías.
		System.out.println("Foto tomada");
	}
}
