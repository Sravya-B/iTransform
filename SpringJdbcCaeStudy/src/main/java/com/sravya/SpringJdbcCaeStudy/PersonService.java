package com.sravya.SpringJdbcCaeStudy;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class PersonService implements PersonDAO {
private DataSource dataSource;
public void setDataSource(DataSource dataSource) {
this.dataSource=dataSource;
}
public void insert(String name,String email) {
	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	jdbcTemplate.update("insert into casestudy.person(name,email) values(?,?)",new Object[] {name,email});
}
public List<Person> selectALL(){
	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	String sql="SELECT * FROM casestudy.person";
    return jdbcTemplate.query(sql,new PersonRowMapper());
}
public void deletePerson(String name) {
	JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
	String sql="delete from casestudy.person where name=?";
	jdbcTemplate.update(sql,new Object[] {name});
}
}
