// Last updated: 26/02/2026, 09:53:52
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3          List<List<Integer>> triangle = new ArrayList<>(); 
4        
5        for(int i =0 ; i < numRows ; i ++){ 
6            List<Integer> row = new ArrayList<>();
7            row.add(1); 
8
9            for(int j =1 ; j < i ; j++ ){ 
10                List<Integer> prev = triangle.get(i-1);
11                row.add(prev.get(j-1)+prev.get(j)); 
12            }
13            if(i>0){
14                row.add(1); 
15            }
16            triangle.add(row); 
17        }
18        return triangle;
19    }
20}