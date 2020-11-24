import core.DriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks extends DriverManager {

    @BeforeEach
    public void before(){
        WebDriverManager.chromedriver().setup();
        setDriver(new ChromeDriver());
        setWait(new WebDriverWait(getDriver(),30));
        getDriver().manage().window().maximize();
        getDriver().get("http://automationpractice.com/index.php");
    }

    @AfterEach
    public void tearDown(){
        getDriver().quit();

    }
}
