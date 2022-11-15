import java.util.Scanner;

public class FazConta {
    public static void main(String[] args) {
        String operador;
        int num1;
        int num2;
        int result;

        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com a operação a ser realizada (+, - ou *):\n");
        operador = ler.next();
        System.out.println("Entre com o primeiro número:\n");
        num1 = ler.nextInt();
        System.out.println("Entre com o segundo número:\n");
        num2 = ler.nextInt();
        ler.close();

        switch (operador) {
            case "+":
                result = num1 + num2;
                System.out.println("O resultado da operação é: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("O resultado da operação é: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("O resultado da operação é: " + result);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }
}
