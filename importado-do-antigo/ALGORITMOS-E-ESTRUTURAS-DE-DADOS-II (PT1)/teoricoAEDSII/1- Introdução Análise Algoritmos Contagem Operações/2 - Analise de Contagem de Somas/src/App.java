public class App {
    public static void main(String[] args) throws Exception {
        int a = 0, b = 0, c = 0, d = 0, i = 0, j = 0;
        /*  #   Número de Adições do Código  #*/
        // Melhor caso (3 ações)
        if (a + 5 < b + 3){// 2
            i++;
            ++b;
            a += 3;
        } else {
            j++; // 1
        }
            
        // Pior caso (5 ações)
        if (a + 5 < b + 3){// 2
            // 3
            i++;
            ++b;
            a += 3;
        } else {
            j++;
        }
            
            
        if (a + 5 < b + 3 || c + 1 < d + 3){
            i++;
            ++b;
            a += 3;
        } else {
            j++;
        }
    }
}
