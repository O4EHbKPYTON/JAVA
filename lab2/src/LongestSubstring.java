/*1. Задача: Найти наибольшую подстроку без повторяющихся символов.
 Условие: Напишите метод, который принимает строку и возвращает наибольшую подстроку, в
которой все символы уникальны*/

public class LongestSubstring {

    public static String lengthOfLongestSubstring(String s) {
        int[] index = new int[128]; //stores the index of each character in the string

        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            start = Math.max(start, index[s.charAt(end)]);
            maxLength = Math.max(maxLength, end - start + 1);
            index[s.charAt(end)] = end + 1;
        }
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcdefghabcdefg";
        String result = lengthOfLongestSubstring(input);
        System.out.println("Наибольшая подстрока без повторяющихся симоволов : " + result);
    }
}