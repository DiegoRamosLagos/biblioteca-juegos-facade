package subsistema_juego;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final String NOMBRE = "Biblioteca de consola";
    private List<Juego> juegos = new ArrayList<>();

    public void agregarJuego(Juego juego) {
        juegos.add(juego);
    }

    public void eliminarJuego(Juego juego) {
        juegos.remove(juego);
    }

    public Juego getJuego(String nombre){
        for (Juego juego: juegos) {
            if (nombre.equals(juego.getNombre())) {
                return juego;
            }
        }
        return null;
    }

    public void getJuegos() {
        System.out.println("Biblioteca");
        for (Juego juego: juegos) {
            System.out.println("\t" + juego.toString());
        }
    }
}
