
public class Q6_ATVD3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Tabela do Graus Celsius
			float C, F = 0;
			for(int i = 50; i <= 100; i = i + 5) {
				// System.out.println(i);
				
				F = i;
				C = 5 / (9 *(F - 32));
				System.out.printf("%.2f°F = %.3f°C \n", F, C);
			}
	}

}
/*

*/