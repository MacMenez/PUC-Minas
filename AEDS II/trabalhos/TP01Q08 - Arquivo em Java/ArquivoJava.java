import java.io.IOException;
import java.io.RandomAccessFile;

class ArquivoJava{
    static void mostrarq() throws IOException {
        RandomAccessFile arquivo = new RandomAccessFile("arq.txt", "r");
        long n = arquivo.length();
        arquivo.seek(n);
        while (n > 0) {
            n -= 8;
            arquivo.seek(n);
            double valor = arquivo.readDouble();
            if(valor == (long) valor){
                MyIO.println((int) valor);
            }else{
                MyIO.println(valor);
            }
        }

        arquivo.close();
    }
    static void larq(int total) throws IOException {
        RandomAccessFile arquivo = new RandomAccessFile("arq.txt", "rw");
        for(int i = 0; i < total;i ++){
            double n;
            n = MyIO.readDouble();
            arquivo.writeDouble(n);
        }
        arquivo.close();
    }
    public static void main(String[] args) {
        int numR;
        numR = MyIO.readInt();
        
        try{
            larq(numR);
            mostrarq();

        }catch(Exception e){
            MyIO.println("erro");
        }
    }
}