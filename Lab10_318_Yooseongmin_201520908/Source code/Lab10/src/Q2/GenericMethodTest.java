package Q2;

public class GenericMethodTest 
{
   public static void main(String[] args) 
   {
      // create arrays of Integer, Double and Character
      Integer[] integerArray = {1, 2, 3, 4, 5};
      Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
      Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
      try {
      test("integerArray", integerArray);
      test("doubleArray", doubleArray);
      test("characterArray", characterArray);
      }
      catch(ArrayIndexOutOfBoundsException e) {
    	  e.getMessage();
      }
      catch(InvalidSubscriptException e){
    	  e.getMessage();
      }
      catch(Exception e) {
    	  e.getMessage();
      }
   }

   // generic original printArray method
   public static <T> void printArray(T[] inputArray)
   {
 		// write code to display array elements
 		for(T element : inputArray) {
 			System.out.printf("%s ", element);
 		}
 		System.out.println();
   }
   
   // overload generic method printArray
   	public static <T> int printArray(T[] inputArray, int lowSubscript, int highSubscript) throws InvalidSubscriptException
   	{
   		try {
	   	if (lowSubscript < 0 || highSubscript >= inputArray.length) {
	   		System.err.println("input error!!");
	   		}
   		}
   		catch(InvalidSubscriptException e){
      	  e.getMessage();
        }
      	int count = 0;
      	
      	for (int i = lowSubscript; i <= highSubscript; i++) 
      	{
      		count++;
      		System.out.printf("%s ", inputArray[i]);
      	}
      	System.out.println();
      	return count;
   	} 

   	public static <T>void test(String string, T[] inputArray)
   	{
	   try
	   {
  
         int elements = 0;

         // display array using original printArray method
         System.out.println("\n\nUsing original printArray method");
         printArray(inputArray); // print array

         // display intAarray using overloaded printArray method
         System.out.printf("Array %s contains: ", string);
         elements = printArray(inputArray, 0, inputArray.length - 1);
         System.out.printf("%d elements were output\n", elements);

         // display elements 1-3 of array
         System.out.printf("Array %s from positions 1 to 3 is : ", string);
         elements = printArray(inputArray, 1, 3);
         System.out.printf("%d elements were output\n", elements);

         // try to print an invalid element
         System.out.printf("Array %s output with invalid subscripts: ", string);
         elements = printArray(inputArray, -1, 10);
      }
      catch(Exception e)
      {
         e.printStackTrace();
      } 
   } 
}

