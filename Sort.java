
public class Sort {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {80,110,73,999,88,229,77,230};
//		61,60,62,10,64,58,1,60,62,49,64,
//				58,66,56,59,59,57,60,53,55,54,5015,35,39,31,28,33,32,37,38,23,21,22,19,15,
//				66,56,59,59,22,44,57,60,53,55,54,50,46,51,49,48,44,45,43,41,40,42,35,39,31,
//				28,33,32,37,38,23,21,22,19,15};

		int start = 0;
		//int back = (array.length-1);
		int size = array.length;
		System.out.println("size: " + size);
		QuickSort(array, 0, size);
	}
	
	private static void QuickSort(int[] array, int start, int size ) {
		System.out.println("");
		System.out.println("STARTING OVER at start: " + start);
		
//		1.  If the starting and ending places coincide, then this segment of the array 
//		only contains one element and must already be sorted.  
		int pivot = start;
		int front = start+1;
		int back = size-1;
		// zero should be safe to initialize these with since 0 is the starting point
		int tmpFront = 0;
		int tmpBack  = 0;

		if (start == back) {
			System.out.println(array[front] + "==" + array[back]);
			System.out.println(front + " == " + back);
		}
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
					System.out.println("FRONT:: " + front);
				}
				else if (array[front] > array[start]) {
					System.out.println("array[front] is > array[start]: " + array[front] 
							+ ">" + array[start]);
					tmpBack = array[front];
					System.out.println("tmpBack is now: " + tmpBack);
					System.out.println("unincremented FRONT:: " + front);
				}
//			System.out.println("array[back] is >= array[start]: " 
//					+ array[back] + ">=" + array[start]);
//				 B.  Set up another loop which will decrement Back while Back points to an 
//			     element greater than the element in the start of the segment and Back does not 
//			     meet or pass Front.  
					 if (array[back] >= array[start]) {
						System.out.println("array[back] is >= array[start]: " 
								+ array[back] + ">=" + array[start]);
						back--;
						System.out.println("BACK:::: " + back);
					 }
					 else if (array[back] < array[start]) {
						tmpFront = array[back];
						System.out.println("tmpFront is now: " + tmpFront);
						System.out.println("unincremented BACK:: " + back);
					 }
			//	}
//		     C.  If both of these embedded loops find elements to be moved, swap the elements.
				if (tmpFront != 0 && tmpBack != 0 ) {
					array[front] = tmpFront;
					array[back] = tmpBack;
					front++;
					back--;
					tmpFront = 0;
					tmpBack = 0;
					System.out.println("tmpFront:: " + tmpFront + " tmpBack:: " + tmpBack);
					System.out.println("tmpFront and tmpBack were swapped");
					System.out.println("-----------============----------");
					System.out.println("FRONT:: " + front + " BACK:: " + back);
				}
		}
//		3.  Place the element at the start of the current segment where it belongs by 
//		swapping it which the appropriate element that should be where Front and Back meet 
//		give or take one position.
		
		if (front >= back) {
			System.out.println("");
			System.out.println("EXIT STRATEGY");
			System.out.println("tmpFront:: " + tmpFront + " tmpBack:: " + tmpBack);
			if (tmpFront == 0 && tmpBack == 0 ) {
				tmpBack = array[0];
				tmpFront = array[back-1];
				array[0] = tmpFront;
				array[back-1] = tmpBack;
				size = (back-1)-start;
				System.out.println("----------++++++++++++++------------");
				System.out.println("SIZE:::" + size);
				System.out.println("FRONT:: " + front + " BACK:: " + back);
			}
				// if only something from the back needs to move to the front, 
				// swap with array[0] 
			else if (tmpFront != 0 && tmpBack == 0 ) {
					array[back] = array[0];
					array[0] = tmpFront;
					size = back-start;
					System.out.println("----------++++++++++++++------------");
					System.out.println("SIZE:::" + size);
					System.out.println("FRONT:: " + front + " BACK:: " + back);
			}
			// if only something from the front needs to move to the back, 
			// swap with the element before tmpBack with array[0] 
			else if (tmpFront == 0 && tmpBack != 0 ) {
				tmpBack = array[front-1];
				array[front-1] = array[0];
				array[0] = tmpBack;
				size = front-start;
				 
				System.out.println("----------++++++++++++++------------");
				System.out.println("START::: " + start + " SIZE:::" + size);
				System.out.println("FRONT:: " + front + " BACK:: " + back);
			}
		}
		for (int a : array) {
			System.out.print(a + ",");
		}
		System.out.println("");
	

//
//		4.  Call the recursive method passing it the array, the starting position of the 
//		segment of the array, and the position just before the location where the element 
//		was placed that was previously at the starting position of the current segment.  
//		This is done provided the new starting position is bigger than the new ending 
//		position.
//	QuickSort(array, front-size, frontSize);
	
//
//		5.  Call the recursive method passing it the array, the position just after the 
//		location where the element was placed that was previously at the starting position 
//		of the current segment, and the ending position of the current segment.  This is 
//		also provided the new starting position is bigger than the new ending position. 

//	QuickSort(array, back, back+3);
	}

	
}
