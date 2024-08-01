import java.util.*;
public class AbbrevationMatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        System.out.println("Enter String: ");
        sc.nextLine();
        String s[]=new String[n];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.nextLine();
        }
        String k=sc.nextLine();
        for(int i=0;i<n;i++) {
            String ans = "";
            String s1[] = s[i].split(" ");
            for (String m : s1) {
                ans+= m.charAt(0) + "";
            }
            if (k.equalsIgnoreCase(ans)) {
                System.out.print("Hence the correct Abbrevation is: "+s[i]);
                break;
            }
        }
    }
}
/*
Input: Enter Number: 4
Enter the String: hello Good Morning
World Health Organisation
World Human Chain
World War Two
WHO
Output: Hence the correct Abbrevation is: World Health Organisation*/
