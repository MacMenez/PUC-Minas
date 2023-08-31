using System;
public class Empregado
{
 private string nome;
 private string sobrenome;
 private double salario;
 public string Nome
 {
 get { return nome; }
 set { nome = value; }
 }
 public string Sobrenome
 {
 get { return sobrenome; }
 set { sobrenome = value; }
 }
 public double Salario
 {
 get { return salario; }
 set { salario = value; }
 }
 public Empregado(string nome, string sobrenome, double salario)
 {
 this.nome = nome;
 this.sobrenome = sobrenome;
 this.salario = salario;
 }
}