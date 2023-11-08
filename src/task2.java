public class task2 {
    public static int reversednumber(int x){
        int r = 0;
        while (x!=0){
            int digit = x%10;
            r = r * 10 +digit;
            x /= 10;

        }

return r;

    }
}
