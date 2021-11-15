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

import java.util.*;

/**
 * Clase Vista
 * 
 * @author Grupo 8
 * @version Vista 1.1
 */

public class Vista {
    private Scanner sn = new Scanner(System.in);

     /**
     * Metodo para solicitar un entero al usuario
     * se ingresan el numero minimo y maximo requerido
     * 
     * @author Grupo 9
     * @version solicitar_int 1.1
     * @return int
     * @param String,int,int
     */
    public int solicitar_int(String s, int inferior, int superior){
        inferior -= 1;
        superior += 1;
        int entero = 0;
        boolean continuar = true;
            while(continuar){
                try{
                System.out.print(s);
                this.sn = new Scanner(System.in);
                int numero = sn.nextInt();
                if((numero>inferior)&&(numero<superior)){
                    entero = numero;
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    continuar = false; 
                }
                else{
                    System.out.println("\t Error: debe de ingresar un entero valido.");   
                    System.out.println();              
                }
                }
                catch(Exception e){
                    System.out.println("\t Error: debe de ingresar un entero valido.");
                    System.out.println();
                }
            }
        
        return entero;
    }

    /**
     * Metodo para solicitar string al usuario
     * 
     * @author Grupo 9
     * @version solicitar_string 1.1
     * @return String
     */
    public String solicitar_string(String s){
        String txt = "";
            boolean continuar = true;
            while(continuar){
                try{
                System.out.print(s);
                this.sn = new Scanner(System.in);
                String texto = sn.nextLine();
                if(texto.equals("")){
                    System.out.println("\t Error: debe de ingresar un texto valido.");
                    System.out.println();
                }
                else{
                    txt = texto;
                    System.out.println("---------------------------------------------------------------------------------------------------------------------");
                    continuar = false;                   
                }
                }
                catch(Exception e){
                    System.out.println("\t Error: debe de ingresar un texto valido.");
                    System.out.println();
                }
            }
        
        return txt;
    } 
    /**
     * Bienvenida al usuario.
     * 
     * @author Grupo 9
     * @version bienvenida 1.1
     */
    public void bienvenida(){
        System.out.println();
        System.out.println();
        System.out.println("------------ Mercedes-Benz ------------");
        System.out.println();
        System.out.println("------------ BIENVENID@ ------------");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("- Esto es un simulador de radios para vehiculos!");
        System.out.println("- Podra probar 3 tipos diferentes de radios...");
        System.out.println("- Que suenen las radios!!!");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println();
    }
    /**
     * Metodo para encender y apagar radio.
     * 
     * @author Grupo 9
     * @version MenuEncender 1.1
     */
    public int MenuEncender(){
        
        int desicion = 0;
        
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- Apagadar/Encender radio ------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("");
        System.out.println("¿Que accion desea ejecutar?");
        System.out.println("1. Encender Radio");
        System.out.println("2. Apagar Radio");
        System.out.println();
        String s = " Ingrese su desicion: ";
        desicion = solicitar_int(s, 1, 2);
        switch (desicion) {
            //Encender Radio
            case 1:
                
                System.out.println("----Se a encendido correctamente la radio----");
                
                break;
                //Apagar radio
                default:
                
                System.out.println("La radio esta Apagada");
                break;
        
        }
        System.out.println(); 
        return desicion;
        }
        
    /**
     * Metodo para tipo de radio
     * 
     * @author Grupo 9
     * @version TipoRadio 1.1
     */
        public int TipoRadio(){
            int desicion = 0;
            System.out.println("--------------------------------------------------------");
            System.out.println("-------------------- Tipo Radio ------------------");
            System.out.println("--------------------------------------------------------");
            System.out.println("- Existen 3 tipos de radios para los vehiculos, los cuales.");
            System.out.println("- Cada tipo de radio comparten algunas caracteristicas.");
            System.out.println("- pero cada una hace cosas que otra no.");
            System.out.println("");
            System.out.println("¿Que tipo de radio desea probar?");
            System.out.println("1. Clase S");
            System.out.println("2. Clase A");
            System.out.println("3. Clase C");
            System.out.println("4. Salir");
            String s = " Ingrese su desicion: ";
            desicion = solicitar_int(s, 1, 4);
            return desicion;
    }
        
