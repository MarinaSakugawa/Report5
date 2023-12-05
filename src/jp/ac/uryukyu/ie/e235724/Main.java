package jp.ac.uryukyu.ie.e235724;

public class Main {
    public static void main(String[] args){
        try{
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException n){
            System.out.println("Error : NullPointerException");
            System.out.println(n.getMessage());
        }

    }
    
}
