package com.sravya.springAOP;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import com.sravya.springAOP.BankAccountServiceImpl;
@Controller
public class BankAccountController {
	
	@Autowired
	BankAccountServiceImpl bankServiceImpl;
	
	public BankAccountServiceImpl getBankAccountServiceImpl() {
		return bankServiceImpl;
	}
	public void setBankAccountServiceImpl(BankAccountServiceImpl bankServiceImpl) {
		this.bankServiceImpl = bankServiceImpl;
	}
	public double withdraw(long accountId,double balance) throws SQLException{
		return bankServiceImpl.withdraw(accountId, balance);
		
	}
	 DataSource dataSource;
 JdbcTemplate jdbcTemplate;
	 public void setDataSource(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }
	public double deposit(long accountId,double balance) {
		return bankServiceImpl.deposit(accountId, balance);
	}
	public double getBalance(long accountId) {
		return bankServiceImpl.getBalance(accountId);
	}
	public boolean fundTransfer(long fromAccount,long toAccount,double amount) throws SQLException{
		return bankServiceImpl.fundTransfer(fromAccount, toAccount, amount);
	}
}
