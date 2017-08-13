import java.util.* ;

public class RainWater
{
    public static int totalWater(int[] arr)
    {
        int leftPos=0;
        int rightPos= arr.length -1;
        int leftHeight = 0;
        int rightHeight = 0;
        int rainWater = 0;
        
        while(leftPos<=rightPos)                      //Loop until indices overlap
        {
            if(arr[leftPos] < arr[rightPos])          //If the position of the element at the left is less that element at right
            {
               if(arr[leftPos] > leftHeight)          //If the element at current position is greater than previous maximum on left side  
               leftHeight = arr[leftPos];             //set new value for current left side max height
               else
               rainWater += leftHeight - arr[leftPos];
               
               leftPos++;
            }
            else 
            {
               if(arr[rightPos] > rightHeight)        //check if current height at right index is greater than previous max found
               rightHeight = arr[rightPos];
               else
               rainWater += rightHeight - arr[rightPos];
               
               rightPos--;
            }
         }
                                    
       
       System.out.print(Integer.toString(rainWater));
       return rainWater; 
                
      }
      
      public static void main(String[] args)
      {
         Scanner scan = new Scanner(System.in);
         
         System.out.println("Enter number of elements in RainArray");
         
         int size = scan.nextInt();
         
         int[] arr = new int[size];
         
         for(int i=0; i<size; i++)
         arr[i] = scan.nextInt();
         
         System.out.println(Arrays.toString(arr));
         
         int a = totalWater(arr);
         
         
         
       }
         
         
   
}