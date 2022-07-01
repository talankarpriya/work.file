package KiteappUtility;//2//

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hwpf.model.FIBFieldHandler;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {
	////reading data from exel/////
 public static String readdatafromexel(int row,int cell) throws EncryptedDocumentException, IOException
//return type string data reaturn in string
 {
	 File myfile=new File("C:\\Users\\admin\\Desktop\\exelreading\\exelread.xlsx");
	 Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet3");
	String myvalue = mysheet.getRow(row).getCell(cell).getStringCellValue();
	
	
	return myvalue;
 }
 public static void takeScreenshot(WebDriver driver) throws IOException//webdriver locally gheun parameterise kel
 {
	 //source file
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 String random = RandomString.make(3);//for randomly taking screenshot
	 //destination file
     File dest=new File("C:\\Users\\admin\\Pictures\\Saved Pictures\\screenshot1"+random+".png");
	 
     FileHandler.copy(src, dest);
	
 }
 
}
///////after this kiteapptestclass////////////
