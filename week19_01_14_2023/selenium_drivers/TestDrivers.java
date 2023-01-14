package week19_01_14_2023.selenium_drivers;

public class TestDrivers {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://youtube.com");
        driver=new FireFoxDriver();
        driver.get("https://google.com");
        System.out.println(((TakeScreenShot) driver).getScreenshotAs());
        ((JavaScriptExecuter)driver).executeScript("kgmdbklfgmnlkb");

    }
}
