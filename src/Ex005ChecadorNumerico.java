public class Ex005ChecadorNumerico { // Positivo, Negativo e zero

    public static void main(String[] args) {

        checarNumero(0);

    }

    public static void checarNumero(int numero) {

        if (numero > 0) {
            System.out.println("Positivo");

        } else if (numero < 0) {
            System.out.println("Negativo");

        } else {
            System.out.println("Zero");
        }
    }
}

/* Enunciado:

Escreva um método chamado checkNumber com um parâmetro do tipo int chamado number.

O método não deve retornar nenhum valor, e ele precisa imprimir:

positive se o número do parâmetro for > 0

negative se o número do parâmetro for < 0

"zero" se o número do parâmetro for igual a 0

OBSERVAÇÃO:
O método checkNumber precisa ser definido como public static, como temos feito até agora no curso.

Objetivo de aprendizagem:
Aprofundar o entendimento das estruturas de decisão em Java, criando um programa que classifica valores numéricos como positivos, negativos ou zero. */