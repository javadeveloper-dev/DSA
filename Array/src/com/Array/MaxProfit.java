package com.Array;

public class MaxProfit {

	private static int findMaxProfit(int[] price, int start, int end) {
		if (end <= start) {
			return 0;
		}
		int profit = 0;
		for (int i = start; i < end; i++) {
			for (int j = i + 1; j <= end; j++) {
				if (price[j] > price[i]) {
					int current_profit = price[j] - price[i] + findMaxProfit(price, start, i - 1)
							+ findMaxProfit(price, j + 1, end);
					profit = Math.max(profit, current_profit);
				}
			}
		}
		return profit;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 5, 3, 8, 12 };
		int start = 0;
		int profit = MaxProfit.findMaxProfit(arr, start, arr.length - 1);
		System.out.println("Profit is " + profit);
	}

}
