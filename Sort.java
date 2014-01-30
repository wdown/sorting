
public class Sort {

	/**
	 * @param args
	 */


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {80,110,73,99,88,229,77,230,61,60,62,10,64,58,1,60,62,49,64};
//				58,66,56,59,59,57,60,53,55,54,5015,35,39,31,28,33,32,37,38,23,21,22,19,15,
//				66,56,59,59,22,44,57,60,53,55,54,50,46,51,49,48,44,45,43,41,40,42,35,39,31,
//				28,33,32,37,38,23,21,22,19,15};

	//	int size = array.length;
		System.out.println("size: " + array.length);
		QuickSort(array, 0, array.length);
	}
	
	private static void QuickSort(int[] array, int start, int size ) {
		System.out.println("");
		System.out.println("STARTING OVER at start: " + start);
		
		int front = start;
		int back = start+size-1;
		if (back > start){
	
			System.out.println("size is: " + size);
			System.out.println("back is: " + back);
		
		//initialize variables to hold the size of arrays before and after pivot
		int frontSize = 0;
		int backSize = 0;
				
		// zero should be safe to initialize these with since 0 is the starting point
		int tmpFront = 0;
		int tmpBack  = 0;

//		1.  If the starting and ending places coincide, then this segment of the array 
//		only contains one element and must already be sorted.  
//		if (start == back) {
//			System.out.println(array[front] + "==" + array[back]);
//			System.out.println(front + " == " + back);
//			for (int a : array) {
//				System.out.print(a + ",");
//			}
//			System.out.println("");
//		//	break;
//		}
//		If, however, the starting and ending positions do not coincide, then you 
//		arbitrarily select the first element in the segment (which is the one designated 
//		by the starting location) to be what you are (I think) terming the pivot element.
		while (front < back){
			System.out.println("front: " + front + " is < back: " + back);
			for (int a : array) {
				System.out.print(a + ",");
			}
			System.out.println("");
			System.out.println("");
//		2.  Set up a loop with Front pointing to the element just after the start of the 
//		current segment and Back pointing to the end of the current segment.  		
//		The loop should terminate when these two pointers meet or pass each other.  
//		The body of this loop looks like this:  
				
//		     A.  Set up a loop which will increment Front while Front points to an element 
//		     less than or equal to the element in the start of the segment and Front does 
//		     not pass Back.  
			if (array[front] <= array[start]) {
				System.out.println("array[front] is <= array[start]: " + array[front] 
						+ "<=" + array[start]);
				front++;
				frontSize++;
				System.out.println("FRONT:: " + front + ", frontSize:: " + frontSize);
			}
			else if (array[front] > array[start]) {
				System.out.println("array[front] is > array[start]: " + array[front] 
						+ ">" + array[start]);
				tmpBack = array[front];
				System.out.println("tmpBack is now: " + tmpBack);
				System.out.println("unincremented FRONT:: " + front + ", frontSize:: " + frontSize);
			}
//			B.  Set up another loop which will decrement Back while Back points to an 
//			element greater than the element in the start of the segment and Back does not 
//			meet or pass Front.  
			if (array[back] >= array[start]) {
			System.out.println("array[back] is >= array[start]: " 
						+ array[back] + ">=" + array[start]);
				back--;
				backSize++;
				System.out.println("BACK:::: " + back + ", backSize:: " + backSize);
			}
			else if (array[back] < array[start]) {
				tmpFront = array[back];
				System.out.println("tmpFront is now: " + tmpFront);
				System.out.println("unincremented BACK:: " + back + ", backSize:: " + backSize);
			}
//		    C.  If both of these embedded loops find elements to be moved, swap the elements.
			if (tmpFront != 0 && tmpBack != 0 ) {
				array[front] = tmpFront;
				array[back] = tmpBack;
				front++;
				frontSize++;
				back--;
				backSize++;
				tmpFront = 0;
				tmpBack = 0;
			}
				
				System.out.println("----------++++++++++++++------------");
				System.out.println("START::: " + start + " SIZE:::" + size);
				System.out.println("FRONT:: " + front + " BACK:: " + back);
				System.out.println("frontSize:: " + frontSize + ", backSize:: " + backSize);
				
		}
//		3.  Place the element at the start of the current segment where it belongs by 
//		swapping it which the appropriate element that should be where Front and Back meet 
//		give or take one position.
		System.out.println("");
		System.out.println("EXIT STRATEGY");
		System.out.println("FRONT:: " + front + " BACK:: " + back);
		System.out.println("tmpFront:: " + tmpFront + " tmpBack:: " + tmpBack);
		if (start == back) {
			System.out.println(array[front] + "==" + array[back]);
			System.out.println(front + " == " + back);
			for (int a : array) {
				System.out.print(a + ",");
			}
			System.out.println("");
		}
		else if (front >= back && back > start) {
			if (tmpFront == 0 && tmpBack == 0 ) {
				tmpBack = array[start];
				array[start] = array[back-1];
				array[back-1] = tmpBack;
			}
			// if only something from the back needs to move to the front, 
			// swap with array[0] 
			else if (tmpFront != 0 && tmpBack == 0 ) {
				array[back] = array[start];
				array[start] = tmpFront;
				backSize++;
			}		
			// if something from the front needs to move to the back, 
			// swap the element before tmpBack with array[0] 
			else if (tmpFront == 0 && tmpBack != 0 ) {
				tmpBack = array[start];
				System.out.println("tmpBack is now: " + tmpBack);
				System.out.println("back is now: " + back);
				tmpFront = array[front-1];
				System.out.println("tmpFront is now: " + tmpFront);
				System.out.println("front-1 is now: " + (front-1));
				array[front-1] = tmpBack;
				array[start] = tmpFront;
				backSize++;
				frontSize--;
//			QuickSort(array, tmpFront, frontSize );	
			}
			System.out.println("*******************************");
			System.out.println("calling QuickSort for back side");
			QuickSort(array, back, backSize );
	
//			System.out.println("----------++++++++++++++------------");
//			System.out.println("START::: " + start + " SIZE:::" + size);
//			System.out.println("FRONT:: " + front + " BACK:: " + back);
//			System.out.println("frontSize:: " + frontSize + ", backSize:: " + backSize);
	
		
//			QuickSort(array, start, frontSize);
//			QuickSort(array, back, backSize);

			for (int a : array) {
				System.out.print(a + ",");
			}
			System.out.println("");
		}
//		QuickSort(array, tmpFront, frontSize );
//		QuickSort(array, tmpBack, backSize );
		
//		4.  Call the recursive method passing it the array, the starting position of the 
//		segment of the array, and the position just before the location where the element 
//		was placed that was previously at the starting position of the current segment.  
//		This is done provided the new starting position is bigger than the new ending 
//		position.
	//	System.out.println("array: " + array + ", start: " + start + ", frontSize: " + frontSize);
		System.out.println("##############################");
		System.out.println("calling QuickSort for front side");
		QuickSort(array, start, frontSize);
	
//
//		5.  Call the recursive method passing it the array, the position just after the 
//		location where the element was placed that was previously at the starting position 
//		of the current segment, and the ending position of the current segment.  This is 
//		also provided the new starting position is bigger than the new ending position. 
//	System.out.println("array: " + array + ", start: " + start + ", backSize: " + backSize);
		System.out.println("##############################");
		System.out.println("calling QuickSort for back side");
		QuickSort(array, back, backSize);
	
	
			
//	QuickSort(array, start, frontSize );
//	QuickSort(array, back, backSize );
		}
	}
} 

