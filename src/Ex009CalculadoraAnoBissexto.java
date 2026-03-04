public class Ex009CalculadoraAnoBissexto {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2020));

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

isLeapYear(2000); → deve retornar true, pois 2000 é um ano bissexto */
