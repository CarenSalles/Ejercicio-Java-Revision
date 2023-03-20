package com.caren.cuantaBancaria;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.Spring;

public class Cuenta {

   private String name;
   private String surname;
   private int accountNumber;
   private float balance = 0;
   private float fees = 1.5f;

   public enum tipoCuenta {
      AHORROS, CORRIENTE;
   }

   private tipoCuenta cuenta;

   public Cuenta(String name, String surname, int accountNumber, tipoCuenta cuenta) {
      this.name = name;
      this.surname = surname;
      this.accountNumber = accountNumber;
      this.cuenta = cuenta;

   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getSurname() {
      return surname;
   }

   public float getFees() {
      return fees;
   }

   public void setFees(float fees) {
      this.fees = fees;
   }

   public void setSurname(String surname) {
      this.surname = surname;
   }

   public int getAccountNumber() {
      return accountNumber;
   }

   public void setAccountNumber(int accountNumber) {
      this.accountNumber = accountNumber;
   }

   public float getBalance() {
      return balance;
   }

   public void setBalance(float balance) {
      this.balance = balance;
   }

   public tipoCuenta getCuenta() {
      return cuenta;
   }

   public void setCuenta(tipoCuenta cuenta) {
      this.cuenta = cuenta;
   }

   public void render() {
      System.out.println("Nombres del titular =" + name);
      System.out.println("Apellidos del titular =" + surname);
      System.out.println("Número de cuenta =" + accountNumber);
      System.out.println("Tipo de cuenta =" + cuenta);
      System.out.println("Saldo en la cuenta =" + balance);

   }

   public void consultarSaldo() {
      System.out.println("El saldo actual de la cuenta es =" + balance);

   }

   public float saldoActualizadoAgregado(int value) {
      if (value > 0) {
         balance = balance + value;

         System.out.println("Fue consignado $ " + value + "en la cuenta.");

         return balance;

      } else {

         System.out.println("El valor a consignar debe ser mayor que cero");

         return balance;

      }

   }

   public float saldoActualizadoDebitado(int value) {
      if ((balance >= value) && (value > 0)) {
         balance = balance - value;

         System.out.println("El saldo es sufiente." + "Tu nuevo saldo es =" + balance);

         return balance;

      } else {
         System.out.println("El saldo es Insuficiente para retirar el valor.");
         return balance;
      }

   }

   public float saldoActualizadoConTasaInterés(float fees) {

      balance = balance + (balance * fees / 100);

      System.out.println("Nuevo saldo después de aplicado la tasa de interes es =" + balance);

      return balance;

   }
}
