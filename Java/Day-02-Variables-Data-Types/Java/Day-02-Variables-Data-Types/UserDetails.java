
package javaworkshop;

public class UserDetails {

    public static void main(String[] args) {

        System.out.println("Hello World");

        int age = 20;
        int sal = 0000000000;
        char g = 'M';
        String mn = "Hero";
        int mno = 1;

        for (int i = 1; i < 10; i++) {
            mno += i * Math.pow(10, i);
        }

        boolean ise = false;

        System.out.println("My Name is :" + mn);
        System.out.println("My Age is :" + age);

        if (ise) {
            System.out.println("My Employment is done");
        } else {
            System.out.println("My Employment is not done");
        }

        System.out.println("My Gender is :" + g);
        System.out.println("My Salary is :" + sal);
        System.out.println("My Mobile No. is :" + mno);
    }
        }
