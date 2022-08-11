package Util;

import Model.Info;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonWrite {

    private static final Logger logger = Logger.getLogger(JsonWrite.class.getName());

    private JsonWrite() {
    }

    public static void writeJson(Info info) {
        try {
            Calendar calendar = info.getDateCreate();
            String name = calendar.get(Calendar.DAY_OF_MONTH) + "_" + (calendar.get(Calendar.MONTH) + 1) + "_" + calendar.get(Calendar.YEAR) + "_" +
                    calendar.get(Calendar.HOUR_OF_DAY) + "_" + calendar.get(Calendar.MINUTE) + ".json";
            name = "src/main/data/json/" + name;
            File file = new File("src/main/data/json");
            file.mkdirs();
            File fileName = new File(name);
            fileName.createNewFile();
            List<String> result = JsonConvert.javaToJson(info.getStudentList());
            result.addAll(JsonConvert.javaToJson(info.getUniversityList()));
            result.addAll(JsonConvert.javaToJson(info.getStatisticsList()));
            Files.write(Paths.get(String.valueOf(fileName)), result);
            logger.setLevel(Level.FINE);
            logger.log(Level.FINE, "Json файл записан");
        } catch (IOException e) {
            logger.log(Level.WARNING, "Ошибка записи", e);
        } catch (Exception e) {
            logger.log(Level.WARNING, "Ошибка параметра сериализации", e);
        }

    }
}
