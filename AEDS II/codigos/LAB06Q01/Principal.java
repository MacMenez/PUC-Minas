/**
 * Classe Principal
 * @author Max do Val Machado
 * @version 3 08/2020
 */
class Principal {
	public static void main(String[] args) {

      //Delcaracao de variaveis
      Geracao algoritmo;
      // int n = (args.length < 1) ? 1000 : Integer.parseInt(args[0]);
      int n = 100000000;
      double inicio, fim;


      //Inicializacao do algoritmo de ordenacao
      // algoritmo = new QuickParcial(n);
      algoritmo = new QuickParcial(n);
      
      //Geracao do conjunto a ser ordenado
		// algoritmo.aleatorio();
		// algoritmo.crescente();
		algoritmo.decrescente();


      //Mostrar o conjunto a ser ordenado
		//algoritmo.mostrar();
		

      //Execucao do algoritmo de ordenacao
		inicio = algoritmo.now();
		algoritmo.sort();
		fim = algoritmo.now();


      //Mostrar o conjunto ordenado, tempo de execucao e status da ordenacao
		// algoritmo.mostrar();
		System.out.println("Tempo para ordenar: " + (fim-inicio)/1000.0 + " s.");
      System.out.println("Tempo para ordenar: " + String.format("%.6f", (fim - inicio) / 1000.0) + " s.");
		System.out.println("isOrdenado: " + algoritmo.isOrdenado());
	}
}
