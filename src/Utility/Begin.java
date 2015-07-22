package Utility;

import pageObjects.*;


public  class Begin {

 PageObjects repository = new PageObjects();
 public  HomePage GoToHomePage()
 {
	return this.repository.GetHomePage();
 }
 
 
}



