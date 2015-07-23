package Utility;
import test.Core.*;


public  class Configuration {
	
	static ReadProperties rp= new ReadProperties();
	
	public static String ServerName()
	{
		return rp.Properties("ServerURL");
	
	}
	
	//public static String getBrowser()
//	{
		//return rp.Properties("Browsername");
	//}

	public static String browser() 
	{
		// TODO Auto-generated method stub
		return rp.Properties("Browsername");
		
	}
	public static String SeleniumServer() 
	{
		// TODO Auto-generated method stub
		return rp.Properties("SeleniumServer");
		
	}
	
	public static String LogFilePath() 
	{
		// TODO Auto-generated method stub
		return rp.Properties("LogFilePath");
		
	}
	
	public  static String ServerPort() 
	{
		// TODO Auto-generated method stub
		return rp.Properties("ServerPort");
		
	}
	public  static String StoreCache() 
	{
		// TODO Auto-generated method stub
		return rp.Properties("StoreCache");
		
	}
	
	
}
