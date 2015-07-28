package pageObjects;


import Utility.Configuration;
import Utility.PageObjects;
import test.Core.*;
public class MasterPage {

protected PageObjects repository;
static Action Action =new Action();
Log log=new Log();
Configuration configuration = new Configuration();
	public MasterPage(PageObjects repository)
	{
		this.repository=repository;
	}
	
	public  LoginPage GetLoginPage()
	{
		return repository.GetLoginPage();
	}
	
	public  HomePage GetHomePage()
	{
       return repository.GetHomePage();
		
	}
	public ArticlesPage GoToArticlePage()
	{
 return repository.GetArticlePage();
		
	}
	
	public ButikPage GetButikPage()
	{
 return repository.GetButikPage();
		
	}
	
	//Master Page Locator Objects	
	public static LocatorObject ICA_Logo_Image = new LocatorObject("img[alt='ICA förstasida']","Master Page>Header>Logo>",LocatorObject.CSS);
	public static LocatorObject Logout_Link = new LocatorObject("[Logga ut]","Master Page>Log Out button",LocatorObject.LINKTEXT);
	public static LocatorObject Home_Link =new LocatorObject("(//a[contains(@href, '/')])[2]","Master Page > Home Link",LocatorObject.XPATH);
    public static LocatorObject Ongoing_Activities_Link=new LocatorObject("Löpande aktiviteter","Login page >RememberMe",LocatorObject.LINKTEXT);
    public static LocatorObject Settings_Link =new LocatorObject("Inställningar","Master Page > Settings",LocatorObject.LINKTEXT);
    public static LocatorObject Statistics_Link=new LocatorObject("Statistik","Master Page >RememberMe",LocatorObject.LINKTEXT);
    public static  LocatorObject Login_Link = new LocatorObject("[Logga in]","Home Page >Login Link",LocatorObject.LINKTEXT);
      
  
	   
       
}
