import java.util.Scanner;

public class ePar {
    public static void main(String[] args) {
        int num;
        boolean result;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o numero:");
        num = ler.nextInt();
        ler.close();

        if (num % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
    }
}
