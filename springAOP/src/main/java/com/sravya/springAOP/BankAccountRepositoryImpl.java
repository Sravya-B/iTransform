package com.sravya.springAOP;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class BankAccountRepositoryImpl implements BankAccountRepository {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	 public void setDataSource(DataSource dataSource) {
	        this.dataSource = dataSource;
	    }

	public double getBalance(long accountId) {
		String sql="SELECT accountBalance from itransform.bankaccount where accountId=?";
		jdbcTemplate=new JdbcTemplate(dataSource);
		return jdbcTemplate.queryForObject(sql, new Object[] {accountId},Double.class);
	}

	public double updateBalance(long accountId, double newBalance) {
		String sql="update itransform.bankaccount set accountBalance=accountBalance+? where accountId=?";
		jdbcTemplate=new JdbcTemplate(dataSource);
		return jdbcTemplate.queryForObject(sql, new Object[] {newBalance,accountId},Double.class);
	}

}
