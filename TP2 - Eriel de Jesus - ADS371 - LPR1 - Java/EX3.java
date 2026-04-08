import java.util.Scanner;

public class EX3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double valor[] = new Double[6];
        Double maiorvalor, menorvalor, media;
        Double porcentneg = 0.0;
        Double porcentpos = 0.0;
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
        menorvalor = valor[0];
        for (int i = 0; i < valor.length; i++) {
            if (valor[i] > maiorvalor){
                maiorvalor = valor[i];
            }
            else if (valor[i] < menorvalor){
                menorvalor = valor[i];
            }
            if (valor[i] < 0){
                porcentneg++;
            }
            else {
                porcentpos++;
            }
            soma += valor[i];
        }
        media = soma / valor.length;

        System.out.println("O maior valor é: " + maiorvalor);
        System.out.println("O menor valor é: " + menorvalor);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A média dos valores é: " + media);
        System.out.println("A porcentagem de valores negativos é: " + (porcentneg / valor.length * 100) + "%");
        System.out.println("A porcentagem de valores positivos é: " + (porcentpos / valor.length * 100) + "%");

        scanner.close();
    }
}