    /**
     * Menu de probar opciones de radio tipo S.
     * 
     * @author Grupo 9
     * @version MenuprincipalS 1.1
     */
     public void MenuprincipalS(Radio radioS){
        boolean continuar = true;
        int volumen = radioS.get_volumen_radio();
        int desicion = 0;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- Radio S ------------------");
        System.out.println();
        for(int k = 0; k<(radioS.datos_radio().length) ;k++){
            System.out.println(radioS.datos_radio()[k]);
        }
        System.out.println();
        System.out.println("Volumen: "+volumen);
        System.out.println();
        System.out.println("Emisoras: ");
        for(int k = 0; k<(radioS.get_emisoras().size()) ;k++){
            System.out.println(radioS.get_emisoras().get(k));
        }
        System.out.println();
        System.out.println("Lista de reproduccion:");
        for(int i = 0; i<(radioS.get_lista_repruccion().size()) ;i++){
            System.out.println(radioS.get_lista_repruccion().get(i));;
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("- Actualmente usted esta en el tipo de radio S.");
        System.out.println("- Acontinuacion se muestra las opciones de la radio tipo S.");
        System.out.println("");
        System.out.println("¿Que producto desea probar?");
        System.out.println("1. Cambiar volumen(en intervalos de ±1)");
        System.out.println("2. Modo Radio");
        System.out.println("3. Modo Reproducción (sirve para CD, MP3, o Spotify)");
        System.out.println("4. Modo teléfono ");
        System.out.println("5. Modo Productividad");
        System.out.println("6. Salir");
        System.out.println();
        String s = " Ingrese su desicion: ";
        desicion = solicitar_int(s, 1, 6);

        switch (desicion) {
            //Cambiar volumen
            case 1:
                int i = Volumen();
                volumen = volumen + i;
                break;

            //Modo radio
            case 2:
                ModoRadio();
                break;

            //Modo reproduccion
            case 3:
                ModoReproduccion();
                break;

            case 4:
                ModoTelefonoS();
                break;

            case 5:
                
                break;

            default:
                continuar = false;
                break;
        }
        System.out.println();
        
        }
    }

    /**
     * Menu de probar opciones de radio tipo A.
     * 
     * @author Grupo 9
     * @version MenuprincipalA 1.1
     */
    public void MenuprincipalA(Radio radioA){
        int volumen = radioA.get_volumen_radio();
        boolean continuar = true;
        int desicion = 0;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- Menu principal A ------------------");
        System.out.println();
        for(int k = 0; k<(radioA.datos_radio().length) ;k++){
            System.out.println(radioA.datos_radio()[k]);
        }
        System.out.println();
        System.out.println("VOLUMEN: "+volumen);
        System.out.println();
        System.out.println("Emisoras: ");
        for(int k = 0; k<(radioA.get_emisoras().size()) ;k++){
            System.out.println(radioA.get_emisoras().get(k));
        }
        System.out.println();
        System.out.println("Lista de reproduccion:");
        for(int i = 0; i<(radioA.get_lista_repruccion().size()) ;i++){
            System.out.println(radioA.get_lista_repruccion().get(i));;
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("- Actualmente usted esta en el tipo de radio A.");
        System.out.println("- Acontinuacion se muestra las opciones de la radio tipo A.");
        System.out.println("");
        System.out.println("¿Que producto desea probar?");
        System.out.println("1. Cambiar volumen(en intervalos de ±1)");
        System.out.println("2. Modo Radio");
        System.out.println("3. Modo Reproducción (sirve para CD, MP3, o Spotify)");
        System.out.println("4. Modo teléfono ");
        System.out.println("5. Modo Productividad");
        System.out.println("6. Salir");
        System.out.println();
        String s = " Ingrese su desicion: ";
        desicion = solicitar_int(s, 1, 6);

        switch (desicion) {
            //Cambiar volumen
            case 1:
                int i = Volumen();
                volumen = volumen + i;
                break;

            //Modo radio
            case 2:
                ModoRadio();
                break;

            //Modo reproduccion
            case 3:
                ModoReproduccion();
                break;

            case 4:
                ModoTelefonoA();
                break;

            case 5:
                
                break;

            default:
                continuar = false;
                break;
        }
        System.out.println();
        
        }
    }

