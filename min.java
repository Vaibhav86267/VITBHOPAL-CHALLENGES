// Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

// [4,5,6,7,0,1,2] if it was rotated 4 times. [0,1,2,4,5,6,7] if it was rotated 7 times. Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

// Given the sorted rotated array nums of unique elements, return the minimum element of this array.

// You must write an algorithm that runs in O(log n) time.

// Input Format

// First line of each test case or query contains an integer 'N' representing the size of the first array/list.
// Second line contains 'N' single space separated integers representing the elements in the array/list.
// Constraints

// n == nums.length
// 1 <= n <= 5000
// Output Format

// Minimum element from roatated sorted array
// Sample Input 0

// 5
// 3 4 5 1 2
// Sample Output 0

// 1
// Explanation 0

// The original array was [1,2,3,4,5] rotated 3 times.

// Sample Input 1

// 7
// 4 5 6 7 0 1 2
// Sample Output 1

// 0
// Explanation 1

// The original array was [0,1,2,4,5,6,7] and it was rotated 4 times
//*********************************************************************************************************************************************************************
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] g;
        g = new int[i] ;
        for(int f = 0; f<i;f++){
            g[f] = sc.nextInt();
        }
        int small = g[0];
        for(int f = 0; f<i;f++){
            if(g[f]<small){
                small =g[f];
            }
        }
        System.out.println(small);
    }
}
