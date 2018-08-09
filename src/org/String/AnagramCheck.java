package org.String;

public class AnagramCheck {
    public static void main(String[] args) {
        String a="pat";
        String b="tac";
        int count[]=new int [256];
        
        if(a.length()!=b.length())
           System.out.println("not anagaram.. Length not same");
       
        
      for(int i=0;i<a.length();i++)
      {
         count[a.charAt(i)]=count[a.charAt(i)]+1;
         count[b.charAt(i)]=count[b.charAt(i)]-1;
      }
      
      for(int j=0;j<count.length;j++)
      {
          if(count[j]!=0)
          {
              System.out.println("Not anagram");
          }
          
          else
          {
              System.out.println("Anagram");
          }
      }
        
    }

}
