public class Main {
    public static void main(String[] args) {
        //1    System.out.println("Hello, Autocode!");
        MeetAStranger person = new MeetAStranger(); // создание объект
        person.name = "Diana";
        person.displayInfo();

        //циклы for
        System.out.printf("do while: \n");
        int k = 7;
        do {
            System.out.println(k);
            k--;
        }
        while (k > 0);
        System.out.printf("for:\n");
        for (int i = 1; i < 9; i++) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }
        System.out.printf("while:\n");
        int j = 6;
        while (j > 0) {

            System.out.println(j);
            j--;
        }

        //массивы
        System.out.printf("Массивы:\n");
        int[] mass = new int[]{1, 2, 3, 5};

        int[] mass2 = {1, 2, 3, 5};
        int length1 = mass.length;
        System.out.println(length1);
        for (int i : mass2) {

            System.out.println(i);
        }
        System.out.printf("Работа со строками:\n");
        String str1 = "Java";
        String str2 = "Hello";
        str2 = str2.concat(str1);
        String str3 = String.join(" ", str2, str1);
        char c = str1.charAt(2);
        System.out.println(c);
        System.out.println(str1.equals(str2));
        int index1 = str2.indexOf('l');
        String replStr1 = str2.replace('l', 'd');
        String substr1 = str2.substring(2, 4);

        System.out.println(index1);
        System.out.println(str3);
        System.out.println(str1.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println("Исключения:\n");
        try {
            int result = getFactorial(-6);

            System.out.println(result);
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("Перечисления \n");
        Day days = Day.MONDAY;
        System.out.println(days);

        System.out.println("Классы оболочки \n");
        String a = "11";
        int b = Integer.parseInt(a);
        System.out.println(b);
    }

    public static int getFactorial(int num) throws Exception {

        if (num < 1) throw new Exception("The number is less than 1");
        int result = 1;
        for (int i = 1; i <= num; i++) {

            result *= i;
        }
        return result;
    }

    enum Day {

        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

}
    //2
    class MeetAStranger {

        String name;

        void displayInfo() {
            System.out.printf("Hello, %s\n", name);
        }
    }
