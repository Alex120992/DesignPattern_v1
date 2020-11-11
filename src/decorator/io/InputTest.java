package decorator.io;

import java.io.*;
/*Архитектура Ввод-вывод  базируется на паттерне - декораторе*/
public class InputTest {
    public static void main(String[] args) {
        int c;
        try {
            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream("src/decorator/io/test.txt")));
            while ((c = in.read()) >= 0)
                System.out.print((char) c);
            in.close();
        } catch (IOException e) {
            System.out.println("Exception:<<<< " + e.getLocalizedMessage()+">>>>>");
        }
    }
}

