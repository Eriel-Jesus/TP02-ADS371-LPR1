import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double valor[] = new Double[10];
        Double maiorvalor, media;
        Double soma = 0.0;

        for (int i = 0; i < valor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Valor errado. Digite um número, por favor: ");
                scanner.next();
            }
            valor[i] = scanner.nextDouble();
        }
        maiorvalor = valor[0];
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > maiorvalor){
                maiorvalor = valor[i];
            }   
            soma += valor[i];   
        }
        media = soma / valor.length;

        System.out.println("O maior valor é: " + maiorvalor);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média dos valores é: " + media);

        scanner.close();
    }
}
