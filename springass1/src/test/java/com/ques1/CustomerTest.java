package com.ques1;

import org.junit.Test;
//import junit.framework.TestCase;

import static org.junit.Assert.assertNotEquals;


//import org.junit.Assert;
import com.ques1.Customer;
public class CustomerTest{
	
@Test
	
 public void displayTest() throws Exception {
	Address add=new Address("Gandhi Nagar","Bangalore","Karnataka","511161","India");
	
	//System.out.println(add.toString());

	Customer expectedCustomer=new Customer("161191","Sindhu","9001100110",add);
	//System.out.println(expectedCustomer.getCustomerAddress());
	assertNotEquals(add.toString(),expectedCustomer.getCustomerAddress());
	
}

}

