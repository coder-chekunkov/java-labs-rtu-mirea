package Lab_6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AutoSaveLog implements Runnable{
    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {
            try (FileWriter logWriter = new FileWriter("log.txt");
                 BufferedWriter bufferedWriter = new BufferedWriter(logWriter)
            ) {
                ArrayList<String> logBuffer = Log.getLogHistory();
                for (String s : logBuffer) {
                    s += "\n";
                    bufferedWriter.write(s);
                    System.out.println(s);
                }
                logBuffer.clear();
                TimeUnit.SECONDS.sleep(5);

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }



    }
}
