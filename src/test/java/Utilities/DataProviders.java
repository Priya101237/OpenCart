package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider (name="LoginData")
	public String [] [] getData() throws IOException
	{
		String path=".\\TestData\\opencart testdata.xlsx";
		ExcelUtilities xlutil=new ExcelUtilities(path);
		int totalrows=xlutil.getRowCount("sheet1");
		int totalcols=xlutil.getCellCount("sheet",1);
		
		String logindata[][]=new String [totalrows][totalcols];
		
		for(int i=1;i<=totalrows;i++)
		{
			for(int j=0;j<totalcols;j++)
			{
				logindata[i-1][j]=xlutil.getCellData("sheet", i, j);
				
			}
		}
		return logindata;
	}
}
