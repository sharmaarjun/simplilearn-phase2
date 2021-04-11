package com.poi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestRead {

public static void readTestExcel(String FilePath, String SheetName) throws IOException {
		
		try {
			
		FileInputStream inputstream = new FileInputStream(FilePath);
		XSSFWorkbook ExcelWBook = new XSSFWorkbook(inputstream);
		XSSFSheet ExcelWSheet = ExcelWBook.getSheet(SheetName);
		int startrow = 1;
		int Totalrow = ExcelWSheet.getLastRowNum();
		System.out.println(Totalrow+" num of rows");
		for (int i = startrow;i<=Totalrow;i++) {
			XSSFRow ROW = ExcelWSheet.getRow(i);
			XSSFCell cell_id = ROW.getCell(0,MissingCellPolicy.CREATE_NULL_AS_BLANK);
			int strID = (int) cell_id.getNumericCellValue();
			
			XSSFCell cell_user = ROW.getCell(1,MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String strusername = cell_user.getStringCellValue();
			
			XSSFCell cell_expected = ROW.getCell(2,MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String strexp = cell_expected.getStringCellValue();
			
			XSSFCell cell_actual = ROW.getCell(3,MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String stract = cell_actual.getStringCellValue();
			
			XSSFCell cell_result = ROW.getCell(4,MissingCellPolicy.CREATE_NULL_AS_BLANK);
			String strResult = cell_result.getStringCellValue();
			
			System.out.println(strID+" - "+strusername+" - "+strexp+" - "+stract+" - "+strResult);
			
			// Login
			Login obj = new Login();
			
			String strTCResult = "FAIL";
			String ActRes = obj.LoginSwiggy(strResult);
			if (strexp.equals(ActRes)) {
				strTCResult = "PASS";
			}
			System.out.println("Actual result is "+ActRes);
			XSSFCell cellActRes = ROW.createCell(4);
			XSSFCell cellTCRes = ROW.createCell(5);
			cellActRes.setCellValue(ActRes);
			cellTCRes.setCellValue(strTCResult);
			
			
			System.out.println(strID+" - "+strTCResult);
			}

		} catch (NullPointerException e) {
			System.out.println("Error message caught "+e.getMessage());
		}
	}

	public static void main(String[] args) throws IOException {
		readTestExcel("C:\\Users\\Arjun Sharma\\eclipse-workspace\\TestSwiggyAssignment\\testdata.xlsx","Data");

	}

}
