class Program7_NumberFormatException{
    static void handle(String s){
        try{
            int n=Integer.parseInt(s);
        }catch(NumberFormatException e){
            System.out.println("Handled");
        }
    }
}