package arrays;

import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
		
			Scanner in=new Scanner(System.in);
			int i;
			String names[]=new String[4];
			int marks[][]=new int[4][3];
			int sum[]=new int[4];
			double average[]=new double[4];
			char grades[]=new char[4];
			for(i=0;i<=3;i++) {
				 System.out.print("Name"+i);
				 names[i]=in.next();
				 System.out.println("Marks"+names[i]+"");
				 for(int j=0;j<=2;j++) {
					 System.out.print(""+(j+1)+"");
					 marks[i][j]=in.nextInt();
					 sum[i]+=marks[i][j];
				 }
				 average[i]=sum[i]/3;
				 if( average[i]>=70) {
					 grades[i]='A';
				 }
				 else if(average[i]>=50) {
					 grades[i]='B';
				 }
				 else {grades[i]='F';
					}
			}
			
			System.out.println("*******************************************************************************************");
			System.out.println("                         STUDENT MARKLIST");
			System.out.println("*******************************************************************************************");
			System.out.println("ROLL\tNAME\tMARK1\tMARK2\tMARK3\tTOTAL\tRESULT\tAverage\tGRADE");
	System.out.println("");
	for(i=0;i<=3;i++) {
		System.out.print("10"+(i+1)+"\t");
		System.out.print(names[i]+"\t");
		for(int j=0;j<=2;j++) {
			System.out.print(""+marks[i][j]+"\t");
	}
	System.out.print(sum[i]+"\t");
	 if(marks[i][0]>50&&marks[i][1]>50&&marks[i][2]>50){
		 System.out.print("P\t");
	 }
		else{
			System.out.print("F\t");
		}
	System.out.print(average[i]+"\t");

	System.out.println(grades[i]);
	}



	}

}
