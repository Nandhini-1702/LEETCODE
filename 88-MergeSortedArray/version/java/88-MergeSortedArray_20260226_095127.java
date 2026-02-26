// Last updated: 26/02/2026, 09:51:27
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int[] temp = new int[m];
4        for (int l = 0; l < m; l++) {
5            temp[l] = nums1[l];
6        }
7
8        int i = 0;
9        int j = 0;
10        int k = 0;
11        
12        while(i < m && j < n) {
13            if (temp[i] <= nums2[j]) {
14                nums1[k++] = temp[i];
15                i++;
16            } else if (temp[i] > nums2[j]) {
17                nums1[k++] = nums2[j];
18                j++;
19            }
20        }
21        
22        while (i < m) {
23            nums1[k++] = temp[i];
24            i++;
25        }
26        
27        while(j < n) {
28            nums1[k++] = nums2[j];
29            j++;
30        }
31    }
32}