package Test_pkg;

import vendas.parte.pkg03.Historico;
import vendas.parte.pkg03.Venda;

public class TesteHistorico {

    public static void main(String[] args) {
        Venda venda1 = new Venda(9, 3, 2017, 200, "Lucas", "fone de ouvido", "Loja de informática");
        Venda venda2 = new Venda(9, 3, 2017, 200, "Luane", "fone de ouvido", "Loja de informática");
       

        Historico h1 = new Historico();
        h1.AdicionaHistorico(venda1);
        h1.AdicionaHistorico(venda2);

        h1.InfoVendas();
        h1.DeletaVenda(venda2);

        h1.InfoVendas();

        h1.ConsultaVenda(venda1);
        h1.ConsultaVenda(venda2);

        System.out.println(h1.CalculaLucro());
    }

}
