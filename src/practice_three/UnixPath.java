package practice_three;

import java.util.LinkedList;

/**
 * Дано повний шлях до файла в Unix системі.
 * Наприклад /home/../var/./lib//file.txt
 * Необхідно повернути спрощений варіант. (/var/lib/file.txt)
 */
public class UnixPath {
    public String simplify(String input) {
        if (input == null || input.length() == 0) return "/";

        LinkedList<String> list = new LinkedList<>();
        String[] splits = input.trim().trim().split("/");
        for (String s : splits) {
            if (s == null || s.length() == 0 || s.equals(".")) continue;
            else if (s.equals("..")) {
                if (list.size() > 0) list.pop();
            } else {
                list.push(s);
            }
        }
        if (list.isEmpty()) return "/";
        StringBuffer stringBuffer = new StringBuffer();
        while (!list.isEmpty()) {
            stringBuffer.insert(0, list.pop());
            stringBuffer.insert(0, "/");
        }
        return stringBuffer.toString();
    }
}

