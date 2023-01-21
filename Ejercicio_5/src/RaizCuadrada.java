import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un numero");
        double numero = teclado.nextInt();
        if (numero>=0) {
            System.out.println("La raiz cuadrada del numero \""+ numero+"\" es:\""+(Math.sqrt(numero))+"\"");
        }else{
            System.out.println("El único número que tiene una sola raíz cuadrada es el cero."+ 
                            "Por el mismo motivo, no existen raíces cuadradas de número negativos.");
        }
    }
}
