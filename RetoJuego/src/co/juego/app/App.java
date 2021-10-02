package co.juego.app;

import co.juego.dominio.Juego;

import javax.swing.*;
import java.util.Arrays;

public class App {
    public static final ImageIcon icono = new ImageIcon("C:\\RETOPOO2\\rkpp73 (1).jpg");
    public static final int JUGAR = 0;
    public static final int VER_PUNTAJES = 1;
    public static final int INSTRUCCIONES = 2;
    public static final int CAMBIAR_NOMBRE_JUGADOR = 3;
    private static Juego play = new Juego();

    public static void main(String[] args) {
        //Juego play = new Juego();
        do{
           int seleccion = JOptionPane.showOptionDialog(null, "Bienvenido al juego.", "Pieda, Papel o Tijera.", 0, JOptionPane.PLAIN_MESSAGE, icono, Arrays.asList("Jugar", "Ver Puntajes", "Instrucciones", "Cambiar Nombre Del Jugador").toArray(), play.getNombreJugador());
           switch (seleccion){
               case JUGAR: {
                    if(play.getNombreJugador() == null) {
                        play.setNombreJugador(ingresarNombre());
                    }
                    int jugadaJugador = JOptionPane.showOptionDialog(null, "Selecciona tu jugada.","Piedra, Papel o Tijera",0, JOptionPane.QUESTION_MESSAGE, null, Arrays.asList("Piedra", "Papel", "Tijera").toArray(), null);
                    if (jugadaJugador == JOptionPane.CLOSED_OPTION){
                        continue;
                    }
                    String resultado = play.jugar(jugadaJugador);
                    JOptionPane.showMessageDialog( null, "La jugada de la maquina fue: " + play.getJugadaMaquina() + "\nLa jugada de " + play.getNombreJugador() + " fue: " + jugadaJugador + "\n" + resultado);
                    break;
               }
               case VER_PUNTAJES: {
                   String resultados = "Ganadas Maquina: " + play.getGanadasMaquina() + "\nGanadas " + play.getNombreJugador() + ": " + play.getGanadasJugador() + "\nEmpates: " + play.getEmpates();
                   JOptionPane.showMessageDialog(null, resultados);
                   break;
               }
               case INSTRUCCIONES:{
                   String instrucciones = "Instrucciones.\nBienvenido a piedra, papel o tijera:\n- Presionar “Jugar” para iniciar el juego. Si no has ingresado un nombre aún, él te lo pedirá\n  automáticamente. Posteriormente deberás escoger tu jugada, recuerda que la piedra le\n  gana a la tijera, la tijera le gana al papel y el papel le gana a la piedra.\n- Presiona “Ver resultados” para ver el historial de partidas jugadas.\n- Presiona “Cambiar nombre” para cambiar el nombre del jugador. Al realizar esta acción\n  se borrará el historial de partidas.";
                   JOptionPane.showMessageDialog(null, instrucciones);
                   break;
               }
               case CAMBIAR_NOMBRE_JUGADOR: {
                   play.setNombreJugador(ingresarNombre());
                   play.setEmpates(0);
                   play.setGanadasJugador(0);
                   play.setGanadasMaquina(0);
                   break;
               }
               case JOptionPane.CLOSED_OPTION:{
                   System.exit(0);
               }
           }
        }while(true);
    }
    public static String ingresarNombre(){
        String nombre;
        do{
            nombre = JOptionPane.showInputDialog("Ingrese su nombre.", play.getNombreJugador());
        }while(nombre == null || nombre.trim().isEmpty());
        return nombre;
    }

}
