import java.util.Scanner;

public class mediaDeVetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//		#	Exemplo 2	#
		/*
			Faça um programa para ler e armazenar em um vetor, uma série de 10 números.
			Após a leitura da série, mostre:
			- a média dos números que foram lidos;
			- todos os números abaixo da média e suas posições no vetor.
		*/
		// Vetor - Exemplo 2
		Scanner sc=new Scanner(System.in);
			double a[];
			a=new double[10];
			
			double soma=0, media;
			
			// Lendo os dados do Vetor
			int i=0;
			while (i<10){
				System.out.printf("Entre com o a[%d] = ",i);
				a[i]=sc.nextDouble();
				
				i=i+1;
			}
			
			// Calculando a média
			for (i=0;i<10;i++){ 
				soma=soma+a[i]; 
			}
			
			media=soma/10;
			
			System.out.printf("%n Media = %.2f",media);
			
			// Procura no vetor e mostra os números abaixo da média e suas posições no vetor
			for (i=0;i<10;i++){
				if (a[i]<media)
				System.out.printf("%n Numero abaixo da média = %.2f Posiçao no Vetor a[%d]",a[i],i);
			}
		sc.close();
	}

}
