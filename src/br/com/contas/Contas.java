package br.com.contas;

public class Contas {
 private int Acao;
   private double NumeroDeAcao=0.0;
   private double tudo;

    public int getAcao() {
        return Acao;
    }

    public void setAcao(int acao) {
        Acao = acao;
    }

    public double getNumeroDeAcao() {
        return NumeroDeAcao;
    }

    public void setNumeroDeAcao(double numeroDeAcao) {
        NumeroDeAcao = numeroDeAcao;
    }

    public double getTudo() {
        return tudo;
    }

    public void setTudo(double tudo) {
        this.tudo = tudo;
    }
}
