package org.Kaas;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.util.List;

public class HandlingWebTable {

    @Test
    public void getNoRowsandColumns() throws ParseException {
        String max;
        double m = 0;
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php#");
        // TO Checked the column heading in thread

        List<WebElement> col = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
        int colsize = col.size();
        //traverse in first column
        List<WebElement> rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
        int rowsize = rows.size();
        System.out.println("colsize  " + colsize);
        System.out.println("rowsize  " + rowsize);
        WebElement ele = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[3]/td[1]"));
        String text = ele.getText();
        ele.getText().isEmpty();
        System.out.println("textdata" + text);
        //get max in particular column
        double r = 0;
        for (int i = 1; i < rowsize; i++) {
            max = driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr[" + (i + 1) + "]/td[4]")).getText();

            m = Double.parseDouble(max);
            if (r < m) {
                r = m;
            }
        }
        System.out.println("max money " + r);
//Get All the text in List
        List<WebElement> element = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr"));
        for (int i = 0; i < element.size(); i++) {
            System.out.println("Anurag " + element.get(i).getText());
        }
        driver.quit();

    }
}

