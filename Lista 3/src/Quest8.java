import java.util.Scanner;
public class Quest8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int deMaior = 0;



        for(int i = 1; i <=20; i++){
            System.out.println("Digite a sua idade "+ (i+1) + ":");
            int idade = s.nextInt();

            if(idade >= 18) {
                deMaior++;


            }

        }
        System.out.println("Foram registradas " + deMaior);

    }
}