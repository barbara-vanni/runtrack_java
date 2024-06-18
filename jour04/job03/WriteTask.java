package jour04.job03;

import java.io.FileWriter;
import java.io.IOException;

class WriteTask implements Runnable {
    private final String data;
    private final int start;
    private final int end;

    WriteTask(String data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        synchronized (WriteTask.class) {
            try (FileWriter writer = new FileWriter("output.txt", true)) {
                writer.write(data.substring(start, end));
            } catch (IOException e) {
                System.out.println("Une erreur s'est produite lors de l'écriture du fichier.");
                e.printStackTrace();
            }
        }
    }
}
