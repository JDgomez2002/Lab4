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

import java.util.ArrayList;

/**
 * Clase  Radio <<Interface>> 
 * 
 * @author Grupo 8
 * @version Radio 1.1
 */

interface Radio {
    void set_estado();

    void subir_volumen();

    void bajar_volumen();

    void cambiar_fm_am();

    void cambiar_emisora();

    void guardar_emisora(String c);

    String cargar_emisora(String i);

    boolean get_estado_radio();

    int get_volumen_radio();

    String seleccionar_lista_reproduccion(int indice);

    void conectar_desconectar_telefono();

    String mostrar_contactos();

    String llamar_contacto();

    String finalizar_llamada();

    String[] datos_radio();

    ArrayList<String> get_emisoras();

    ArrayList<String> get_lista_repruccion();
    
}