package factory;

public class Main {
    public static void main(String[] args) {
        GUIFactory factory = new MacFactory();

        Aplicacion ap = new Aplicacion(factory);
        ap.mostrarUI();
    }
}
