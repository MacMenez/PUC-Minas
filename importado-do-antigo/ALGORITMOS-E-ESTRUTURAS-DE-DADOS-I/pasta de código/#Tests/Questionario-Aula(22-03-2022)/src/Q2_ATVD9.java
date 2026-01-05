
public class Q2_ATVD9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1, num = 1, nTotal = 0;
		
		while(num <= 48) {
			System.out.printf("%d + ", num);
			num = num + 2;
			
			nTotal = nTotal + num;
			
			i = i + 1;
		}
		
		nTotal = nTotal + 49;
		System.out.printf("49 \n");
		System.out.printf("A soma de todos os números equivale a: %d", nTotal);
	}

}
