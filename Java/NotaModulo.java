import java.util.Arrays;

public class NotaModulo {
    public static void main(String[] args) {
        calcularNota(13, 23, 40, 15);
    }

    public static void calcularNota(int nota1, int nota2, int nota3, int nota4) {
        int[] notas = {nota1, nota2, nota3, nota4};

        Arrays.sort(notas);

        int notaMenor = notas[0];

        int notaTotal = ((nota1 + nota2 + nota3 + nota4) - notaMenor) / 3;

        System.out.println("La nota menor fue: " + notaMenor);
        System.out.println("La nota total fue: " + notaTotal);
    }
}
