package praticasIndividuais.aula5.exercicio1;

public class SortUtil {

    public static <T> Precedente<T>[] sort(Precedente<T> arr[]) {
        int n = arr.length;
        Precedente<T> temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1].precedeA((T) arr[j]) > 0) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
