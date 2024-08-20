import java.util.Scanner;
public class Quest4 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome = s.nextLine();

        System.out.println("Digite o número de vezes que vai repetir:");
        int n = s.nextInt();


        for(int i = 1; i<=n; i++){
            System.out.println(nome);
        }
    }
}

