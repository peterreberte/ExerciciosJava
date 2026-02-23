public class Ex007ConversorVelocidade {

    public static void main(String[] args) {

        mostrarConversao(75.144);
    }

    public static void mostrarConversao(double kilometrosPorHora) {

        double milhasPorHora = 1.609;

        if (kilometrosPorHora < 0) {
            System.out.println("Valor inválido");

        } else {
            long velocidadeConvertida = Math.round(kilometrosPorHora / milhasPorHora);
            System.out.println(kilometrosPorHora + " km/h = " + velocidadeConvertida + " mi/h");
        }
    }
}

/* Enunciado:

Implementando um Conversor de Velocidade para Praticar Aritmética Básica em Java e Saída de Dados

Escreva um método chamado toMilesPerHour que tenha 1 parâmetro do tipo double com o nome kilometersPerHour.
Este método precisa retornar o valor arredondado do cálculo, do tipo long.

Se o parâmetro kilometersPerHour for menor que 0, o método toMilesPerHour deve retornar -1 para indicar um valor inválido.

Caso contrário, se for positivo, calcule o valor em milhas por hora, arredonde e retorne. Para conversão e arredondamento, verifique as notas no texto abaixo.

Exemplos de entrada/saída:

toMilesPerHour(1.5); → deve retornar o valor 1

toMilesPerHour(10.25); → deve retornar o valor 6

toMilesPerHour(-5.6); → deve retornar o valor -1

toMilesPerHour(25.42); → deve retornar o valor 16

toMilesPerHour(75.114); → deve retornar o valor 47

Escreva outro método chamado printConversion com 1 parâmetro do tipo double com o nome kilometersPerHour.

Este método não deve retornar nada (void) e precisa calcular milesPerHour a partir do parâmetro kilometersPerHour.

Depois, ele deve imprimir uma mensagem no formato:

"XX km/h = YY mi/h"

XX representa o valor original de kilometersPerHour.
YY representa o valor arredondado de milesPerHour calculado a partir do parâmetro kilometersPerHour.

Se o parâmetro kilometersPerHour for < 0, então imprima o texto "Invalid Value".

Exemplos de entrada/saída:

printConversion(1.5); → deve imprimir o seguinte texto (no console - System.out):  1.5 km/h = 1 mi/h

printConversion(10.25); → deve imprimir o seguinte texto (no console - System.out):  10.25 km/h = 6 mi/h

printConversion(-5.6); → deve imprimir o seguinte texto (no console - System.out):  Invalid Value

printConversion(25.42); → deve imprimir o seguinte texto (no console - System.out):  25.42 km/h = 16 mi/h
printConversion(75.114); → deve imprimir o seguinte texto (no console - System.out):  75.114 km/h = 47 mi/h

Use o método Math.round para arredondar o número de milhas por hora calculado (double). O método round retorna long.

DICA: No método printConversion, chame o método toMilesPerHour em vez de duplicar o código.

OBSERVAÇÃO: 1 milha por hora é igual a 1.609 quilômetros por hora.

Objetivo de aprendizagem: Fortalecer as operações aritméticas e a formatação de saída em Java convertendo quilômetros por hora para milhas por hora. */