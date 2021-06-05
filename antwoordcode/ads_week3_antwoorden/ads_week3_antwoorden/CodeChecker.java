package ads_week3_antwoorden;

import java.util.ArrayDeque;

public class CodeChecker {
    public static void main(String[] args) {
        String inputString = "public static void main(String[] args) {  " + 
            " Vogelbekdier[] vogelbekdieren = getVogelbekdieren(); " +
            "" +
            "ArrayDeque<Vogelbekdier> arrayDeque = new ArrayDeque<>();" +
            "for (Vogelbekdier vogelbekdier : vogelbekdieren) {" + 
            "    arrayDeque.addFirst(vogelbekdier);" + 
            "}" + 
            "System.out.println('Vooraan de rij: ' + arrayDeque.getFirst());" +
            "System.out.println('Achteraan de rij: ' + arrayDeque.getLast()); }";
    

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (Character c : inputString.toCharArray()) {
            if (c == '{' || c == '[' || c == '(')
                stack.addFirst(c);

            if (c == '}' || c == ']' || c == ')') {
                Character popChar = stack.removeFirst();
                // Bekijk of de laatste haakje in de Stack een matchend haakje is.
                if ((popChar == '{' && c == '}') || 
                    (popChar == '(' && c == ')') || 
                    (popChar == '[' && c == ']'))
                    ;
                else {
                    System.out.println("Error, wrong haakje");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Correct code!");
        }
        else {
            System.out.println("Error, wrong haakje");
        }
    
    }
}
