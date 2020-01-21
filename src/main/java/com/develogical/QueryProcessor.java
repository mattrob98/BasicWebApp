package com.develogical;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("cucumber")) {
            return "benzo";
        } else if (query.toLowerCase().contains("benzo")) {
            return "is a drug, whoops";
        } else if (query.toLowerCase().contains("test1")) {
            return "This is a test";
        } else if (query.toLowerCase().contains("team name")) {
            return "Benedrome Cucaracha";
        } else if (query.toLowerCase().contains("eiffel")) {
            return "Paris";
        } else if (query.toLowerCase().contains("banana")) {
            return "Yellow";
        } else if (query.toLowerCase().contains("dr. no")) {
            return "Sean Connery";
        } else if (query.toLowerCase().contains("fib")) {
            Matcher m = p.matcher(query);

            // if an occurrence if a pattern was found in a given string...
            if (m.find()) {
                int n = Integer.valueOf(m.group());
                if (n < 2)
                    return Integer.toString(n);
                long ans = 0;
                long n1 = 0;
                long n2 = 1;
                for (n--; n > 0; n--) {
                    ans = n1 + n2;
                    n1 = n2;
                    n2 = ans;
                }
                return Integer.toString(ans);
            }
        }
        return process2(query);
    }

    public String process2(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.toLowerCase().contains("theresa may")) {
            return "2016";
        } else if (query.toLowerCase().contains("benzo")) {
            return "is a drug, whoops";
        } else if (query.toLowerCase().contains("test1")) {
            return "This is a test";
        } else if (query.toLowerCase().contains("largest")) {
            Pattern p = Pattern.compile("-?\\d+");
            Matcher m = p.matcher(query.toLowerCase());
            List<Integer> numbers = new LinkedList<>();
            while (m.find()) {
                numbers.add(Integer.parseInt(m.group()));
            }
            return Integer.toString(Collections.max(numbers));
        }
        return process3(query);
    }


    public String process3(String query) {
        final Pattern p = Pattern.compile("\\d+");


        if (query.toLowerCase().contains("what is")) {
            if (query.toLowerCase().contains("plus")){

                Matcher m = p.matcher(query);

                // if an occurrence if a pattern was found in a given string...
                if (m.find()) {
                    int first = Integer.valueOf(m.group());
                    if (m.find()) {
                        int second = Integer.valueOf(m.group());
                        return String.valueOf(first + second);

                    }
                }
            }
            else if (query.toLowerCase().contains("multipl")){

                Matcher m = p.matcher(query);

                // if an occurrence if a pattern was found in a given string...
                if (m.find()) {
                    int first = Integer.valueOf(m.group());
                    if (m.find()) {
                        int second = Integer.valueOf(m.group());
                        return String.valueOf(first * second);

                    }
                }
            }
            else if (query.toLowerCase().contains("minus")){

                Matcher m = p.matcher(query);

                // if an occurrence if a pattern was found in a given string...
                if (m.find()) {
                    int first = Integer.valueOf(m.group());
                    if (m.find()) {
                        int second = Integer.valueOf(m.group());
                        return String.valueOf(first - second);

                    }
                }
            }

        }
        else if (query.toLowerCase().contains("numbers are prime")) {
            Pattern pn = Pattern.compile("-?\\d+");
            Matcher m = pn.matcher(query.toLowerCase());
            List<Integer> result = new LinkedList<>();

            while (m.find()) {
                Integer num = Integer.parseInt(m.group());
                if (isPrime(num))
                {
                    result.add(num);
                }
            }
            return result.toString();
        }
        return "";
    }

    public static boolean isPrime(int num){
        boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
