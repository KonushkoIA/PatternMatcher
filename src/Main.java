import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "+375(29)123-12-13";
        Pattern pattern = Pattern.compile("\\d{3}\\(\\d{2}\\)\\d{3}-\\d{2}-\\d{2}");
        Matcher matcher = pattern.matcher(text);
        boolean flag = matcher.find();
        System.out.println(flag);

        String text1 = "vano29670@mail.ru";
        Pattern pattern1 = Pattern.compile(".+@.+\\..+");
        Matcher matcher1 = pattern1.matcher(text1);
        boolean flag1 = matcher1.find();
        System.out.println(flag1);
        System.out.println("----------------------------------------");

        String text3 = "Сегодня хороший день? Завтра ждёт успех! Выходные мир дружба жвачка.";
        String [] sentence = text3.split("([.,!?])");
        for (String word: sentence) {
            String word1 = word.trim();
            Pattern pattern3 = Pattern.compile("^[а-яА-Я]+\\s");
            Matcher matcher3 = pattern3.matcher(word1);
            while (matcher3.find()) {
                System.out.println(matcher3.group());
            }
        }

        for (String word: sentence) {
            Pattern pattern4 = Pattern.compile("[а-яА-Я]+$");
            Matcher matcher4 = pattern4.matcher(word);
            while (matcher4.find()) {
                System.out.println(matcher4.group());
            }
        }
    }
}
