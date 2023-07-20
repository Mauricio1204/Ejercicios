package ejercio2;

public class LamdaTest2 {
    public static void main(String[] args){
        Operaciones op= (num1, num2 ) -> System.out.println(num1+num2);
        op.imprimeSuma(15,30);
    }
}
