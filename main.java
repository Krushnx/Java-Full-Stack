class demo1 { 
    
    static int func(int n , int m)
    {
        return (n+m)/2;
    }
    public static void main(String args[]) 
    { 
        
        int arr[] = {12,3,4,5,6,7};
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]--);
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]--);
        }
    
        int a = 6;
       
        System.out.println(func(98,2));
        
    } 
} 