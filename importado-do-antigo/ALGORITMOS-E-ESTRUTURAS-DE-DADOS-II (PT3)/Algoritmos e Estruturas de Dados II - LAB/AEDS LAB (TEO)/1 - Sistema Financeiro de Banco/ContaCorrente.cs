using System;
class ContaCorrente
{
 private string numero;
 private double saldo;
public ContaCorrente(string numero, double saldo)
 {
 this.numero = numero;
 this.saldo = saldo;
 }
 public void Sacar(double valor)
 {
 saldo -= valor;
 }
public void Depositar(double valor)
 {
 saldo += valor;
 }
}