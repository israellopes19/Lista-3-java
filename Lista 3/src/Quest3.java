import java.util.Scanner;
public class Quest3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome = s.nextLine();

        for(int i = 0; i<=10; i++){
            System.out.println(nome);
        }
    }
}
