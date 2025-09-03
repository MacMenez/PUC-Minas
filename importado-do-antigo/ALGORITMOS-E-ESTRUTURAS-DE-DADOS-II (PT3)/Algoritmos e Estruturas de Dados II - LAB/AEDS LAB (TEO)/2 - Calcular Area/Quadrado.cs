using System;
public class Quadrado
{
 private double lado;
 public Quadrado(double lado)
 {
 this.lado = lado;
 }
 public double GetLado()
 {
 return lado;
 }
public void SetLado(double lado)
 {
 this.lado = lado;
 }
 public double CalcularArea()
 {
 return lado * lado;
 }
}

/*
//Outra estrutura de utilização de métodos
public double Lado
 {
 get {
 return lado;
 }
 set {
 lado = value;
 }
 }
 public Quadrado(double lado)
 {
 this.lado = lado;
 }

 public double CalcularArea()
 {
 return lado * lado;
 }
*/