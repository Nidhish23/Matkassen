// <summary>
//     Home Page Class 
// </summary>
// <revision>
//     Author:	Nidhish Jain
//     Date:	07/14/2015		Action: Created
// </revision>

package pageObjects;
import Utility.Configuration;
import test.Core.*;
import Utility.*;

public class HomePage extends MasterPage {

	
	public HomePage(PageObjects repository)
	{
	super(repository);
	}
	
	public static  LocatorObject Login_Link = new LocatorObject("[Logga in]","Home Page >Login Link",LocatorObject.LINKTEXT);
	public static  LocatorObject Butiker_Link = new LocatorObject("Butiker","Home Page >Login Link",LocatorObject.LINKTEXT);

	 	
	  
	
	  public HomePage atHomePage(){
			
				return this;
			}
	  
	  public HomePage GotoHomePage()
	{
		// ActionLog("Login to home page" +  configuration.ServerName());
		System.out.println(Configuration.ServerName());
		Action.OpenURl(Configuration.ServerName());
		return this;
	}
	
public HomePage NavigateToLoginpage() 
{
	//Action.waitt(Login_Link);
	Action.Click(Login_Link);
	
	return this;
}
public HomePage NavigateToButikerPage() 
{
	//Action.waitt(Login_Link);
	Action.Click(Butiker_Link);
	return this;
}

}
