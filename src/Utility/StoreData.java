package Utility;

import java.util.Map;

import test.Core.YmalReader;

public class StoreData {
	
	public String Name; 
	public String StoreProfile;
	public String  LegalName ;
	public String  CorporateIdentification;
	public String  StreetAddress;
	public String  PhoneNumber;
	public String  PostalAddress;
	public String  RecipeCardPostalAddress;
	public String  RecipeCardZipCode;
	public String  RecipeCardPostalArea;
	  
 	static YmalReader reader = new YmalReader();
	
	@SuppressWarnings("rawtypes")
	
	//Retrive all the Store data from file and save in variable 
	public static StoreData Initialize(String key) 
	{
		StoreData obj=new StoreData();
       Map map=  reader.YmalRead(key, "./TestData/StoreData.yaml");
       obj.Name= (String) map.get("Name").toString();
       obj.LegalName=  (String) map.get("LegalName").toString();
       obj.StoreProfile= (String) map.get("StoreProfile").toString();
       obj.PhoneNumber=  (String) map.get("PhoneNumber").toString();
       obj.StreetAddress=  (String) map.get("StreetAddress").toString();
       obj.PostalAddress= (String) map.get("PostalAddress").toString();
       obj.RecipeCardPostalAddress=  (String) map.get("RecipeCardPostalAddress").toString();
       obj.RecipeCardPostalArea= (String) map.get("RecipeCardPostalArea").toString();
       obj.CorporateIdentification=  (String) map.get("CorporateIdentification").toString();
          
                  
	return obj;
       
	}

}
