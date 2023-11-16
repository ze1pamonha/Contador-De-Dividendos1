package br.com.contas;

public class Contas {
    private double PrecoDoImobiliario;

    public double getPrecoDoImobiliario() {
        return PrecoDoImobiliario*NumeroDeAcao;
    }

    public void setPrecoDoImobiliario(double precoDoImobiliario) {
        PrecoDoImobiliario = precoDoImobiliario;
    }

    private double Dividendos;
   private double NumeroDeAcao=0.0;
   private double Tudo;






    public void setPrecoTotal(double precoTotal) {
    }

    public double getDividendos() {
        return Dividendos;
    }

    public void setDividendos(double dividendos) {
        Dividendos = dividendos;
    }

    public double getNumeroDeAcao() {
        return NumeroDeAcao;
    }

    public void setNumeroDeAcao(double numeroDeAcao) {
        NumeroDeAcao = numeroDeAcao;
    }

    public double getTudo() {
        return Dividendos *NumeroDeAcao;
    }

    public void setTudo(double tudo) {
        this.Tudo = tudo;
    }
}
