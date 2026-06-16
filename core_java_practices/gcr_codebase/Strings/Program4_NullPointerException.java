class Program4_NullPointerException{
    static void handle(){
        try{
            String s=null;
            System.out.println(s.length());
        }catch(NullPointerException e){
            System.out.println("Handled");
        }
    }
}