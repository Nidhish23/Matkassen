package pageObjects;

import test.Core.Action;
import Utility.*;
import test.Core.LocatorObject;

public   class LoginPage extends MasterPage {

	public LoginPage(PageObjects repository) {
		super(repository);
		
	}
	
	public static String rememberMe_Checkbox ="RememberMe";
	public static  LocatorObject userName_Textbox = new LocatorObject("Username","Login page> Enter Username",LocatorObject.ID);
	public static   LocatorObject password_Textbox = new LocatorObject("Password","Login page>Enter Password",LocatorObject.ID);
	public static LocatorObject login_Button =new LocatorObject("login","Login page >Login button",LocatorObject.ID);
    public static LocatorObject rememberMe_Chkbox=new LocatorObject("RememberMe","Login page >RememberMe",LocatorObject.ID);

    //Method to return the object of login class     
    public LoginPage getLoginpage(){
		
		return this;
	}
    //method to login into application
    public LoginPage Login(String username,String password) 
{
	Action.ActionLog("Verify the login process from Matkassen");
	
	Action.enterText(userName_Textbox, username);
	Action.ActionLog("Enter the Usner name"+ username);
	Action.enterText(password_Textbox, password);
	Action.ActionLog("Enter the Password"+ password);
	Action.Click(login_Button);
	Action.verifyElementPresent(Logout_Link);
	
	return this;
}

  
    
}