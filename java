1)https://www.hackerrank.com/challenges/welcome-to-java/problem?isFullScreen=true
----
  
public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");


    }
}


2)https://www.hackerrank.com/challenges/java-stdin-and-stdout-1/problem?isFullScreen=true
----
 import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read integers until there is no more input
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println(num);
        }

        sc.close();
    }
}

3)https://www.hackerrank.com/challenges/java-if-else/problem?isFullScreen=true
---
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
    }
}

4)https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true
---
 import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // consume the leftover newline
        String s = scan.nextLine();

        scan.close();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}

5)https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
---
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String s = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }

        System.out.println("================================");
        sc.close();
    }
}

6)https://www.hackerrank.com/challenges/java-loops-i/problem?isFullScreen=true
----
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }
}

7)https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
----
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();  // number of queries

        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += Math.pow(2, j) * b;
                System.out.print(sum + (j < n - 1 ? " " : ""));
            }
            System.out.println();
        }

        sc.close();
    }
}

8)https://www.hackerrank.com/challenges/java-end-of-file/problem?isFullScreen=true
----
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 1; // start numbering from 1

        while (sc.hasNextLine()) { // read until EOF
            String line = sc.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }

        sc.close();
    }
}

9)https://www.hackerrank.com/challenges/java-currency-formatter/problem?isFullScreen=true
----
  import java.util.*;
import java.text.*;


        
    import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment = sc.nextDouble();
        sc.close();

        // US Locale
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        // India Locale (custom)
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

        // China Locale
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        // France Locale
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}

    
10)https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
----
  import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        sc.close();

        // 1. Sum of lengths
        System.out.println(A.length() + B.length());

        // 2. Lexicographical comparison
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Capitalize first letters
        String capA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(capA + " " + capB);
    }
}

