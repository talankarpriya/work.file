package exelreading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sheetstudy {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("C:\\Users\\admin\\Desktop\\exelreading\\exelread.xlsx");
		
	String name = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		
	//System.out.println(name);
	}
	
		
		
		
		
		
		
		
		
		
		
		

	}


