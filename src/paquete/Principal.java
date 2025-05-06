package paquete;

public class Principal {
    public static void main(String[] args) {
    // Crear un objeto a partir de una clase - Instancia
    Gelatina g1 = new Gelatina();
    g1.setColor("Verde");
    g1.setSabor("Limon");

    g1.mostrarInfo();

    Gelatina g2 = new Gelatina();
    g2.setColor("Amarillo");
    g2.setSabor("Naranja");
    g2.mostrarInfo();

        System.out.println("Santiago Gonzalez - 24310116");
    }
}
