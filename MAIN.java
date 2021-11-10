/**
 * Esta clase es el controlador del programa.
 * @author: Linda Ines Jimenez Vides && Mario Antonio Guerra Morales
 * @version: 9 - noviembre - 2021
 */

public class MAIN {
    public static void main(String args[]){
     
        //Objeto tipo vista
        Vista vista = new Vista();
        //Objeto tipo camara
        Camara cam = new Camara();
        //Objeto tipo desktop
        Desktop d = new Desktop();
        //Objeto tipo fijo
        Fijo fijo = new Fijo();
        //Objeto tipo laptop
        Laptop lap = new Laptop();
        //Objeto tipo smartphone
        SmartPhone sp = new SmartPhone();
        //Objeto tipo smartTV
        SmartTV tv = new SmartTV();
        //Objeto tipo smartwatch
        SmartWatch sw = new SmartWatch();
        //Objeto tipo tabet
        Tablet tab = new Tablet();
    

        int opcion = 0;
        int opcion2 = 0;
        int opcion3 = 0;
        int opcion4 = 0;
        int opcion5 = 0;
        int opcion6 = 0;
        int opcion7 = 0;
        int opcion8 = 0;
        int opcion9 = 0;
        int opcion10 = 0;
        String s = "";
        
        /**
         * Esta clase es el controlador del programa.
         * @author: Linda Ines Jimenez Vides
         * @version: 2 - noviembre - 2021
         */
        while (opcion != 3){

            opcion = vista.menuPrincipal();

            if (opcion == 1){

                opcion2 = vista.menuDispositivo();

                if (opcion2 == 1){

                    opcion3 = vista.telefonoF();

                    if (opcion3 == 1){
                        
                        fijo.makePhoneCall(opcion3);
                    }
                } else if (opcion2 == 2){

                    opcion4 = vista.smartPhone();

                    if (opcion4 == 1){
                        sp.makePhoneCall(opcion4);
                    } else if (opcion4 == 2){
                        sp.takePic();
                    } else if (opcion4 == 3){
                        sp.browseInInternet(s);
                    } else if (opcion4 == 4){
                        sp.playVideo(s);
                    }

                } else if (opcion2 == 3){

                    opcion5 = vista.Cam();

                    if (opcion5 == 1){
                        cam.takePic();
                    } else if (opcion5 == 2){
                        cam.playVideo(s);
                    }
                    
                } else if (opcion2 == 4){

                    opcion6 = vista.Desktop();

                    if (opcion6 == 1){
                        d.browseInInternet(s);
                    } else if (opcion6 == 2){
                        d.playVideo(s);
                    } else if (opcion6 == 3){
                        d.VideoGames();
                    }

                } else if (opcion2 == 5){

                    opcion7 = vista.Laptop();

                    if (opcion7 == 1){
                        lap.browseInInternet(s);
                    } else if (opcion7 == 2){
                        lap.playVideo(s);
                    } else if (opcion6 == 3){
                        lap.VideoGames();
                    }
                
                } else if (opcion2 == 6){

                    opcion8 = vista.SmartTV();

                    if (opcion8 == 1){
                        tv.browseInInternet(s);
                    } else if (opcion8 == 2){
                        tv.playVideo(s);
                    }

                } else if (opcion2 == 7){

                    opcion9 = vista.Smartwatch();

                    if (opcion9 == 1){
                        sw.makePhoneCall(opcion10);
                    } else if (opcion9 == 2){
                        sw.takePic();
                    }

                } else if (opcion2 == 8){

                    opcion10 = vista.Tablet();

                    if (opcion9 == 1){
                        tab.takePic();
                    } else if (opcion9 == 2){
                        tab.browseInInternet(s);
                    } else if (opcion10 == 3){
                        tab.playVideo(s);
                    }

                }

            } else if (opcion == 2){

                vista.tiendasD();
                
            } else if (opcion == 3){

               vista.mensajeDespedida();
            }
        }

    }
}
