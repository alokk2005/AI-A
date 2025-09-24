package Unit3;

import java.io.FileReader;

import java.io.IOException;
import java.util.Properties;

public class file1 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("C:\\Users\\itsal\\IdeaProjects\\AI-A\\src\\Unit3\\dp.properties");
        Properties p=new Properties();
        p.load(fr);

        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));
        System.out.println(p.getProperty("admin"));
    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }
}
