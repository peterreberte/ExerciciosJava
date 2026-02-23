public class Ex010ComparadorDecimal {

    public static void main(String[] args) {

        temTresCasasDecimaisIguais(3.234, 3.234);

    }

    public static void temTresCasasDecimaisIguais(double numero1, double numero2) {

        int calculo1 = (int) (numero1 * 1000); // 3.234 -> 3234
        int calculo2 = (int) (numero2 * 1000); // 3.234 -> 3234

        if (calculo1 == calculo2) {
            System.out.println("Iguais");

        } else {
            System.out.println("Diferentes");
        }


    }
}

/* Enunciado:

Escreva um método chamado areEqualByThreeDecimalPlaces com dois parâmetros do tipo double.

O método deve retornar boolean e precisa retornar true se os dois números do tipo double forem iguais até três casas decimais. Caso contrário, retorne false.

EXEMPLOS DE ENTRADA/SAÍDA:

areEqualByThreeDecimalPlaces(-3.1756, -3.175); → deve retornar true, pois os números são iguais até 3 casas decimais.

areEqualByThreeDecimalPlaces(3.175, 3.176); → deve retornar false, pois os números não são iguais até 3 casas decimais.

areEqualByThreeDecimalPlaces(3.0, 3.0); → deve retornar true, pois os números são iguais até 3 casas decimais.

areEqualByThreeDecimalPlaces(-3.123, 3.123); → deve retornar false, pois os números não são iguais até 3 casas decimais.

DICA: Use papel e caneta.
DICA: Use casting (conversão de tipo).

Objetivo de aprendizagem: Aprender a comparar números de ponto flutuante até uma determinada casa decimal, implementando um método que verifica igualdade considerando três casas decimais. */