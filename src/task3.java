public class task3 {
    public static int calcname(String x){
        int sum =0;
        x = x.toUpperCase();
        for(int i=0;i<x.length();i++){
char letter = x.charAt(i);
if(letter>='A' && letter <='Z'){
    int numvalue = letter - 'A' + i;
sum += numvalue;

}



        }

return sum;


    }

}
