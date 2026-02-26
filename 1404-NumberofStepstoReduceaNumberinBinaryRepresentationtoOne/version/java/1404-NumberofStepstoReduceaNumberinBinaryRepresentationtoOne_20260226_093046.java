// Last updated: 26/02/2026, 09:30:46
1class Solution {
2    public int numSteps(String s) {
3        int st = 0;
4    int c = 0;
5    for (int i = s.length() - 1; i > 0; i--) {
6        int n = s.charAt(i) - '0';
7        if (n + c == 1) {
8            st+= 2;
9            c= 1;
10        } else {
11            st+= 1;
12        }
13    }
14    return st+c;
15    }
16}