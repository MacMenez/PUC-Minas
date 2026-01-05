import java.util.Scanner;

public class Q6_ATVD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
			float nota, nMaior = 0, tNota = 0, nMenor = 0, media;
					
			for (int i = 1; i <= 10; i++) {
				System.out.print("Digite a nota do aluno: ");
				nota = sc.nextFloat();
				
				//a maior e a menor nota verificada
				if (i==1 )
				{
					nMaior = nota;
					nMenor = nota;
				}
				
				tNota = tNota + nota;	
				
				if (nota > nMaior) {
					nMaior = nota;					
				}
				
				if(nota < nMenor){
					nMenor = nota;					
				}
				
			}
			//calcule e mostre a média da turma
			media = tNota / 10;
			
			System.out.printf("A média da turma foi de %.2f pontos.", media);
			System.out.printf("A menor nota foi %.2f e a maior nota foi %.2f", nMenor, nMaior);
			
		sc.close();
	}

}
