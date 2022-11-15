import java.util.Scanner;

public class SomaInfinitamente {
    public static void main(String[] args) {
        int num = 0;
        int soma = 0;

        Scanner ler = new Scanner(System.in);

        do {
            soma += num;
            System.out.println("Digite um numero positivo para ser somado ou negativo para sair: \n");
            num = ler.nextInt();
        } while (num > 0);
        ler.close();

        System.out.println("A soma é: " + soma);
    }
}
