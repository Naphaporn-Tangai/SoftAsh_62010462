package creational;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException{

        BookMetadataExporter exporter = new JSONBookMetadataExporter();
        exporter.add(TestData.sailboatBook);
        exporter.add(TestData.GoFBook);
        exporter.add(TestData.dragonBook);
        exporter.add(TestData.dinosaurBook);
        exporter.export(System.out);
    }
}
