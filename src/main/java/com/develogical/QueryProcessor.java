package com.develogical;

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
        }
        return process2(query);
    }

    public String process2(String query) {
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
        }
        return process3(query);
    }


    public String process3(String query) {
        final Pattern p = Pattern.compile("\\d+");


        if (query.toLowerCase().contains("what is")) {
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
        return "";
    }
}
