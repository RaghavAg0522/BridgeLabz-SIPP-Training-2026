class Program5_StringIndexOutOfBounds{
    static void handle(String s){
        try{
            System.out.println(s.charAt(s.length()+1));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Handled");
        }
    }
}