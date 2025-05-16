package src.Easy.BestTimeToBuyAndSellStock;

import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int menor = Arrays.stream(prices).min().getAsInt();

        int indexMenor = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == menor) {
                indexMenor = i;
                break;
            }
        }
//        prices = [1,2]
//        Output = 0
//        Expected = 1

        int indexMaior = indexMenor;
        int maior = prices[indexMenor];
        for (int p = indexMenor; p < prices.length; p++) {

            if (prices[p] > maior) {
                maior = prices[p];
                indexMaior = p;
            }
        }

        int output = prices[indexMaior] - prices[indexMenor];
        if (output >= prices[indexMenor]) {
            return output;
        }
        return  0;
    }
}
