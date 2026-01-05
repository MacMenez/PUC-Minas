
public class fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5; //Para computar o fatorial de N
        int fatorial = 1; //Inicia o produto com 1

        int i = 1;
        while (i <= n) {
            fatorial = fatorial * i;
            i++;
        }
        System.out.printf("The Factorial of %d  is %d", n, fatorial);
	}

}
