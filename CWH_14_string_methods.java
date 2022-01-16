package com.company;

public class CWH_14_string_methods {
    public static void main(String[] args) {
        String name = "Pratham";
        System.out.println(name);

        //length() method
        //int value = name.length();
        //System.out.println(value);

        //lowercase method and Uppercase method
        //String lstring = name.toLowerCase();
        //System.out.println(lstring);
        //String ustring = name.toUpperCase();
        //System.out.println(ustring);

        //trim() method
        //String nonTrimmedString = "    Pratham    ";
        //System.out.println(nonTrimmedString);
        //String TrimmedString = nonTrimmedString.trim();
        //System.out.println(TrimmedString);

        //substring() method
        //System.out.println(name.substring(2));//Here from index 2 it prints till end
        //System.out.println(name.substring(2,5));//Here from index 2 it prints till 4 and exclude 5

        //replace() method
        //System.out.println(name.replace('a','o'));
        //System.out.println(name.replace("m", "m Shinde"));

        //startswith() method
        //System.out.println(name.startsWith("Pra"));

        //endswith() method
        //System.out.println(name.endsWith("ma"));

        //charAt() method
        //System.out.println(name.charAt(3));

        //indexOf() method
        //String modifiedName = "prathamam";
        //System.out.println(modifiedName.indexOf("a"));
        //System.out.println(modifiedName.indexOf("a",4));
        //System.out.println(modifiedName.lastIndexOf("ma"));
        //System.out.println(modifiedName.lastIndexOf("ma",8));

        //equals() method and equalsIgnoreCase() method
        //System.out.println(name.equals("Pratham"));
        //System.out.println(name.equalsIgnoreCase("prAtham")); // removes Case sensitivity

        //Escape sequence character
        System.out.println("I am Escape sequence \"double quote\" ");
        System.out.println("I am Escape sequence \\Back slash\\ ");
        System.out.println("I am Escape sequence \'Single quote\' ");
        System.out.println("I am Escape sequence \nNew Line ");
        System.out.println("I am Escape sequence \ttab ");
        System.out.println("I am Escape sequence \ftab ");
    }
}
