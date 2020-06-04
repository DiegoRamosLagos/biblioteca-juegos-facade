package facade;

import subsistema_juego.Biblioteca;
import subsistema_juego.Juego;
import subsistema_juego.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Consola {
    private List<Usuario> usuarios = new ArrayList<>();
    Usuario admin = new Usuario("admin", "admin");
    Usuario sesion = null;
    Biblioteca biblioteca = new Biblioteca();

    public void nuevoUsuario(String email, String nombre) {
        usuarios.add(new Usuario(email, nombre));
    }

    public void iniciarSesion(String nombre){
        if (usuarios.size() == 0) {
            sesion = admin;
        }
        for (Usuario usuario: usuarios) {
            if (nombre.equals(usuario.getNombre())) {
                sesion = usuario;
                break;
            }
        }
        if (sesion != null)
            System.out.println("Bienvenido: " + sesion.getNombre());
        else
            System.out.println("Usuario inválido");
    }

    public void cerrarSesion() {
        sesion = null;
    }

    public void agregarJuego(String nombre, String descripcion, Usuario sesion) {
        if (sesionValida(sesion))
            biblioteca.agregarJuego(new Juego(nombre, descripcion));
        else
            System.out.println("Debe iniciar sesión");
    }

    public  void quitarJuego(String nombre, Usuario sesion) {
        if (sesionValida(sesion)) {
            if (biblioteca.getJuego(nombre) != null)
                biblioteca.eliminarJuego(biblioteca.getJuego(nombre));
            else
                System.out.println("El juego no existe");
        }
    }

    public  void jugar(String nombre, Usuario sesion) {
        if (sesionValida(sesion)) {
            if (biblioteca.getJuego(nombre) != null)
                System.out.println("Jugando a :" + biblioteca.getJuego(nombre).getNombre());
            else
                System.out.println("El juego no existe");
        }
    }

    public void cambiarUsuario(String nombre, Usuario sesion) {
        if (sesionValida(sesion)) {
            cerrarSesion();
            iniciarSesion(nombre);
        }
    }

    public void revisarBiblioteca(){
        biblioteca.getJuegos();
    }

    public Usuario getSesion() {
        return sesion;
    }

    public boolean sesionValida (Usuario sesion) {
        return sesion != null;
    }


}
