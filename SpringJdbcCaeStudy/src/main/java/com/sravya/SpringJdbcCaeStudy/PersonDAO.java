package com.sravya.SpringJdbcCaeStudy;

import java.util.List;

public interface PersonDAO {
	
	public void insert(String name,String email);
	
	public List<Person> selectALL();
	
	public void deletePerson(String name);
}