    /**
     * Menu de probar opciones de radio tipo C.
     * 
     * @author Grupo 9
     * @version MenuprincipalC 1.1
     */
    public void MenuprincipalC(Radio radioC){
        int volumen = radioC.get_volumen_radio();
        boolean continuar = true;
        int desicion = 0;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- Menu principal C ------------------");
        System.out.println();
        for(int k = 0; k<(radioC.datos_radio().length) ;k++){
            System.out.println(radioC.datos_radio()[k]);
        }
        System.out.println();
        System.out.println("Volumen: "+volumen);
        System.out.println();
        System.out.println("Emisoras: ");
        for(int k = 0; k<(radioC.get_emisoras().size()) ;k++){
            System.out.println(radioC.get_emisoras().get(k));
        }
        System.out.println();
        System.out.println("Lista de reproduccion:");
        for(int i = 0; i<(radioC.get_lista_repruccion().size()) ;i++){
            System.out.println(radioC.get_lista_repruccion().get(i));;
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        System.out.println("- Actualmente usted esta en el tipo de radio C.");
        System.out.println("- Acontinuacion se muestra las opciones de la radio tipo C.");
        System.out.println("");
        System.out.println("¿Que producto desea probar?");
        System.out.println("1. Cambiar volumen(en intervalos de ±1)");
        System.out.println("2. Modo Radio");
        System.out.println("3. Modo Reproducción (sirve para CD, MP3, o Spotify)");
        System.out.println("4. Modo teléfono ");
        System.out.println("5. Modo Productividad");
        System.out.println("6. Salir");
        System.out.println();
        String s = " Ingrese su desicion: ";
        desicion = solicitar_int(s, 1, 6);

        switch (desicion) {
            //Cambiar volumen
            case 1:
            int i = Volumen();
            volumen = volumen + i;
                break;

            //Modo radio
            case 2:
                ModoRadio();
                break;

            //Modo reproduccion
            case 3:
                ModoReproduccion();
                break;

            case 4:
                ModoTelefonoC();
                break;

            case 5:
                
                break;

            default:
                continuar = false;
                break;
        }
        System.out.println();
        
        }
    }

    /**
     * Menu de aumentar o disminuir volumen
     * 
     * @author Grupo 9
     * @version Volumen 1.1
     */
    public int Volumen(){
        boolean continuar = true;
        int desicion = 0;
        int subir_bajar = 0;
        while(continuar){
        System.out.println("--------------------------------------------------------");
        System.out.println("-------------------- Cambiar volumen ------------------");
        System.out.println("--------------------------------------------------------");
        System.out.println("- Aqui se le permitira al usuario poder subir o bajar el.");
        System.out.println("- Volumen de la radio segun el gusto del usuario.");
        System.out.println("- Recuerda no llevar las bocinas a  .");
        System.out.println("- Podra finalizar su compra desde el menu principal.");
        System.out.println("");
        System.out.println("¿Que producto desea probar?");
        System.out.println("1. Subir volumen");
        System.out.println("2. Bajar volumen");
        String s = " Ingrese su desicion: ";
        desicion = solicitar_int(s, 1, 2);
        switch (desicion) {
            //Subir volumen
            case 1:
                subir_bajar = 1;
                continuar = false;
                break;

            //Bajar Volumen
            default:
                subir_bajar = -1;
                continuar = false;
                break;   
    }
}
    return subir_bajar;
}

