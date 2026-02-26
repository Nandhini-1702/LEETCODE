// Last updated: 26/02/2026, 09:45:57
1class Solution {
2    public void generate(List<String> arr, StringBuilder sb, int i, int j) {
3        if (i == 0 && j == 0) {
4            arr.add(sb.toString());
5            return;
6        }
7
8        if (i > 0) {
9            sb.append('(');
10            generate(arr, sb, i - 1, j);
11            sb.deleteCharAt(sb.length() - 1);
12        }
13
14        if (j > 0 && i < j) {
15            sb.append(')');
16            generate(arr, sb, i, j - 1);
17            sb.deleteCharAt(sb.length() - 1);
18        }
19    }
20
21    public List<String> generateParenthesis(int n) {
22        List<String> arr = new ArrayList<>();
23        generate(arr, new StringBuilder(), n, n);
24        return arr;
25        
26    }
27}