import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Vista {
    
    //Objeto tipo scanner
    Scanner sn = new Scanner(System.in);
    
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
     * Metodo para imprimir el menu para elegir un dispositivo
     */
    public int menuDispositivo(){
        
        int opcion2;

        String menuDispositivo = "\nQue dispositivo desea probar?\n" +
                                "1. Telefono Fijo\n" +
                                "2. Smartphone\n" +
                                "3. Camara Fotografica\n" +
                                "4. Computadora Desktop\n" +
                                "5. Laptop\n" +
                                "6. SmartTV\n" +
                                "7. Smartwatch\n" +
                                "8. Tablet\n";
        
        System.out.println(menuDispositivo);
        opcion2 = sn.nextInt();

        return opcion2;
    }

    public int telefonoF(){
        
        int opcion3;

        String telF = "\nQue desea realizar?\n" +
                                "1. Llamar\n";
        
        System.out.println(telF);
        opcion3 = sn.nextInt();

        return opcion3;
    }

    public int smartPhone(){
        
        int opcion4;

        String smp = "\nQue desea realizar?\n" +
                        "1. Llamar\n" +
                        "2. Tomar Fotografia\n" +
                        "3. Navegar por Internet\n" +
                        "4. Reproducir Videos\n";
        
        System.out.println(smp);
        opcion4 = sn.nextInt();

        return opcion4;
    }

    public int Cam(){
        
        int opcion5;

        String cam = "\nQue desea realizar?\n" +
                        "1. Tomar Fotografia\n" +
                        "2. Reproducir Videos\n";
        
        System.out.println(cam);
        opcion5 = sn.nextInt();

        return opcion5;
    }

    public int Desktop(){
        
        int opcion6;

        String ds = "\nQue desea realizar?\n" +
                        "1. Navegar por Internet\n" +
                        "2. Reproducir Videos\n" +
                        "3. Ejecitar Videojuegos";
        
        System.out.println(ds);
        opcion6 = sn.nextInt();

        return opcion6;
    }

    public int Laptop(){
        
        int opcion7;

        String lp = "\nQue desea realizar?\n" +
                    "1. Navegar por Internet\n" +
                    "2. Reproducir Videos\n" +
                    "3. Ejecitar Videojuegos";
        
        System.out.println(lp);
        opcion7 = sn.nextInt();

        return opcion7;
    }

    public int SmartTV(){
        
        int opcion8;

        String tv = "\nQue desea realizar?\n" +
                    "1. Navegar por Internet\n" +
                    "2. Reproducir Videos\n" +
                    "3. Ejecitar Videojuegos";
        
        System.out.println(tv);
        opcion8 = sn.nextInt();

        return opcion8;
    }

    public int Tablet(){

        int opcion9;

        String tv = "\nQue desea realizar?\n" +
                    "1. Navegar por Internet\n" +
                    "2. Reproducir Videos\n" +
                    "3. Ejecitar Videojuegos";
        
        System.out.println(tv);
        opcion9 = sn.nextInt();

        return opcion9;
    }

    public int Smartwatch(){
        
        int opcion8;

        String tv = "\nQue desea realizar?\n" +
                    "1. Navegar por Internet\n" +
                    "2. Reproducir Videos\n" +
                    "3. Ejecitar Videojuegos";
        
        System.out.println(tv);
        opcion8 = sn.nextInt();

        return opcion8;
    }

    /**
     * Metodo para imprimir las tiendas disponibles.
     */
    public void tiendasD(){

        String contenido = " ";

        try {

            //Creamos un archivo FileReader que obtiene lo que tenga el archivo
            FileReader leer = new FileReader("Tiendas.txt");
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader tiendas = new BufferedReader(leer);
            //Con el siguiente ciclo extraemos todo el contenido del archivo y se muestra
            while((contenido = tiendas.readLine()) != null) {
            System.out.println("\n" + contenido);
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
