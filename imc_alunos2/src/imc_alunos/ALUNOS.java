package imc_alunos;

//Subclasse criada para herdar atributos principais e adicionar atributos específicos de alunos.
public class ALUNOS extends PESSOAS {
    private double nota;
    private double presenca;

//Constructor para inicialização de atributos criados.
    public ALUNOS(String nome, String cpf, double peso, double altura, double nota, double presenca) {
        super(nome, cpf, peso, altura);
        this.nota = nota;
        this.presenca = presenca;
    }

//Métodos getters e setters para acessar e alterar atributos privados.
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPercentualDePresenca() {
        return presenca;
    }

    public void setPercentualDePresenca(double presenca) {
        this.presenca = presenca;
    }
    
  //Método utilizado para formatação de informações quando puxadas ao main. 
    public String exibicao() {
    	return
    			super.exibicao() + 
    			"Nota: " + this.nota + "\n" +
    			"Presença: " + this.presenca + "\n";
    			
    }
}

