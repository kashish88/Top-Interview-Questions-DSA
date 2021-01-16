public class ImplementPowerFunction {
    public int pow(int x, int n, int d) {
        int ans=(int) pow(x*1L,n*1L,d*1L);
        return ans<0?d+ans:ans;
    }
    long pow(long x,long n,long d){
        if(x==0)
          return 0;
          if(n==0)
          return 1;
        long temp=pow(x,n/2,d)%d;
        if(n%2==0){
            return (temp * temp)%d;
        }
        return (((temp*temp)%d)*x)%d;
    }
}