    /**
     * Menu de modo radio
     * 
     * @author Grupo 9
     * @version ModoRadio 1.1
     */
public void ModoRadio(){
    boolean continuar = true;
    int desicion = 0;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("-------------------- Modo Radio ------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- Las radios son un medio de comunicacion muy importante.");
    System.out.println("- Debido a que nos mantienen informados sobre problemas.");
    System.out.println("- Que suceden en nuestro pais,.");
    System.out.println("");
    System.out.println("¿Que producto desea probar?");
    System.out.println("1. Cambiar de FM a AM");
    System.out.println("2. Cambiar emisoras, se cambiara en intervalos de 0.5 ");
    System.out.println("3. Guardar emisoras. Se podrán guardar hasta 50 estaciones de radio");
    System.out.println("4. Cargar emisora ");
    System.out.println("5. Salir");
    System.out.println();
    String s = " Ingrese su desicion: ";
    desicion = solicitar_int(s, 1, 5);
    switch (desicion) {
        //Cambiar de FM a AM
        case 1:
            
            break;

        //Cambiar emisoras
        case 2:
            
            break;

        //Guardar emisoras
        case 3:
            
            break;
        
        //Cargar Emisora
        case 4:

        break;

        //Salir
        default:
            continuar = false;
            break;
    
}
    }
}

    /**
     * Menu de modo reproduccion
     * 
     * @author Grupo 9
     * @version ModoReproduccion 1.1
     */
public void ModoReproduccion(){
    boolean continuar = true;
    int desicion = 0;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("-------------------- Modo Reproduccion ------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- Aqui es para reproducir algun tipo de musica en especifico.");
    System.out.println("- Para ello utilize las opciones de abajo de su interes.");
    System.out.println("");
    System.out.println("¿Que producto desea probar?");
    System.out.println("1. Seleccionar lista de reproduccion");
    System.out.println("2. Cambiar cancion ");
    System.out.println("3. Escuchar cancion");
    System.out.println("4. Salir");
    System.out.println();
    String s = " Ingrese su desicion: ";
    desicion = solicitar_int(s, 1, 4);
    switch (desicion) {
        //Seleccionar lista de reproduccion
        case 1:
            
            break;

        //Cambiar cancion
        case 2:
            
            break;

        //Escuchar cancion
        case 3:
            
            break;

        //Salir
        default:
            continuar = false;
            break;
    }
}
}

    /**
     * Menu para conectar el  telefono tipo S
     * 
     * @author Grupo 9
     * @version ModoTelefonoS 1.1
     */
public void ModoTelefonoS(){
    boolean continuar = true;
    int desicion = 0;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("-------------------- Conectar telefono S ------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- Si desea continuar conecte su telefono.");
    System.out.println("");
    System.out.println("¿Que accion desea probar?");
    System.out.println("1. Conectar telefono");
    System.out.println("2. Desconectar telefono ");
    System.out.println();
    String s = " Ingrese su desicion: ";
    desicion = solicitar_int(s, 1, 2);
    switch (desicion) {
        //Conectar telefono
        case 1:
            TelefonoConectadoS();
            System.out.println("----Se a conectado el telefono correctamente----");
            break;
            //Desconectar telefono
            default:
            continuar = false;
            System.out.println("Se a desconectado el telefono correctamente");
            break;
    }
}
}

    /**
     * Menu para conectar el telefono tipo A
     * 
     * @author Grupo 9
     * @version ModoTelefonoA 1.1
     */
public void ModoTelefonoA(){
    boolean continuar = true;
    int desicion = 0;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("-------------------- Conectar Telefono A ------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- Si desea continuar conecte su telefono.");
    System.out.println("");
    System.out.println("¿Que accion desea probar?");
    System.out.println("1. Conectar telefono");
    System.out.println("2. Desconectar telefono ");
    System.out.println();
    String s = " Ingrese su desicion: ";
    desicion = solicitar_int(s, 1, 2);
    switch (desicion) {
        //Conectar telefono
        case 1:
            TelefonoConectadoA();
            System.out.println("----Se a conectado el telefono correctamente----");
            break;
            //Desconectar telefono
            default:
            continuar = false;
            System.out.println("Se a desconectado el telefono correctamente");
            break;
    }
}
}
    /**
     * Menu para conectar el telefono tipo C
     * 
     * @author Grupo 9
     * @version ModoTelefonoC 1.1
     */
