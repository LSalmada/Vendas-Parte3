package Test_pkg;

import vendas.parte.pkg03.Fornecedor;
import vendas.parte.pkg03.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("Kabum", "Representante","fornecedor@email.com","Vende Produtos Eletronicos","F1");
        Produto produto1 = new Produto("Headset", 30, 100, 500, 100, fornecedor1.getNome(),"P1");
        System.out.println(produto1.toString());
        System.out.println(produto1.CalculaPrecoVenda());
    }
}
