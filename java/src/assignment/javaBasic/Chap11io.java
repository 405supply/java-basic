package assignment.javaBasic;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Chap11io {
    public Scanner scanner = new Scanner(System.in);
    public void level01BasicOne() {
        System.out.print("파일 이름을 입력하세요: ");
        String FileName = scanner.next();
        try (FileReader fr = new FileReader(FileName)) {
            int value;
            while ((value = fr.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void level01BasicTwo() {
        System.out.print("복사할 원본 파일 이름 입력: ");
        String originFileName = scanner.next();
        System.out.print("복사된 결과물 파일 이름 입력: ");
        String duplicateFileName = scanner.next();

        try (FileReader fr = new FileReader(originFileName)) {
            FileOutputStream fileOutputStream = new FileOutputStream(duplicateFileName);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
            BufferedWriter writer = new BufferedWriter(outputStreamWriter);

            char[] carr = new char[(int) new File(originFileName).length()];
            fr.read(carr);

            writer.write(carr);
            writer.flush();

            System.out.println("파일 복사 완료");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void level02NormalOne() {
        System.out.print("병합할 파일 개수 입력: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 파일 이름 입력: ");
            String fileName = scanner.next();

            try (FileReader fr = new FileReader(fileName)) {
                FileOutputStream fileOutputStream = new FileOutputStream("duplicate.txt", true);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
                BufferedWriter writer = new BufferedWriter(outputStreamWriter);

                char[] carr = new char[(int) new File(fileName).length()];
                fr.read(carr);

                writer.write(carr);
                writer.flush();

                System.out.println("파일" + (i+1) + " 복사 완료");

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
