public class Main {
    public static void main(String[] args) {

        // Archivos
        File f1 = new File("tarea.docx", 120);
        File f2 = new File("foto.png", 300);
        File f3 = new File("video.mp4", 1000);
        File f4 = new File("notas.txt", 80);

        // Carpetas
        Directory documentos = new Directory("Documentos");
        Directory multimedia = new Directory("Multimedia");
        Directory raiz = new Directory("MiPC");

        // Construcción del árbol
        documentos.add(f1);
        documentos.add(f4);

        multimedia.add(f2);
        multimedia.add(f3);

        raiz.add(documentos);
        raiz.add(multimedia);

        // Mostrar estructura
        System.out.println("=== ESTRUCTURA DEL SISTEMA ===");
        raiz.show("");

        // Resultado final
        System.out.println("\n=== RESULTADO FINAL ===");
        System.out.println("Tamaño total: " + raiz.getSize() + " kb");
    }
}