public class Ex012VerificadorDeIdade {

    public static void main(String[] args) {

        temAdolescente(2, 45, 13);
        eAdolescente(4);

    }
    public static boolean temAdolescente(int numero1, int numero2, int numero3) {
        return eAdolescente(numero1) || eAdolescente(numero2) || eAdolescente(numero3);
    }

    public static boolean eAdolescente(int numero1) {
        return numero1 >= 13 && numero1 <= 19;
    }
}

/* Enunciado:

Vamos considerar que um número é "teen" se estiver no intervalo 13 - 19 (inclusive).

Escreva um método chamado hasTeen com 3 parâmetros do tipo int.

O método deve retornar boolean e precisa retornar true se um dos parâmetros estiver no intervalo 13 (inclusive) - 19 (inclusive). Caso contrário, retorne false.

EXEMPLOS DE ENTRADA/SAÍDA:

hasTeen(9, 99, 19); → deve retornar true, pois 19 está no intervalo 13 - 19

hasTeen(23, 15, 42); → deve retornar true, pois 15 está no intervalo 13 - 19

hasTeen(22, 23, 34); → deve retornar false, pois 22, 23 e 34 não estão no intervalo 13 - 19

Escreva outro método chamado isTeen com 1 parâmetro do tipo int.

O método deve retornar boolean e precisa retornar true se o parâmetro estiver no intervalo 13 (inclusive) - 19 (inclusive). Caso contrário, retorne false.

EXEMPLOS DE ENTRADA/SAÍDA:

isTeen(9); → deve retornar false, pois 9 não está no intervalo 13 - 19

isTeen(13); → deve retornar true, pois 13 está no intervalo 13 - 19

Objetivo de aprendizagem: Melhorar a verificação de condições baseadas em intervalo, determinando se alguma das idades fornecidas está dentro da faixa teen. */