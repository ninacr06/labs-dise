import java.util.ArrayList;
import java.util.List;

class Directory extends FileSystemComponent {
    private List<FileSystemComponent> children;

    public Directory(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    @Override
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public FileSystemComponent getChild(int index) {
        return children.get(index);
    }

    @Override
    public int getSize() {
        int total = 0;

        for (FileSystemComponent c : children) {
            total += c.getSize(); // recursivo
        }

        return total;
    }

    @Override
    public void show(String indent) {
        System.out.println(indent + "+ " + name + " (" + getSize() + " kb)");

        for (FileSystemComponent c : children) {
            c.show(indent + "   "); // indentación
        }
    }
}