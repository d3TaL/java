package pract75;

public interface StringInterface {
    public default int counter(String i){
        return i.length();
    }
    public default String nechet(String str){
        String out = "";
        for (int i = 0; i< str.length(); i++){
            if ((i+1)%2 == 0)
                out += str.charAt(i);
        }
        return out;
    }
    public default String invert(String str){
        String out = "";
        for (int i = str.length()-1; i >= 0; i--)
            out += str.charAt(i);
        return out;

    }
}
