package vendas.parte.pkg03;

public class Produto {

    //Atributos da Classe
    private String nome = new String();
    private float percentualLucro;
    private float precoDeCusto;
    private int quantidadeEmEstoque;
    private int QuantidadeMinimaEmEstoque;
    private String fornecedorProduto = new String();
    private String codigoProduto = new String();

    //Método Construtor
    public Produto(String nome, float percentualLucro, float precoDeCusto, int quantidadeEmEstoque,
            int QuantidadeMinimaEmEstoque, String fornecedorProduto, String codigoProduto) {
        this.nome = nome;
        this.percentualLucro = percentualLucro;
        this.precoDeCusto = precoDeCusto;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.QuantidadeMinimaEmEstoque = QuantidadeMinimaEmEstoque;
        this.fornecedorProduto = fornecedorProduto;
        this.codigoProduto = codigoProduto;
    }
    
    //Método Referente ao item 6 do Vendas.pdf
    @Override
    public String toString() {
        return "Nome do produto: " + this.getNome() + "\n" + "Percentual Lucro: " + this.getPercentualLucro() + "%" + "\n"
                + "Preço de Custo: R$" + this.getPrecoDeCusto() + "\n" + "Quantidade em estoque: "
                + this.getQuantidadeEmEstoque() + " itens(s)" + "\n" + "Quantidade minima em estoque: "
                + this.getQuantidadeMinimaEmEstoque() + " itens(s)" + "\n" + "Fornecedor do Produto: " + this.getFornecedorProduto() + "\n" + "Código produto: " + this.getCodigoProduto();

    }
    
    //Método refente ao item 13
    public String CalculaPrecoVenda() {
        return "Preço de Venda: " + (this.getPrecoDeCusto() * (this.getPercentualLucro() / 100) + this.getPrecoDeCusto());
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPercentualLucro() {
        return percentualLucro;
    }

    public void setPercentualLucro(float percentualLucro) {
        this.percentualLucro = percentualLucro;
    }

    public float getPrecoDeCusto() {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(float precoDeCusto) {
        this.precoDeCusto = precoDeCusto;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getQuantidadeMinimaEmEstoque() {
        return QuantidadeMinimaEmEstoque;
    }

    public void setQuantidadeMinimaEmEstoque(int QuantidadeMinimaEmEstoque) {
        this.QuantidadeMinimaEmEstoque = QuantidadeMinimaEmEstoque;
    }

    public String getFornecedorProduto() {
        return fornecedorProduto;
    }

    public void setFornecedorProduto(String fornecedorProduto) {
        this.fornecedorProduto = fornecedorProduto;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }
}
