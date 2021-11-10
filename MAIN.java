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
        
        /**
         * Esta clase es el controlador del programa.
         * @author: Linda Ines Jimenez Vides
         * @version: 2 - noviembre - 2021
         */
        while (opcion != 4){

            opcion = vista.menuPrincipal();

            if (opcion == 1){

                opcion2 = vista.menuDispositivo();

                if (opcion2 == 1){

                    opcion3 = vista.telefonoF();

                    if (opcion3 == 1){
                        
                        fijo.makePhoneCall(opcion3);
                    }
                } else if (opcion2 == 2){

                } else if (opcion2 == 3){
                
                } else if (opcion2 == 4){

                } else if (opcion2 == 5){
                
                } else if (opcion2 == 6){

                } else if (opcion2 == 7){

                } else if (opcion2 == 8){

                }

            } else if (opcion == 2){

                vista.tiendasD();


            } else if (opcion == 3){
                

            } else if (opcion == 4){

               vista.mensajeDespedida();
            }
        }

    }
}
