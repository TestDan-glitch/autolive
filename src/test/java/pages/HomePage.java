package pages;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends UIInteractionSteps{

    @FindBy(how = How.XPATH, using = "//h2[text()[normalize-space()='Matthew Regis, welcome to My Working Life']]")
    public WebElement adminPageCheck;

    @FindBy(how = How.XPATH, using = "//h2[text()[normalize-space()='Naomi Lloyd, welcome to My Working Life']]")
    public WebElement employeePageCheck;

    @FindBy(how = How.XPATH, using = "//p[text()='This is where you can view your information.']")
    public WebElement MyDetailsBtn;

    @FindBy(how = How.XPATH, using = "//div[@class='card card-my-rota']//div[1]")
    public WebElement MyRotaBtn;

    @FindBy(how = How.ID, using = "MyTimeOff")
    public WebElement MyTimeOffBtn;

    @FindBy(how = How.CSS, using = "html>body>div:nth-of-type(3)>div:nth-of-type(3)>div:nth-of-type(7)>div>p")
    public WebElement TrainingAndDevBtn;

    @FindBy(how = How.XPATH, using = "//p[text()='Absence Dashboard']")
    public WebElement AbsenceDashboardBtn;

    @FindBy(how = How.XPATH, using = "//p[text()='Money Dashboard']")
    public WebElement MoneyDashboardBtn;

    @FindBy(how = How.XPATH, using = "//p[text()='Overtime Dashboard']")
    public WebElement OvertimeDashboardBtn;

    @FindBy(how = How.XPATH, using = "//button[text()[normalize-space()='Log out']]")
    public WebElement logOut;

    public void CheckAdminPage() {
        adminPageCheck.isDisplayed();
    }

    public void CheckEmployeePage() {
        employeePageCheck.isDisplayed();
    }

    public void ClickMyDetailsBtn() {
        MyDetailsBtn.click();
    }

    public void ClickMyRotaBtn() {
        MyRotaBtn.click();
    }

    public void ClickMyTimeOffBtn() {
        MyTimeOffBtn.click();
    }

    public void ClickTrainingAndDevBtn() {
        TrainingAndDevBtn.click();
    }

    public void ClickAbsenceDashboardBtn() {
        AbsenceDashboardBtn.click();
    }

    public void ClickMoneyDashboardBtn() {
        MoneyDashboardBtn.click();
    }

    public void ClickOvertimeDashboardBtn() {
        OvertimeDashboardBtn.click();
    }

    public void LogOut() throws InterruptedException {
        try {
            WebElement date = getDriver().findElement(By.xpath("//button[@type='submit']"));
            date.click();
        }
        catch(org.openqa.selenium.StaleElementReferenceException ex)
        {
            WebElement date = getDriver().findElement(By.xpath("//button[@type='submit']"));
            date.click();
        }
    }
}
