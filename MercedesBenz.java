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
 * Clase  MercedesBenz 
 * 
 * @author Grupo 8
 * @version MercedesBenz 1.1
 */
public class MercedesBenz {
    private Radio radio; //polimorfico
    private String radio_actual;

    public MercedesBenz(int i){
        cambiar_tipo_radio(i);
    }

    public void encender_radio(){
        this.radio.set_estado();
    }

    public void cambiar_tipo_radio(int i){
        switch (i) {
            //clase s 
            case 1:
                this.radio = new ClaseS();
                this.radio_actual = "ClaseS";
                break;

            //clase a
            case 2:
                this.radio = new ClaseA();
                this.radio_actual = "ClaseA";
                break;

            //clase c
            default:
                this.radio = new ClaseC();
                this.radio_actual = "ClaseC";
                break;
        }
    }

    public void subir_volumen_Mercedez(){
        this.radio.subir_volumen();
    }

    public void bajar_volumen_Mercedez(){
        this.radio.bajar_volumen();
    }

    public void agregar_emisora(String emisora){
        this.radio.guardar_emisora(emisora);
    }

    public void cambiar_fm_am(){
        this.radio.cambiar_fm_am();
    }

    public String cargar_emisora_mercedes(String i){
        return this.radio.cargar_emisora(i);
    }

    public int get_volumen_radio_mercedes(){
        return this.radio.get_volumen_radio();
    }

    public String mostrar_contactos_mercedes(){
        return this.radio.mostrar_contactos();
    }

    public Radio get_radio(){
        return this.radio;
    }

}
