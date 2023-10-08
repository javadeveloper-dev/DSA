
package com.Array.Sorting;

public class BubbleSortObject {
	public static void main(String args[]) {
		Student s1=new Student(18,"Vikas","XII",78.8f);
		Student s2=new Student(17,"Satish","IX",77.44f);
		Student s3=new Student(16,"Vimal","XII",79.99f);
		Student s4=new Student(15,"Swapnil","VIII",76.66f);
		Student s5=new Student(14,"Dinesh","XI",86.66f);
		Student s6=new Student(13,"Dipak","XII",98.77f);
		Student s7=new Student(12,"Mayur","V",56.66f);
		
		Student[] student= {s1,s2,s3,s4,s5,s6,s7};
		System.out.println("Before Bubble Sort Student Array is ");
		for(int i=0;i<student.length;i++) {
			System.out.print(student[i].getId() +" ");
		}
		Student temp=null;
		for(int i=0;i<student.length-1;i++) {
			for(int j=0;j<student.length-i-1;j++) {
				if(student[j].getId()>student[j+1].getId()) {
					temp=student[j];
					student[j]=student[j+1];
					student[j+1]=temp;
					
				}
			}
		}
		System.out.println("After Bubble Sort Student Array is ");
		for(int k=0;k<student.length;k++) {
			System.out.println(student[k]+" ");
		}
		//		for(Student s:student) {
//			System.out.println(s);
//		}
		
	}
}
