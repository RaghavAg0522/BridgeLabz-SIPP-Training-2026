class Program8_ArrayIndexOutOfBounds{
    static void handle(){
        try{
            String[] a={"A","B"};
            System.out.println(a[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Handled");
        }
    }
}