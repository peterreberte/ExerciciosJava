public class Ex008CachorroLatindo {

    public static void main(String[] args) {

        deveLevantar(true, 2);
    }

    public static void deveLevantar(boolean cachorroLatindo, int horaDaNoite) {

        if (horaDaNoite < 0) {
            System.out.println("Hora inválida");
        } else if (horaDaNoite > 23) {
            System.out.println("Hora inválida");
        }

        if (horaDaNoite < 8 && cachorroLatindo) {
            System.out.println("Levante, o cachorro está latindo.");
        } else if (horaDaNoite > 22 && cachorroLatindo) {
            System.out.println("Levante, o cachorro está latindo");
        } else if (horaDaNoite < 8 || horaDaNoite > 22) {
            System.out.println("O cachorro não está latindo");
        }

    }
}

/* Enunciado:

Nós temos um cachorro que gosta de latir. Precisamos acordar se o cachorro estiver latindo durante a noite!

Escreva um método chamado shouldWakeUp que tenha 2 parâmetros.

O 1º parâmetro deve ser do tipo boolean e se chamar barking, representando se o nosso cachorro está latindo no momento.
O 2º parâmetro representa a hora do dia, deve ser do tipo int, com o nome hourOfDay, e possui um intervalo válido de 0 a 23.

Devemos acordar se o cachorro estiver latindo antes das 8 ou depois das 22 horas, então nesse caso retorne true.

Em todos os outros casos, retorne false.

Se o parâmetro hourOfDay for menor que 0 ou maior que 23, retorne false.

Exemplos de entrada/saída:

shouldWakeUp(true, 1); → deve retornar true

shouldWakeUp(false, 2); → deve retornar false, pois o cachorro não está latindo.

shouldWakeUp(true, 8); → deve retornar false, pois não é antes das 8.

shouldWakeUp(true, -1); → deve retornar false, pois o parâmetro hourOfDay precisa estar no intervalo 0-23.

DICA: Use a estrutura if else com múltiplas condições.

Objetivo de aprendizagem: Explorar expressões booleanas e verificações condicionais decidindo quando acordar com base no comportamento do cachorro e na hora do dia. */
