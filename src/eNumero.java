import java.util.Scanner;

public class eNumero {
    public static void main(String[] args) {
        char caractere;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o caracter a ser verificado: ");
        caractere = ler.next().charAt(0);
        ler.close();

        System.out.println(Character.isDigit(caractere));
    }
}