public class NaturalN {
    static void printN(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printN(n-1);
    }

    static void main(String[] args) {
        int n =5;
        printN(n);
    }
}
