package org.tnsif.singledimentionalarray;


//program to demonstrate on array of objects----
public class ArraysOfObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee arr[] = new Employee[2];
		arr[0] = new Employee(12, "Ritesh", 45000.5);
		arr[1] = new Employee(13, "Pratik", 45300.5);
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i].getId()+ " "+ arr[i].getName()+ " "+ arr[i].getSalary());
		}


	}

}
