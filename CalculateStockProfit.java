import  java.util.Scanner;
public class CalculateStockProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of days
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        // Create an array to store the prices
        int[] prices = new int[n];

        // Prompt user to enter the prices for each day
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the price for day " + (i + 1) + ": ");
            prices[i] = scanner.nextInt();
        }
        int maxProfit = findMaxProfit(prices);// calculate the max profit

        // Print the result
        System.out.println("Maximum Profit of selling at :"+n+" day is :"+ maxProfit);
    }
    public static int findMaxProfit(int[] prices){
        if (prices == null || prices.length <= 1) {
            return 0; // If there are fewer than 2 prices, no profit can be made
        }

        int minPrice = prices[0]; // Initialize the minimum price to the first day's price
        int maxProfit = 0; // Initialize the maximum profit to 0

        for (int i = 1; i < prices.length; i++) {
            // Update the minimum price if the current price is lower
            int currentPrice = prices[i];
            minPrice = Math.min(minPrice, currentPrice);
            int potentialProfit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
        }

        return maxProfit; // Return the maximum profit

    }
}
