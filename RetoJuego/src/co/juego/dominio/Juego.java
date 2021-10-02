package co.juego.dominio;

import java.util.Random;

public class Juego {
    private String nombreJugador = null;
    public static final int PIEDRA = 0;
    public static final int PAPEL = 1;
    public static final int TIJERA = 2;
    private int ganadasJugador = 0;
    private int ganadasMaquina = 0;
    private int empates = 0;
    private int jugadaMaquina = new Random().nextInt(3);

    public String jugar(int jugadaJugador) {
        if (jugadaJugador == PIEDRA && jugadaMaquina == TIJERA) {
            ganadasJugador++;
            return "¡Felicidades, ganaste " + nombreJugador + "!";
        } else if (jugadaJugador == PAPEL && jugadaMaquina == PIEDRA) {
            ganadasJugador++;
            return "¡Felicidades, ganaste " + nombreJugador + "!";
        } else if (jugadaJugador == TIJERA && jugadaMaquina == PAPEL) {
            ganadasJugador++;
            return "¡Felicidades, ganaste " + nombreJugador + "!";
        } else if (jugadaJugador == jugadaMaquina) {
            empates++;
            return "Buen juego " + nombreJugador + ", fue un empate.";
        } else {
            ganadasMaquina++;
            return "Lo siento " + nombreJugador + ", perdiste.";
        }
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public void setGanadasJugador(int ganadasJugador) {
        this.ganadasJugador = ganadasJugador;
    }

    public void setGanadasMaquina(int ganadasMaquina) {
        this.ganadasMaquina = ganadasMaquina;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public int getGanadasJugador() {
        return ganadasJugador;
    }

    public int getGanadasMaquina() {
        return ganadasMaquina;
    }

    public int getEmpates() {
        return empates;
    }

    public int getJugadaMaquina() {
        return jugadaMaquina;
    }
}
