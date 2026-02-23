public class Ex002CalculadoraMedia {

    public static void main(String[] args) {

        calcularMedia(7, 9.4, 9.2);

    }

    public static void calcularMedia(double matematica, double portugues, double ciencia) {

        double media = (matematica + portugues + ciencia) / 3;

        if (media >= 9) {
            System.out.printf("Excelente, média de: %.1f", media);

        } else if (media >= 7) {
            System.out.printf("Aprovado, média de: %.1f", media);

        } else if (media >= 5) {
            System.out.printf("Recuperação, média de: %.1f", media);

        } else {
            System.out.printf("Reprovado, média de: %.1f", media);
        }

    }
}

/* Exercício criado de forma autoral para teste de habilidade de lógica. */
