public class App {
    public static void main(String[] args) throws Exception {
        int a = 0, n = 8;
        for(int i=n+1; i>0; i/=2){
            //código a ser executado
        }
        for (int i = n + 1; i > 0; i /= 2){
            System.out.println(i);
            a *= 2;
            System.out.println(n);
            System.out.println("---------------");
            System.out.println(i);
        }
        System.out.println("---------------");
        System.out.println("---------------");
        System.out.println(n);
        System.out.println(a);
        
    }
}
