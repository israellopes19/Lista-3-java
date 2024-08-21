import java.util.Scanner;
public class Quest7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double soma =0;
        double media = 0;


        for(int i = 1; i <=20; i++){
            System.out.println("Digite a sua idade "+ i + ":");
            int idade = s.nextInt();
            soma +=idade;

            media = soma / 20;
        }
        System.out.printf("%n A média é: %.2f", media);
    }
}