package org.world;

import org.hello.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameWork extends BaseClass{
          public static void main(String[] args) throws InterruptedException {
		  //1.
          launchChrome();
          //2.
          launchFireFox();
          //3.
          launchEdgeDriver();
          //4.
          launchopera();
          //5
          winmax();
          //6
          loadUrl("https://www.facebook.com");
          //7
          printTitle();
          //8
          printCurrentUrl();
          //9
          WebElement txt = driver.findElement(By.id("email"));
          capslck(txt);
          fill(txt, "nishanth");
          
          WebElement pass = driver.findElement(By.id("pass"));
          fill(pass, "nishanth123");
          //10
          WebElement button = driver.findElement(By.name("login"));
          btn(button);
          //11
          sshot();
          //12
          clkdouble(txt);
          //13
          rightclick(txt);
          //14
          cpyrobo(txt);
          //15
          nxtTxt();
          //15
          entr();
          //16
          dwn();
          //17
          pstrobo(txt, pass);
          //18
          capslck(txt);
          //19
          cutz(txt);
          //20
          inspt();
          //21
          undoo();
          //22
          prnt();
          //23
          onscreenkboard();
          //24
          actnsendkys(pass, "surya");
          //25
          actncaps(txt, "rolexsurya");
          //26
          WebElement create = driver.findElement(By.xpath("//a[@rel='async']"));
          moveactn(create);
          //27
          clkactn();
          //28
          closetab();
          //29
          quitall();
          //30
          WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
          gettxt(forgot);
          //31
          getAttri(txt);
          //32
          staticWait();
          //33
          jsSndkeys(txt, "naveen");
          //34
          jsgetAttr(txt);
          //35
          jsclick(button);
          //36
          jsScrolltop(create);
          //37
          jsScrollbottom(create);
          //38
          jsHilite(pass);
          //39
          WebElement dropdown = driver.findElement(By.tagName("select"));
          //40
          slctbyvalue(dropdown, "5");
          //41
          slctbyVisibleTxt(dropdown, "Mar");
          //42
          slctbyIndx(dropdown, 19);
          //43
          ismultplslct();
          //44 
          dslctByVisibletxt(dropdown, "Mar");
          //45
          dslctByValue(dropdown, "5");
          //46
          dslctByIndx(dropdown, 19);
          //47
          dslctAll(dropdown);
          //48
          roboSelectAll(pass);
          //49
          robofindtxt();
          //50
          roboBoldfont();
          //51
          roboUnderline();
          //52
          roboCreateNewdoc();
          //53
          toscreenshott();
          //54
          openpropertyloc();
          //55
          switchesfromonetabtoanother();
          //56
          openDoc();
          //57
          italictext();
          //58
          aligntxtLeft(); 
          //59
          aligntxtright();
          //60
          aligntxtcenter();
          //61
          createnewtab();
          //62
          reundo();
          //63
          openwindowsstratmenu();
          //64
          closetheopenTabexcel();
          //65
          viewdownloadinbrowser();
          //66
          torplace();
          //67
          openfileexplorer();
          //68
          shutdown();
          //69
          refresh();
           // 70
          changekeyboardlang();
          }
}
