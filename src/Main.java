//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Archivo archi= new Archivo();
       //archi.crearArchivo("Archivo.txt");

       //archi.sobreescribirArchivo("Archivo.txt", "Primera  escritura");
       // archi.agregarTextoAlArchivo("Archivo.txt", "Tercera escritura");
        System.out.println(archi.leerArchivo("Archivo.txt"));
    }
}