public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static void stringSwap(String[] arr, int num1, int num2) {
		String temp;
		temp = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = temp;
	}

	public static void reverse(int[] arr) {
		int[] temp = new int[4];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[arr.length-i-1];
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
	}

	public static String[] toWordArray(String words) {
		String[] arr = words.split(" ");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("")) {
				count++;
			}
		}
		String[] arr2 = new String[count];
		count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i].equals("")) {
				arr2[count] = arr[i];
				count++;
			}
		}
		return arr2;
	}
}
