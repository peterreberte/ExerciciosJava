public class Ex016ConversorDeMinutos {

    public static void main(String[] args) {

        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");

        } else {
            long horas = minutes / 60;
            long dias = horas / 24;
            long restoDias = dias % 365;
            long anos = dias / 365;

            System.out.println(minutes + " min = " + anos + " y and " + restoDias + " d");
        }
    }

    /* Enunciado:

Escreva um método chamado printYearsAndDays com um parâmetro do tipo long chamado minutes.

O método não deve retornar nada (void) e precisa calcular os anos e dias a partir do parâmetro minutes.

Se o parâmetro for menor que 0, imprima o texto "Invalid Value".

Caso contrário, se o parâmetro for válido, então deve imprimir uma mensagem no formato:

"XX min = YY y and ZZ d"

XX representa o valor original de minutes.
YY representa os anos calculados.
ZZ representa os dias calculados.

EXEMPLOS DE ENTRADA/SAÍDA:

printYearsAndDays(525600); → deve imprimir "525600 min = 1 y and 0 d"

printYearsAndDays(1051200); → deve imprimir "1051200 min = 2 y and 0 d"

printYearsAndDays(561600); → deve imprimir "561600 min = 1 y and 25 d"

Objetivo de aprendizado: Desenvolver suas habilidades com cálculos baseados em tempo, convertendo uma grande quantidade de minutos em anos e dias correspondentes, com a formatação correta. */
}
