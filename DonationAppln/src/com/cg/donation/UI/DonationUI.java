package com.cg.donation.UI;

import java.util.Scanner;

import com.cg.donation.DTO.DonationDetails;
import com.cg.donation.exception.DonationApplnException;
import com.cg.donation.service.DonationServiceImpl;
import com.cg.donation.service.IDonationService;





public class DonationUI {
	static Scanner sc=new Scanner(System.in);
	static int choice;
	static DonationDetails details=null;
	  static IDonationService service=new DonationServiceImpl();
	public static void main(String[] args) throws DonationApplnException {
		System.out.println("Donation Appln");
		System.out.println("****************");
		while(true)
		{
			System.out.println("1.Get Donation Details");
			System.out.println("2.Exit");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:addDonationDetails();
			break;
			case 2:
				System.exit(0);
				break;
			}
		}
	}
	private static void addDonationDetails() throws DonationApplnException {
		try{
			service=new DonationServiceImpl();
			System.out.println("Enter Donar name");
			String donarName=sc.next();
			System.out.println("Enter Donar PhoneNo");
			String phoneNo=sc.next();
			System.out.println("Enter Donar Address");
			String address=sc.next();
			System.out.println("Enter Donation Amt");
			int donationAmt=sc.nextInt();
			details=new DonationDetails(donarName,phoneNo,address, donationAmt);
			int res=service.addDonationDetails(details);
			System.out.println(res+"  inserted");
			if(res==1)
			{
				System.out.println("Values added in databse");
			}
			else
			{
				System.out.println("values not added");
			}
		}
			catch(DonationApplnException e)
			{
				throw new DonationApplnException("Exception occured"+e.getMessage());
			}
			
			
			
	}
}
