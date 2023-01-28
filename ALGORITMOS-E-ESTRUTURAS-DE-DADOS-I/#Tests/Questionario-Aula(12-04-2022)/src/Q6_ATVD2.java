
public class Q6_ATVD2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1, y = 0;
		
		for (int i = 0; i <= 99 && i <= 50; i++) {
			
			//soma = (1/1 + 3/2 + 5/3 + 7/4 + ... + 99/50)
			if (x == 1 && y == 0) {
				y = 1;
				System.out.printf("%d/%d + ", x, y);
			}
			
			if (x < 97 && y < 49) {
				x = x + 2;
				y = y +1;
				System.out.printf("%d/%d + ", x, y);
			}
			
			if (x == 97 && y == 49) {
				x = x + 2;
				y = y +1;
				System.out.printf("%d/%d", x, y);
			}
		}
	}

}
