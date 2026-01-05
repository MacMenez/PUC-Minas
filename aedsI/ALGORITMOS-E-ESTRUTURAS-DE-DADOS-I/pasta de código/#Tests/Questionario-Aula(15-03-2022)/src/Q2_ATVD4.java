import java.util.Scanner;

public class Q2_ATVD4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //4 - Faça um programa para ler 3 temperaturas medidas ao longo de um dia e após as leituras, mostre a média.
		  Scanner sc = new Scanner(System.in);
	      
		  float temp1, temp2, temp3, media;
	      
	      System.out.print("Informar apenas números!");
	      
	      System.out.print("Informe a 1° temperatura: ");
	      temp1 = sc.nextFloat();

	      System.out.print("Informe a 2° temperatura: ");
	      temp2 = sc.nextFloat();

	      System.out.print("Informe a 3° temperatura: ");
	      temp3 = sc.nextFloat();
	      
	      media = (temp1 + temp2 + temp3)/3;
	      
	      // Se a média for <= 10 graus, diga “Muito Frio!”;
	      if (media <= 10){
	        System.out.print("A temperatura está Muito Fria!");
	      }
	      
	      // Se a média estiver > 10 e <= 20, diga “Frio !”;
	      else if ((media > 10) && (media <= 20)) {
	        System.out.print("A temperatura está Fria!");
	      }
	      
	      // Se a média estiver > 20 e <= 30, diga “Quente!”;
	      else if ((media > 20) && (media <= 30)) {
	        System.out.print("A temperatura está Quente!");
	      }
	      
	      // Se a média estiver > 30, diga “Muito Quente!”;
	      else {
	        System.out.print("A temperatura está Muito Quente!");
	      }
	      
	      sc.close();
	}

}
