package EXERCICIO_MODULO_10;

public class ATIVIDADE_MODULO_10 {
	
	public static void main (String [] args) {
		
		int nota01 = 7;
		int nota02 = 6;
		int nota03 = 8;
		int nota04 = 10;
		
		int media = ((nota01 + nota02 + nota03 + nota04)/4);
				
				System.out.println("A média é " + media); 
				
		if (media >= 7) {
			System.out.println ("O aluno está aprovado.");}
			else if (5 <= media && media < 7) {
				System.out.println ("O aluno está de recuperação.");
			}
			else {
				System.out.println ("O aluno está reprovado");
			}
	}

}
