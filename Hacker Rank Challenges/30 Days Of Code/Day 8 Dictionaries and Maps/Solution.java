//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, String> mapobj =  new HashMap<String, String>();;
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            mapobj.put(name, String.valueOf(phone));
        }
        while(in.hasNext()) {
            String s = in.next();
            // Write code here
          if(mapobj.containsKey(s)){
              System.out.println(s + "=" + mapobj.get(s));

          } else{
              System.out.println("Not found");
          }
        }
        in.close();
    }
}