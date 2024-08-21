import java.util.Scanner;
public class Quest9 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String nomeNovo = "";
        int idadeNova = Integer.MAX_VALUE;



        for(int i = 1; i <=10; i++){
            System.out.print("Digite a sua idade "+ i + ":");
            String nome = s.nextLine();
            System.out.print("Qual éa idade:");
            int idade = s.nextInt();

            if(idade < idadeNova) {
                idadeNova = idade;
                nomeNovo = nome;



            }

        }
        System.out.println("Foram registradas " + nomeNovo);

    }
}