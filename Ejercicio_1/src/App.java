import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite un numero");
        double numero = teclado.nextDouble();

        if (numero<0) {
            System.out.println("El valor absoluto de \""+numero+"\" es: \""+numero*-1+"\"");
        }else {
            System.out.println("El valor absoluto de \""+numero+"\" numero es: \""+numero+"\"");
        }

    }
}
