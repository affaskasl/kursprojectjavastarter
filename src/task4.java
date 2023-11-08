public class task4 {
    public static int date(String x){
int sum = 0;
x = x.replace("/","");
for(int i=0; i<x.length();i++){
    char digit = x.charAt(i);
    int numValue = Character.getNumericValue(digit);
    sum += numValue;


}
return sum;
    }
}
