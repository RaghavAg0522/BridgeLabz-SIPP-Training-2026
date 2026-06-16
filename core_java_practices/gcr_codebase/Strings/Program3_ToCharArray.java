import java.util.*;
class Program3_ToCharArray{
    static char[] getChars(String s){
        char[] a=new char[s.length()];
        for(int i=0;i<s.length();i++) a[i]=s.charAt(i);
        return a;
    }
}