package ua.tarasov.hw10;

public class Main {

    public static void main(String[] args) {

        Report report = Report.builder().header("Header").body("Body").build();
        Report report1 = report.toBuilder().footer("Footer").build();
        System.out.print("");

        Pow exp = (int number, int pow) -> {
            int result;
            if (pow != 0) {
                result = number;
            } else {
                result = 1;
            }
            for (int i = 1; i < pow; i++) {
                result *= number;
            }
            return result;
        };

        System.out.println(exp.exponentiation(5, 2));

    }
}


