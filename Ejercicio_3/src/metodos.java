public class metodos {

    public static void NtMayor(double nota1,double nota2,double nota3,double nota4) {
        if (nota1>nota2 && nota1>nota3 && nota1>nota4) {
            System.out.println("La mejor calificacion fue de:"+nota1);
        }else if (nota2>nota1 && nota2>nota3 && nota2>nota4) {
            System.out.println("La mejor calificacion fue de:"+nota2);
        }else if (nota3>nota1 && nota3>nota2 && nota3>nota4) {
            System.out.println("La mejor calificacion fue de:"+nota3);
        }else if (nota4>nota1 && nota4>nota3 && nota4>nota2) {
            System.out.println("La mejor calificacion fue de:"+nota4);
        }else if (nota1 == nota2 && nota1 > nota3 && nota1 > nota4) {
            System.out.println("La mejor calificacion fue de:"+nota1);
        }else if (nota1 == nota3 && nota1 > nota2 && nota1 > nota4) {
            System.out.println("La mejor calificacion fue de:"+nota1);
        }else if (nota1 == nota4 && nota1 > nota3 && nota1 > nota2) {
            System.out.println("La mejor calificacion fue de:"+nota1);
        }else if (nota2 == nota3 && nota2>nota4) {
            System.out.println("La mejor calificacion fue de:"+nota2);
        }else if (nota2 == nota4 && nota2>nota3) {
            System.out.println("La mejor calificacion fue de:"+nota2);
        }else if (nota3 == nota4) {
            System.out.println("La mejor calificacion fue de:"+nota3);
        }
    }
    public static void NtMenor(double nota1,double nota2,double nota3,double nota4) {
        if (nota1<nota2 && nota1<nota3 && nota1<nota4) {
            System.out.println("La menor calificacion fue de:"+nota1);
        }else if (nota2<nota1 && nota2<nota3 && nota2<nota4) {
            System.out.println("La menor calificacion fue de:"+nota2);
        }else if (nota3<nota1 && nota3<nota2 && nota3<nota4) {
            System.out.println("La menor calificacion fue de:"+nota3);
        }else if (nota4<nota1 && nota4<nota3 && nota4<nota2) {
            System.out.println("La menor calificacion fue de:"+nota4);
        }else if (nota1 == nota2 && nota1 < nota3 && nota1 < nota4) {
            System.out.println("La menor calificacion fue de:"+nota1);
        }else if (nota1 == nota3 && nota1 < nota2 && nota1 < nota4) {
            System.out.println("La menor calificacion fue de:"+nota1);
        }else if (nota1 == nota4 && nota1 < nota3 && nota1 < nota2) {
            System.out.println("La menor calificacion fue de:"+nota1);
        }else if (nota2 == nota3 && nota2 < nota4) {
            System.out.println("La menor calificacion fue de:"+nota2);
        }else if (nota2 == nota4 && nota2 < nota3) {
            System.out.println("La menor calificacion fue de:"+nota2);
        }else if (nota3 == nota4) {
            System.out.println("La menor calificacion fue de:"+nota3);
        }
    }
    public static double promedio(double nota1,double nota2,double nota3,double nota4) {
        return (nota1+nota2+nota3+nota4)/4;
    }
}