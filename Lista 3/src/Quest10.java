import java.util.Scanner;
public class Quest10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o número:");
        int num = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(num + "x" + i + "=" + num * i);
        }
    }
}