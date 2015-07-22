package Utility;
import test.Core.*;


public  class Configuration {
	
	static ReadProperties rp= new ReadProperties();
	
	public String ServerName()
	{
		return rp.Properties("ServerURL");
	
	}
	
	//public static String getBrowser()
//	{
		//return rp.Properties("Browsername");
	//}

	public String browser() 
	{
		// TODO Auto-generated method stub
		return rp.Properties("Browsername");
		
	}
	public String SeleniumServer() 
	{
		// TODO Auto-generated method stub
		return rp.Properties("SeleniumServer");
		
	}
	
	public String LogFilePath() 
	{
		// TODO Auto-generated method stub
		return rp.Properties("LogFilePath");
		
	}
	
	public String ServerPort() 
	{
		// TODO Auto-generated method stub
		return rp.Properties("ServerPort");
		
	}
	
	
}
