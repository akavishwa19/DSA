package Array;

import java.util.HashMap;

public class Romans {

    static int romanToInt(String s) {
        //we need to iterate till we reach the end of th word
        int i=0;
        int len=s.length();

        int net=0;

        while(i<len){

            //we need to check the successing character too , in few cases so we have some optional checks
            //also it should be contained in the size of string , so we check for i as well
            if(i <len-1 && s.charAt(i)=='I' && s.charAt(i+1)=='V' ){
                net+=4;
                i+=2;
            }
            else if(i <len-1 && s.charAt(i)=='I' && s.charAt(i+1)=='X' ){
                net+=9;
                i+=2;
            }
            else if(i <len-1 && s.charAt(i)=='X' && s.charAt(i+1)=='L' ){
                net+=40;
                i+=2;
            }
            else if(i <len-1 && s.charAt(i)=='X' && s.charAt(i+1)=='C' ){
                net+=90;
                i+=2;
            }
            else if(i <len-1 && s.charAt(i)=='C' && s.charAt(i+1)=='D' ){
                net+=400;
                i+=2;
            }
            else if(i <len-1 && s.charAt(i)=='C' && s.charAt(i+1)=='M' ){
                net+=900;
                i+=2;
            }
            else if(s.charAt(i)=='I'){
                net+=1;
                i++;
            }
            else if(s.charAt(i)=='V'){
                net+=5;
                i++;
            }
            else if(s.charAt(i)=='X'){
                net+=10;
                i++;
            }
            else if(s.charAt(i)=='L'){
                net+=50;
                i++;
            }
            else if(s.charAt(i)=='C'){
                net+=100;
                i++;
            }
            else if(s.charAt(i)=='D'){
                net+=500;
                i++;
            }
            else if(s.charAt(i)=='M'){
                net+=1000;
                i++;
            }
        }

        return net;
    }

    static int romanToIntOptimal(String s){
        //create a hasmap to store the values of characters
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        //initialise result with 0
        int net=0;

        //since we will be moving from back to front
        int digit=s.length()-1;
        int len=s.length();

        //if length is 1 , digit will be zero , then no answer
        //so we need to handle that case as well
        if(len==1){
            return map.get(s.charAt(0));
        }

        while(digit>-1){
            //subtract case
            if(digit>0 && map.get(s.charAt(digit-1))<map.get(s.charAt(digit))){
                net+=map.get(s.charAt(digit))-map.get(s.charAt(digit-1));
                digit-=2;
            }
            else{
                //addition case
                net+=map.get(s.charAt(digit));
                digit--;
            }

        }

        return net;
    }
    public static void main(String[] args) {
        System.out.println(romanToIntOptimal("III"));
    }
}
