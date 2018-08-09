package org.String;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class DuplicateInString {
    public static void main(String[] args) {
        String input = "geeksforgeeks";
        getDuplicates(input);
    }

    private static void getDuplicates(String input) {
     HashMap<Character, Integer> dupMap=new HashMap<Character, Integer>();
     char [] inputArray=input.toCharArray();
     for(int i=0;i<inputArray.length;i++)
     {
         if(dupMap.containsKey(inputArray[i]))
         {
             dupMap.put(inputArray[i], dupMap.get(inputArray[i])+1);
         }
         else
          
         dupMap.put(inputArray[i], 1);
        
    }

   Set<Character> set=dupMap.keySet();

   
   for(char c:set)
   {
       if(dupMap.get(c)>1)
       {
           System.out.println("Duplicate value :" +c + "  :" +dupMap.get(c));
       }
   }
        
     
    }

}
