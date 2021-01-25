package controller;

public class StringUtil {

    public static int  convertToString(int [] src, String [] des)
    {
        int max_length = 0;
        for (int i = 0; i < src.length; i++)
        {
            des[i] = Integer.toString(src[i]);
        }
        for (String i: des)
        {
            if (i.length() > max_length) { max_length = i.length(); }
        }
        int n_zeros;
        for (int i = 0; i < des.length; i++)
        {
            n_zeros = max_length - des[i].length();
            if (n_zeros > 0)
            {
                for (int j = 0; j < n_zeros; j++){ des[i] = "0" + des[i];}
            }
        }
        return max_length;
    }

    private static String createFill(char c, int n)
    {
        String fill = "";
        for (int i = 0; i < n; i ++)
        {
            fill += c;
        }
        return fill;
    }

    public static String rpad(String s, char c, int n) { return s + createFill(c, n); }

    public static String lpad(String s, char c, int n) { return createFill(c, n) + s; }

    public static String ltrim(String s)
    {
        int nRemove = 0;
        for (int i=0; i<s.length(); i++)
        {
            if (s.charAt(i) == ' '){nRemove++;}
            else {break;}
        }
        return s.substring(nRemove);
    }

    public static String rtrim(String s)
    {
        int nRemove = s.length();
        for (int i=s.length() - 1; i>= 0; i--)
        {
            if (s.charAt(i) == ' '){nRemove--;}
            else {break;}
        }
        return s.substring(0,nRemove);
    }

    public static String trim(String s) { return rtrim(ltrim(s));}

    public static int indexOfN(String s, char c, int n )
    {
        if (n > 0)
        {
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    count++;
                    if (count == n) { return i; }
                }
            }
        }
        return -1;
    }


}
