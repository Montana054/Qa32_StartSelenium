import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTest {

    WebDriver wd;

    @Test
    public void tableCss() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/user/Downloads/QA/index.html");
        wd.manage().window().maximize();

        WebElement el1 = wd.findElement(By.cssSelector("[href='#item1']"));
        WebElement el2 = wd.findElement(By.cssSelector("#nav ul li:first-child a"));
        WebElement el3 = wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement el4 = wd.findElement(By.cssSelector("#nav ul li:nth-child(2)"));
        WebElement el5 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement el6 = wd.findElement(By.cssSelector("#nav ul li:nth-child(3)"));
        WebElement el7 = wd.findElement(By.cssSelector("[href='#item4']"));
        WebElement el8 = wd.findElement(By.cssSelector("#nav ul li:last-child a"));

        WebElement el9 = wd.findElement(By.cssSelector("[placeholder*='Type your name']"));
        WebElement el10 = wd.findElement(By.cssSelector("#form1 input:first-child"));

        WebElement el11 = wd.findElement(By.cssSelector("[placeholder*='Type your surename']"));
        WebElement el12 = wd.findElement(By.cssSelector("#form1 input:nth-child(2)"));

        // WebElement el13=wd.findElement(By.cssSelector("[.class='btn']"));///
        WebElement el14 = wd.findElement(By.cssSelector("#form1 button:last-child"));

        WebElement Europe = wd.findElement(By.cssSelector("tr:first-child td:first-child"));
        WebElement Asia = wd.findElement(By.cssSelector("tr:first-child td:nth-child(2)"));
        WebElement America = wd.findElement(By.cssSelector("tr:first-child td:last-child"));

        WebElement Ukraine = wd.findElement(By.cssSelector("tr:nth-child(2) td:first-child"));
        WebElement Israel = wd.findElement(By.cssSelector("tr:nth-child(2) td:nth-child(2)"));
        WebElement USA = wd.findElement(By.cssSelector("tr:nth-child(2) td:last-child"));

        WebElement Germany = wd.findElement(By.cssSelector("tr:nth-child(3) td:first-child"));
        WebElement Russia = wd.findElement(By.cssSelector("tr:nth-child(3) td:nth-child(2)"));
        WebElement Canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));

        WebElement Poland = wd.findElement(By.cssSelector("tr:last-child td:first-child"));
        WebElement Chine = wd.findElement(By.cssSelector("tr:last-child td:nth-child(2)"));
        WebElement Mexico = wd.findElement(By.cssSelector("tr:last-child td:last-child"));


        WebElement el23 = wd.findElement(By.cssSelector("#alert p"));
        wd.quit();
    }

    @Test
    public void xPathTests() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/user/Downloads/QA/index.html");
        wd.manage().window().maximize();

        WebElement el1 = wd.findElement(By.xpath("//a[@href='#item1']"));
        String textEl1 = el1.getText();
        System.out.println("Text of element --->" + textEl1);
        Assert.assertEquals(textEl1, "Item 1");
        el1.click();
        WebElement message=wd.findElement(By.xpath("//p[@class='message']"));
        String textEl11 = message.getText();
        System.out.println("Text of element --->" + textEl11);
        Assert.assertEquals(textEl11, "Clicked by Item 1");

        WebElement el2 = wd.findElement(By.xpath("//*[@href='#item2']"));
        String textEl2 = el2.getText();
        System.out.println("Text of element --->" + textEl2);
        Assert.assertEquals(textEl2, "Item 2");

        WebElement el3 = wd.findElement(By.xpath("//*[@href='#item3']"));
        String textEl3 = el3.getText();
        System.out.println("Text of element --->" + textEl3);
        Assert.assertEquals(textEl3, "Item 3");

        WebElement el4 = wd.findElement(By.xpath("//*[@href='#item4']"));
        String textEl4 = el4.getText();
        System.out.println("Text of element --->" + textEl4);
        Assert.assertEquals(textEl4, "Item 4");

        WebElement el5 = wd.findElement(By.xpath("//*[text()='Europe']"));
        String textEl5 = el5.getText();
        System.out.println("Text of element --->" + textEl5);
        Assert.assertEquals(textEl5, "Europe");

        WebElement el6 = wd.findElement(By.xpath("//*[text()='Israel']"));
        String textEl6 = el6.getText();
        System.out.println("Text of element --->" + textEl6);
        Assert.assertEquals(textEl6, "Israel");

        WebElement el7 = wd.findElement(By.xpath("//*[text()='America']"));
        String textE7 = el7.getText();
        System.out.println("Text of element --->" + textE7);
        Assert.assertEquals(textE7, "America");
        WebElement el24 = wd.findElement(By.xpath("//*[@id='alert']"));


        wd.quit();


    }

}