public void ModoTelefonoC(){
    boolean continuar = true;
    int desicion = 0;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("-------------------- Conectar telefono C ------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("- Si desea continuar, conectese con su celular.");
    System.out.println("");
    System.out.println("¿Que accion desea probar?");
    System.out.println("1. Conectar telefono");
    System.out.println("2. Desconectar telefono ");
    System.out.println();
    String s = " Ingrese su desicion: ";
    desicion = solicitar_int(s, 1, 2);
    switch (desicion) {
        //Conectar telefono
        case 1:
            TelefonoConectadoC();
            System.out.println("----Se a conectado el telefono correctamente----");
            break;
            //Desconectar telefono
            default:
            continuar = false;
            System.out.println("Se a desconectado el telefono correctamente");
            break;
    }
}
}

    /**
     * Menu para modo de telefonos tipo S
     * 
     * @author Grupo 9
     * @version TelefonoConectadoS 1.1
     */
public void TelefonoConectadoS(){
    boolean continuar = true;
    int desicion = 0;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("-------------------- Telefono Conectado S ------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    System.out.println("¿Que producto desea probar?");
    System.out.println("1. Mostrar contactos");
    System.out.println("2. Llamar a contacto ");
    System.out.println("3. Finalizar llamada");
    System.out.println("4. Cambiar a bocinas o auriculares");
    System.out.println("5. Salir");
    System.out.println();
    String s = " Ingrese su desicion: ";
    desicion = solicitar_int(s, 1, 5);
    switch (desicion) {
        //Mostrar contacto
        case 1:
            
            break;

        //Llamar contacto
        case 2:
            
            break;
        
        //Finalizar llamada
        case 3:

            break;
        
        //Cambiar bocina o auriculares
        case 4:

         break;

        //Salir
        default:
            continuar = false;
            break;
    
}
}
}
    /**
     * Menu para modo de telefonos tipo A
     * 
     * @author Grupo 9
     * @version TelefonoConectadoA 1.1
     */
public void TelefonoConectadoA(){
    boolean continuar = true;
    int desicion = 0;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("-------------------- Telefono Conectado A ------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    System.out.println("¿Que producto desea probar?");
    System.out.println("1. Mostrar contactos");
    System.out.println("2. Llamar a contacto ");
    System.out.println("3. Finalizar llamada");
    System.out.println("4. Llamar al último contacto con el que se hablo ");
    System.out.println("5. Salir");
    System.out.println();
    String s = " Ingrese su desicion: ";
    desicion = solicitar_int(s, 1, 5);
    switch (desicion) {
        //Mostrar contacto
        case 1:
            
            break;

        //Llamar contacto
        case 2:
            
            break;
        
        //Finalizar llamada
        case 3:

            break;
        
        //llamar ultimo contacto
        case 4:
        
         break;

        //Salir
        default:
            continuar = false;
            break;
    
}
}
}

    /**
     * Menu para modo de telefonos tipo C
     * 
     * @author Grupo 9
     * @version TelefonoConectadoC 1.1
     */
public void TelefonoConectadoC(){
    boolean continuar = true;
    int desicion = 0;
    while(continuar){
    System.out.println("--------------------------------------------------------");
    System.out.println("-------------------- Telefono Conectado C ------------------");
    System.out.println("--------------------------------------------------------");
    System.out.println("");
    System.out.println("¿Que producto desea probar?");
    System.out.println("1. Mostrar contactos");
    System.out.println("2. Llamar a contacto ");
    System.out.println("3. Finalizar llamada");
    System.out.println("4. Cambiar a llamada en espera  ");
    System.out.println("5. Salir");
    System.out.println();
    String s = " Ingrese su desicion: ";
    desicion = solicitar_int(s, 1, 5);
    switch (desicion) {
        //Mostrar contacto
        case 1:
            
            break;

        //Llamar contacto
        case 2:
            
            break;
        
        //Finalizar llamada
        case 3:

            break;
        
        //Cambiar llamada en espera
        case 4:
        
         break;

        //Salir
        default:
            continuar = false;
            break;
    
}
}
}

/**
     * Despedida para el usuario
     * 
     * @author Grupo 9
     * @version despedida 1.1
     */
    public void despedida(){
        System.out.println();
        System.out.println("\tSaliendo de el Radio...");
        System.out.println();
        System.out.println("\t\tGracias por utilizar nuestros servicios...");
        System.out.println("\t\tEsperamos que vuelva pronto!!!");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
    }

}