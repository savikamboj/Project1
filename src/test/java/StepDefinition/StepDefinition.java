package StepDefinition;

import StructureOfFramework.UtilityClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

UtilityClass utility=new UtilityClass();

	@Given("^Launch browser and enter url$")
	public void launch_browser_and_enter_url() throws Throwable {
	    utility.LaunchBrowser();
	
	}

	@When("^Enter valid credential$")
	public void enter_valid_credential() throws Throwable {
	    utility.Login();
	}
	@Then("^Home Page displayed$")
	public void home_Page_displayed() throws Throwable {
	    utility.VerifyHomepage();
	}
	/*@When("^User should have multiple roles$")
	  public void user_should_have_multiple_roles() throws Throwable {
	     utility.multiplerole();
		  System.out.println("user has multiple roles");
	}
	
	@When("^User select secendory role$")
	  public void user_select_secendory_role() throws Throwable {
		utility.selectrole();
		System.out.println("value is selected");
	}
	
	@Then("^User should be able to switch to selected role's user interface$")
	  public void user_should_be_able_to_switch_to_selected_role_s_user_interface() throws Throwable {
	      utility.clickpopup();
	      System.out.println("role specific view is displayed");
	}
	
	*/

	@Then("^Home Page displayed and Click Artifact Sidemenu$")
	public void home_Page_displayed_and_Click_Artifact_Sidemenu() throws Throwable {
	    utility.ArtifactSideMenu();
	}

	@And("^Create artifact$")
	public void create_artifact() throws Throwable {
	    utility.CreateArtifact();
	    System.out.println("Artifact is created");
	    		
	}
		
	@And("^Close the application$")
	public void close_the_application() throws Throwable {
	   utility.quit();
	}
}


