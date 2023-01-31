import java.io;
import java.util.*;

class Janela{
    public static void main(String[] args) {
        Retangulo r;
        r = new Retangulo();

        float altura, largura, area, perimetro;
        
        Scanner entrada;
        entrada = new Scanner(System.in);
            System.out.print("Digite o valor da altura do retângulo: ");
            r.setAltura(entrada.nextFloat());

            System.out.print("Digite o valor da largura do retâgulo: ");
            r.setLargura(entrada.nextFloat());

            mostraMensagem("O valor da área é: ", r.calculaArea());
            mostraMensagem("O valor do perímetro é ", r.calculaPerimetro());

        entrada.close();
    }

    public static void mostraMensagem(String msg, float vlr){
        System.out.println(msg + vlr);
    }
}