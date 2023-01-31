program exemplo;
uses crt;

type retangulo = object
    altura, largura: real;
    procedure Inicializar_altura;
    procedure Inicializar_largura;
    function CalcularArea(alt, lar: real):real;
    function CalcularPerimetro(alt, lar: real):real;
    procedure MostraMensagem(texto: string, valor: real);
end;

procedure retangulo.Inicializar_altura;
begin
    writeln('digite o valor da altura do retângulo: ');
    readln(altura);
end;

procedure retangulo.Inicializar_largura;
begin
    writeln('Digite o valor da largura do retângulo: ');
    readln(largura);
end;

function retangulo.CalculaPerimetro(alt, lar: real):real;
begin
    CalculaPerimetro := 2 * alt + 2 * lar;
end;

procedure retangulo.MostraMensagem(texto: string; valor: real);
begin
    writeln(texto, valor:5.2);
end;

var ret: retangulo; {instanciando um objeto da classe retangulo}

begin {Programa Principal}
    clrscr;
    ret.Inicializar_altura;
    ret.Inicializar_largura;
    ret.MostraMensagem('O valor da área = ', ret.CalcularArea(ret.altura, ret.largura));
    ret.MostraMensagem('O valor do parímetro = ', ret.CalculaPerimetro(ret.altura, ret.largura));
    readln;
end;