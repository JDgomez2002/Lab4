//Universidad del Valle de Guatemala
//Programación Orientada a Objetos
//Catedrático Tomás Gálvez
//Segundo Semestre 2021
//Grupo 9:
//José Daniel Gómez Cabrera
//Carné 21429
//Abner Iván García Alegría
//21285
//Sección 11
//Actividad: Laboratorio 4

/**
 * Clase Controlador
 * 
 * @author Grupo 8
 * @version Controlador 1.1
 */

public class Controlador {
    /**
     * Metodo para ejecutar la simulacion de la tienda
     * 
     * @author Grupo 9
     * @version ElectronicaLatinoamericana 1.1
     */
    public void simuladorRadio(){
        Vista interfaz = new Vista();
        MercedesBenz radio = new MercedesBenz();

        interfaz.bienvenida();

        boolean continuar = true;
        int encendido = 0;

        while(continuar){
            encendido = interfaz.MenuEncender();
            switch (encendido) {
                //Encendido
                case 1:
                    int tipo_radio = interfaz.TipoRadio();
                    



                    break;
                
                //Apagado
                default:
                    continuar = false;
                    break;
            }
        }
        interfaz.despedida();
    }

        
            
           
}
