public class App {
    public static void main(String[] args) throws Exception {
        /*  #   Número de Subtrações do Código  #*/

        // Faremos as subtrações quando i vale
        for (int i = 0; i < 4; i++){
            a--;    // 0, 1, 2, 3
        }
        
        //Sua resposta deve ser em função de n
        for (int i = 0; i < n; i++){
            a--;
            b--;    // 2n subtrações
        }
        
            
        // Faremos subtrações quando o valor de i for igual a 0, 1 e 2
        int i = 0, b = 10;
        while (i < 3){
            i++;
            b--;
        }
            
        for (int i = 3; i < n; i++){
            a--;    // n - 3 subtrações
        }
            
        int i = 10;
        while (i >= 7){
            i--;    // 4 subtrações
        }
            
        for (int i = 5; i >= 2; i--){
            a--;    //8 subtrações
        }
            
        for (int i = 0; i < 5; i++){
            if (i % 2 == 0){
                a--;
                b--;
            } else {
                c--;    //8 subtrações
            }
        }
            
        //Solução fácil: 3x2x1 = 6 operações
        int a = 10;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++){
                a--;
            }
        }
            
        //n2 subtrações
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a--;
            }
        }
            
    }
}
