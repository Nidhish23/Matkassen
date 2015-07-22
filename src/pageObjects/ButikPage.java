package pageObjects;
import Utility.Configuration;
import Utility.PageObjects;
import test.Core.*;
import Utility.*;


import java.util.Random;


public class ButikPage extends MasterPage {
	
	//Parametrized constructor to call the super class constuctor 
	public ButikPage(PageObjects repository) {
		super(repository);
		
	}
	
	//Locator Object
	public static  LocatorObject store_add_New_Butik_Link = new LocatorObject("Lägg till butik","Butik Page>Click on add new butik link",LocatorObject.LINKTEXT);
	public static   LocatorObject store_bms_ID_Textbox = new LocatorObject("StoreDefinition_BMSId","Butik Page > Enter BMS ID",LocatorObject.ID);
	public static LocatorObject store_CustomerNumber_Textbox =new LocatorObject("StoreCustomerNumber","Butik Page >StoreCustomerNumber textbox",LocatorObject.ID);
    public static LocatorObject store_Profile_Chkbox=new LocatorObject("StoreProfile","Butik Page >Store Profile",LocatorObject.ID);
    
     public static  LocatorObject store_Legal_Name_Textbox = new LocatorObject("StoreDefinition_LegalName","Butik Page>Store Legal Name textbox",LocatorObject.ID);
	public static   LocatorObject store_Name_Textbox = new LocatorObject("StoreDefinition_Name","Butik Page > Store Name",LocatorObject.ID);
	public static LocatorObject store_Corporate_Identification_Textbox =new LocatorObject("StoreDefinition_CorporateIdentificationNumber","Butik Page >store_Corporate_Identification_Textbox",LocatorObject.ID);
    public static LocatorObject store_PhoneNumber_Textbox=new LocatorObject("StoreDefinition_PhoneNumber","Butik Page >Store Phone Number",LocatorObject.ID);
    
    public static  LocatorObject store_StreetAddress_Textbox = new LocatorObject("StoreDefinition_StreetAddress","Butik Page>store_StreetAddress_Textboxo",LocatorObject.ID);
	public static   LocatorObject store_PostalAddress_Textbox = new LocatorObject("StoreDefinition_PostalAddress","Butik Page > Store postal address",LocatorObject.ID);
	public static LocatorObject store_HasStorePayment_Chkbox =new LocatorObject("StoreDefinition_HasStorePayment","Butik Page >StoreDefinition_HasStorePayment",LocatorObject.ID);
    public static LocatorObject store_SelectWeek_Dropdown=new LocatorObject("SelectedWeek","Butik Page >SelectWeek",LocatorObject.ID);
    
    public static  LocatorObject store_TextEditor_Textbox = new LocatorObject("storeTextEditor","Butik Page>store_StreetAddress_Textboxo",LocatorObject.ID);
	public static   LocatorObject store_RecipeCardPostalAddress_Textbox = new LocatorObject("StoreDefinition_RecipeCardPostalAddress","Butik Page > RecipeCard Postal address",LocatorObject.ID);
	public static LocatorObject Store_RecipeCardZipCode_Textbox =new LocatorObject("RecipeCardZipCode","Butik Page >Store Store_RecipeCardZipCode_Textbox ",LocatorObject.ID);
    public static LocatorObject store_RecipeCardPostalAre_Textbox=new LocatorObject("StoreDefinition_RecipeCardPostalArea","Butik Page >store_RecipeCardPostalAre_Textbox",LocatorObject.ID);
    
    public static  LocatorObject Store_Save_Button = new LocatorObject("btnSave","Butik Page>Store_Save_Button",LocatorObject.ID);
	
    
    public static  LocatorObject store_ChangeEdit_Button = new LocatorObject("Ändra","Butik Page>store_StreetAddress_Textboxo",LocatorObject.LINKTEXT);
   	public static   LocatorObject store_Active_Button = new LocatorObject("//div[@id='primary']/div/div[2]/div/div/form/ul/li[14]/div/span/input","Butik Page > Active button",LocatorObject.XPATH);
   	public static LocatorObject store_Visible_close_Button =new LocatorObject("//div[@id='primary']/div/div[2]/div/div/form/ul/li[15]/div[2]/span/input","Butik Page >Store Store_RecipeCardZipCode_Textbox ",LocatorObject.XPATH);
      
   
   //Local Variables 
   	String number;
    public ButikPage getButikPage(){
		
		return this;
	}
   	
   	//Create a New Store 
    public ButikPage CreateStore(String storeName,String legalName,String storeProfile,String phoneNumber,
    		String streetAddress,String postalAddress,String storeInfo,String recipeCardPostalAddress,String recipeCardPostalArea, String CorporateIdentification)
    {
    	 number=RandomNumber();
    	 
    	Action.ActionLog("Expected Result : New Store should be created");
    	Action.ActionLog("Enter bms ID ");
    	Action.Click(store_add_New_Butik_Link);
    	Action.enterText(store_bms_ID_Textbox,number); 
    	Action.ActionLog("Enter Customer Number ");
    	Action.enterText(store_CustomerNumber_Textbox, number);
    	Action.ActionLog("Enter Store Name ");
    	Action.enterText(store_Name_Textbox,storeName);
    	//Action.SelectdropdrownValueByVisibleText(store_Profile_Chkbox, storeProfile);
    	Action.ActionLog("Select the Store Profile");
    	Action.SelectdropdrownValueByIndex(store_Profile_Chkbox, 1);
    	Action.ActionLog("Enter Store legal Name ");
    	Action.enterText(store_Legal_Name_Textbox, legalName);
    	Action.ActionLog("Enter Co-operate Identity ");
    	Action.enterText(store_Corporate_Identification_Textbox, CorporateIdentification);
    	Action.ActionLog("Enter Phone Number ");
    	Action.enterText(store_PhoneNumber_Textbox, phoneNumber);
    	Action.ActionLog("Enter Street Address");
    	Action.enterText(store_StreetAddress_Textbox, streetAddress);
    	Action.ActionLog("Enter Zipcode ");
    	Action.enterText(store_PostalAddress_Textbox, postalAddress);
    	Action.Click(store_HasStorePayment_Chkbox);
    	Action.enterText(store_TextEditor_Textbox, storeInfo);
    	Action.enterText(store_RecipeCardPostalAddress_Textbox, recipeCardPostalAddress);
    	Action.enterText(Store_RecipeCardZipCode_Textbox, postalAddress);
    	Action.Click(Store_Save_Button);
    	Action.driverwait(60);
    	Action.verifyElementPresent(store_ChangeEdit_Button);
    	Action.ActionLog("Actual Result : Store Created Successfully");
    	return this;
    }
    
    public ButikPage ClickonChange()
    {
   Action.ActionLog("Click on Change link");
    	Action.Click(store_ChangeEdit_Button);
    	
    	return this;
    }
    
    public ButikPage MakeStoreActive()
    {
    	Action.ActionLog("Make a store Active");
    Action.Click(store_Active_Button);
    	return this;
    }
	
    public ButikPage MakeStoreVisible()
    {
    	Action.ActionLog("Make a store Visible");
    	Action.driverwait(10);
    	Action.Click(store_Visible_close_Button);
    	return this;
    }
    
    public String RandomNumber()
    {
    	Random random=new Random();
       return String.valueOf((random.nextInt()*999)*2);

    }
}   


