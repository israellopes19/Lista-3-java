import java.util.Scanner;

public class Quest14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador = 0;
        int contador101 = 0;
        int contador200 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite um número " + i + ":");
            int num = s.nextInt();

            if (num >= 0 && num <= 100) {
                contador++;
            } else if (num >= 101 && num <= 200) {
                contador101++;
            } else if (num > 200) {
                contador200++;
            }
        }
        System.out.println("Quantos números de 0 a 100:" +contador);
        System.out.println("Quantos números de 101 a 200:" +contador);
        System.out.println("Quantos números de 200:" +contador);
    }
}