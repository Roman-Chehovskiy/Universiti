package Util;

import Model.Info;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XmlWrite {

    private static final Logger logger = Logger.getLogger(XmlWrite.class.getName());

    private XmlWrite() {
    }

    public static void XmlWriter(Info info) {
        try {
            Calendar calendar = Calendar.getInstance();
            String name = calendar.get(Calendar.DAY_OF_MONTH) + "_" + (calendar.get(Calendar.MONTH) + 1) + "_" + calendar.get(Calendar.YEAR) + "_" +
                    calendar.get(Calendar.HOUR_OF_DAY) + "_" + calendar.get(Calendar.MINUTE) + ".xml";
            name = "src/main/data/xml/" + name;
            File file = new File("src/main/data/xml");
            file.mkdirs();
            File fileName = new File(name);
            fileName.createNewFile();

            JAXBContext context = JAXBContext.newInstance(Info.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(info, fileName);
            logger.setLevel(Level.FINE);
            logger.log(Level.FINE, "Xml файл записан");
        } catch (JAXBException e) {
            logger.log(Level.WARNING, "Ошибка сериализации в Xml формат", e);
        } catch (IOException e) {
           logger.log(Level.WARNING, "Ошибка записи в файл", e);
        }

    }
}
