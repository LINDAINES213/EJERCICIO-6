import java.util.Scanner;
/**
* Clase Laptop para heredar características a la computadora personal desde la de escritorio.
*/

/**
* @author Mario Guerra, Linda Jiménez
*/

public class Laptop extends Desktop{
     
    Scanner scan = new Scanner(System.in);

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

    public void VideoGames(){
        System.out.println("Jugando al buscaminas...");
    }
}
