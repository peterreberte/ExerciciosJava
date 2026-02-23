public class Ex011VerificadorDeSomaIgual {

    public static void main(String[] args) {

        temSomaIgual(3, 3, 6);

    }

    public static boolean temSomaIgual(int numero1, int numero2, int numero3) {

        if (numero1 + numero2 == numero3) {
            return true;
        } else
            return false;
    }
}

/* Enunciado:

Escreva um método chamado hasEqualSum com 3 parâmetros do tipo int.

O método deve retornar boolean e precisa retornar true se a soma do primeiro e do segundo parâmetro for igual ao terceiro parâmetro. Caso contrário, retorne false.

EXEMPLOS DE ENTRADA/SAÍDA:

hasEqualSum(1, 1, 1); → deve retornar false, pois 1 + 1 não é igual a 1

hasEqualSum(1, 1, 2); → deve retornar true, pois 1 + 1 é igual a 2

hasEqualSum(1, -1, 0); → deve retornar true, pois 1 + (-1) é 1 - 1 e é igual a 0

Objetivo de aprendizagem: Consolidar operações aritméticas e verificações de igualdade confirmando se a soma de dois inteiros corresponde a um terceiro inteiro. */