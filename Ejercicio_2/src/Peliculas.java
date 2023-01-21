import java.util.Scanner;

public class Peliculas {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Puedes llevarte 3 peliculas por el precio de las 2 mas baratas");
        System.out.println("Digite cuantas peliculas desea llevar");
        int numPeliculas = teclado.nextInt();
        double suma=0;
        double p1,p2,p3;
        if (numPeliculas==3) {
            System.out.println("Digite el costo de la pelicula #1");
            p1 =teclado.nextDouble();
            System.out.println("Digite el costo de la pelicula #2");
            p2 =teclado.nextDouble();
            System.out.println("Digite el costo de la pelicula #3");
            p3 =teclado.nextDouble();
            if (p1>p2 && p1>p3) {
                p1 = 0;
            }else if (p2>p1 && p2>p3) {
                p2 = 0;
            }else if(p3>p1 && p3>p2){
                p3 = 0;
            }else if(p1 == p2 && p1 == p3){
                p1 =0;
            }
            System.out.println("El costo de las peliculas es: "+(p1+p2+p3));
        }else{
            for (int i = 0; i < numPeliculas; i++) {
                System.out.println("Digite el costo de la pelicula #"+ (i+1)); 
                suma = suma+teclado.nextDouble();
            }
            System.out.println("El costo de las peliculas es: "+(suma));
        }
    }
}
