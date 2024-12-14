
    public class SecondLargestIn2DArray {
        public static void main(String[] args) {
            int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;
    
            for (int[] row : arr) {
                for (int num : row) {
                    if (num > largest) {
                        secondLargest = largest;
                        largest = num;
                    } else if (num > secondLargest && num != largest) {
                        secondLargest = num;
                    }
                }
            }
            System.out.println("Second largest number: " + secondLargest);
        }
    }
    

