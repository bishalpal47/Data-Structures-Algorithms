package mathematical;

import java.util.Scanner;

public class TableUpto10 {
    public static void main(String[] args) {
        Scanner myObject = new Scanner(System.in);
        // You can use BufferedReader for taking the input. There won't be any problems. Just import the
        // appropriate classes properly.
        System.out.print("Enter the number whose table you want to see : ");
        int a = myObject.nextInt();
        myObject.close();

        System.out.println("Table of the number " + a + " up to 10 is as follows : ");
        for(int i = 1; i <= 10; i++) {
            int calculation = a * i;
            System.out.println(a + " X " + i + " = " + calculation);
        }
    }
}
/*
*       OUTPUT

Enter the number whose table you want to see : 26
Table of the number 26 up to 10 is as follows :
26 X 1 = 26
26 X 2 = 52
26 X 3 = 78
26 X 4 = 104
26 X 5 = 130
26 X 6 = 156
26 X 7 = 182
26 X 8 = 208
26 X 9 = 234
26 X 10 = 260

* */