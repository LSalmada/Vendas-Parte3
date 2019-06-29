package vendas.parte.pkg03;

public class Fornecedor {
    
    //Atributos do Fornecedor - Referente ao item 4 do Vendas.pdf
     private String nome = new String();
     private String cargo = new String();
     private String email = new String();
     private String descricaoEmpresa = new String();
     private String codigoFornecedor = new String();
    
     //Método construtor - Referente ao item 5 do Vendas.pdf
    public Fornecedor(String nome, String cargo, String email, String descricaoEmpresa, String codigoFornecedor) {
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.descricaoEmpresa = descricaoEmpresa;
        this.codigoFornecedor = codigoFornecedor;  //Referente ao item 10 do Vendas.pdf   
    }
    
    //Referente ao item 6 do Vendas.pdf
    @Override
    public String toString() {
        return "Nome fornecedor: " + this.getNome() + "\n" + 
               "Cargo: " + this.getCargo() + "\n" + 
               "Email: " + this.getEmail() + "\n" + 
               "Descrição da Empresa: " + this.getDescricaoEmpresa() + "\n" +
               "Código do fornecedor: " + this.getCodigoFornecedor() + "\n"; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescricaoEmpresa() {
        return descricaoEmpresa;
    }

    public void setDescricaoEmpresa(String descricaoEmpresa) {
        this.descricaoEmpresa = descricaoEmpresa;
    }

    public String getCodigoFornecedor() {
        return codigoFornecedor;
    }

    public void setCodigoFornecedor(String codigoFornecedor) {
        this.codigoFornecedor = codigoFornecedor;
    }
}
