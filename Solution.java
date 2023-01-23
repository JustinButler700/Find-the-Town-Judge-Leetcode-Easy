class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1){return 1;} // if only one person return 1
        int[] trustCount = new int[n+1]; // array to keep track of trust count for each person
        for(int i = 0; i < trust.length; i++){
            trustCount[trust[i][1]]++; // increment trust count for person being trusted
            trustCount[trust[i][0]]--; // decrement trust count for person doing the trusting
        }
        // We start at i = 1 because 1 <= n <=1000
        for(int i = 1; i <= n; i++){
            if(trustCount[i] == n-1){ // if trust count is n-1, it means everyone trusts this person except himself
                return i; // return this person as the judge
            }
        }
        return -1; // no judge found
    }
}
