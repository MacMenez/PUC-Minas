import java.util.Scanner;

public class ATVD_Aula_13_02_23 {
    public static void main(String[] args) {
        /*
            Faça um programa em JAVA que receba como etrada o período de tempo, em dias, de um
            investidor financeiro sujeito a tributação. O programa deverá informar a alíquota de
            imposto de renda a ser paga, com base na tabela apresentada:
            TEMPO | ALÍQUOTA
            ----------------
            0 a 180 dias
        */

        MyIO.println("DECLARAÇÃO DO IMPOSTO DE RENDA");
        MyIO.println("Cálculo de Alíquota");
        MyIO.print("Informe o valor de dias: ");
        int dias = MyIO.readInt();

        String aliq;

        if (dias < 180) {
            aliq = "22,5%";    
        }
        else if (dias > 180 && dias < 361) {
            aliq = "20%";
        } 
        else if (dias > 360 && dias < 721){
            aliq = "17,5%";
        }
        else {
            aliq = "15%";
        }

        System.out.println("Cálculo da Alíquota: " + aliq);

        double aliquota = calculoAliquota(dias);
        System.out.println("Cálculo da Alíquota: " + aliquota*100);
    }

    private static double calculoAliquota(int dias) {
        if (dias < 180) {
            return 0.225;    
        }
        else if (dias > 180 && dias < 361) {
            return 0.20;
        } 
        else if (dias > 360 && dias < 721){
            return 0.175;
        }
        else {
            return 0.15;
        }
    }
}
