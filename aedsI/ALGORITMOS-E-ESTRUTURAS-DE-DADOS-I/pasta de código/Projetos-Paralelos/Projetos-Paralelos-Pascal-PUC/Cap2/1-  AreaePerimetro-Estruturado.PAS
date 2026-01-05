porgram AreaePerimetroStructure;

use crt;

var altura, largura, area, perimetro: real;

function calculaArea(a, b:real):real;
    begin
        calculaArea := a * b;
    end;

function calculaPerimetro(a, b:real):real;
    begin
        calculaPerimetro := 2 * a + 2 * b;
    end;

prcedure mostraMensagem(msg: string; vlr: real);
    begin
        write(msg, vlr:5:2);
    end;

begin
    clrscr;
    write('Digite o valor da altura do retângulo: ');
    readln(altura);

    write('Digite o valor da largura do retângulo: ');
    readln(largura);

    area := calculaArea(altura, largura);
    perimetro := calculaPerimetro(altura, largura);

    mostraMensagem('O valor da área é ', ´, area);
    mostraMensagem('O valor do perimetro é ', ´, perimetro);
    readln;
end.