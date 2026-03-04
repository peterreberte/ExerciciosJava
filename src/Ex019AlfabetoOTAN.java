public class Ex019AlfabetoOTAN {

    public static void main(String[] args) {

        char letra = 'k';

        switch (letra) {

            case 'A', 'a':
                System.out.println("Able");
                break;

            case 'B', 'b':
                System.out.println("Baker");
                break;

            case 'C', 'c':
                System.out.println("Charlie");
                break;

            case 'D', 'd':
                System.out.println("Dog");
                break;

            case 'E', 'e':
                System.out.println("Easy");
                break;

            default:
                System.out.println("Letra " + letra + " não encontrada");
                break;
        }

    }
}

/* Objetivo de aprendizagem: Introduzir à função switch tradicional (Java 8) */
