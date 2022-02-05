package com.cybertek.OOP_Practice;

public class SavingsAccount extends BankAccount{

  private Double interestRate;

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public SavingsAccount(Double interestRate) {
    this.interestRate = interestRate;
  }
}
