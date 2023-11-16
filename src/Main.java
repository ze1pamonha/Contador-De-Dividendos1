import br.com.contas.Contas;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        Contas contas=new Contas();

       var enquanto=0;
        System.out.println("\n bem vindo ao calculo de dividendos\n ");
        while (enquanto!=1){
            System.out.println("\n          deseja sair?\n aperte 1 se deseja continuar aperte 0\n");
            enquanto=leitura.nextInt();
            System.out.println("qual o preço da açao/fundo imobiliario?");
            contas.setPrecoDoImobiliario(leitura.nextDouble());

            System.out.println("quantas acoes/fundo imobiliario?");
             contas.setNumeroDeAcao(leitura.nextInt()); ;
            System.out.println("quanto de dividendos?");

             contas.setDividendos(leitura.nextDouble());


            System.out.println("ao todo com "+contas.getDividendos()+" de deividendos" +" e com "+contas.getNumeroDeAcao()+" de dividendos ao mes" +" \nao todo deu " +contas.getTudo()+" reais por mes");
            System.out.println("voce iria precisar de "+new DecimalFormat(".0").format(contas.getPrecoDoImobiliario()));

        }

    }
}