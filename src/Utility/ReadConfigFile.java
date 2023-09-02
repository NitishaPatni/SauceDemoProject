package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class ReadConfigFile 
{
	Properties pro;

	public ReadConfigFile(String path)
	{
		FileInputStream file;
		try {
			file = new FileInputStream(path);
			pro = new Properties();
			pro.load(file);
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getApplicationURL()
	{
	
		String url = pro.getProperty("baseURL");
		return url; 
	}
	
	public String getTitle() 
	{
		String getTitle = pro.getProperty("title");
		return getTitle;
	}
	
	public String getUserName() 
	{
		String username = pro.getProperty("username");
		return username;
		
	}
	
	public String getPassword() 
	{
		String pass = pro.getProperty("passwords");
		return pass;
		
	}
	
	public String clickLoginButton() 
	{
		String clickLoginButton = pro.getProperty("clickLoginButton");				
		return clickLoginButton;		
	}
	
	public String addtoCartbutton() 
	{
		String addtoCartbutton =pro.getProperty("AddtoCarts");
		return addtoCartbutton;
		
	}
	
	public String CheckPrice() 
	{
		String checkoutPrice = pro.getProperty("checkoutPrice");
		return checkoutPrice;
		
	}
	
	public String CartTocheckout() 
	{
		String CartTocheckout =pro.getProperty("ClickonCart");
		return CartTocheckout;
		
	}
	
	public String Checkoutbuttons() 
	{
		String Checkoutbuttons =pro.getProperty("Checkoutbutton");
		return Checkoutbuttons;
		
	}
	
	public String getfirstName() 
	{
		String firstName = pro.getProperty("firstName");
		return firstName;
		
	}
	
	public String getlastName() 
	{
		String lastName = pro.getProperty("lastName");
		return lastName;
		
	}
	
	public String getzipcode() 
	{
		String zipCode = pro.getProperty("zipCode");
		return zipCode;
	}
	
	public String lastPrice() 
	{
		String endPrice = pro.getProperty("itemtotal");
		return endPrice;
	}
	
	public String TaxPrice() 
	{
		String taxprice = pro.getProperty("tax");
		return taxprice;
	}
}
