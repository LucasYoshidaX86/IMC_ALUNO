package imc_alunos;

public class Main {

	public static void main(String[] args) {

//Criando alunos para verificar se o sistema está calculando e recebendo todas informações.
		
		Funcoes_Uteis p1 = new Funcoes_Uteis("Lucas Yoshida", "52998224725", 70, 1.75, 8.5, 80);
		System.out.println(p1.exibicao());
		
//Criando aluno com dados de cpf inválido e situação irregular. 
		Funcoes_Uteis p2 = new Funcoes_Uteis("Irineu da Silva", "111100009999", 80, 2.00, 4, 23);
		System.out.println(p2.exibicao());
		
        
    }

	

}
