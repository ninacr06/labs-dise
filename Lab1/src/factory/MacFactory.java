package factory;

public class MacFactory implements GUIFactory{
    @Override
    public Boton crearBoton() {
        return new BotonMac();
    }

    @Override
    public Ventana crearVentana() {
        return new VentanaMac();
    }
}
