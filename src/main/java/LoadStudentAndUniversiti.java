import Model.Student;
import Model.University;
import Enum.StudyProfile;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LoadStudentAndUniversiti {

    private static List<University> universityList = new ArrayList<University>();
    private static List<Student> studentList = new ArrayList<Student>();

    private LoadStudentAndUniversiti() {
    }

    public static List<Student> LoadStudent() {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("C:\\Users\\Роман\\Desktop\\учеба\\university\\src\\main\\resources\\universityInfo.xlsx"));
            XSSFSheet sheet = workbook.getSheet("Студенты");
            Iterator iterator = sheet.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                Row row = (Row) iterator.next();
                Student student = new Student(row.getCell(1).getStringCellValue(), row.getCell(0).getStringCellValue(), (int) row.getCell(2).getNumericCellValue(), row.getCell(3).getNumericCellValue());
                studentList.add(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Нет базы");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Ошибка чтнения данных");
        }
        return studentList;
    }

    public static List<University> LoadUnuversity() {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream("C:\\Users\\Роман\\Desktop\\учеба\\university\\src\\main\\resources\\universityInfo.xlsx"));
            XSSFSheet sheet = workbook.getSheet("Университеты");
            Iterator iterator = sheet.iterator();
            iterator.next();
            while (iterator.hasNext()) {
                Row row = (Row) iterator.next();
                StudyProfile studyProfile = StudyProfile.valueOf(row.getCell(4).getStringCellValue());
                //System.out.println(studyProfile);
                University university = new University(row.getCell(0).getStringCellValue(), row.getCell(1).getStringCellValue(), row.getCell(2).getStringCellValue(), (int) row.getCell(3).getNumericCellValue(), studyProfile);
                universityList.add(university);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Нет базы");
        } catch (IOException e) {

        }
        return universityList;
    }
}
