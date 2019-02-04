package com.ncu.assignment.main;
import com.ncu.assignment.*;
import com.ncu.assignment.exception.*;
import java.util.*;
import java.text.SimpleDateFormat;
import com.ncu.assignment.validation.*;
public class StudentDriver
{
	

	public void student()
	{
		Scanner scan=new Scanner(System.in);
		Student f1=new Student();
		
		try
		{
			System.out.print("Enter Student first name : ");
			String st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			f1.setfirstName(st1);
			System.out.print("\nEnter Student last name  : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			f1.setlastName(st1);
			System.out.println("\nEnter Address : ");
			System.out.print("LINE 1  : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			f1.addr.setline1(st1);
			System.out.print("LINE 2  : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			f1.addr.setline2(st1);
			System.out.print("City    : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			f1.addr.setcity(st1);
			System.out.print("State   : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			f1.addr.setstate(st1);
			System.out.print("PinCode : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			f1.addr.setpinCode(Integer.parseInt(st1));
			System.out.print("\nE-Mail : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			f1.seteMail(st1);
			System.out.print("\nContact No. : ");
			st1=sc.nextLine();
			StudentValidation.Exception1(st1);
			f1.setcontactNo(st1);
			
			
			System.out.print("\nNo. of Skills you want to enter : ");
			int size=sc.nextInt();
			sc.nextLine();
			StudentValidation.Exception2(size);
			int sno=size;
			f1.skills=new String[sno];
			System.out.println("Enter Skills : ");
			for(int i=0;i<sno;i++)
			{
				System.out.print("\t"+(i+1)+". : ");
				f1.skills[i]=sc.nextLine();
			}
			System.out.print("\nNo. of Qualification you have done : ");
			size=sc.nextInt();
			StudentValidation.Exception2(size);
			int qno=size;
			f1.skills=new String[sno];
			f1.qual=new Qualification[qno];
			System.out.println("\nEnter Qualification : ");
			for(int j=0;j<qno;j++)
			{
				f1.qual[j]= new Qualification();
				System.out.print("Qualification Name : ");
				f1.qual[j].setqualName(sc.next());
				System.out.print("University Name    : ");
				f1.qual[j].setuniversity(sc.next());
				System.out.print("Institute Name     : ");
				f1.qual[j].setinstitute(sc.next());
				System.out.print("CGPA               : ");
				f1.qual[j].setcgpa(sc.nextFloat());
			}
			System.out.print("\nNo. of Projects you have done : ");
			int pno=sc.nextInt();
			sc.nextLine();
			int rno=0;
			f1.projects=new Project[pno];
			System.out.println("\nEnter Projects:: ");
			for(int l=0;l<pno;l++)
			{
				f1.projects[l]= new Project();
				System.out.print("Name           : ");
				f1.projects[l].setname(sc.next());
				System.out.print("Start Date in dd-mm-yyyy format: ");
				sc.nextLine();
				try
				{
					f1.projects[l].setstartDate(sdf.parse(sc.nextLine()));
				}
				catch(Exception e){throw new DateFormatException("Enter correct date."); };
				
				System.out.print("End Date in dd-mm-yyyy format: ");
				try
				{
					f1.projects[l].setendDate(sdf.parse(sc.nextLine()));
				}
				catch(Exception e){throw new DateFormatException("Enter correct date."); };
				System.out.print("Enter no. of Responsibility: ");
				rno=sc.nextInt();
				f1.projects[l].responsibilities=new String[rno];
				System.out.println("Responsibility : ");
				for(int k=0;k<rno;k++)
				{
					System.out.print("\t"+(k+1)+". : ");
					f1.projects[l].responsibilities[k]=sc.next();
				}
			}






	//_________________________________________________________________________________________________________________
			
			System.out.println("********");
			System.out.println("\nFirst Name       : "+f1.getfirstName());
			System.out.println("\nLast Name        : "+f1.getlastName());
			System.out.println("\nAddress          : ");
			System.out.println("Line1     : "+f1.addr.getline1());
			System.out.println("Line2     : "+f1.addr.getline2());
			System.out.println("City      : "+f1.addr.getcity());
			System.out.println("State     : "+f1.addr.getstate());
			System.out.println("PinCode   : "+f1.addr.getpinCode());
			System.out.println("DOB        : "+f1.getdob());
			System.out.println("\nE-Mail           : "+f1.geteMail());
			System.out.println("\nContact No.      : "+f1.getcontactNo());
			System.out.println("\nSkills           :");
			for(int i=0;i<sno;i++)
			{
				System.out.println("\t"+(i+1)+". : "+f1.skills[i]);
			}
			System.out.println("\nQualification    : ");
			for(int j=0;j<qno;j++)
			{
				System.out.println("QName      : "+f1.qual[j].getqualName());
				System.out.println("University : "+f1.qual[j].getuniversity());
				System.out.println("Institute  : "+f1.qual[j].getinstitute());
				System.out.println("CGPA       : "+f1.qual[j].getcgpa());
			}
			System.out.println("\nProjects         : ");
			for(int l=0;l<pno;l++)
			{
				System.out.println("Name       : "+f1.projects[l].getname());
				System.out.println("Start Date           : "+f1.projects[l].getstartDate());
				System.out.println("End Date             : "+f1.projects[l].getendDate());
				for(int k=0;k<rno;k++)
				{
					System.out.println("\t"+(k+1)+". : "+f1.projects[l].responsibilities[k]);
				}
		}
	}
		

	
	public static void main(String [] args)
	{
		
		StudentDriver s1=new StudentDriver();
		s1.student();
	}
	
}