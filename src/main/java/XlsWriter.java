import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import Model.Statistics;

import java.util.List;

public class XlsWriter {

    private XlsWriter() {
    }

    private static XSSFWorkbook createTable(List<Statistics> statisticsList) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Statistics");

        Font font = workbook.createFont();
        font.setBold(true);
        font.setFontHeightInPoints((short) 12);
        CellStyle cellStyle = workbook.createCellStyle();
        cellStyle.setFont(font);

        int rowNum = 0;
        Row row = sheet.createRow(rowNum);
        for (int i = 0; i <= 4; i++) {
            row.createCell(i).setCellStyle(cellStyle);
        }
        row.getCell(0).setCellValue("Специализация университета");
        row.getCell(1).setCellValue("Средний бал");
        row.getCell(2).setCellValue("Количество студентов");
        row.getCell(3).setCellValue("Название университета");
        row.getCell(4).setCellValue("Количество университетов");

        for (Statistics statistics : statisticsList) {
            writeSheet(sheet, ++rowNum, statistics);
        }
        for (int i = 0; i <= 4; i++) {
            sheet.autoSizeColumn(i);
        }
        return workbook;
    }

    private static void writeSheet(XSSFSheet sheet, int rouNum, Statistics statistics) {
        Row row = sheet.createRow(rouNum);
        row.createCell(0).setCellValue(statistics.getProfileName().toString());
        row.createCell(1).setCellValue(statistics.getAverageScore());
        row.createCell(2).setCellValue(statistics.getCountStudent());
        row.createCell(3).setCellValue(statistics.getNameUniversity());
        row.createCell(4).setCellValue(statistics.getCountUniversity());
    }

    public static void writeTable(List<Statistics> statisticsList, String addres) {
        XSSFWorkbook workbook = createTable(statisticsList);
        try {
            workbook.write(new FileOutputStream(new File(addres)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
