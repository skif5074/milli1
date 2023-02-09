import java.util.Scanner;
// Объявляете переменные для входных данных и
// параметров программы: одну для хранения
// стоимости билета, другую для хранения количества
// рублей для одной бонусной мили

// Рассчитываете количество бонусных миль, используя
// значения заведённых переменных. Ответ сохраняете в
// новую переменную и выводите на экран


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float cashback;
        double calc_cb;

        System.out.print("Enter cost bilet:");
        int cost = input.nextInt();
        System.out.println("Cost bilet:" + cost);

        // closing the scanner object

        input.close();
        calc_cb = Math.round((cost/20));

        System.out.println("Your cashback:" + calc_cb);



    }
}