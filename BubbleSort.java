
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = new int[] {61,61,60,62,64,58,66,56,59,57,60,53,55,54,50,47,
				46,51,49,48,44,45,43,41,40,42,35,39,31,28,33,32,37,38,23,21,22,19,15};
		
		// set n < array.length-1 since initial pass will push the largest
		// to the last element anyway
		for (int n=0; n <(array.length-1); n++) {
			for (int i=0;i<(array.length)-1;i++){
				if (array[i] > array[i+1]){
					int tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
				}			
			}
		}
		for (int j : array){
			System.out.println(j);	
		}
	}

}
