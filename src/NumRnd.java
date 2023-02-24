import java.util.Random;

public class NumRnd {
    public static void main(String[] args) {
        System.out.println("ランダムな数字の偶数と奇数を10回判定します。");

        Random rnd = new Random();



        for (int i = 0; i < 10; i++) {

            int value = rnd.nextInt(200) + 1;

            System.out.println(value + "は");
            if (value % 2 == 0){
                System.out.println("偶数です。");
            } else {
                System.out.println("奇数です。");
            }

        }

    }
}
