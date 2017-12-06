import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Parse parse = new Parse();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.nextLine();
            try {
                parse.parseJson(s);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
