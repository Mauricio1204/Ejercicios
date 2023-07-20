public class prueva1 {
    
    public static void main(String[] args) {
        inferfa ft = () -> System.out.println("hola mundo");
        // ft.saludar();
         prueva1 obj = new prueva1();
         obj.miMetodo(ft);
    }
   
    public void miMetodo(inferfa parametro)  {

        parametro.saludar();

    }
}
