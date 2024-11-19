package es.masanz.ut4;

import es.masanz.ut4.entity.Wordle;
import es.masanz.ut4.util.GeneradorPalabras;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String palabraWordle = "articulo";
        Wordle juego = new Wordle(palabraWordle);
        System.out.print("Introduce una palabra de 8 caracteres: ");
        Scanner scanner = new Scanner(System.in);
        String palabraUsuario = scanner.next();
        int caraceteresCorrectos = juego.evaluarPalabra(palabraUsuario);
        while(caraceteresCorrectos!=palabraWordle.length()){
            System.out.println();
            System.out.print("Introduce una palabra de 8 caracteres: ");
            palabraUsuario = scanner.next();
            caraceteresCorrectos = juego.evaluarPalabra(palabraUsuario);
        }

    }
}