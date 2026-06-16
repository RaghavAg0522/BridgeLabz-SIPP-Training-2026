import java.util.*;
public class RaviGuildMember {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.next();

        System.out.print("Enter age:");
        int age = sc.nextInt();

        System.out.print("Enter rank:");
        int rank=sc.nextInt();

        System.out.print("Enter salary:");
        float salary=sc.nextFloat();

        System.out.print("Enter membership_fee:");
        float membership_fees=sc.nextFloat();

        float bonus=salary*0.12f;
        int annul_bonus= (int) bonus;


        System.out.println("Name"+ name);
        System.out.println("Age:"+age);
        System.out.println("Rank:"+rank);
        System.out.println("salary:"+salary);
        System.out.print("Annul bonus:"+annul_bonus);
    }
}
