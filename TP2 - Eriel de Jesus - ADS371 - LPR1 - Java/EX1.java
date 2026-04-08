import java.util.Scanner;


public class EX1 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            double primeiro, segundo;

                System.out.print("Informe qual é o primeiro valor:");
                while (!scanner.hasNextDouble()){
                      System.out.print("Tá errado isso aí. Digite um número: ");
                      scanner.next();
                }
                primeiro = scanner.nextDouble();

                System.out.print("Agora diga qual é o segundo valor (ele deve ser maior que o primeiro): ");
                while(!scanner.hasNextDouble()){
                    System.out.print("É sério isso? Digite um número válido, por favor: ");
                    scanner.next();
                }
                segundo = scanner.nextDouble();

                while (segundo <= primeiro){
                    System.out.print("O segundo valor é menor ou igual ao primeiro. Digite novamente: ");
                    while(!scanner.hasNextDouble()){
                        System.out.print("Digite um número válido, por favor: ");
                        scanner.next();
                    }
                    segundo = scanner.nextDouble();
                }
                System.out.println("Os valores inseridos foram: " + primeiro + " como o primeiro valor e " + segundo + " como o segundo valor.");
                scanner.close();
    }
}