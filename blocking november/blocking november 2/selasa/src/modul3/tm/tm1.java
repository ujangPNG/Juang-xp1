package modul3.tm;
public class tm1 {
    public static void main(String[]args)
    {
        for(int a=2;a<=1000;a++)
        {
            boolean isPrime=true;
            for(int i=2;1<=Math.sqrt(a);i++){
                if (a%i==0){
                    isPrime=false;
                    break;
                }
                i++;
            }
            if(isPrime){
                System.out.print(a+" ");
            }
            a++;
        }
        int a =2;
        do{
            boolean isPrime=true;
            int i=2;
            while (i<=Math.sqrt(a)){
                if (a%i==0){
                    isPrime=false;
                    break;
                }
                i++;
            }
            if (isPrime){
                System.out.println(a + " ");
            }
            a++;
        }while (a<=1000);
    }
}
