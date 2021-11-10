public class MAIN {
    public static void main(String args[]){
     
        //Objeto tipo vista
        Vista vista = new Vista();

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
