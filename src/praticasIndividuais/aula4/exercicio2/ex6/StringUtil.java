package praticasIndividuais.aula4.exercicio2.ex6;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {

    public static String rpad(String s, char c, int n) {
        return String.format("%1$-" + n + "s", s).replace(' ', '0');
    }

    public static String ltrim(String s) {
        int i  = 0;

        while(i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        return s.substring(i);
    }

    public static String rtrim(String s) {
        int i = s.length() - 1;

        while(i > 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        return s.substring(0, i+1);
    }

    public static String trim(String s) {
        return s.trim();
    }

    public static int indexOfN(String s, char c, int n) {
        String a = Character.toString(c);
        System.out.println(a);
        String[] word = new String[s.length() - 1];
        word = s.split("");
        int contador = 0;

        for (int i = 0; i < word.length; i++) {
            System.out.println(word[i]);
            if (word[i].compareTo(a) == 0 ) {
                System.out.println("foi");
                contador++;
                if(contador == n) {
                    contador = i;
                    break;
                }
            }
        }

        return contador >= n ? contador : -1;
    }
}
