package aufgaben.strings;

public class Strings {

    public static void main(String[] args) {






        String name = "Zero";
        String name2 = "  Ze   r o ";

        System.out.println(STR."string.equals(\"Zero\") = \{name.equals("Zero")}");                                     //equals() compares two strings
        System.out.println(STR."string.length() = \{name.length()}");                                                   //length() returns the length of the string
        System.out.println(STR."string.toUpperCase() = \{name.toUpperCase()}");                                         //toUpperCase() returns the string in upper case
        System.out.println(STR."string.toLowerCase() = \{name.toLowerCase()}");                                         //toLowerCase() returns the string in lower case
        System.out.println(STR."string.charAt(0) = \{name.charAt(0)}");                                                 //charAt() returns the character at the specified index
        System.out.println(STR."string.indexOf(\"E\") = \{name.indexOf("E")}");                                         //indexOf() returns the index of the first occurrence of the specified character in the string, or -1 if it is not present
        System.out.println(STR."string.indexOf(\"E\") = \{name.toUpperCase().indexOf("E")}");
        System.out.println(STR."string.isEmpty() = \{name.isEmpty()}");                                                 //isEmpty() returns true if the string is empty
        System.out.println(STR."string.trim() = \{name2.trim()}");                                                      //trim() removes leading and trailing whitespace
        System.out.println(STR."string.concat(\"Hello\") = \{name.concat(" Hello")}");                              //concat() combines two strings
        System.out.println(STR."string.replace(\"o\", \"0\") = \{name.replace("o", "0")}");           //replace() replaces all occurrences of a character in a string with another character

    }

}
