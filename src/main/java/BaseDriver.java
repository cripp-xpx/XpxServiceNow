import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseDriver {

    private static WebDriver driver = new ChromeDriver();

    public static WebDriver getBaseDriver() {
        return driver;
    }
}
