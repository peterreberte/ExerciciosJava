public class Ex013ConversorDeCentimetrosSobrecarregado {

    public static void main(String[] args) {

        System.out.println("A altura é igual a: " + conversorDeCentimetros(68) + "cm");
        System.out.println("A altura é igual a: " + conversorDeCentimetros(6, 8) + "cm");
    }

    public static double conversorDeCentimetros(int polegadas) {

        return polegadas * 2.54;
    }

    public static double conversorDeCentimetros(int pes, int polegadas) {

        int totalPolegadas = pes * 12 + polegadas;

        return conversorDeCentimetros(totalPolegadas);
    }
}

/* Enunciado:

Crie dois métodos com o mesmo nome: convertToCentimeters.

O primeiro método deve ter um parâmetro do tipo int, que representa a altura total em polegadas (inches).
Você deve converter polegadas para centímetros nesse método e retornar o valor em centímetros como double.

O segundo método deve ter dois parâmetros do tipo int: um para representar a altura em pés (feet) e outro para representar as polegadas restantes (inches).

Então, se uma pessoa tem 5 pés e 8 polegadas, os valores 5 (feet) e 8 (inches) devem ser passados para esse método para obter o total em centímetros, também retornando o valor como double.

Ambos os métodos devem retornar um número real (decimal) representando a altura total em centímetros.

Chame os dois métodos e imprima os resultados.

DICA: A fórmula de conversão de polegadas para centímetros é: 1 inch = 2.54 cm.

DICA: 1 foot = 12 inches. */