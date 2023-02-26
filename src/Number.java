import java.util.Random;

public class Number {
    public static void main(String[] args) {

        Random rnd = new Random();
        int number = rnd.nextInt(30);

        if ((number < 20) || (number >= 10)) {
            System.out.println(number + "は10以上または20未満の値です");
        }

        if ((number < 20) && (number >= 10)) {
            System.out.println(number + "は10以上かつ20未満の値です");
        }

        if (!(number >= 20)) {
            System.out.println(number + "は20以上の値ではありません");
        }
    }
}
