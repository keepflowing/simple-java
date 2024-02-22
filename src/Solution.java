class Solution {
    public static int findJudge(int n, int[][] trust) {
        int[][] people = new int[n][2];

        for (int[] r : trust) {
            people[r[0] - 1][0]++;
            people[r[1] - 1][1]++;
        }

        for (int i = 0; i < people.length; i++) {
            if(people[i][0] == 0 && people[i][1] == n-1) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] trust = {{1,3},{2,3}};
        int n = 3;
        int res = findJudge(n, trust);
        System.out.print(res);
    }
}