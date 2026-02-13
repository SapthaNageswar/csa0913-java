class SmallestNumber
 {
    public static void main(String[] args) 
    {

        int[] arr = {45, 12, 8, 32, 5};

        int smallest = arr[0];   
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest number is: " + smallest);
    }
}