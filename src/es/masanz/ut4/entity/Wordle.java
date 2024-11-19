package es.masanz.ut4.entity;

import es.masanz.ut4.util.ColoresConsola;
import es.masanz.ut4.util.GeneradorPalabras;

public class Wordle {

    private String palabraParaAdivinar;

    public Wordle(String palabra){
        this.palabraParaAdivinar = palabra;
    }

    public Wordle(){
        this.palabraParaAdivinar = GeneradorPalabras.obtenerPalabraFija();
    }

    public int evaluarPalabra(String palabraUsuario){
        int caracteresCorrectos = 0;
        if(palabraUsuario.length()!=this.palabraParaAdivinar.length()){
            System.out.println("NO HAS INTRODUCIDO UNA PALABRA DE LONGITUD "+this.palabraParaAdivinar.length());
            return caracteresCorrectos;
        }
        for (int i = 0; i < palabraUsuario.length(); i++) {
            char letraUsuario = palabraUsuario.charAt(i);
            char letraWordle = this.palabraParaAdivinar.charAt(i);
            if(letraUsuario == letraWordle){
                System.out.print(ColoresConsola.VERDE+letraUsuario+ColoresConsola.RESET);
                caracteresCorrectos++;
            } else if (this.palabraParaAdivinar.contains(letraUsuario+"")) {
                System.out.print(ColoresConsola.CIAN+letraUsuario+ColoresConsola.RESET);
            } else {
                System.out.print(ColoresConsola.ROJO+letraUsuario+ColoresConsola.RESET);
            }
        }
        return caracteresCorrectos;
    }
}
