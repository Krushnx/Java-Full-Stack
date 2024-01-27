class demo1 {
    // This is a simple Java class with a main method

    static int func(int n , int m) {
        // This is a static method that takes two integers as arguments
        // and returns the average of the two numbers rounded down to the nearest integer
        return (n+m)/2;
    }

    public static void main(String args[]) {
        // This is the main method that gets executed when the program is run

        int arr[] = {12,3,4,5,6,7};
        // This is an array of integers

        for (int i = 0; i < arr.length; i++) {
            // This is a for loop that iterates over the array and prints each element
            // with a decrement operator applied to it
            System.out.println(arr[i]--);
        }

        for (int i = 0; i < arr.length; i++) {
            // This is another for loop that iterates over the array and prints each element
            // with a decrement operator applied to it
            System.out.println(arr[i]--);
        }

        int a = 6;
        // This is an integer variable initialized to 6

        System.out.println(func(98,2));
        // This is a print statement that calls the static method 'func' with arguments 98 and 2
        // and prints the result
    }
}