package Test_pkg;

import vendas.parte.pkg03.Cliente;

//Classe de teste Cliente
public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Lucas Almada", "lucas.almada96@hotmail.com", "Masculino", "C1");
         System.out.println(cliente1.toString());
    }
    
}
