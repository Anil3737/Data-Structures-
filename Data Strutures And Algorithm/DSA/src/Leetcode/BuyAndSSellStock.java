package Leetcode;
import java.util.*;
public class BuyAndSSellStock {
	public static int maxProfit(int[] prices) {
		int n = prices.length;
		int max_profit = 0;
		int buy_price = prices[0]; //  buying price
		for(int i=0;i<n;i++) {
			int current_profit = prices[i] - buy_price;
			if(current_profit > max_profit) {
				max_profit = current_profit;
			}
			if(prices[i] < buy_price) {
				buy_price = prices[i];
			}
		}
		return max_profit;
	}
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		int size = scanner.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i] = scanner.nextInt();
		} 
		System.out.println(maxProfit(array));
	}

}
