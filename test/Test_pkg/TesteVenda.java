package Test_pkg;

import java.util.Calendar;
import vendas.parte.pkg03.Cliente;
import vendas.parte.pkg03.Fornecedor;
import vendas.parte.pkg03.Produto;
import vendas.parte.pkg03.Venda;

public class TesteVenda {

    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor("Kabum", "Representante", "fornecedor@email.com", "Vende Produtos Eletronicos","F1");
        Produto produto1 = new Produto("Fone de Ouvido", 30, 100, 500, 100, fornecedor1.getNome(), "P2");
        Cliente cliente1 = new Cliente("Lucas Almada", "lucas.almada96@hotmail.com", "Masculino", "C1");

        Venda venda1 = new Venda(9, 3, 2017, 200, "Lucas", "fone de ouvido", "Loja de informática");
        System.out.println(venda1.toString());

        Venda venda2 = new Venda(9, 3, 2017, 200, "Luane", "Celular", "Loja de informática");
        System.out.println(venda2.toString());

        Venda venda3 = new Venda(9, 3, 2017, 200, "Lidyane", "Caixa de Som", "Loja de informática");
        System.out.println(venda3.toString());

        Venda venda4 = new Venda(9, 3, 2018, 200, "Lidyane", "Caixa de Som", "Loja de informática");
        System.out.println(venda4.toString());

        Venda venda5 = new Venda(9, 3, 2018, 200, "Lidyane", "Caixa de Som", "Loja de informática");
        System.out.println(venda5.toString());

        Venda venda6 = new Venda(9, 3, 2018, 200, "Lidyane", "Caixa de Som", "Loja de informática");
        System.out.println(venda6.toString());
        
        Venda venda7 = new Venda(9, 3, 2019, 200, "Lidyane", "Caixa de Som", "Loja de informática");
        System.out.println(venda7.toString());
        
        Venda venda8 = new Venda(9, 3, 2019, 200, "Lidyane", "Caixa de Som", "Loja de informática");
        System.out.println(venda8.toString());
        
        Venda venda9 = new Venda(9, 3, 2016, 200, "Lidyane", "Caixa de Som", "Loja de informática");
        System.out.println(venda9.toString());

        Calendar c = Calendar.getInstance();
        c.set(2019, 02 - 1, 31);

    }
}
