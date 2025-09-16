import java.util.*;

public class Chap13Collections {
    public void level01BasicOne() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.print("학생 성적: ");
        arrayList.add(scanner.nextInt());
        System.out.print("추가 입력시 y 입력: ");

        char cursor;
        while ((cursor = scanner.next().charAt(0)) == 'y') {
            System.out.print("학생 성적: ");
            arrayList.add(scanner.nextInt());
            System.out.print("추가 입력시 y 입력: ");
        }

        int sum = 0;
        for (Integer i : arrayList) {
            sum += i;
        }

        System.out.println("평균 점수: " + (double) sum / arrayList.size());

    }

    public void level01BasicTwo() {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        String url;

        while (true) {
            System.out.print("Input URL or exit to terminate >> ");
            url = scanner.next();

            if (url.equalsIgnoreCase("exit")) break;

            queue.add(url);
            if (queue.size() > 5) {
                queue.poll();
            }

            System.out.print("Recently visited website: ");
            for (var str : queue.toArray()) {
                System.out.print("[" + str + "] ");
            }
            System.out.println();
        }
    }

    public void level01BasicThree() {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();

        String str;

        while (true) {
            System.out.print("Input waiting customer (next/exit) >>");
            str = scanner.next();

            if (str.equalsIgnoreCase("exit")) break;

            if (str.equalsIgnoreCase("next")) {
                if (queue.isEmpty()) continue;
                else {
                    System.out.println("Pending: " + queue.poll());
                    continue;
                }
            }

            queue.add(str);
            System.out.println(str + " has been added");
        }
    }

    public void level01BasicFour() {
        Scanner scanner = new Scanner(System.in);
        Set<String> set = new HashSet<>();

        String str;

        while (true) {
            System.out.print("Input student ID (exit to terminate) >> ");
            str = scanner.next();

            if (str.equalsIgnoreCase("exit")) break;

            if (set.contains(str)) {
                System.out.println(str + " has already been registered");
                continue;
            }

            set.add(str);
        }

        System.out.print("All students ID: ");
        for(var s : set.toArray()) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void level01BasicFive() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();

        String str;

        while (true) {
            System.out.print("Input word (exit to terminate) >> ");
            str = scanner.next();

            if (str.equalsIgnoreCase("exit")) break;

            arr.add(str);
        }

        Collections.sort(arr);

        for (var s : arr) {
            System.out.print(s + " ");
        }
    }

    public void level01BasicSix() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> book = new HashMap<>();
        String str, name, phone;

        while (true) {
            System.out.println("Input name and phone number separated by blank");
            System.out.println("search to enter search mode, exit to terminate");
            System.out.print(">> ");
            str = scanner.nextLine();

            if (str.equalsIgnoreCase("exit")) break;
            else if (str.equalsIgnoreCase("search")) {
                while (true) {
                    System.out.print("input name to search, exit to terminate >> ");
                    str = scanner.next();
                    if (str.equalsIgnoreCase("exit")) break;

                    if ((book.get(str)) != null) {
                        System.out.println(book.get(str));
                    }
                    else {
                        System.out.println("No such person");
                    }
                }
            }
            if (str.equalsIgnoreCase("exit")) continue;

            String[] parsed = str.split(" ");

            if (parsed.length != 2) {
                System.out.println("Wrong input. Try again.");
                continue;
            }
            name = parsed[0];
            phone = parsed[1];

            book.put(name, phone);
        }
    }
}
