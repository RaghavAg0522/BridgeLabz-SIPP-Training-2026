import java.util.*;
class Program2_Substring{
    static String sub(String s,int st,int en){
        String r="";
        for(int i=st;i<en;i++) r+=s.charAt(i);
        return r;
    }
    static boolean compare(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
}