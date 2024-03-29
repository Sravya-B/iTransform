package com.sravya.springAOP;

import java.sql.SQLException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class BankAccountServiceImpl implements BankAccountService{

	private BankAccountRepositoryImpl bankAccountRepositoryImpl;
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	 public void setDataSource(DataSource dataSource) {
	        this.dataSource = dataSource;
	       
	    }
	
	public double withdraw(long accountId, double balance) throws SQLException{
		System.out.println("This is withdraw method");
		jdbcTemplate=new JdbcTemplate(dataSource);

		String sql="update itransform.bankaccount set accountBalance=accountBalance-? where accountId=?";
				return  jdbcTemplate.update(sql, new Object[] {balance,accountId});
				
	}
public double deposit(long accountId,double balance) {
	
	return bankAccountRepositoryImpl.updateBalance(accountId,balance);
}
	public double getBalance(long accountId) {
	
		return bankAccountRepositoryImpl.getBalance(accountId);
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) throws SQLException {
		if(withdraw(fromAccount,amount)==500) {
			
			return false;
		}
		else{
			deposit(toAccount,amount);
			
			return true;
		}
		
	}
	}
