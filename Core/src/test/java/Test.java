import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Test {


    public static void main(String[] args) {
        String str= "i Like you";
     String slist[]= str.split(" ");
     String temp="";

        for (int i = slist.length-1; i >= 0 ; i--) {
            ;
                temp=temp+ (slist[i].substring(0,1).toUpperCase()+slist[i].substring(1))+" ";
        }
        System.out.println(temp);


    }
}
