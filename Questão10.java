import java.util.Scanner;

public class Questao10{

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        double investimento, juro, Valor_total = 0;
        String resposta;

        System.out.printf("Valor do investimento: ");
        investimento = leitor.nextDouble();
        System.out.printf("Valor do juros: ");
        juro = leitor.nextDouble();

        do{
            for(int i = 1; i <= 12; i++){

                investimento = investimento+(investimento*juro)/100;
                Valor_total = Valor_total + investimento;

            }
            System.out.printf("\nValor depois de um ano: %f", Valor_total);
            leitor.nextLine();
            System.out.printf("\n\nDeseja processar mais um ano (s= sim, n = não)? ");
            resposta = leitor.nextLine();
            investimento = Valor_total;

        }while("s".equals(resposta) || "S".equals(resposta));

    }

}