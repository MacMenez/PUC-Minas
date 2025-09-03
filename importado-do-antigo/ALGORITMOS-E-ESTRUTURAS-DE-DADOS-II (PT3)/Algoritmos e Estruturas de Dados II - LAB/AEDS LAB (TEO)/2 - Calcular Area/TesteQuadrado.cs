using System;
public class TesteQuadrado
{
static void Main(string[] args)
 {
 double l;
 Console.WriteLine("Informe o lado do quadrado:");
 l = double.Parse(Console.ReadLine());
 //Instanciando quadrado 1
 Quadrado q1 = new Quadrado(l);
 Console.WriteLine("Informe o lado do quadrado:");
 l = double.Parse(Console.ReadLine());
 //Instanciando quadrado 2
 Quadrado q2 = new Quadrado(l);
 double area1 = q1.CalcularArea();
Console.WriteLine("Area do quadrado 1: " + area1);
 l = q2.GetLado();
 Console.WriteLine("Lado do quadrado 2 " + l);
 q2.SetLado(10);
 l = q2.GetLado();
 Console.WriteLine("Lado do quadrado 2 " + l);
 Console.ReadLine();

 /*
 //Demostrativo utilizando a outra forma de declaração de metodos
 double area1 = q1.CalcularArea();
 Console.WriteLine("Area do quadrado 1: " + area1);
 l = q2.Lado;
 Console.WriteLine("Lado do quadrado 2 " + l);
 q2.Lado = 10;
 l = q2.Lado;
 Console.WriteLine("Lado do quadrado 2 " + l);
 */
 }
}