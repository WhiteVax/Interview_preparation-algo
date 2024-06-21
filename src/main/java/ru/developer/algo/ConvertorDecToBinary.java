package ru.developer.algo;

/**
 * O(1)
 */
public class ConvertorDecToBinary {
    public void decToBinary(int num) {
        for (int i = 31; i >= 0; i--) {
            int k = num >> i;
            if ((k & 1) > 0) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }
    public static void main(String[] args) {
        ConvertorDecToBinary convertor = new ConvertorDecToBinary();
        convertor.decToBinary(32);
    }
}
