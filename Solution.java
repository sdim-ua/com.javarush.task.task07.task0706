import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int chet;
        int nechet;
        
         int[] num = new int[15];
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int i = 0; i < num.length; i++){
            num[i] = Integer.parseInt(reader.readLine());
           
           if (num[i] % == 0 ){
               chet++;
            }
            else{
                nechet++;
            }
            
        }
        
        if (chet > nechet){
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
        else{
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}
