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

11)https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
---
  import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String reversed = new StringBuilder(s).reverse().toString();

        if (s.equals(reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}


12)https://www.hackerrank.com/challenges/java-string-tokens/problem?isFullScreen=true
----
 import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        // Trim leading/trailing spaces
        s = s.trim();

        // Split on non-alphabetic characters
        String[] tokens = s.isEmpty() ? new String[0] : s.split("[^A-Za-z]+");

        // Print the number of tokens
        System.out.println(tokens.length);

        // Print each token
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}

13)https://www.hackerrank.com/challenges/pattern-syntax-checker/problem?isFullScreen=true
----
 import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        while (t-- > 0) {
            String pattern = sc.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }

        sc.close();
    }
}


14)https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
----
  class MyRegex {
    String pattern =
        "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}


15)https://www.hackerrank.com/challenges/tag-content-extractor/problem?isFullScreen=true
-----
  import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine()); // number of lines

        while (n-- > 0) {
            String line = in.nextLine();

            // Regex to match <tag>content</tag>
            // Group 1: tag name, Group 2: content
            Pattern p = Pattern.compile("<(.+?)>([^<>]+)</\\1>");
            Matcher m = p.matcher(line);

            boolean found = false;

            while (m.find()) {
                System.out.println(m.group(2));
                found = true;
            }

            if (!found) {
                System.out.println("None");
            }
        }

        in.close();
    }
}


16)https://www.hackerrank.com/challenges/java-primality-test/problem?isFullScreen=true
----
  import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        // Create a BigInteger from the input string
        BigInteger n = new BigInteger(input);

        // isProbablePrime(certainty) returns true if n is probably prime
        // Using certainty = 10 is usually sufficient
        if (n.isProbablePrime(10)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}


17)https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
----
  import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the two large numbers as strings
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());

        sc.close();

        // Add the two numbers
        BigInteger sum = a.add(b);

        // Multiply the two numbers
        BigInteger product = a.multiply(b);

        // Print results
        System.out.println(sum);
        System.out.println(product);
    }
}

18)https://www.hackerrank.com/challenges/java-2d-array/problem?isFullScreen=true
----
 import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[6][6];

        // Read the 6x6 array
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        int maxSum = Integer.MIN_VALUE; // smallest possible value

        // Loop over possible hourglass centers
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]  // top row
                        + arr[i+1][j+1]                            // middle
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]; // bottom row
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        System.out.println(maxSum);
    }
}


19)https://www.hackerrank.com/challenges/java-arraylist/problem?isFullScreen=true
---
  import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of lines
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Read n lines of integers
        for (int i = 0; i < n; i++) {
            int d = sc.nextInt(); // number of integers in this line
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            list.add(row);
        }

        int q = sc.nextInt(); // number of queries

        // Process queries
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt(); // line number
            int y = sc.nextInt(); // position in line

            // Check bounds
            if (x <= 0 || x > list.size()) {
                System.out.println("ERROR!");
                continue;
            }
            ArrayList<Integer> row = list.get(x - 1);
            if (y <= 0 || y > row.size()) {
                System.out.println("ERROR!");
            } else {
                System.out.println(row.get(y - 1));
            }
        }

        sc.close();
    }
}


20)https://www.hackerrank.com/challenges/phone-book/problem?isFullScreen=true
----
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of entries
        sc.nextLine(); // consume the leftover newline

        Map<String, String> phoneBook = new HashMap<>();

        // Read phone book entries
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String number = sc.nextLine();
            phoneBook.put(name, number);
        }

        // Process queries until EOF
        while (sc.hasNextLine()) {
            String query = sc.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + "=" + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        sc.close();
    }
}
  
