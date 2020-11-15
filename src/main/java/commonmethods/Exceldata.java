package commonmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {
	public static String readdata(int row,int column) throws IOException {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\prave\\Desktop\\advexcel.xlsx");
		XSSFWorkbook bw = new XSSFWorkbook(fis);
		String val1 = bw.getSheet("Sheet1").getRow(row).getCell(column).getStringCellValue();
		return val1;
	}
	
	public static void writedata(int row,int column,String val) throws IOException {

		FileInputStream fis= new FileInputStream("C:\\Users\\prave\\Desktop\\advexcel.xlsx");
		XSSFWorkbook bw = new XSSFWorkbook(fis);
		bw.getSheet("sheet1").getRow(row).createCell(column).setCellValue(val);
		FileOutputStream fos= new FileOutputStream("C:\\Users\\prave\\Desktop\\advexcel.xlsx");
		
		bw.write(fos);
		fos.close();
	}

}
