import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int maior = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero: ");
        numeros[0] = ler.nextInt();
        System.out.println("Entre com o segundo numero: ");
        numeros[1] = ler.nextInt();
        System.out.println("Entre com o terceiro numero: ");
        numeros[2] = ler.nextInt();
        System.out.println("Entre com o quarto numero: ");
        numeros[3] = ler.nextInt();
        System.out.println("Entre com o quinto numero: ");
        numeros[4] = ler.nextInt();
        ler.close();

        for (int i : numeros) {
            if (maior < i) {
                maior = i;
            }
        }
        System.out.println(maior);
    }
}
