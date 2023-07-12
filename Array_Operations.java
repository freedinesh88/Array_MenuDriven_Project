package arrays;

public class Array_Operations {
	public int[] Insert(int[] a, int new_ele, int pos) {
		int[] res = new int[a.length + 1];
		for (int i = 0, j = 0; i < res.length; i++) {
			if (i == pos - 1) {
				res[i] = new_ele;
			} else {
				res[i] = a[j++];
			}
		}
		return res;
	}

	public int[] delete(int[] a, int ele, int index) {
		int[] res = new int[a.length - 1];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (i != index)
				res[j++] = a[i];
		}
		return res;
	}

	public int[] update(int[] a, int ele, int new_ele) {
		if (a.length != 0 && search(a, ele) != -1) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == ele) {
					a[i] = new_ele;
				}
			}
		}
		return a;
	}

	public int[] sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;
		}
		return a;
	}

	public int search(int[] a, int ele) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				return i;
			}
		}
		return index;
	}

	public int[] reverse(int[] a) {
		int[] rev = new int[a.length];
		for (int i = a.length - 1, j = 0; i >= 0; i--) {
			rev[j++] = a[i];
		}
		return rev;
	}

	public int[] fibonacci(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (fib(a[i]))
				count++;
		}
		int[] fibArray = new int[count];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (fib(a[i]))
				fibArray[j++] = a[i];
		}
		return fibArray;
	}

	public boolean fib(int n) {
		int a = 0, b = 1, c = a + b;
		while (a <= n) {
			if (a == n)
				return true;
			a = b;
			b = c;
			c = a + b;
		}
		return false;
	}

	public int min(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public int max(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public void occurance(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (i > j && a[i] == a[j])
					break;
				if (a[i] == a[j]) {
					count++;
					break;
				}
			}
			if (count > 0)
				System.out.println(a[i] + " comes " + count + " times");
		}
	}

	public boolean isEmpty(int[] a) {
		return a.length == 0;
	}

	public void display(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
