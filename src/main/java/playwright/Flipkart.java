package playwright;

	import com.microsoft.playwright.*;
	import com.microsoft.playwright.options.*;
	import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
	import java.util.*;
	import java.util.regex.Pattern;
	public class Flipkart {
	public static void main(String[] args) {
			    try (Playwright playwright = Playwright.create()) {
			      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
			        .setHeadless(false));
			      BrowserContext context = browser.newContext();
			      Page page = context.newPage();
			      page.navigate("https://www.flipkart.com/");
			      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("✕")).click();
			      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Fashion")).click();
			      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Kurta sets")).click();
			      page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Image")).nth(5).click();
			      Page page1 = page.waitForPopup(() -> {
			        page.getByRole(AriaRole.LINK).filter(new Locator.FilterOptions().setHasText(Pattern.compile("^$"))).nth(1).click();
			      });
			      page1.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Login")).nth(1).click();
			      page1.locator("form").filter(new Locator.FilterOptions().setHasText("Enter Email/Mobile numberBy")).getByRole(AriaRole.TEXTBOX).fill("9043028004");
			      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Request OTP")).click();
			    }
			  }
			

		}



	
	


