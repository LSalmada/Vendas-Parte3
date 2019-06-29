package vendas.parte.pkg03;

public class Cliente {

    //Atributos do Cliente - Referente ao item 2 do Vendas.pdf
    private String nome = new String();
    private String codigoCliente = new String(); //Atributo do item 9 do Vendas.pdf
    private String email = new String();
    private String sexo = new String();

    //Método construtor - Referente ao item 5 do Vendas.pdf
    public Cliente(String nome, String email, String sexo, String codigoCliente) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.codigoCliente = codigoCliente;
    }

    //Referente ao item 6 do Vendas.pdf
    @Override
    public String toString() {
        return "Nome do Cliente: " + this.getNome() + "\n"
                + "Email: " + this.getEmail() + "\n"
                + "Sexo: " + this.getSexo() + "\n"
                + "Código do Cliente: " + this.getCodigoCliente();
    }

    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

}
