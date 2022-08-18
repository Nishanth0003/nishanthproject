package org.hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.SystemOutLogger;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		//1.file location
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Testing\\src\\test\\resources\\TestData\\Frame.xlsx");
		//2.read
		FileInputStream filein = new FileInputStream(f);
		//3.type of wrkbook
		Workbook w =new XSSFWorkbook(filein);
		//4.get the sheet
		Sheet s = w.getSheet("Sheet1");
		
		for (int i = 0; i <s.getPhysicalNumberOfRows(); i++) {
			
			Row row = s.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				
				int cellType = cell.getCellType();
				if(cellType==1) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
				}
					else if (DateUtil.isCellDateFormatted(cell)) {
						Date dcv = cell.getDateCellValue();
						SimpleDateFormat simple = new SimpleDateFormat("ddMMyyy");
						String format = simple.format(dcv);
						System.out.println(format);
					}
					else {
						double numeric = cell.getNumericCellValue();
						long l = (long)numeric;
						String valueOf = String.valueOf(l);
						System.out.println(valueOf);
					}
				}
			}
		}
	}


