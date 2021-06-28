package praticasIndividuais.aula4.exercicio2.ex6;

public class Main {

    public static void main(String[] args) {

        String number = "2";
        System.out.println(StringUtil.rpad(number, '0', 5));

        String ltrim = "  teste";
        System.out.println(StringUtil.ltrim(ltrim));

        String rtrim = "teste  ";
        System.out.println(StringUtil.rtrim(rtrim));

        String s = " teste";
        System.out.println(StringUtil.trim(s));

        String teste = "John | Paul | George | Ringo";
        System.out.println(StringUtil.indexOfN(teste, 'l', 1));
    }
}
