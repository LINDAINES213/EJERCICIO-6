import java.util.Scanner;
/**
* Clase Desktop para heredar características a la computadora de escritorio.
*/

/**
* @author Mario Guerra, Linda Jiménez
*/

public class Desktop extends Device{
     
    Scanner scan = new Scanner(System.in);

	@Override
	public void makePhoneCall(int phoneNumber){ //Método para llamar al número de teléfono.
        System.out.println("Ingrese numero de telefono");
	    phoneNumber = scan.nextInt();
	    System.out.println("Llamando al numero: " + phoneNumber + " desde mi: " + this.deviceType + " " + this.getManufacturer());
    }

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
