package week19_01_14_2023.selenium_drivers;

public class FireFoxDriver extends RemoteWebDriver{
    @Override
    public String getScreenshotAs() {
        return "TIFF";
    }
}
