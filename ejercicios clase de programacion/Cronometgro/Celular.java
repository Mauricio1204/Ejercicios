package Cronometgro;

public class Celular {
       
    String nombre;
    String marca;
    int tamaño;
    String color;

    public Celular(String nombre, String marca, int tamaño, String color){
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.marca = marca;
        this.color = color;
    }
        public void MostrarCelular() {
            System.out.println("las caracteristicas del tevisor son las siguientes: " + 
                                "nombre: " + nombre +
                                "marca: " + marca +
                                "tamaño:" + tamaño +
                                "color: " + color);

        } 
}
