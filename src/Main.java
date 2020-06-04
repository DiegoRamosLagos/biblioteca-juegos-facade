import facade.Consola;

public class Main {
    public static void main(String[] args) {
        Consola consola = new Consola();
        consola.iniciarSesion("admin");
        consola.nuevoUsuario("diego@gmail.com", "randir");
        consola.cambiarUsuario("randir", consola.getSesion());
        consola.revisarBiblioteca();
        consola.agregarJuego("Valorant", "Tactical shooter", consola.getSesion());
        consola.revisarBiblioteca();
        consola.agregarJuego("Counter Strike Global offense", "Tactical shooter", consola.getSesion());
        consola.revisarBiblioteca();
        System.out.println();
        System.out.println();
        consola.jugar("Valorant", consola.getSesion());
    }
}
