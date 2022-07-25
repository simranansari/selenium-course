package com.example.spreadsheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SpreadsheetDemo {

	public static void main(String[] args) throws IOException, URISyntaxException {
		File dataFile = new File(
				ClassLoader.getSystemResource("localdata/demodata.xlsx").toURI());
		FileInputStream fis = new FileInputStream(dataFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		int sheets = workbook.getNumberOfSheets();
		
		for (int i=0; i<sheets; i++) {
			if (workbook.getSheetName(i).equals("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				
				Iterator<Row> rows = sheet.rowIterator();
				
				Row headerRow = rows.next();
				Iterator<Cell> headerCells = headerRow.cellIterator();
				
				int k=0;
				int column = -1;
				
				/*
				 * 
				 */
				while (headerCells.hasNext()) {
					Cell headerCell = headerCells.next();
					
					if (headerCell.getStringCellValue().equals("Testcases")) {
						column = k;
						break;
					}
					
					k++;
				}
				
				while (rows.hasNext()) {
					Row dataRow = rows.next();
					
					if (dataRow.getCell(column).getStringCellValue().equals("Add Profile")) {
						Iterator<Cell> requiredCells = dataRow.cellIterator();
						
						while (requiredCells.hasNext()) {
							Cell cell = requiredCells.next();
							
							switch (cell.getCellType()) {
								case STRING:
									System.out.print(cell.getStringCellValue() + " ");
									break;
								case NUMERIC:
									System.out.print(cell.getNumericCellValue() + " ");
									break;
								case BOOLEAN:
									System.out.print(cell.getBooleanCellValue() + " ");
									break;
								default:
									break;
							}
						}
						
						break;
					}
				}
			}
		}
	}
	
}
