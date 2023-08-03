//https://app.codility.com/programmers/lessons/5-prefix_sums/min_avg_two_slice/


// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
	public int solution(int[] A) {
    	int fromIndexOfSliceMinAvg = 100001;
		float minAvgYet=999999999,sum=0, denominator=2;
    	for(int i=0;i<A.length;i++){
			for(int j=i+1;j<A.length;j++){
				if(j==i+1){
					denominator=2;
					sum=A[i]+A[j];
					if((sum/denominator)<minAvgYet){
						minAvgYet=sum/denominator;
						fromIndexOfSliceMinAvg=i;
					}
				}
				else{
					sum=A[j]+sum;
					if(A[j]<minAvgYet){
						if((sum/denominator)<minAvgYet){
							minAvgYet=sum/denominator;
							fromIndexOfSliceMinAvg=i;
						}
					}
				}
				denominator++;
			}
		}
    	return fromIndexOfSliceMinAvg;
    	}
}

