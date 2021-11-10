import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.util.NoSuchElementException;

public class Vista {
    
    //Objeto tipo scanner
    Scanner sn = new Scanner(System.in);
    //Objeto tipo enemigo
    Camara cam = new Camara();
    //Objeto tipo jefe
    Desktop d = new Desktop();
    //Objeto tipo guerrero
    Fijo fijo = new Fijo();
    //Objeto tipo explorador
    Laptop lap = new Laptop();
    SmartPhone sp = new SmartPhone();
    SmartTV tv = new SmartTV();
    SmartWatch sw = new SmartWatch();
    Tablet tab = new Tablet();
    
    /**
     * Metodo para imprimir el menu principal
     */
    public int menuPrincipal(){

        int opcion;

        System.out.println();
        System.out.println();
        System.out.println("------------ ELECTRONICA PANAMERICANA ------------");
        System.out.println();
        System.out.println("Bienvendo a la tienda virtual de ELECTRONICA PANAMERICANA!");
        System.out.println("En esta pagina puede ver los productos disponibles en la tienda, probarlos y ver cual es su tienda mas cercana para conseguirlo");
        System.out.println("Bienvenido! Que deseas realizar?");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------");

        String menuPrincipal = "\n1. Probar un dispositivo\n" +
                                "2. Ver Tiendas Físicas\n" +
                                "3. Comprar un dispositivo\n" +
                                "4. Salir de la pagina\n";

        System.out.println(menuPrincipal);
        opcion =  sn.nextInt();

        return opcion;
    }

    /**
     * Metodo para imprimir el menu para hacer una publicacion
     * @author: Linda Ines Jimenez Vides
     * @version: 2 - noviembre - 2021
     */
    public int menuDispositivo(){
        
        int opcion2;

        String menuDispositivo = "\nQue dispositivo desea probar?\n" +
                                "1. Telefono Fijo\n" +
                                "2. Telefono Celular\n" +
                                "3. Smartphone\n" +
                                "4. Camara Fotografica\n" +
                                "5. Computadora Desktop\n" +
                                "6. Laptop\n" +
                                "7. SmartTV\n" +
                                "8. Smartwatch\n" +
                                "9. Tablet\n";
        
        System.out.println(menuDispositivo);
        opcion2 = sn.nextInt();

        return opcion2;
    }

    public void tiendasD(){

        String contenido = " ";

        try {

            FileReader leer = new FileReader("Tiendas.txt");

            //El contenido de lector se guarda en un BufferedReader
            BufferedReader tiendas = new BufferedReader(leer);

            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            while((contenido = tiendas.readLine()) != null) {
            System.out.println(contenido);
            //System.out.println("\n---------------- PUBLICADO ----------------\n");
            }   
        } catch (IOException e) {
            System.out.println("\nERROR EN LA CARGA DE TIENDAS DISPONIBLES! INTENTE DE NUEVO\n");
        }
    }

    /**
     * Crea e imprime el mensaje de despedida
    */
    public String mensajeDespedida(){
        String salir = "\n------------ Gracias por visitarnos! Vuelve Pronto!------------";
        System.out.println(salir);
        return salir;
    }

    
}
