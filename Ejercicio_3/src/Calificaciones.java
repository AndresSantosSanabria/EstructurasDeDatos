import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el nombre del estudiante");
        String nombre = teclado.nextLine();

        System.out.println("Hola "+nombre+ "\nDigita la nota #1");
        double nota1= teclado.nextDouble();
        System.out.println("Digita la nota #2");
        double nota2= teclado.nextDouble();
        System.out.println("Digita la nota #3");
        double nota3= teclado.nextDouble();
        System.out.println("Digita la nota #4");
        double nota4= teclado.nextDouble();

        metodos met= new metodos();
        met.NtMayor(nota1, nota2, nota3, nota4);
        met.NtMenor(nota1, nota2, nota3, nota4);
        System.out.println(nombre+" el promedio de tus notas es: "+met.promedio(nota1, nota2, nota3, nota4));
    }
}
