import br.com.contas.Contas;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        Contas contas=new Contas();

       var enquanto=0;
        System.out.println("\nola bem vindo ao calculo de dividendos\n ");
        while (enquanto!=1){
            System.out.println("\n          deseja sair?\n aperte 1 se deseja continuar aperte 0\n");
            enquanto=leitura.nextInt();
            System.out.println("quantas acoes?");
             contas.setAcao(leitura.nextInt()) ;
            System.out.println("quanto de dividendos?");

             contas.setNumeroDeAcao(leitura.nextDouble());
            contas.setTudo(contas.getNumeroDeAcao()*contas.getAcao());

            System.out.println("ao todo com "+contas.getAcao()+" acoes" +" e com "+contas.getNumeroDeAcao()+" de dividendos ao mes" +" \nao todo deu " +contas.getTudo()+" reais por mes");

        }

    }
}