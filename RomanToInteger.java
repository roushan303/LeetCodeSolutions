package leetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int solution(String str){
        int result=0;
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        for (int i=0;i<str.length();i++){
            if(i>0 && map.get(str.charAt(i)) > map.get(str.charAt(i-1))){
                result += map.get(str.charAt(i)) - 2*(map.get(str.charAt(i-1)));
            }
            else {
                result += map.get(str.charAt(i));
            }
        }

        return result;
    }

    public static int solution2(String s){
                int sum = 0,n;
                for(int i = s.length()-1; i>=0;i--){
                    switch(s.charAt(i)){
                        case 'I':n=1;break;
                        case 'V':n=5;break;
                        case 'X':n=10;break;
                        case 'L':n=50;break;
                        case 'C':n=100;break;
                        case 'D':n=500;break;
                        default :n=1000;
                    }
                    if(4*n < sum) sum-=n;
                    else sum+=n;
                }
                return sum;
            }

    public static void main(String[] args) {

        String str = "MCMLVIII";
        System.out.println(solution2(str));

    }
}
