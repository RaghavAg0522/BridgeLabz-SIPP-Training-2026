class Program9_ToUpperCase{
    static String upper(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a'&&c<='z') c=(char)(c-32);
            r+=c;
        }
        return r;
    }
}