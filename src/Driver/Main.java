package Driver;

import Department.AdminDepartment;
import Department.HrDepartment;
import Department.TechDepartment;


public class Main {
	public static void main(String [] args) {
		AdminDepartment ad=new AdminDepartment();
		System.out.println("Welcome to "+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println("\n");
		
		
		HrDepartment hD = new HrDepartment();
		System.out.println("Welcome to "+hD.departmentName());
		System.out.println(hD.doActivity());
		System.out.println(hD.getTodaysWork());
		System.out.println(hD.getWorkDeadline());
		System.out.println(hD.isTodayAHoliday());
		System.out.println("\n");
		
		TechDepartment tD = new TechDepartment();
		System.out.println("Welcome to "+tD.departmentName());
		System.out.println(tD.getTodaysWork());
		System.out.println(tD.getWorkDeadline());
		System.out.println(tD.getTechStackInformation());
		System.out.println(tD.isTodayAHoliday());	
		System.out.println("\n");

		
	}

}
