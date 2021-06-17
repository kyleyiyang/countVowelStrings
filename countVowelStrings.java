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
