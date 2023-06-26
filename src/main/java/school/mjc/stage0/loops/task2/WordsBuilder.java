package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public static void buildPhrase(char... chars) {
        int i = 0;
        while (i < chars.length) {
            System.out.print(chars[i]);
            i++;
        }
//        System.out.println("loops are cool");
    }

    public static void main(String[] args) {
        buildPhrase('l', 'o', 'o', 'p', 's', ' ', 'a', 'r', 'e', ' ', 'c', 'o', 'o', 'l');
    }
}


