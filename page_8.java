import java.util.Scanner;

public class page_8 {

	public page_8() {
	}

	public static void main(String[] arg) {
		page_8 caller = new page_8();
		// Scanner scanner=new Scanner(System.in);
		// int scann=scanner.nextInt();
		// int scann2=scanner.nextInt();
		// System.out.println(caller.guthrieIndex(scann));
		// System.out.println(caller.solve10()[0]);
		// System.out.println(caller.isNUnique(new int[]{7, 3, 3, 2, 4},4));
		// System.out.println(caller.isSquare(25));
		// System.out.println(caller.convertToBase10(new int[]{3, 7, 1},6));
		// System.out.println(caller.computeDepth(25));
		// System.out.println(caller.matches(new int[] { 1, 2, 3, -5, -5, 2, 3, 18 }, new int[] { 3, -2, 3 }));
		// System.out.println(caller.isStacked(scann));
		// System.out.println(caller.isSumSafe(new int[]{5, -5, 0}));
		// System.out.println(caller.isIsolated(scann));
		// System.out.println(caller.fullnessQuotient(scann));
		// System.out.println(caller.isOddHeavy(new int[]{1}));
		// System.out.println(caller.getExponent(scann,scann2));
		// System.out.println(caller.is121Array(new int[]{1, 2, 1}));
		// for(int res:  caller.filterArray(new int[]{0, 9, 12, 18, -6},11)){
		// 	System.out.println(res);
		// }
		// System.out.println(caller.largestAdjacentSum(new int[]{1,1,1,1,1,2,1,1,1}));
		// System.out.println(caller.checkConcatenatedSum(scann,scann2));
		// System.out.println(caller.isSequencedArray(new int[]{1, 2, 3, 4, 5},1,5));
		// System.out.println(caller.largestPrimeFactor(scann));
		// for(int res: caller.encodeNumber(scann)){
		// System.out.println(res);	
		// }
		// System.out.println(caller.decodeArray(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
		// System.out.println(caller.isOnionArray(new int[]{1, 2, 19, 4, 5}));
		// System.out.println(caller.isPrimeHappy(scann));
		// System.out.println(caller.isSystematicallyIncreasing(new int[]{1, 1, 2, 3}));
		// System.out.println(caller.areAnagrams(new char[]{'b', 'i', 'g'},new char[]  {'b', 'i', 'g'}));
		// System.out.println(caller.closestFibonacci(scann));
		// System.out.println(caller.isVesuvian(scann));
		// System.out.println(caller.isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));
		// System.out.println(caller.isFibonacci(scann));
		// System.out.println(caller.isTriangular(scann));
		// System.out.println(caller.isMercurial(new int[]{8, 2, 1, 1, 18, 3, 5}));
		// System.out.println(caller.is235Array(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7}));
		// for(int res: caller.computeHMS(scann)){
		// 	System.out.println(res);	
		// 	}
		// System.out.println(caller.hasNValues(new int[]{1, 2, 2, 1},2));
		// System.out.println(caller.sameNumberOfFactors(23,97));
		// System.out.println(caller.isFineArray(new int[]{4,7,9,6,5}));
	}
	int guthrieIndex(int n) {
		int counter = 0;
		while (n != 1) {
			if (n % 2 == 0)
				n = n / 2;
			else
				n = n * 3 + 1;
			counter++;
		}
		return counter;
	}

