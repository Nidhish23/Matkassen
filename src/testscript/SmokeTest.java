// <summary>
//     Smoke Test 
// </summary>
// <revision>
//     Author:	Nidhish Jain
//     Date:	07/14/2015		Action: Created
// </revision>

package testscript;
import org.testng.annotations.Test;

import test.Core.*;

import org.testng.Assert;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import Utility.StoreData;
import Utility.TestBase;
import Utility.Begin;
import Utility.LoginData;


public class SmokeTest extends TestBase  {
	
	 
@Test (groups={"MKM-Smoke Test"}, description = "Verify the login functionality with admin Credentials")
public static void Verify_Login_Functionality() {
	
		LoginData login=  LoginData.Initialize("LoginDataMKM");
		Begin begin =new Begin();
        
       begin
       .GoToHomePage()
       .getHomePage()
       .GotoHomePage()
       .NavigateToLoginpage()
       .GoToLoginPage()
       .getLoginpage()
       .Login(login.username,login.password);
         
  }

//@Test (groups={"MKM-Smoke Test"}, description = "Verify the functionality to add new store ")
public static void Verify_Add_New_Butik_Functionality() {
	
		LoginData login=  LoginData.Initialize("LoginDataMKM");
		StoreData store= StoreData.Initialize("TestStore1");
		Begin begin =new Begin();
		   
   begin
   .GoToHomePage()
   .getHomePage()
   .GotoHomePage()
   .NavigateToLoginpage()
   .GoToLoginPage()
   .getLoginpage()
   .Login(login.username,login.password)
   .GoToArticlePage()
   .getArticlesPage()
   .NavigateToHomePage()
   .GoToHomePage()
   .getHomePage()
   .NavigateToButikerPage()
   .GoToButikPage()
   .getButikPage()
   .CreateStore(store.Name,store.LegalName,store.StoreProfile,store.PhoneNumber,store.StreetAddress
		   ,store.PostalAddress,"NA NA NA NA ",store.RecipeCardPostalAddress,
		   store.RecipeCardPostalArea,store.CorporateIdentification)
   .ClickonChange()
   .MakeStoreActive()
   .MakeStoreVisible();
		   
   
   
   
        
       
  }
  
  }


