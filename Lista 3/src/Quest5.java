import java.util.Scanner;
public class Quest5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int soma =0;


        for(int i = 1; i <10; i++){
            System.out.println("Digite o número "+ i + ":");
            int n1 = s.nextInt();
            soma = soma + n1;
        }
        System.out.println("Soma é: "+ soma);
    }
}
