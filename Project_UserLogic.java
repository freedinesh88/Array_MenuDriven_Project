package arrays;
import java.util.Scanner;

public class Project_UserLogic {

	static Array_Operations ob = new Array_Operations();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter size of Array");
		int size = scan.nextInt();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter " + (i + 1) + " element");
			a[i] = scan.nextInt();
		}
		while (true) {
			System.out.println();
			System.out.println("Which Operation You Want Please Select");
			System.out.println(
					"\n 1. Insert \n 2. Delete \n 3. Update \n 4. Sort \n 5. Search \n 6. Reverse \n 7. Fibonacci \n 8. Display \n 9. Min  \n 10.Max \n 11.Occurance \n 12.isEmpty \n 13.Exit");
			int option = scan.nextInt();

			switch (option) {
			case 1: {
				System.out.println("Enter the new element to to insert");
				int new_ele = scan.nextInt();
				System.out.println("Enter the position to insert new element");
				int pos = scan.nextInt();
				if (pos <= a.length + 1 && pos >= 0) {
					a = ob.Insert(a, new_ele, pos);
					ob.display(a);
				} else {
					System.out.println("Insertion is not possible since position is more than actual array length ..!");
				}
				break;
			}

			case 2: {
				System.out.println("Enter deleting element");
				int ele = scan.nextInt();

				int index = ob.search(a, ele);
				if (size == 0) {
					System.out.println("Deletion is not possible since Array is Empty");
				} else if (index == -1) {
					System.out.println("Delete Element is not persent");
				} else {
					a = ob.delete(a, ele, index);
					ob.display(a);
				}
				break;
			}

			case 3: {
				System.out.println("Enter element");
				int ele = scan.nextInt();
				System.out.println("Enter updating element");
				int new_ele = scan.nextInt();

				int index = ob.search(a, ele);
				if (size == 0) {
					System.out.println("Updation is not possible since Array is Empty");
				} else if (index == -1) {
					System.out.println("Element is not persent for update");
				} else {
					a = ob.update(a, ele, new_ele);
					ob.display(a);
				}
				break;
			}

			case 4: {
				ob.sort(a);
				ob.display(a);
				break;
			}

			case 5: {
				System.out.println("Enter the searching element");
				int ele = scan.nextInt();
				int index = ob.search(a, ele);
				if (index == -1) {
					System.out.println("Element not found");
				} else {
					System.out.println("Element found at position : " + index);
				}
				break;
			}
			case 6: {
				a = ob.reverse(a);
				ob.display(a);
				break;
			}

			case 7: {
				a = ob.fibonacci(a);
				ob.display(a);
				break;
			}

			case 8: {
				ob.display(a);
				break;
			}

			case 9: {
				int min = ob.min(a);
				System.out.println("Minimun element is : " + min);
				break;
			}

			case 10: {
				int max = ob.max(a);
				System.out.println("Maximun element is : " + max);
				break;
			}

			case 11: {
				ob.occurance(a);
				break;
			}

			case 12: {
				boolean flag = ob.isEmpty(a);
				if (flag) {
					System.out.println("Array is Empty");
				} else {
					System.out.println("Array is not Empty");
				}
				break;
			}

			case 13: {
				return;
			}

			}
		}
	}

}
