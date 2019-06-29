package Test_pkg;

import vendas.parte.pkg03.Fornecedor;

//Classe de teste Fornecedor 
public class TesteFornecedor {
    public static void main(String[] args) {
         Fornecedor fornecedor1 = new Fornecedor("Kabum", "Representante","fornecedor@email.com","Vende Produtos Eletronicos","F1");
         System.out.println(fornecedor1.toString());
    }
    
   
        
}
