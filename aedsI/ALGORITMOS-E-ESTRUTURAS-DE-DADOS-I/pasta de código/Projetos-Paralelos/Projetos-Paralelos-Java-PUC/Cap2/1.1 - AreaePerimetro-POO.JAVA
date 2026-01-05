public class Retangulo{
    private float altura;
    private float largura;

    public Retangulo(){
        altura = 0; largura = 0;
    }

    public float getAltura(){
        return altura;
    }

    public void setAltura(float a){
        altura = a;
    }

    public float getLargura(){
        return largura;
    }

    public void setLargura(float l){
        largura = l;
    }

    public float calculaArea(){
        return altura * largura;
    }

    public float calculaPerimetro(){
        return 2 * altura + 2 * largura;
    }
}