package imc_alunos;

//Superclasse criada contendo todos atributos requisitados na classe.
public class PESSOAS {
	private String nome;
    private String cpf;
    private double peso;
    private double altura;

//Constructor para inicialização de todos atributos criados.
    public PESSOAS(String nome, String cpf, double peso, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.peso = peso;
        this.altura = altura;
    }

//Métodos getters e setters para acessar e alterar atributos privados.
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
//Método utilizado para formatação de informações quando puxadas ao main.
    public String exibicao() {
    	return
    			"Nome: " + this.nome + "\n" + 
    			"Cpf sem dígitos: " + this.cpf + "\n" + 
    			"Peso: " + this.peso + "\n" + 
    			"Altura: " + this.altura + "\n";
    }
}
