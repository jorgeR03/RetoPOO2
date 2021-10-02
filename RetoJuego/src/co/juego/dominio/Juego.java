package co.juego.dominio;

public class Juego {
    private String nombreJugador;
    public static final int PIEDRA = 0;
    public static final int PAPEL = 1;
    public static final int TIJERA = 2;
    private int jugadaJugador;
    private int jugadaMaquina;
    private int ganadasJugador = 0;
    private int ganadasMaquina = 0;
    private int empate = 0;

    public Juego(int jugadaJugador) {
        this.jugadaJugador = jugadaJugador;
        this.jugadaMaquina =(int) Math.random()*3;
    }

    public String jugar(int jugadaJugador, int jugadaMaquina){
        if(jugadaJugador == PIEDRA && jugadaMaquina == TIJERA){
            ganadasJugador++;
            return "¡Felicidades, ganaste " + nombreJugador + "!";
        }
        else if(jugadaJugador == PAPEL && jugadaMaquina == PIEDRA){
            ganadasJugador++;
            return "¡Felicidades, ganaste " + nombreJugador + "!";
        }
        else if(jugadaJugador == TIJERA && jugadaMaquina ==PAPEL){
            ganadasJugador++;
            return "¡Felicidades, ganaste " + nombreJugador + "!";
        }
        else if(jugadaJugador == jugadaMaquina){
            empate++;
            return "Buen juego" + nombreJugador + ", fue un empate.";
        }
        else{
            ganadasMaquina++;
            return "Lo siento" + nombreJugador + ", perdiste.";
        }
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getGanadasJugador() {
        return ganadasJugador;
    }

    public int getGanadasMaquina() {
        return ganadasMaquina;
    }

    public int getEmpate() {
        return empate;
    }
}
