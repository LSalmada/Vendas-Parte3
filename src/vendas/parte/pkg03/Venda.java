package vendas.parte.pkg03;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Venda {

    private int dia;
    private int mes;
    private int ano;
    private Date dataVenda;
    private DateFormat DF = DateFormat.getDateInstance();
    private double valorVenda;
    private String nomeCliente;
    private String descricaoProduto;
    private String nomeFornecedor;

    private static int numeroVendaPorAno = 1;
    private static int AnoAtual = 0;

    //Método construtor da venda.
    public Venda(int dia, int mes, int ano, double valorVenda, String nomeCliente, String descricaoProduto, String nomeFornecedor) {
        this.descricaoProduto = descricaoProduto;
        this.nomeFornecedor = nomeFornecedor;
        this.nomeCliente = nomeCliente;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.valorVenda = valorVenda;
        this.nomeCliente = nomeCliente;
        this.descricaoProduto = descricaoProduto;
        this.nomeFornecedor = nomeFornecedor;

        Calendar c = Calendar.getInstance();
        c.set(ano, mes - 1, dia);
        this.dataVenda = c.getTime();
    }

    @Override
    //Retorna um string informando os dados da venda.
    public String toString() {
        return "Venda do produto " + getDescricaoProduto() + " no valor de R$" + String.valueOf(this.getValorVenda())
                + " para " + getNomeCliente() + " em " + getDF().format(getDataVenda()) + "." + "\n" + GeraIdentificarVenda() + "\n";
    }

    public String GeraIdentificarVenda() {
        if (Venda.getAnoAtual() == this.getAno()) {
            Venda.setNumeroVendaPorAno(Venda.getNumeroVendaPorAno() + 1);
        } else {
            Venda.setNumeroVendaPorAno(1);
        }
        Venda.setAnoAtual(this.getAno());
        return this.getAno() + "-" + Venda.getNumeroVendaPorAno();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public DateFormat getDF() {
        return DF;
    }

    public void setDF(DateFormat DF) {
        this.DF = DF;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public static int getNumeroVendaPorAno() {
        return numeroVendaPorAno;
    }

    public static void setNumeroVendaPorAno(int aNumeroVendaPorAno) {
        numeroVendaPorAno = aNumeroVendaPorAno;
    }

    public static int getAnoAtual() {
        return AnoAtual;
    }

    public static void setAnoAtual(int aAnoAtual) {
        AnoAtual = aAnoAtual;
    }
}
