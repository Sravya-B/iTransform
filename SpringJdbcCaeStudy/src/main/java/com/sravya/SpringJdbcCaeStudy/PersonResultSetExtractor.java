package com.sravya.SpringJdbcCaeStudy;

import java.sql.ResultSet;
import com.sravya.SpringJdbcCaeStudy.Person;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import com.sravya.SpringJdbcCaeStudy.Person;
public class PersonResultSetExtractor implements ResultSetExtractor {

	public Object extractData(ResultSet rs) throws SQLException, DataAccessException {
		Person person=new Person();
		person.setName(rs.getString("Name"));
		person.setEmail(rs.getString("Email"));
		return person;
	}

}
