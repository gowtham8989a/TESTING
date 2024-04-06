package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
    @Test
    public void Test1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://skct892.examly.io/dashboard");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("email")).sendKeys("22ads.gowtham.a@skct.edu.in");
        driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-login/div/div/div[2]/app-dynamic/div[3]/div/div/div[1]/app-button/button")).click();
        Thread.sleep(7000);
        driver.findElement(By.id("password")).sendKeys("tarzo777");
        driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-login/div/div/div[2]/app-dynamic/div[3]/div/div/div/app-button/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-sidebar/div/ul/li[7]/a/div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-sidebar/div[2]/ul/li[7]/div/ul/li[4]/div/div[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-my-course-layout/div/div/app-mycourse-list/div/div/div[1]/div[2]/div[2]/app-user-card[1]/div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-mycourse-details/div[2]/div[1]/div/div[2]/app-accordian/div[2]/div/div/div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-mycourse-details/div[2]/div[1]/div/div[2]/app-accordian/div[2]/div/div/div[2]/div[3]/div[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-sidebar/div/ul/li[7]/a/div/img")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/div/app-sidebar/div[2]/ul/li[7]/div/ul/li[7]/div/div[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/div/div/div/app-my-course-layout/div/div/app-mycourse-list/div/div/div[1]/div[2]/div[2]/app-user-card[1]/div")).click();
        Thread.sleep(5000);
        driver.close();
        
    }
}
