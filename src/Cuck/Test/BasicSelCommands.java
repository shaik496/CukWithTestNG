import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.asn1.eac.UnsignedInteger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BasicSelCommands {

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://learn-automation.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));
        List<WebElement> element = driver.findElements(By.tagName("a"));
        List<String> valu = new ArrayList<String>();
        for (WebElement vol :
                element) {
            valu.add(vol.getAttribute("href"));
        }
        driver.quit();

        System.out.println(valu);
        System.out.println("Number of links count " + valu.size());

        URL url = new URL(valu.get(0));
        HttpURLConnection htpConnection = (HttpURLConnection) url.openConnection();

        htpConnection.setRequestMethod("HEAD");
        htpConnection.connect();
        int code = htpConnection.getResponseCode();

        if (code == 200) {
            System.out.println("Link works fine as status code is "+ code);
        }


        UnsignedInteger unsignedInteger = new
    }
}
