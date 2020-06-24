package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        String s = query.toLowerCase();
        if (s.contains("romeo and juliet")) {
            return "William Shakespeare";
        }

        return "I don't know";
    }
}
