import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);

       var enquanto=0;
        System.out.println("\nola bem vindo ao calculo de dividendos\n ");
        while (enquanto!=1){
            System.out.println("\n          deseja sair?\n aperte 1 se deseja continuar aperte 0\n");
            enquanto=leitura.nextInt();
            System.out.println("quantas açoes?");
            int Acao= leitura.nextInt();
            System.out.println("quanto de dividendos?");

            double NumeroDeAcao= leitura.nextDouble();
            double tudo=Acao*NumeroDeAcao;

            System.out.println("ao todo com "+Acao+" açoes" +" e com "+NumeroDeAcao+" de dividendos" +" ao todo deu " +tudo+" reais por mes");

        }

    }
}