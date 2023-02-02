int main{
    int x;
    int x = 10;
    int *y = &x;

    printf("\n %p", x);
    printf("\n %p", &x);
    printf("\n %p", y);
    printf("\n %i", *y);
    
    *y = 100; //x = 100
    
    //  #   ALOCAÇÃO DINÂMICA   #

    int *p;

    p = (int *) malloc(size (int) * 500); //Altera o tamanho de P para 500

    return 0;
}