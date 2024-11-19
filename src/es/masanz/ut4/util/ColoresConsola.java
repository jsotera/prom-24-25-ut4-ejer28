package es.masanz.ut4.util;

public class ColoresConsola {

    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CIAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";

    public static void imprimirEnRojo(String texto){
        System.out.print(ROJO);
        System.out.print(texto);
        System.out.println(RESET);
    }

    public static void imprimirEnVerde(String texto){
        System.out.println(VERDE+texto+RESET);
    }

    public static void imprimirEnAmarillo(String texto){
        System.out.println(AMARILLO+texto+RESET);
    }

    public static void imprimirEnAzul(String texto){
        System.out.println(AZUL+texto+RESET);
    }

    public static void imprimirEnMorado(String texto){
        System.out.println(MAGENTA+texto+RESET);
    }

    public static void pintarPalabrasRandom(String texto){
        String color = colorRandom();
        System.out.print(color);
        int desde = 0;
        int hasta = 0;
        for(int i = 0; i<texto.length(); i++){
            char c = texto.charAt(i);
            if(c == ' '){
                hasta = i;
                color = colorRandom();
                System.out.print(color+" ");
                System.out.print(texto.substring(desde, hasta));
                desde = hasta + 1;
            }
        }
        color = colorRandom();
        System.out.print(color+" ");
        System.out.print(texto.substring(desde));
        System.out.println(RESET);

    }

    public static String colorRandom(){
        String colorElegido = "";
        int num = (int) (Math.random()*7)+1;
        switch (num){
            case 1:
                return ROJO;

            case 2:
                return VERDE;

            case 3:
                return AMARILLO;

            case 4:
                return AZUL;

            case 5:
                return MAGENTA;

            case 6:
                return CIAN;

            case 7:
                return BLANCO;

        }

        return colorElegido;
    }
}
