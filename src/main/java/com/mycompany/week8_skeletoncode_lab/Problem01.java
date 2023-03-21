/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {

    public static long getSumOfPrimes(int n) {
        int count = 0;
        boolean prime = true;
        for (int i = 1; i <= n; i++) {
            prime = true;
            for (int j = i - 1; j > 1; j--) {
                if (i % j == 0) {
                    prime = false;
                }
            }

            if (prime && i != 1) {
                count += i;
            }
            prime = true;
        }
        return count;
    }
    /*
    * The time complexity of this algorithm is O(n^2), the outer loop runs n times
    * along with the inner loop
    * The space complexity of this algorithm is O(c)
     */
}
