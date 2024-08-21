import java.util.Scanner;
public class Quest6 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int soma =0;


        for(int i = 1; i <=20; i++){
            System.out.println("Digite a sua idade"+ i + ":");
            int n1 = s.nextInt();
            soma = soma + n1;
        }
        System.out.println("Soma é: "+ soma);
    }
}