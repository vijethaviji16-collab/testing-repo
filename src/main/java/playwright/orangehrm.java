package playwright;

import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.*;
	import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
	import java.util.*;

	public class orangehrm {
	  public static void main(String[] args) {
	    try (Playwright playwright = Playwright.create()) {
	      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
	        .setHeadless(false));
	      BrowserContext context = browser.newContext();
	      Page page = context.newPage();
	      page.navigate("https://orangehrm.com/");
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Allow all")).click();
	      page.getByRole(AriaRole.NAVIGATION).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("OrangeHRM Logo")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Employee Management")).click();
	      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("Food for the Hungry")).first().click();
	      page.navigate("https://orangehrm.com/orangehrm-starter-open-source-software");
	      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("Food for the Hungry")).first().click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Starter on the Cloud")).first().click();
	      page.getByRole(AriaRole.IMG, new Page.GetByRoleOptions().setName("claritas logo")).first().click();
	      page.navigate("https://orangehrm.com/pricing");
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Solutions")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Book a Free Demo")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Full Name")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Full Name")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Full Name")).fill("viji");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Phone Number")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Phone Number")).fill("0321789486");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Email")).fill("vijethavij@12345678");
	      page.getByLabel("Country").selectOption("India");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Company Name")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Company Name")).fill("abc");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Job title")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Job title")).press("CapsLock");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Job title")).fill("QA");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Job title")).press("CapsLock");
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Job title")).fill("QA engineer");
	      page.getByLabel("No Of Employees").selectOption("< 10");
	      page.locator("iframe[name=\"a-tk15yyo1wckc\"]").contentFrame().getByRole(AriaRole.CHECKBOX, new FrameLocator.GetByRoleOptions().setName("I'm not a robot")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Get a Free Demo")).click();
	      page.locator("iframe[name=\"a-w31cys82xn5e\"]").contentFrame().getByRole(AriaRole.CHECKBOX, new FrameLocator.GetByRoleOptions().setName("I'm not a robot")).click();
	      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Get a Free Demo")).click();
	      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Book a Free Demo")).getByRole(AriaRole.BUTTON).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Full Name")).click();
	      page.getByRole(AriaRole.TEXTBOX, new Page.GetByRoleOptions().setName("Full Name")).fill("vijetha");
	      page.getByRole(AriaRole.NAVIGATION).getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("OrangeHRM Logo")).click();
	    }
	  }
	}

