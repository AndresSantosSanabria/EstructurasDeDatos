import java.util.Scanner;

public class Collatz {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un numero entero");
        int resultado = teclado.nextInt();
        while (resultado!=1) {
            if (resultado%2==0) {
                resultado = resultado/2;
            }else{
                resultado = (resultado * 3) + 1;
            }
            System.out.println(resultado);
        }
    }
}