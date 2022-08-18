package org.hello;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	  public static WebDriver driver;
	  public static TakesScreenshot t;
	  public static Actions a;
	  public static Robot r;
	  public static Select s;
	  public static JavascriptExecutor js;
	  
	//1.
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
	}
	//2.
	public static void launchFireFox() {
	    WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	
	}
	//3.
	public static void launchEdgeDriver() {
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		 
	}	
	//4.
	public static void launchopera() {
		WebDriverManager.operadriver().setup();
		 driver = new OperaDriver();
	}
	//5.
	public static void winmax() {
		driver.manage().window().maximize();
		
	}
	//6.
	public static void loadUrl(String url) {
		driver.get(url);

	}
	//7
	public static void printTitle() {
		System.out.println(driver.getTitle());

	}
	//8
	public static void printCurrentUrl() {
		System.out.println(driver.getCurrentUrl());

	}
	//9
	public static void fill(WebElement e,String value) {
	e.sendKeys(value);
	}
	//10
     public static void btn(WebElement e) {
		e.click();

	}
     //11.
     public static void sshot(){
    	 t=(TakesScreenshot)driver;
    	 File src = t.getScreenshotAs(OutputType.FILE);
    	 File des = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Testing\\screenshotss\\ss.jpg");
         try {
    	 FileUtils.copyFile(src, des);
     }
         catch (IOException e) {
			
		}
     }
     //12.
         public static void clkdouble(WebElement ele) {
        	
        	 a.doubleClick(ele).perform();
         }
    //13.	
         public static void rightclick(WebElement ele) {
        	 a.contextClick(ele).perform();
        	 
         }
     //14.
         public static void cpyrobo(WebElement ele) {
        	 
        	 r.keyPress(KeyEvent.VK_CONTROL);
			 r.keyPress(KeyEvent.VK_C);
			 r.keyRelease(KeyEvent.VK_CONTROL);
			 r.keyRelease(KeyEvent.VK_C);
         }
         
     //15.
         public static void nxtTxt() {
        	 r.keyPress(KeyEvent.VK_TAB);
        	 r.keyRelease(KeyEvent.VK_TAB);
         }
     //16.
         public static void entr() {
        	 r.keyPress(KeyEvent.VK_ENTER);
        	 r.keyRelease(KeyEvent.VK_ENTER);
         }
         
     //17.
         public static void dwn() {
        	 r.keyPress(KeyEvent.VK_DOWN);
        	 r.keyRelease(KeyEvent.VK_DOWN);
         }
      
     //18.    
         public static void pstrobo(WebElement src,WebElement des) {
            
        	r.keyPress(KeyEvent.VK_CONTROL);
        	r.keyPress(KeyEvent.VK_V);
        	r.keyRelease(KeyEvent.VK_CONTROL);
        	r.keyRelease(KeyEvent.VK_V);
         }
     //19.
         public static void capslck(WebElement ele) {
        	 r.keyPress(KeyEvent.VK_CAPS_LOCK);
        	 r.keyRelease(KeyEvent.VK_CAPS_LOCK);
         }
      //20.
         public static void cutz(WebElement ele) {

         	r.keyPress(KeyEvent.VK_CONTROL);
         	r.keyPress(KeyEvent.VK_X);
         	r.keyRelease(KeyEvent.VK_CONTROL);
         	r.keyRelease(KeyEvent.VK_X);
         }
     //21.
         public static void saves() {
        	 r.keyPress(KeyEvent.VK_CONTROL);
        	 r.keyPress(KeyEvent.VK_S);
        	 r.keyRelease(KeyEvent.VK_CONTROL);
        	 r.keyRelease(KeyEvent.VK_S);
		}
     //22.    
         public static void inspt() {
        	 r.keyPress(KeyEvent.VK_CONTROL);
        	 r.keyPress(KeyEvent.VK_SHIFT);
        	 r.keyRelease(KeyEvent.VK_I);
        	 r.keyRelease(KeyEvent.VK_CONTROL);
        	 r.keyRelease(KeyEvent.VK_SHIFT);
        	 r.keyRelease(KeyEvent.VK_I);
         }
         
      //23.
         public static void undoo() {
        	 r.keyPress(KeyEvent.VK_CONTROL);
        	 r.keyPress(KeyEvent.VK_Z);
         }
      //24.
         public static void prnt() {
			r.keyPress(KeyEvent.VK_CONTROL);
            r.keyRelease(KeyEvent.VK_P);
		}
         
      //25.
         public static void refrsh() {
        	 r.keyPress(KeyEvent.VK_F5);
        	 r.keyRelease(KeyEvent.VK_F5);
         }
      //26.
         public static void onscreenkboard() {
        	 r.keyPress(KeyEvent.VK_WINDOWS);
        	 r.keyPress(KeyEvent.VK_CONTROL);
        	 r.keyPress(KeyEvent.VK_O);
        	 r.keyRelease(KeyEvent.VK_WINDOWS);
        	 r.keyRelease(KeyEvent.VK_CONTROL);
        	 r.keyRelease(KeyEvent.VK_O);
         }
      //27.
         public static void actnsendkys(WebElement ele ,String value) {
        	 a.sendKeys(ele, value).perform();
        	 
         }
      //28
         public static void actncaps(WebElement ele ,String value) {
        	 a.keyDown(Keys.SHIFT).perform();
        	 a.sendKeys(ele, value).perform();
        	 a.keyUp(Keys.SHIFT).perform();
         }
     //29.
         public static void moveactn(WebElement ele) {
        	 a.moveToElement(ele).perform();
        	 
         }
        	 
      //30.
         public static void clkactn() {
         
    	 a.click().perform();
         } 
    	 
      	//31
         public static void closetab() {
        	 
        	 driver.close();
         }
         //32
         public static void quitall() {
			driver.quit();

		}
        //33.
         public static void gettxt(WebElement ele ) {
        String text = ele.getText();
        System.out.println(text);
         }
        //34.
        public static void getAttri(WebElement ele) {
         String attribute = ele.getAttribute("value");
       
    	 System.out.println(attribute);
        }
    	 //35.
    	 public static void staticWait() throws InterruptedException {
    		Thread.sleep(5000); 
    	 }
    	 
    	 //36.
    	 public static void jsSndkeys(WebElement e,String value) {
    		  js = (JavascriptExecutor)driver;
    		 js.executeScript("arguments[0].setAttribute('value')", e);
    		 
    	 }
    	 
    	 //37.
    	 public static void jsgetAttr(WebElement ele) {
    		 Object getattr = js.executeScript("return arguments[0].getAttribute('value')",ele);
    	 
    	    System.out.println(getattr);
    	 }
    	 //38.
    	 public static void jsclick(WebElement ele) {
    		 js.executeScript("arguments[0].click()", ele);
    		 
    	 }
    	 //39.
    	 public static void jsScrolltop(WebElement ele) {
    		 js.executeScript("arguments[0].scrollIntoView(true)", ele);
    		 
    	 
    	 
        } 
    	 //40.
    	 public static void jsScrollbottom(WebElement ele) {
    		 js.executeScript("arguments[0].scrollIntoView(false)", ele);
    	 }
    	 //41.
    	 public static void jsHilite(WebElement ele) {
    		 js.executeScript("arguments[0].setAttribute('style',background:blue", ele);
    		 
    	 }
    	 //42
    	 public static void slctbyvalue(WebElement ele,String value) {
    		  s = new Select(ele);
    		  s.selectByValue(value);
    	 }
    	 //43
    	 public static void slctbyVisibleTxt(WebElement ele,String value) {
    		 s.selectByVisibleText(value);
    	 }
    	 //44.
    	 public static void slctbyIndx(WebElement ele,int i) {
    		 s.selectByIndex(i);
    	 }
    	 //45.
    	 public static  void ismultplslct() {
    		 boolean a = s.isMultiple();
    		 System.out.println(a);
    	 }
    	 //46.
    	 public static void dslctByVisibletxt(WebElement ele,String value) {
    		 s.deselectByVisibleText(value);
    	 }
    	 //47.
    	 public static void dslctByValue(WebElement ele ,String value) {
    		 s.deselectByValue(value);
    		 
    	 }
    	 
    	//47.
    	 public static void dslctByIndx(WebElement ele,int i) {
    		 s.deselectByIndex(i);
    	 }
    	 //48.
    	 public static void dslctAll(WebElement ele ) {
    		 s.deselectAll();
    	 }
    	 //49.
    	 public static void roboSelectAll(WebElement e) {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_A);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_A);
    		 
    	 }
    	 //50.
    	 public static void robofindtxt() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_F);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_F);
    	 }
    	 //51.
    	 public static void roboUnderline() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_U);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_U);
    	 }
    	 //52.
    	 public static void roboBoldfont() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_B);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_B);
    	 }
    	 //53.
    	 public static void roboCreateNewdoc() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_N);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_N);
    	 }
    	 //54.
    	 public static void toscreenshott() {
    		 r.keyPress(KeyEvent.VK_WINDOWS);
    		 r.keyPress(KeyEvent.VK_PRINTSCREEN);
    		 r.keyRelease(KeyEvent.VK_WINDOWS);
    		 r.keyRelease(KeyEvent.VK_PRINTSCREEN);
    	 }
    	 //55.
    	 public static void openpropertyloc() {
    		 r.keyPress(KeyEvent.VK_ALT);
    		 r.keyPress(KeyEvent.VK_ENTER);
    		 r.keyRelease(KeyEvent.VK_ALT);
    		 r.keyRelease(KeyEvent.VK_ENTER);
    		 
    		 
    	 }
    	 //56.
    	 public static void switchesfromonetabtoanother() {
    		 r.keyPress(KeyEvent.VK_ALT);
    		 r.keyPress(KeyEvent.VK_TAB);
    		 r.keyRelease(KeyEvent.VK_ALT);
    		 r.keyRelease(KeyEvent.VK_TAB);
    	 }
    	 //57.
    	 public static void openDoc() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_O);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_O);
    	 }
    	 //58.
    	 public static void italictext() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_I);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_I);
    	 }
    	 //59.
    	 public static void aligntxtLeft() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_L);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_L);
    	 }
    	 //60.
    	 public static void aligntxtright() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_R);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_R);
    		
    	 }
    	 //61.
    	 public static void aligntxtcenter() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_E);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_E);
    		 
    	 }
    	 
    	 //62.
    	 public static void createnewtab() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_T);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_T);
    		 
    	 }
    	 //63.
    	 public static void reundo() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_Y);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_Y);
    	 }
    	 //63.
    	 public static void openwindowsstratmenu() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_ESCAPE);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_ESCAPE);
    	 }
    	 //64.
    	 public static void  closetheopenTabexcel() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_W);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_W);
    	 }
    	 //65.
    	 public static void viewdownloadinbrowser() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_J);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_J);
    	 }
    	 //66.
    	 public static void torplace() {
    		 r.keyPress(KeyEvent.VK_CONTROL);
    		 r.keyPress(KeyEvent.VK_R);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_R);
    	 }
    	 //67
    	 public static void  openfileexplorer() {
    		 r.keyPress(KeyEvent.VK_WINDOWS);
    		 r.keyPress(KeyEvent.VK_E);
    		 r.keyRelease(KeyEvent.VK_WINDOWS);
    		 r.keyRelease(KeyEvent.VK_E);
    	 }
    	 //68
    	 public static void shutdown() {
    		 r.keyPress(KeyEvent.VK_ALT);
    		 r.keyPress(KeyEvent.VK_F4);
    		 r.keyRelease(KeyEvent.VK_CONTROL);
    		 r.keyRelease(KeyEvent.VK_F4);
    	 }
    	 //69.
    	 public static void refresh() {
    		 r.keyPress(KeyEvent.VK_F5);
    		 
    		 r.keyRelease(KeyEvent.VK_F5);
    		
    	 }
    	 //70.
    	 public static void changekeyboardlang() {
    		 r.keyPress(KeyEvent.VK_ALT);
    		 r.keyPress(KeyEvent.VK_SHIFT);
    		 r.keyRelease(KeyEvent.VK_ALT);
    		 r.keyRelease(KeyEvent.VK_SHIFT);
    	 }
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
}
