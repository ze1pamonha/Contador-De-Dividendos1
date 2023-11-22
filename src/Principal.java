import br.com.contas.Contas;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner leitura=new Scanner(System.in);
        Contas contas=new Contas();

        int enquanto=0;
        int opcao=12;

        System.out.println("se deseja continuar aperte 1 se deseja parar aperte qual quer numero ou didite 4 nao faz diferença");
            opcao= leitura.nextInt();


            //completado essa area
            if (opcao==1){

                while (enquanto>=0){



                    System.out.println("""
                    
                    bem vindo a calculadora de investimentos voltada a dividendos
                    
                    opcoes:
                    1-retorno de dividendos podera dar e a quantida de dinheiro necessaria
                    2-quanto daria se fosse tivesse um tanto de dinheiro e quisse comprar tudo em uma certo fundo
                    3-quanto e preciso para alcançar um certo valor de dividendos
                    """);
                   opcao=leitura.nextInt();
                    if (opcao==1){
                        //explemplo: se uma açao custa 8,00 e ela retorna 0,06 centavos com 900 açoes ela daria 	54,00 rais por mes
                        //entao vai calcular o preço da açao e o retorno vai pegar um tanto de açao 900 voltaria um tanto
                        System.out.println("qual o preço do fundo imobiliario?");
                        contas.setPrecoDoImobiliario(leitura.nextDouble());

                        System.out.println("quantas fundos imobiliarios?");
                        contas.setNumeroDeAcao(leitura.nextInt());
                        ;
                        System.out.println("quanto de dividendos?");
                        contas.setDividendos(leitura.nextDouble());


                        System.out.println("ao todo com "+contas.getDividendos()+" de dividendos" +" e com "+contas.getNumeroDeAcao()+" de dividendos ao mes" +" \nao todo deu " +contas.getTudo()+" reais por mes");
                        System.out.println("voce iria precisar de "+new DecimalFormat(".0").format(contas.getPrecoDoImobiliario()));


                    }else if (opcao==2) {

//completado essa area
                        //suponhamos que voce teria uma certa quantia e queira comprar tudo e uma so açao isso mostraria quantas açao teria com esse valor
                        System.out.println("qual o valor do fundo");
                        contas.setValor(leitura.nextDouble());


                        System.out.println("quanto voce teria?");
                        contas.setFundo(leitura.nextDouble());
                        int soma= (int) (contas.getFundo()/contas.getValor());
                        System.out.println( "\n" +
                                "Se você tem "+contas.getValor()+" e deseja comprar ações que custam "+contas.getFundo()+" cada ");

                        System.out.println(" voce teria comprado "+Math.floor(soma)+" de fundos imobiliarios");
                        return;


                    } else if (opcao==3) {
                        //suponhamos que voce queira ter mil reais de dividendos isso calcularia quantas ação seria preciso para ter esse valor
                        System.out.println("qual e o valor desejado dos dividendos alcançara?");
                        contas.setValor(leitura.nextDouble());

                        System.out.println("qunato que o fundo da de retorno?");
                        contas.setDividendos(leitura.nextDouble());


                        double soma= contas.getValor()/ contas.getDividendos();

                        System.out.println(" voce precisaria no total de "+Math.floor(soma)+" fundos para ter o valor de dividendos por mes de "+Math.floor(contas.getValor()));

                    } else if (opcao==4) {
break;
                    }

                }
            }
        }






    }
