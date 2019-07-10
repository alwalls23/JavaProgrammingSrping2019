package java_practice_problems;

import java.util.*;

class Point {

    static int x;

    int y;

}



public class Quiz4 {

    public static void main(String[] args) {

        Point p1 = new Point();

        Point p2 = new Point();

        p1.x = 17;

        p1.y = 35;

        p2.x = 19;

        p2.y = 40;



        System.out.println(p1.x + ":" + p1.y);

        System.out.println(p2.x + ":" + p2.y );
        
        List<String> list = new ArrayList<>();

        list.add(0, "Array");

        list.add(0, "List");



        System.out.println(list);
        
        Boolean b1 = new Boolean("tRuE");

        Boolean b2 = new Boolean("fAlSe");

        Boolean b3 = new Boolean("abc");

        Boolean b4 = null;
        
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
       
        
        class A {

            A( ) {

                this(1);

                System.out.println("M");

            }

            A(int i) {

                System.out.println("N");

            }

       }

       class B extends A {

        

       }

        

    

                new B( );
                
                Boolean [] arr = new Boolean[2];

                System.out.println(arr[0] + ":" + arr[1]);

            }

    
    }


	

