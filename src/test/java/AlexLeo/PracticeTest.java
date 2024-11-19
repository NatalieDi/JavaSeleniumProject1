package AlexLeo;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PracticeTest extends BaseTest {

    @Test
    public void testStoreName() throws InterruptedException {

        String websiteName = driver.findElement(By.xpath("//h1/a[@href='https://askomdch.com/']")).getText();

        Assert.assertEquals(websiteName, "AskOmDch");

        Thread.sleep(3000);
    }

    @Test
    public void testPageTitleName() {
        String expectedTitle = "Products";
        String actualTitle = driver.findElement(By.className("title")).getText();

        Assert.assertEquals(actualTitle, expectedTitle, "Page title is incorrect");
    }

    @Test
    public void testFindMoreButton() throws InterruptedException {
        org.openqa.selenium.WebElement element;
        try {
            element = driver.findElement(By.xpath("//*[@id=\"post-61\"]/div/div[1]/div/div/div/div/div[2]/a"));
        } catch (Exception e) {
            System.out.println("Element not found");
            throw new RuntimeException(e);
        }
        element.click();
        int count = 0;
        while (count < 10) {
            if (driver.getCurrentUrl().equals("https://askomdch.com/contact-us/")) {
                break;
            }
            Thread.sleep(200);
            count++;
        }
    }
}

