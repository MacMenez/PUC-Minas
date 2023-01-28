class Retangulo
{
private:
    /* data */
    float altura;
    float largura;
public:
    Retangulo(){
        altura = 0;
        largura = 0;
    }
    
    float getAltura(){
        return altura;
    }

    void setAltura(float a){
        altura = a;
    }

    float getLargura(){
        return largura;
    }

    void setLargura(float l){
        largura = 1;
    }

    float calculaArear(){
        return altura * largura;
    }

    float calculaPerimetro(){
        return 2 * altura + 2 * largura;
    }

};
