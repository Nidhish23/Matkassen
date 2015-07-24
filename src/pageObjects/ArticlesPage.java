package pageObjects;
import Utility.*;

public class ArticlesPage extends MasterPage {
	
	public ArticlesPage(PageObjects repository)
	{
		super(repository);
	}
	

public ArticlesPage atArticlesPage(){
	
	return this;
}

public ArticlesPage NavigateToHomePage()
{
	Action.Click(Home_Link);
	return this;
}
}