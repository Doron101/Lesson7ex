import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class logSingleton  {
    private static logSingleton logFile = null;

    private logSingleton() { }

    public static logSingleton getlogFile() throws Exception{
        if (logFile == null) {
            logFile = new logSingleton();
            // Open the file
            String line = " ";
            Files.write(Paths.get("log.txt"),line.getBytes());
        }

        return logFile;
    }

    public static void writetoFile(String cur_line) throws Exception{
        Files.write(Paths.get("log.txt"),cur_line.getBytes(), StandardOpenOption.APPEND);

    }
}
