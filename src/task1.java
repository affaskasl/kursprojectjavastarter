public class task1 {
    public static  int Sum(int x){

        int sum = 0;
        if (x<0){
            x= Math.abs(x);

        } while(x>0){
            int digit = x % 10;
            sum +=digit;
            x /=10;


        }
return  sum;
    }

}
