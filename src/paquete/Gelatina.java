package paquete;

public class Gelatina {
    // Atributos
    String color;
    String sabor;

    // Metodos

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void mostrarInfo() {
        System.out.println("La informacion de la gelatina es:");
        System.out.println("Sabor: " + getSabor());
        System.out.println("Color: " + getColor());
    }
}

