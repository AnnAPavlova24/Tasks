package com.company;

import java.util.HashMap;

public class Task33 {
    public static HashMap<Character, Integer> getStatistics(String text) {
        var upperCase = text.toUpperCase();
        var chars = upperCase.toCharArray();
        var charMap = new HashMap<Character, Integer>();
        // Пробежимся по chars

        for (char ch : chars) {
            if (Character.isLetter(ch)) {
//                обновляем значения по ключу
                charMap.compute(ch, (key, count) -> count == null ? 1 : ++count);
            }
        }
        return charMap;
    }

    public static void main(String[] args) {
        String text = "Старик рыбачил один  на своей  лодке в Гольфстриме. Вот уже восемьдесят\n" +
                "четыре дня  он ходил  в  море и не поймал ни одной рыбы. Первые сорок дней с\n" +
                "ним был мальчик.  Но день за  днем не  приносил  улова,  и  родители сказали\n" +
                "мальчику, что старик теперь уже явно";
        var charMap = getStatistics(text);

        charMap.forEach((key, value) -> System.out.println("Буква " + key +
                " встречалась " + value + " раз"));
    }
}
