package com.staffing.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation
{
	FileInputStream f;
	XSSFWorkbook wb;
	XSSFSheet ws;
	FileOutputStream f1;
	String result=null;

	public Row readRow(String path,int sheetno,int rowno) throws IOException
	{
		f=new FileInputStream(path);
		wb=new XSSFWorkbook(f);
		ws=wb.getSheetAt(sheetno);
		Row row=ws.getRow(rowno);
		return row;
	}

	public int getRowCount(String path,int sheetno) throws IOException
	{
		f=new FileInputStream(path);
		wb=new XSSFWorkbook(f);
		ws=wb.getSheetAt(sheetno);
		int rowCount=ws.getLastRowNum();
		return rowCount;
	}

	public String getCellData(String path,int sheetno,int r,int c) throws IOException
	{
		f=new FileInputStream(path);
		wb=new XSSFWorkbook(f);
		ws=wb.getSheetAt(sheetno);
		String data=ws.getRow(r).getCell(c).getStringCellValue();
		return data;
	}

	public void fileoutput(String path,int R,int r, int c, String xlactres, String result) throws IOException 
	{
		f1=new FileOutputStream(path);
		wb=new XSSFWorkbook(f);
		ws=wb.getSheetAt(0);
		wb.write(f1);
	}

	public String actresultpass(Row row,int xlexpres,int xlactres,int res) throws InterruptedException
	{
		row.createCell(xlactres).setCellValue("Pass");
		String actres="Pass";
		String expres=row.getCell(xlexpres).getStringCellValue();
		if(expres.equals(actres))
		{
			row.createCell(res).setCellValue("Pass");
			Thread.sleep(2000);
			result=row.getCell(res).getStringCellValue();
		}
		else
		{
			row.createCell(res).setCellValue("Fail");
			Thread.sleep(2000);
			result=row.getCell(res).getStringCellValue();
		}
		return result;
	}

	public String actresultfail(Row row,int xlexpres,int xlactres,int res) throws InterruptedException
	{
		row.createCell(xlactres).setCellValue("Fail");
		String expres=row.getCell(xlexpres).getStringCellValue();
		String actres="Fail";
		if(expres.equals(actres))
		{
			row.createCell(res).setCellValue("Pass");
			Thread.sleep(2000);
			result=row.getCell(res).getStringCellValue();
		}
		else
		{
			row.createCell(res).setCellValue("Fail");
			Thread.sleep(2000);
			result=row.getCell(res).getStringCellValue();
		}
		return result;
	}
}