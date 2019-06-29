package vendas.parte.pkg03;

import java.util.ArrayList;

public class Historico {

    private ArrayList<Venda> listaVenda = new ArrayList<Venda>();

    public void AdicionaHistorico(Venda venda) {
        getListaVenda().add(venda);
        System.out.println("Venda adicionada");

    }

    public void InfoVendas() {
        System.out.println("====================Informações Venda=======================================");
        for (Venda venda : getListaVenda()) {

            System.out.println(venda.toString());

        }
        System.out.println("============================================================================");
    }

    public void DeletaVenda(Venda venda) {
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        getListaVenda().remove(venda);
        System.out.println("Venda excluída");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
    
    public void ConsultaVenda(Venda venda) {
        
        if(getListaVenda().contains(venda)) {
            System.out.println("O venda existe");
        }else  {
            System.out.println("A venda não existe");
        }
    }
    
    public String CalculaLucro() {
        float lucroTotal=0;
        for (Venda venda : getListaVenda()) {
            lucroTotal += venda.getValorVenda();
        }
        return "Valor do lucro: " + lucroTotal; 
    }
    public ArrayList<Venda> getListaVenda() {
        return listaVenda;
    }

    public void setListaVenda(ArrayList<Venda> listaVenda) {
        this.listaVenda = listaVenda;
    }
}
