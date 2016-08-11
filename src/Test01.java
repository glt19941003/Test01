
public class Test01 {

	public static void main(String[] args) {
		
		int[] arr = {12,3,42,54,2,5,44,88,63,76,23,32};
		
		for (int i=0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					int k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;
				}
			}
		}
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
