import java.util.Scanner;
public class page60 {
    public static void main(String[] arg){
        page60 caller=new page60();
        // System.out.println(caller.isBalanced(new int[]{-2,2,2,2}));
        // System.out.println(caller.isEvens(2426));
        // System.out.println(caller.isMagicArray(new int[]{}));
        // System.out.println(caller.isComplete(new int[]{2,6,3,4}));
        System.out.println(caller.isCentered(new int[]{3,2,1,1,4,6}));
        
    }
    int isBalanced(int[] a){
        for(int i=0;i<a.length;i++){
            boolean found=false;
            for(int k=0;k<a.length&&!found;k++){
                if(a[i]+a[k]==0)
                found=true;
            }
            if(!found)
            return 0;
        }
        return 1;
    }

    int isEvens (int n){
        while(n>0){
            if((n%10)%2!=0)
            return 0;
            n=n/10;
        }
        return 1;
    }
    int isPrime(int a){
        if(a<2)
        return 0;
        for(int i=2;i<=a/2;i++){
            if(a%i==0)
            return 0;
        }
    return 1;
    }
    int isMagicArray (int[] a){
        int sum=0;
        for(int i=0;i<a.length&&sum<=a[0];i++){
            if(isPrime(a[i])==1)
            sum+=a[i];
        }
        return a.length>0&&sum==a[0]?1:0;
    }
    int isComplete(int a[]){
        boolean existEven=false;
        int min=0,max=0;
        for(int i=0;i<a.length;i++){
            if(!existEven&&a[i]%2==0){
                existEven=true; 
                min=a[i];
                max=a[i];
            }
            else if(existEven&&a[i]%2==0){
                if(a[i]<min)
                min=a[i];
                else if(a[i]>max)
                max=a[i];
            }
        }
        if(!existEven||max==min)
        return 0;
        for(int i=(min+1);i<max;i++){
            boolean found=false;
            for(int k=0;k<a.length&&!found;k++){
                if(a[k]==i)
                found=true;
            }
            if(!found)
            return 0;
        }
        return 1;
    }
    int isCentered(int[] a){
        if(a.length/2==0)
        return 0;
        int middle=a.length/2;
        int j=middle-1,k=middle+1;
        while(j>=0){
            if(a[j]<=a[middle]||a[k]<=a[middle])
            return 0;
            j--;
            k++;
        }
        return 1;
    }
}
