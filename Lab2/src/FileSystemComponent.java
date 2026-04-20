abstract class FileSystemComponent {
    protected String name;

    public FileSystemComponent(String name) {
        this.name = name;
    }

    // Método principal
    public abstract int getSize();

    // Método para mostrar la estructura
    public abstract void show(String indent);

    // Métodos por defecto
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Operacion invalida");
    }

    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Operacion invalida");
    }

    public FileSystemComponent getChild(int index) {
        throw new UnsupportedOperationException("Operacion invalida");
    }
}