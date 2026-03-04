public class Ex022CalculadoraAnoBissextoSwitch {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2020));
        System.out.println(getDaysInMonth(2, 2020));

    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            return false;

        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        if (isLeapYear(year)) {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 29;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };

        } else {
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
        }
    }
}

/* Enunciado:

Escreva um método isLeapYear com um parâmetro do tipo int chamado year.

O parâmetro precisa ser maior ou igual a 1 e menor ou igual a 9999.

Se o parâmetro não estiver nesse intervalo, retorne false.

Caso contrário, se estiver dentro do intervalo válido, calcule se o ano é bissexto e retorne true se for, caso contrário retorne false.

Um ano é bissexto se for divisível por 4 e não por 100, ou se for divisível por 400.

Exemplos de entrada/saída:

isLeapYear(-1600); → deve retornar false, pois o parâmetro não está no intervalo (1–9999)

isLeapYear(1600); → deve retornar true, pois 1600 é um ano bissexto

isLeapYear(2017); → deve retornar false, pois 2017 não é um ano bissexto

isLeapYear(2000); → deve retornar true, pois 2000 é um ano bissexto

Escreva outro método getDaysInMonth com dois parâmetros month e year, ambos do tipo int.

Se o parâmetro month for menor que 1 ou maior que 12, retorne -1.

Se o parâmetro year for menor que 1 ou maior que 9999, retorne -1.

Esse método precisa retornar o número de dias do mês. Tenha cuidado com anos bissextos, pois eles têm 29 dias no mês 2 (fevereiro).

Você deve verificar se o ano é bissexto usando o método isLeapYear descrito acima.

Exemplos de entrada/saída:

getDaysInMonth(1, 2020); → deve retornar 31, pois janeiro tem 31 dias.

getDaysInMonth(2, 2020); → deve retornar 29, pois fevereiro tem 29 dias em ano bissexto e 2020 é um ano bissexto.

getDaysInMonth(2, 2018); → deve retornar 28, pois fevereiro tem 28 dias quando não é ano bissexto e 2018 não é um ano bissexto.

getDaysInMonth(-1, 2020); → deve retornar -1, pois o parâmetro month é inválido.

getDaysInMonth(1, -2020); → deve retornar -1, pois o parâmetro year está fora do intervalo de 1 a 9999.

Objetivo de aprendizagem: Projetar um programa que calcule corretamente a quantidade de dias em qualquer mês informado, considerando anos bissextos para o mês de fevereiro. */
