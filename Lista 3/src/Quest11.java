import java.util.Scanner;
public class Quest11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int maior = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o número" + i + ":");
            int num = s.nextInt();

            if (num > 8){
                maior++;
            }
        }
        System.out.print("maior que:" +maior);
    }
}
