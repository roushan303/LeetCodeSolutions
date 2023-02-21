package leetCode;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class LongestCommonPrefix {

    public static String solutions(String[] arr){
        String result="";
        String firstString = arr[0];
        int i =0;
        for(int j=1;j<arr.length;j++){
            if(arr[j].charAt(i) == firstString.charAt(i)){
                result += firstString.charAt(i);
                i++;
            }
            else {
                result = "";
            }
        }

        return result;
    }

    public static String solutions2(String[] arr){
        String result="";
        Arrays.sort(arr);
        String first = arr[0];
        String last = arr[arr.length-1];
        for(int i=0;i<first.length();i++){
            if(first.charAt(i) != last.charAt(i)){
                return result;
            }
            result += first.charAt(i);
        }

        return result;
    }

    public static void main(String[] args){
        String[] arr= {"flower","flow","flies"};
        System.out.println(solutions2(arr));
    }
}
