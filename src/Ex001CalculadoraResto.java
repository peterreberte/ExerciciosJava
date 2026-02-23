public class Ex001CalculadoraResto {

    public static void main(String[] args) {

        double numero1 = 10.00d;
        double numero2 = 80.20d;
        double numero3 = ((numero1 + numero2) * 100.00d);
        System.out.println("O resultado é: " + numero3);

        double numero4 = numero3 % 40.00d;
        System.out.println("A diferença é: " + numero4);

        boolean diferenca = numero4 != 0.0d;
        System.out.println("Tem diferença?: " + diferenca);

        if (diferenca) {
            System.out.println("Tem resto");
        } else {
            System.out.println("Não tem resto");
        }
    }
}

/* Exercício feito com a finalidade de familiarização com os operadores de Java. */