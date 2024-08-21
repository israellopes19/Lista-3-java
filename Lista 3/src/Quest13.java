import java.util.Scanner;
public class Quest13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int contador = 0;
        int num;

        for(int i = 1; i<= 20; i++){
            System.out.print("Digite o número" + i + ":");
             num = s.nextInt();

            if(num >= 0 && num <= 100){
              contador++;
            }
        }
        System.out.println("Quantos números entre 0 e 100 : " + contador);
    }
}
