package com.ques4;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("employeeRepo")
public class BankAccountRepositoryImpl implements BankAccountRepository {
	BankAccount bankInfo=new BankAccount();
	public BankAccount accountDeatils() {
	bankInfo.setAccountId(1L);
	bankInfo.setAccountBalance(10000.900);
	bankInfo.setAccountHolderName("Sravya");
	bankInfo.setAccountType("Savings");
	return bankInfo;
	}
	public double getBalance(long accountId) {
		return bankInfo.getAccountBalance();
			}

	public double updateBalance(long accountId, double newBalance) {
		if(accountId==bankInfo.getAccountId()) {
			return newBalance;}
		else {
		return bankInfo.getAccountBalance();
		}
	}
}
