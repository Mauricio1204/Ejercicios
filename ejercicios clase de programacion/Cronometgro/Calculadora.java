package Cronometgro;

public class Calculadora {
    String nombre;
    String marca;
    int tamaño;
    String color;

    public Calculadora(String nombre, String marca, int tamaño, String color){
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.marca = marca;
        this.color = color;
    }
        public void MostrarCamaraFotografica() {
            System.out.println("las caracteristicas del tevisor son las siguientes: " + 
                                "nombre: " + nombre +
                                "marca: " + marca +
                                "tamaño:" + tamaño +
                                "color: " + color);

        }
}
