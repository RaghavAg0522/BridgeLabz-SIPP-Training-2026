class Program10_ToLowerCase{
    static String lower(String s){
        String r="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z') c=(char)(c+32);
            r+=c;
        }
        return r;
    }
}