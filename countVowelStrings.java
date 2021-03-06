class Solution {
    public int countVowelStrings(int n) {
        int[] permutation = new int[]{1,1,1,1,1};
        for (int i=0;i<n;i++) {
            int sum=0;
            for (int j=permutation.length-1;j>=0;j--) {
                permutation[j]+=sum;
                sum=permutation[j];
            }
        }
        return permutation[0];
    }
}

******************

class Solution {
    public int countVowelStrings(int n) {
        int[] permutation = new int[]{1,1,1,1,1};
        for (int i=0;i<n;i++) {
            for (int j=permutation.length-2;j>=0;j--) {
                permutation[j]+=permutation[j+1];
            }
        }
        return permutation[0];
    }
}
