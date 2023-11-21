package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Custome_ExcelDataProvider {

	XSSFWorkbook wb;
	public Custome_ExcelDataProvider() throws IOException {
		String excelPath=System.getProperty("user.dir")+"/Excel/ExcelData.xlsx";
		
		FileInputStream fis=new FileInputStream(excelPath);
		
		 wb=new XSSFWorkbook(fis);
				
	}
	
	public String CustomStringExcelData(String sheetName, int rowIndex, int cellIndex) {
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
	}

	public Double CustomNumericExcelData(String sheetName, int rowIndex, int cellIndex) {
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getNumericCellValue();
	}
}
