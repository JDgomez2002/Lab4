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
 * Clase ClaseS
 * 
 * @author Grupo 8
 * @version ClaseS 1.1
 */
public class ClaseS implements Radio{
    private boolean encendido;
    private ArrayList<String> emisoras = new ArrayList<String>();
    private ArrayList<String> lista_reproduccion = new ArrayList<String>();
    private boolean telefono_encendido;
    private String bocinas_o_auriculares;
    private int volumen;
    private String fm_o_am;
    private double emisora;
    

    public ClaseS(){
        this.encendido = false;
        this.emisoras.add("Picante 1.45");
        this.emisoras.add("Tropicalida 1.59");
        this.emisoras.add("Ranchera 4.56");
        this.emisoras.add("RadioDisney 4.89");
        this.emisoras.add("Platanito 1.23");
        this.lista_reproduccion.add("Smell like teen spirit.");
        this.lista_reproduccion.add("Despacito.");
        this.lista_reproduccion.add("Gone.");
        this.lista_reproduccion.add("Moviendo la cadera.");
        this.lista_reproduccion.add("Movimiento Naranja");
        this.telefono_encendido = false;
        this.bocinas_o_auriculares = "Bocinas";
        this.volumen = 10;
        this.fm_o_am = "FM";
        this.emisora = 1.56;
    }

    public void set_estado(){
        if(this.encendido){
            this.encendido = false;
        }
        else{
            this.encendido = true;
        }
    }

    public void subir_volumen(){
        this.volumen += 1;
    }

    public void bajar_volumen(){
        this.volumen -= 1;
    }

    public void cambiar_fm_am(){
        if(this.fm_o_am.equals("FM")){
            this.fm_o_am = "AM";
        }
        else{
            this.fm_o_am = "FM";
        }
    }   

    public void cambiar_emisora(){
        this.emisora += 0.5;
    }

    public ArrayList<String> get_emisoras(){
        return this.emisoras;
    }
    
    public ArrayList<String> get_lista_repruccion(){
        return this.lista_reproduccion;
    }

    public void guardar_emisora(String emisora){
        this.emisoras.add(emisora);
    }

    public String cargar_emisora(String emisora){
        String emisora_buscada = null;
        boolean continuar = true;
        int contador = 0;
        while((continuar)&&(contador<this.emisoras.size())){
            if(this.emisoras.get(contador).equalsIgnoreCase(emisora)){
                emisora_buscada = this.emisoras.get(contador);
                continuar = false;
            }
            else{
                contador += 1;
            }
        }
        return emisora_buscada;
    }

    public boolean get_estado_radio(){
        return this.encendido;
    }

    public int get_volumen_radio(){
        return this.volumen;
    }

    public String seleccionar_lista_reproduccion(int indice){
        String cancion = null;
        boolean continuar = true;
        int contador = 0;
        while((continuar)&&(contador<this.lista_reproduccion.size())){
            if((contador+1)==indice){
                cancion = this.lista_reproduccion.get(contador);
                continuar = false;
            }
            else{
                contador += 1;
            }
        }
        return cancion;
    }

    public void conectar_desconectar_telefono(){
        if(this.telefono_encendido){
            this.telefono_encendido = false;
        }
        else{
            this.telefono_encendido = true;
        }
    }

    public String mostrar_contactos(){
        String s = "";
        s.concat("Abner: 55689756\n");
        s.concat("Daniel: 45865259\n");
        s.concat("Jose: 5288946\n");
        s.concat("Fernando: 45789612\n");
        s.concat("Ivan: 12457896\n");
        return s;
    }

    public String llamar_contacto(){
        String s = "Se esta llamando al contacto Daniel: 458965978";
        return s;
    }

    public String finalizar_llamada(){
        String s = "Se esta finalizando el programa...";
        return s;
    }

    public String get_bocinas_o_auriculares(){
        return this.bocinas_o_auriculares;
    }

    public String[] datos_radio(){
        String[] s = new String[4];
        s[0] = "Radio Clase S";
        s[1] = "Estado: Encendido.";
        s[2] = "Conectado: "+this.bocinas_o_auriculares;
        s[3] = "Radial: "+this.fm_o_am;
        return s;
    }
}