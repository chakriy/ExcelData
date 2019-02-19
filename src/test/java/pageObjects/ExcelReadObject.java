package pageObjects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;

import static stepDefs.Hooks.cfr;
import static stepDefs.Hooks.myDriver;

public class ExcelReadObject
{
    HashMap<String,String> hm = new HashMap<String, String>();
    FacebookLoginPage flp =new FacebookLoginPage();



       public void ExcelReadObject() throws Exception
       {
           File src = new File(cfr.getExcelPath());
           FileInputStream fis = new FileInputStream(src);
           XSSFWorkbook wb = null;
           wb = new XSSFWorkbook(fis);
           int sheets = wb.getNumberOfSheets();
           for (int i = 0; i < sheets; i++) {
               if (wb.getSheetName(i).equalsIgnoreCase("testdata")) {
                   XSSFSheet sheet = wb.getSheetAt(i);
                   Iterator<Row> rows = sheet.iterator();
                   Row firstRow = rows.next();
                   Iterator<Cell> c = firstRow.cellIterator();
                   int k = 0, column = 0;
                   while (c.hasNext()) {

                       if (c.next().getStringCellValue().equalsIgnoreCase("EmailId")) {
                           column = k;
                       }
                       k++;
                   }
                   while (rows.hasNext()) {
                       Row r = rows.next();
                       String S1 = "", S2 = "";
                       S1 = r.getCell(column).getStringCellValue();
                       Iterator<Cell> c1 = r.cellIterator();
                       while (c1.hasNext()) {

                           S2 = c1.next().getStringCellValue();
                       }
                       System.out.println(S1 + "  " + S2);
                       hm.put(S1, S2);
                   }


               }
           }
           hashSend(hm);

       }




    public void ExcelReadObject(String FileName,String SheetName,String UserName) throws Exception
        {
            ArrayList<String> uid = new ArrayList<String>();
            File file = new File(cfr.getFilePath() + "\\" + FileName);
            FileInputStream fis = new FileInputStream(cfr.getExcelPath());
            XSSFWorkbook workBook = new XSSFWorkbook(fis);
            int sheets = workBook.getNumberOfSheets();
            for (int i = 0; i < sheets; i++)
            {
                if (workBook.getSheetName(i).equalsIgnoreCase(SheetName))
                {
                    XSSFSheet sheet = workBook.getSheetAt(i);
                    Iterator<Row> rows = sheet.iterator();
                    Row firstRow = rows.next();
                    Iterator<Cell> c = firstRow.cellIterator();
                    int k = 0, column = 0;
                    while (c.hasNext())
                    {

                        if (c.next().getStringCellValue().equalsIgnoreCase("Users"))
                        {
                            column = k;
                        }
                        k++;
                    }
                    while (rows.hasNext())
                    {
                        Row r = rows.next();
                        if (r.getCell(column).getStringCellValue().equalsIgnoreCase(UserName))
                        {
                            int z =0;
                            Iterator<Cell> c1 = r.cellIterator();

                            while (c1.hasNext())
                            {
                               uid.add(c1.next().getStringCellValue());
                            }
                        }

                    }
                }



            }
            flp.initWebDriver();
            flp.isSeen(uid.get(1),uid.get(2));
            flp.Click();
        }
    public void ExcelReadObject(String SheetName,String UserName) throws Exception
    {
        ArrayList<String> uid = new ArrayList<String>();
       // File file = new File(cfr.getFilePath() + "\\" + FileName);
        FileInputStream fis = new FileInputStream(cfr.getExcelPath());
        XSSFWorkbook workBook = new XSSFWorkbook(fis);
        int sheets = workBook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++)
        {
            if (workBook.getSheetName(i).equalsIgnoreCase(SheetName))
            {
                XSSFSheet sheet = workBook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> c = firstRow.cellIterator();
                int k = 0, column = 0;
                while (c.hasNext())
                {

                    if (c.next().getStringCellValue().equalsIgnoreCase("Users"))
                    {
                        column = k;
                    }
                    k++;
                }
                while (rows.hasNext())
                {
                    Row r = rows.next();
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase(UserName))
                    {
                        int z =0;
                        Iterator<Cell> c1 = r.cellIterator();

                        while (c1.hasNext())
                        {
                            uid.add(c1.next().getStringCellValue());
                        }
                    }

                }
            }



        }
        flp.initWebDriver();
        flp.isSeen(uid.get(1),uid.get(2));
        flp.Click();
    }
    public void ExcelReadObject(String UserName) throws Exception
    {
        ArrayList<String> uid = new ArrayList<String>();
        //File file = new File(cfr.getFilePath() + "\\" + FileName);
        FileInputStream fis = new FileInputStream(cfr.getExcelPath());
        XSSFWorkbook workBook = new XSSFWorkbook(fis);
        int sheets = workBook.getNumberOfSheets();
        for (int i = 0; i < sheets; i++)
        {
            if (workBook.getSheetName(i).equalsIgnoreCase("testdata"))
            {
                XSSFSheet sheet = workBook.getSheetAt(i);
                Iterator<Row> rows = sheet.iterator();
                Row firstRow = rows.next();
                Iterator<Cell> c = firstRow.cellIterator();
                int k = 0, column = 0;
                while (c.hasNext())
                {

                    if (c.next().getStringCellValue().equalsIgnoreCase("Users"))
                    {
                        column = k;
                    }
                    k++;
                }
                while (rows.hasNext())
                {
                    Row r = rows.next();
                    if (r.getCell(column).getStringCellValue().equalsIgnoreCase(UserName))
                    {
                        int z =0;
                        Iterator<Cell> c1 = r.cellIterator();

                        while (c1.hasNext())
                        {
                            uid.add(c1.next().getStringCellValue());
                        }
                    }

                }
            }



        }flp.initWebDriver();
        flp.isSeen(uid.get(1),uid.get(2));
        flp.Click();
    }
    public void hashSend(HashMap<String,String> hm ) throws InterruptedException {
        System.out.println("hm values are "+hm);

        Set s = hm.entrySet();
        Iterator i = s.iterator();


        while(i.hasNext())
        {

                flp.initWebDriver();
                Map.Entry mp = (Map.Entry) i.next();
                flp.enterEmailInput((String) mp.getKey());
                System.out.println("UserName is " + mp.getKey());
                flp.enterPwd((String) mp.getValue());
                System.out.println("passWord is " + mp.getValue());
                flp.Click();

        }

    }

}