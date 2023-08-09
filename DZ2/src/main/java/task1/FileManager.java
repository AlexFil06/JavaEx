package task1;

import java.io.*;

public class FileManager {
    public String read(String filePath) throws  IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
                content.append(System.lineSeparator());
            }
        }catch (IOException e) {
            System.out.println("Не удалось прочитать файл");
        }
        return content.toString();
    }

    public void write(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }catch (IOException е){
            System.out.println("Не удалось записать файл");
        }
    }

    public void copy(String sourcePath, String destinationPath) throws IOException {
        try (InputStream in = new FileInputStream(sourcePath);
             OutputStream out = new FileOutputStream(destinationPath)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }catch (IOException е){
            System.out.println("Не удалось скопировать файл");
        }
    }
}
