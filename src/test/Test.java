package test;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class Test {
    final static String FILE_NAME = "sample.csv";
    static List<String> dataSet = new ArrayList();
    public static void main(String[] args) {
        readCSVFile(FILE_NAME);
        writeToDataBase();
    }

    private static void readCSVFile(String fileName) {
        try {
            BufferedReader reader =  Files.newBufferedReader(Paths.get(fileName));
           if(reader != null){
               String line;
              // String line = reader.readLine();
               while((line = reader.readLine()) != null && !line.isEmpty())
                   parseCSV(line);
           }
        }catch (Exception ex){
            System.out.println(ex.getLocalizedMessage());
        }
    }

    private static void parseCSV(String line) {
            // suppose csv is seperated by ,
            String[] fields = line.split(",");
            for (String field: fields){
                System.out.println(field);
                dataSet.add(field);
            }
    }

    private static void writeToDataBase() {
        Connection con = ConnectionUtil.getConnection();
        try {
            con.createStatement();
            String sql = "";

        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
        finally {

        }
    }

}
