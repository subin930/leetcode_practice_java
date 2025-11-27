class Solution {
    public int hammingWeight(int n) {
        int answer = 0;
        while(n > 1) {
            int r = n % 2;
            n /= 2;

            if(r == 1) ++answer;
        }

        return answer + 1;
    }
}