public class Ex009CalculadoraAnoBissexto {

    public static void main(String[] args) {

        calcularAnoBissexto(1600);

    }

    public static void calcularAnoBissexto(int ano) {

        if (ano < 1 || ano > 9999) {
            System.out.println("Valor inválido");
        } else {
            if (ano % 4 == 0) {

                if (ano % 100 == 0) {

                    if (ano % 400 == 0) {
                        System.out.println(ano + " é ano bissexto");

                    } else {
                        System.out.println(ano + " não é ano bissexto");
                    }

                } else {
                    System.out.println(ano + " não é ano bissexto");
                }

            } else {
                System.out.println(ano + " não é ano bissexto");
            }
        }
    }
}

/* Enunciado:

Escreva um método chamado isLeapYear com um parâmetro do tipo int chamado year.

O parâmetro precisa ser maior ou igual a 1 e menor ou igual a 9999. Se o parâmetro não estiver nesse intervalo, retorne false.

Caso contrário, se estiver dentro do intervalo válido, calcule se o ano é bissexto e retorne true se for um ano bissexto, caso contrário retorne false.

Para determinar se um ano é bissexto, siga estes passos:

Se o ano for divisível por 4, vá para o passo 2. Caso contrário, vá para o passo 5.

Se o ano for divisível por 100, vá para o passo 3. Caso contrário, vá para o passo 4.

Se o ano for divisível por 400, vá para o passo 4. Caso contrário, vá para o passo 5.

O ano é bissexto (tem 366 dias). O método isLeapYear deve retornar true.

O ano não é bissexto (tem 365 dias). O método isLeapYear deve retornar false.

Outra forma de explicar:

Um ano bissexto é aquele que é divisível por 4, mas não por 100.

Se for divisível por 100, então também precisa ser divisível por 400.

Os seguintes anos não são bissextos:
1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600
Isso acontece porque são divisíveis por 100, mas não por 400.

Os seguintes anos são bissextos:
1600, 2000, 2400
Isso acontece porque são divisíveis tanto por 100 quanto por 400.

Exemplos de entrada/saída:

isLeapYear(-1600); → deve retornar false, pois o parâmetro não está no intervalo (1-9999)

isLeapYear(1600); → deve retornar true, pois 1600 é um ano bissexto

isLeapYear(2017); → deve retornar false, pois 2017 não é um ano bissexto

isLeapYear(2000); → deve retornar true, pois 2000 é um ano bissexto

Objetivo de aprendizagem: Refinar o entendimento de lógica condicional mais complexa determinando corretamente se um determinado ano é bissexto de acordo com regras específicas. */
