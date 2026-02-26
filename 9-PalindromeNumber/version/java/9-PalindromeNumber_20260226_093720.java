// Last updated: 26/02/2026, 09:37:20
1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0){
4            return false;
5        }
6        int rev = 0;
7        int  num= x;
8
9        while (num!= 0) {
10            rev= rev*10 + num%10;
11            num=num/10;
12        }
13
14        return (rev == x);
15    }
16}