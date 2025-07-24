import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Exercícios\n1- Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: \"Olá 'Fulano' você tem 'X' anos\";\n2- Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela;\n3- Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela;\n4- Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas\n");
        System.out.println("Digite o número do exercício que deseja executar:");
        var execicio = scanner.nextLine();

        switch (execicio) {
            case "1":
                var baseYear = LocalDate.now().getYear();
                System.out.println("Informe o seu nome:");
                var name = scanner.nextLine();
                System.out.println("Informe o seu ano de nascimento:");
                var year = scanner.nextInt();
                var age = baseYear - year;
                System.out.printf("Olá %s, você tem %s anos.\n", name, age);
                break;
            case "2":
                System.out.println("Informe o tamanho do lado do quadrado:");
                var side = scanner.nextInt();
                var area = side * side;
                System.out.printf("A área do quadrado é %s.\n", area);
                break;
            case "3":
                System.out.println("Informe a base do retângulo:");
                var base = scanner.nextInt();
                System.out.println("Informe a altura do retângulo:");
                var height = scanner.nextInt();
                var areaRetangulo = base * height;
                System.out.printf("A área do retângulo é %s.\n", areaRetangulo);
                break;
            case "4":
                System.out.println("Informe o nome da primeira pessoa:");
                var name1 = scanner.nextLine();
                System.out.println("Informe a idade da primeira pessoa:");
                var age1 = scanner.nextInt();
                System.out.println("Informe o nome da segunda pessoa:");
                var name2 = scanner.nextLine();
                System.out.println("Informe a idade da segunda pessoa:");
                var age2 = scanner.nextInt();
                var diffAges = age1 - age2;
                System.out.printf("A diferença de idade entre %s e %s é %s.\n", name1, name2, diffAges);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
        scanner.close();
    }
}
