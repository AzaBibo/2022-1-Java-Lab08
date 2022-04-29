package edu.handong.csee.java.hw2.math;

/**
 * Class MathCalculator contains all formulas necessary for calculating given operation.
 */
public class MathCalculator{

    private String name;
/**
 * setName() stores the given private name into public variable
 */
    public void setName(String name){
        this.name= name;
    }
/**
 * getName() gets the name setName() has set
 */
    public String getName(){
        return name;
    }
/**
 * getMax() compares first number and second number, and returns the biggest
*/
    public int getMax(int a, int b){
        if (a> b){
            return a;
        }
        else if (a<b){
            return b;
        }
        else   
            return a;
    }
/**
 * getMin() compares first number and second number, and returns the smallest number
 */
    public int getMin(int a, int b){
        if (a> b){
            return b;
        }
        else if (a<b){
            return a;
        }
        else   
            return a;
    }
/**
 * getAbs(int) gets one numbers and returns the original number of that number. So no matter if the number is positive or negative, it returns positive value of that number 
 */  
    public int getAbs(int a){
        if (a<0){
            a *= -1;
        }
            return a;
    }
/**
 * getSum() sums two numbers and returns the result
 */
    public int getSum( int a, int b){
        return (a+b);
    }
/**
 * getDiff() subtracts the second number from the first, and returns the result
 */
    public int getDiff(int a, int b){
        return (a-b);
    }
/**
 * getProduct() multiplies two numbers and returns the result
 */
    public int getProduct(int a, int b){
        return (a*b);
    }
/**
 * getQuotient() divides the second number to the first number, and returns the result
 */
    public int getQuotient(int a, int b){
        return (a/b);
    }
/**
 * getRemainder() divides the second number to the first number. But if anything remains it returns the remainder, otherwise it returns 0
 */
    public int getRemainder(int a, int b){
        return (a % b);     
    }
/**
 * getPower() it multiplies first number (second number) times, and returns the result
 */
    public int getPower(int a, int b){
        //int k=(int) (Math.pow(a, b));
        //return k;
        int pwr=1;
        while (b!=0){
            pwr= pwr*a;
            b--;
        } 
        return pwr;    
    }
/**
 * getFactorial() it multiplies the number to all the number that are lower than it, and returns the result
 */
    public int getFactorial(int a){
        int z, fact=1;
        int number=a;
        for(z=1; z<=number; z++){
            fact=fact*z;
        }
        return fact;
    }
/**
 * getGcd() finds a Greatest Common Divisor between two numbers, and return the result
 */
    public int getGcd(int a, int b){
       int gcd=1;
       for(int i=1; i<=a && i<=b; i++){
           if(a % i==0 && b % i==0){
               gcd =i;
           }
       }
        return gcd;
    }
/**
 * getLcm() finds a Lowest Common Multiplies between two numbers, and return the result
 */
    public int getLcm(int a, int b){
        int MC=1;
        for(int i=1; i<=a && i<=b; i++){
            if(a % i==0 && b % i==0){
                MC =i;
            }
        }
        int lcm= (a*b)/ MC;
        return lcm;
    }
/**
 * getSquare() roots the given number and return the result
 */
    public int getSquare(int a){
        return (a*a);
    }
}