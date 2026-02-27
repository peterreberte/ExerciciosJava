public class Ex017ChecadorNumerico2 {

    public static void main(String[] args) {

        printEqual(2, 1, 1);

    }

    public static void printEqual(int numero1, int numero2, int numero3) {

        if (numero1 < 0 || numero2 < 0 || numero3 < 0) {
            System.out.println("Invalid Value");
        } else if (numero1 == numero2 && numero1 == numero3) {
            System.out.println("All numbers are equal");
        } else if (numero1 != numero2 && numero1 != numero3 && numero2 != numero3) {
            System.out.println("All numbers are different");
        } else if (numero1 != numero2 || numero2 != numero3 ){
            System.out.println("Neither all are equal or different");
        }
    }
}

/* Enunciado:

Escreva um método chamado printEqual com 3 parâmetros do tipo int. O método não deve retornar nada (void).

Se um dos parâmetros for menor que 0, imprima o texto "Invalid Value".

Se todos os números forem iguais, imprima o texto "All numbers are equal".

Se todos os números forem diferentes, imprima o texto "All numbers are different".

Caso contrário, imprima "Neither all are equal or different".

EXEMPLOS DE ENTRADA/SAÍDA:

printEqual(1, 1, 1); deve imprimir All numbers are equal

printEqual(1, 1, 2); deve imprimir Neither all are equal or different

printEqual(-1, -1, -1); deve imprimir Invalid Value

printEqual(1, 2, 3); deve imprimir All numbers are different

Objetivo de aprendizado: Melhorar sua habilidade com lógica condicional imprimindo mensagens diferentes com base em três números inteiros, verificando se todos são iguais, todos são diferentes ou nenhuma das opções anteriores.  */
