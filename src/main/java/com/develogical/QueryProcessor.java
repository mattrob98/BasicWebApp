package com.develogical;

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
        return "";
    }
}
