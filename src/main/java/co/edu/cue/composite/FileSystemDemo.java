package co.edu.cue.composite;

public class FileSystemDemo {
    public static void main(String[] args) {
        // creacion de archivos
        FileComponent file1 = new File("Document.txt");
        FileComponent file2 = new File("Image1.png");
        FileComponent file3 = new File("Image2.png");

        // creacion de carpetas
        Folder rootFolder = new Folder("Root");
        Folder imagesFolder = new Folder("Images");

        // agregar archivos a las carpetas
        imagesFolder.add(file2);
        imagesFolder.add(file3);

        rootFolder.add(file1);
        rootFolder.add(imagesFolder);

        // mostrar detalles del sistema de archivos
        rootFolder.showDetails();
    }
}