	int[] solve10() {
		int a[] = { 0, 0 };
		int facts[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		for (int i = 1; i <= 10; i++) {
			int Ifact = 1;
			for (int j = i; j > 1; j--) {
				Ifact *= j;
			}
			facts[i - 1] = Ifact;
		}

		for (int i = 0; i < facts.length; i++) {
			System.out.println("fact of " + (i + 1) + " is " + facts[i]);
			for (int j = i; j < facts.length; j++) {
				System.out.println("adding " + facts[i] + " with " + facts[j] + " = " + (facts[i] + facts[j]));
				if (facts[i] + facts[j] == facts[facts.length - 1]) {
					a[0] = facts[i];
					a[1] = facts[j];
					return a;
				}
			}
		}
		return a;
	}

	int isNUnique(int[] a, int n) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int k = (i + 1); k < a.length; k++) {
				if ((a[i] + a[k]) == n) {
					count++;
				}
			}
		}
		if (count == 1)
			return 1;
		else
			return 0;
	}

	int isSquare(int n) {
		int sqrt = 0;
		for (int i = 0; sqrt < n; i++) {
			sqrt = i * i;
			if (sqrt == n)
				return 1;
		}
		return 0;
	}

	int isLegalNumber(int[] a, int base) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= base)
				return 0;
		}
		return 1;
	}

	int convertToBase10(int[] a, int base) {
		if (isLegalNumber(a, base) == 0)
			return 0;
		int base10 = 0;
		for (int i = (a.length - 1); i >= 0; i--) {
			int pow = 1;
			for (int k = (a.length - 1); k > i; k--) {
				pow = pow * base;
			}
			pow *= a[i];
			base10 += pow;
		}
		return base10;
	}

	// int haseNoZeroes
	int computeDepth(int n) {
		int a[] = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
		int counter = 0;
		int depth = 0;
		int i = 1;
		while (counter < 10) {
			int mult = n * i;
			while (mult > 0) {
				int digit = mult % 10;
				mult = mult / 10;
				if (a[digit] == -1) {
					counter++;
					a[digit] = digit;
				}
			}
			depth++;
			i++;
		}
		return depth;

	}

	int matches(int[] a, int[] p) {
		int sum = 0;
		int i = 0;
		int j = 0;
		while (i < a.length) {
			int k = Math.abs(p[j]);
			sum += k;
			if (sum > a.length || k == 0 || j >= p.length)
				return 0;
			while (i < sum) {
				if (p[j] > 0 && a[i] < 0)
					return 0;
				else if (p[j] < 0 && a[i] > 0)
					return 0;
				i++;
			}
			j++;
		}
		if (sum == a.length && j == p.length)
			return 1;
		else
			return 0;
	}
	int isStacked(int n){
		int j=1;
		for(int i=1;j<n;i++){
			j=0;
			for(int k=1;k<=i;k++){
				j+=k;
			}
		}
		if(j==n)
		return 1;
		else 
		return 0;
	}
	int isSumSafe(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum+=a[i];
		}
		for(int i=0;i<a.length;i++){
			if(a[i]==sum)
			return 0;
		}
		return 1;
	}
	int isIsolated(long n){
		if(n>2097151)
		return -1;
		long square=n*n;
		while(square>0){
			long digit=square%10;
			long quibic=n*n*n;
			while(quibic>0){
				if(quibic%10==digit)
				return 0;
				else 
				quibic=quibic/10;
			}
			square=square/10;
		}
		return 1;
	}
	int fullnessQuotient(int n){
		if(n<1)
		return 0;
		int counter=0;
		for(int i=2;i<10;i++){
			int k=n;
			int MS=k%i;
			while(k>0){
				MS=k%i;
				if(MS==0)
				break;
				k=k/i;
			}
			if(MS!=0)
			counter++;
		}
		return counter;
	}
	int isOddHeavy(int[ ] a) {
		int countOdd=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0)
			continue;
			countOdd++;
			for(int j=0;j<a.length;j++){
				if(a[j]%2!=0)
				continue;
				if(a[i]<=a[j])
				return 0;}
		}
		return countOdd>0?1:0;
	}
	int getExponent(int n, int p){
		int expo=0;
		int power=0;
		n=Math.abs(n);
		for(int i=0;power<n;i++){
			power=(int)Math.pow(p,i);
			if(n%power==0)
			expo=i;
		}
		return expo;
	}
	int is121Array(int[ ] a){
		if(a.length<3)
		return 0;
		if(a[0]!=1||a[a.length-1]!=1)
		return 0;
		int j=(a.length/2)-1,middle=a.length/2,k=(a.length/2)+1;
		boolean endMid=false;
		if(a.length%2==0){
		k--;
		}
		if(a[middle]!=2)
		return 0;
		while(j>=0&&k<a.length){
			if(a[j]!=a[k])
			return 0;
			if(endMid&&a[j]==2)
			return 0;
			if(a[j]>2||a[j]<1)
			return 0;
			if(a[j]==1)
			endMid=true;
			k++;
			j--;
		}
		return 1;
	}
	int[ ] filterArray(int[ ] a, int n) {
		int count=0;
		for(int k=n;k>0;k/=2){
			if(k%2==1)
			count++;
		}
		if(count>a.length)
		return new int[]{};
		int result[]=new int[count];
		for(int i=0,j=0,k=n;j<count;i++){
			if(i==a.length)
			return null;
			if(k%2==1){
				result[j]=a[i];
				j++;
			}
			k/=2;
		}
		return result;
	}
	int largestAdjacentSum(int[ ] a){
		int sum=a[0]+a[1];
		for(int i=1;i<a.length;i++){
			if(a[i-1]+a[i]>sum)
			sum=a[i-1]+a[i];
		}
		return sum;
	}
	int checkConcatenatedSum(int n, int catlen){
		int sum=0;
		for(int i=n;i>0;i/=10){
			int digit=i%10;
			int num=0;
			int place=1;
			for(int k=0;k<catlen;k++){
				num+=digit*place;
				place*=10;
			}
			sum+=num;
		}
		return sum==n?1:0;
	}
	int isSequencedArray(int[ ] a, int m, int n){
		if(a.length<1)
		return 0;
		if(a[0]!=m||a[a.length-1]!=n)
		return 0;
		for(int i=1;i<a.length;i++){
			if(a[i]!=a[i-1]){
				if(a[i]!=(a[i-1]+1))
				return 0;
			}
		}
		return 1;
	}
	int largestPrimeFactor(int n) {
		int primeFactor=0;
		for(int i=2;i<=n;i++){// we cound use i<(n/2) but in a case where n is prime this would fail to check n
			if(n%i!=0)
			continue;
			boolean isPrime=true;
			for(int k=2;k<i;k++){
				if(i%k==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			primeFactor=i;
		}
		return primeFactor;
	}
	int[ ] encodeNumber(int n){
		int size=0;
		int k=n;
		for(int i=k;i>1&&k>0;i--){
			if(k%i!=0)
			continue;
			boolean isPrime=true;
			for(int j=2;j<i;j++){
				if(i%j!=0)
				continue;
				isPrime=false;
				break;
			}
			if(!isPrime)
			continue;
			k/=i;
			i++;
			size++;
		}
		int result[]=new int[size];
		k=n;
		for(int i=k,l=0;i>1&&k>0;i--){
			if(k%i!=0)
			continue;
			boolean isPrime=true;
			for(int j=2;j<i;j++){
				if(i%j!=0)
				continue;
				isPrime=false;
				break;
			}
			if(!isPrime)
			continue;
			k/=i;
			result[l]=i;
			l++;
			i++;
		}
		return result;
	}
	int decodeArray(int[ ] a){
		int digitize=1,num=0;
		for(int i=(a.length-1);i>=0;i--){
			if(a[i]==1){
				i--;int count=0;
				while(i>=0&&a[i]==0){
					count++;
					i--;
				}
				i++;
				num+=(digitize*count);
				digitize*=10;
			}
		}
		if(a[0]==-1)
		num*=-1;
		return num;
	}
	int isOnionArray(int[ ] a){
		for(int i=0,j=(a.length-1);j>i;j--,i++){
			if(a[i]+a[j]>10)
			return 0;
		}
		return 1;
	}
	int isPrimeHappy(int n){
		if(n<3)
		return 0;
		int sum=0;
		for(int i=2;i<n;i++){
			boolean isPrime=true;
			for(int k=2;k<i;k++){
				if(i%k==0){
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			sum+=i;
		}
		return sum%n==0?1:0;
	}
	int isSystematicallyIncreasing(int[ ] a){
		int count=0;
		for(int i=0;i<a.length;i+=count){
			count++;
			if(a[i]!=1)
			return 0;
			int k=(i+1);
			for(;k<(i+count);k++){
				if(a[k]!=(a[k-1]+1))
				return 0;
			}
			if(k==a.length)
				return 1;
	}
	return 0;
	}
	int areAnagrams(char [ ] a1, char [ ] a2) {
		if(a1.length!=a2.length)
		return 0;
		int reserved[]=new int[a1.length];
		for(int i=0;i<reserved.length;i++){
			reserved[i]=-1;
		}
		for(int i=0;i<a1.length;i++){
			boolean found=false;
			for(int k=0;k<a2.length;k++){
				if(a1[i]==a2[k]){
					if(reserved[k]==-1){
						reserved[k]=k;
						found=true;
						break;
					}
				}
			}
			if(!found)
			return 0;
		}
		return 1;
	}
	int closestFibonacci(int n){
		int first=1;
		int second=1;
		while(second<n){
			int temp=second;
			second=first+second;
			first=temp;
		}
		return second==n?second:first;
	}
	int isVesuvian(int n){
		for(int i=1;(i*i)<n;i++){
			int sum=0;
			for(int k=(i+1);sum<n;k++){
				sum=(i*i)+(k*k);
			}
			if(sum==n)
			return 1;
		}
		return 0;
	}
	int isOneBalanced(int[ ] a){
		int b1=0,e1=0,n1=0;
		for(int i=0;i<a.length;i++){
			if(e1==1&&a[i]!=1)
			return 0;
			else if(n1==1&&a[i]==1)
			e1=1;
			else if(n1==0&&a[i]==1)
			b1=1;
			else if(a[i]!=1)
			n1=1;
		}
		return (b1+e1+n1)>1||a.length<1?1:0;
	}
	int isFibonacci(int n){
		int i=1,j=1,temp=0;
		while(i<n){
			temp=i;
			i=i+j;
			j=temp;
		}
			return i==n?1:0;
	}
	int isTriangular(int n){
		int sum=0;
		for(int i=1;sum<n;i++){
			sum+=i;
		}
		return sum==n?1:0;
	}
	int isMercurial(int[ ] a){
		int count=0;
		for(int i=0;i<a.length;i++){
			if(count==2&&a[i]==1)
			return 0;
			else if(count==1&&a[i]==3)
			count=2;
			else if(count==0&&a[i]==1)
			count=1;
		}
		return 1;
	}
	int is235Array(int a[ ]){
		int sum1=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0)
			sum1++;
			if(a[i]%3==0)
			sum1++;
			if(a[i]%5==0)
			sum1++;
			if(a[i]%2!=0&&a[i]%3!=0&&a[i]%5!=0)
			sum1++;
		}
		return a.length==sum1?1:0;
	}
	int[] computeHMS(int seconds){
		int HMS[]=new int[3];
		HMS[2]=seconds%60;
		HMS[1]=seconds/60%60;
		HMS[0]=(seconds/60)/60;
		return HMS;
	}
	int hasNValues(int[ ] a, int n){
		int count=0;
		boolean zeroCount=false;
		int res[]=new int[a.length];
		for(int i=0,j=0;i<a.length;i++){
			if(a[i]==0&&(!zeroCount)){ // since the default value of in[] will be 0 we need to make special case to count 0 once;
				res[j]=a[i];
				count++;
				j++;
				zeroCount=true;
				continue;
			}
			boolean counted=false;
			for(int k=0;k<res.length;k++){
				if(a[i]==res[k]){
					counted=true;
					break;
				}
			}
			if(!counted){
				res[j]=a[i];
				count++;
				j++;
			}
		}
		return count==n?1:0;
	}
	int sameNumberOfFactors(int n1, int n2){
		if(n1<0||n2<0)
		return -1;
		int fn1=0,fn2=0;
		for(int i=2;i<=n1||i<=n2;i++){
			if(n1%i==0)
			fn1++;
			if(n2%i==0)
			fn2++;
		}
		return fn1==fn2?1:0;
	}
	int isPrime(int n){
		if(n<2)
		return 0;
		for(int i=2;i<n;i++){
		if(n%i==0)
		return 0;
		}
			return 1;
		}
			int isFineArray(int[] a){
				for(int i=0;i<a.length;i++){
					if(isPrime(a[i])==1){
						boolean found=false;
						for(int k=0;k<a.length;k++){
							if(a[k]==(a[i]+2)||a[k]==(a[i]-2)){
								if(isPrime(a[k])==1){
									found=true;
									break;
								}
							}
						}
						if(!found)
						return 0;
					}
				}
			return 1;
			}
}