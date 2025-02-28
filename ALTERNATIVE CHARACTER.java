// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static Boolean tickets(String s){
        char[] c=s.toCharArray();
        char t=c[0];
        char g=c[1];
        if(t==g){
            return false;
        }
        for(int i=0;i<s.length();i++){
            if(i%2==0&&c[i]!=t){
                return false;
            }
            if(i%2!=0&&c[i]!=g){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(tickets(s));
    }
}