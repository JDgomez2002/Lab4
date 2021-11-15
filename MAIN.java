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
 * Clase Main
 * 
 * @author Grupo 8
 * @version MAIN 1.1
 */

public class MAIN{
    public static void main(String[] args) {
        try{
            Controlador c = new Controlador();
            c.simuladorRadio();
        }
        catch(Exception e){
            System.out.println("Ha ocurrido un error: MercedesBenz: "+e.getMessage());
        }
    }
}