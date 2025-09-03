#include <stdio.h>

int main(){
	int numero;
	printf("Informe o numero: ");
	scanf("%d", &numero);

	if(numero % 2 == 0){
		printf("Par!");			
	}else{
		printf("Impar!");			
	}
}
