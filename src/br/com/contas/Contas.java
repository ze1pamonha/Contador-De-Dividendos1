package br.com.contas;

public class Contas {
    private double PrecoDoImobiliario;

    private double Dividendos;
   private double NumeroDeAcao;
   private double Tudo;
   private double fundo;
private  double valor;

    public double getFundo() {
        return fundo;
    }

    public void setFundo(double fundo) {
        this.fundo = fundo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public double getPrecoDoImobiliario() {
        return PrecoDoImobiliario*NumeroDeAcao;
    }

    public void setPrecoDoImobiliario(double precoDoImobiliario) {
        PrecoDoImobiliario = precoDoImobiliario;
    }




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
