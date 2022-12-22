package practice1;

import static java.lang.Math.min;

public interface Comparabl {
     static int compareTo(String o1, String o2){
        int count = 0;
        for (int i = 0; i< min(o1.length(), o2.length()); i++){
            if (((int)o1.charAt(i) < (int)o2.charAt(i)) && (count != 1))
                count = -1;
            if (((int)o1.charAt(i) > (int)o2.charAt(i)) && (count != -1))
                count = 1;
        }
        return count;
    }
}
