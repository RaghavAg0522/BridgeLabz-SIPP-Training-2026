class Program6_IllegalArgumentException{
    static void handle(String s){
        try{
            System.out.println(s.substring(5,2));
        }catch(RuntimeException e){
            System.out.println("Handled");
        }
    }
}