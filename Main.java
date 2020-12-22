import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File fl = new File("input.txt");
        System.out.println("Имя файла:" + fl.getName());
        System.out.println("Путь:" + fl.getPath());
        System.out.println("Полный путь:" + fl.getAbsolutePath());
        System.out.println("Родительский каталог:" + fl.getParent());
        System.out.println(fl.exists() ? "существует" : "не существует");
        System.out.println(fl.canWrite() ? "можно записывать" : "нельзя записывать");
        System.out.println(fl.canRead() ? "можно читать" : "нельзя читать");
        System.out.println("is" + ("Каталог? " + (fl.isDirectory() ? "да" : "нет")));
        System.out.println(fl.isFile() ? "обычный файл" : "не обычный файл");
        System.out.println("Последняя модификация файла:" + fl.lastModified());
        System.out.println("Размер файла:" + fl.length() + " Bytes");

//ввод и запись в файл
        try {
            File n = new File("output.txt");
            PrintWriter writer = new PrintWriter(new FileWriter(n));
            writer.println(fl.getAbsolutePath());
            int a[] = new int[100];
            for (int i = 0; i < a.length; i++) {
                a[i] = (int) (Math.random() * 100);
                writer.print(a[i] + " ");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
        String s = "";
        try {
            File input = new File("input.txt");

            Scanner scanner = new Scanner(input);
            while (scanner.hasNext()) {
                s = scanner.next();
            }
            System.out.println(""+Integer.parseInt(s)/3);
            scanner.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
