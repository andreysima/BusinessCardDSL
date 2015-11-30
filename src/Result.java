import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by Andrey on 30-Nov-15.
 */
public class Result {

    private String htmlFile;

    Result(){

    }

    private void createResultFolder(){
        new File("../result/").mkdir();
    }

    private void copyTemplate() throws IOException {
        File source = new File("../output_template/assets");
        File dest = new File("../result/assets");
        FileUtils.copyDirectory(source, dest);
    }

    private void createHtmlFile() throws IOException {
        FileWriter fw = new FileWriter("../result/index.html");
        fw.write(htmlFile);
        fw.close();
    }

    public void makeResult(String output) throws IOException {
        htmlFile = output;
        createResultFolder();
        copyTemplate();
        createHtmlFile();
    }
}
