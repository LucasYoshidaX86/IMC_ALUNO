package imc_alunos;


//Subclasse criada herdando atributos, e criando novos. 
public class Funcoes_Uteis extends ALUNOS {
	private String verificacaoCpf;
    private String calculoIMC;
    private String avaliacaoAluno;

//Constructor para inicialização dos atributos criados.
    public Funcoes_Uteis(String nome, String cpf, double peso, double altura, double nota, double presenca) {
        super(nome, cpf, peso, altura, nota, presenca);
        verificarCpf(cpf); // Verifica CPF na inicialização
        calcularIMC(peso, altura); // Calcula IMC na inicialização
        avaliarAluno(nota, presenca); // Avalia aluno na inicialização
    }

// Método para verificar se o CPF é válido, utilizando "if e else" para validar os cálculos dos dígitos. Levando em consideração o CPF já digitado sem (. e -).
    public void verificarCpf(String cpf) {
    	
// Verifica se o CPF tem exatamente 11 dígitos
        if (cpf.length() != 11) {
            verificacaoCpf = "CPF inválido. Deve ter 11 dígitos.";
            return;
        }

// Calcular o primeiro dígito 
        int soma1 = 0;
        for (int i = 0; i < 9; i++) {
            soma1 += (cpf.charAt(i) - '0') * (10 - i);
        }
        int digito1 = (soma1 * 10) % 11;
        if (digito1 == 10) digito1 = 0;

// Calcular o segundo dígito 
        int soma2 = 0;
        for (int i = 0; i < 10; i++) {
            soma2 += (cpf.charAt(i) - '0') * (11 - i);
        }
        int digito2 = (soma2 * 10) % 11;
        if (digito2 == 10) digito2 = 0;

// Verificar se os dígitos verificadores calculados são iguais aos do números do CPF
        if (digito1 == (cpf.charAt(9) - '0') && digito2 == (cpf.charAt(10) - '0')) {
            verificacaoCpf = "CPF válido.";
        } else {
            verificacaoCpf = "CPF inválido.";
        }
    }

// Método para calcular o IMC utilizando "if e else" para verificar parâmetros adicionados. 
    public void calcularIMC(double peso, double altura) {
        if (altura > 0) {
            double imc = peso / (altura * altura);
            calculoIMC = "IMC calculado: " + imc;
        } else {
            calculoIMC = "Altura inválida.";
        }
    }

// Método para avaliar o aluno (nota >= 5 e presença >= 75% = Aprovado), utilizando "if e else" para verificar se a nota e a presença corresponde aos requisitos.
    public void avaliarAluno(double nota, double presenca) {
        if (nota >= 5 && presenca >= 75) {
            avaliacaoAluno = "Aluno aprovado.";
        } else {
            avaliacaoAluno = "Aluno reprovado.";
        }
    }

//Método utilizado para formatação de informações quando puxadas ao main.
    public String exibicao() {
        return super.exibicao() +
               "Verificador de CPF: " + this.verificacaoCpf + "\n" +
               "Cálculo IMC: " + this.calculoIMC + "\n" +
               "Situação do Aluno: " + this.avaliacaoAluno + "\n";
    }
}
