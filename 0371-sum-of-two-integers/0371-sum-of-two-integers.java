class Solution {
    public int getSum(int a, int b) {
        int[] arr = {a, b};

        return Arrays.stream(arr).sum();
    }
}