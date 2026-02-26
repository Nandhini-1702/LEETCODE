// Last updated: 26/02/2026, 09:33:44
1class Solution {
2public:
3    vector<int> twoSum(vector<int>& nums, int target) {
4         unordered_map<int, int> num_map;
5        int n = nums.size();
6
7        for (int i = 0; i < n; i++) {
8            int complement = target - nums[i];
9            if (num_map.count(complement)) {
10                return {num_map[complement], i};
11            }
12            num_map[nums[i]] = i;
13        }
14
15        return {};
16    }
17};