package com.cg.donation.DTO;

import java.time.LocalDate;

public class DonationDetails {
		private String DonarId;
		
		private String DonarName;
		private String PhoneNo;
		
		
	
		public DonationDetails(String donarName, String phoneNo, String address, int donationAmt
		) {
			super();
			
			DonarName = donarName;
			PhoneNo = phoneNo;
			Address = address;
			DonationAmt = donationAmt;
			
		}
	
	
		public String getDonarName() {
			return DonarName;
		}
		public void setDonarName(String donarName) {
			DonarName = donarName;
		}
		public String getPhoneNo() {
			return PhoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			PhoneNo = phoneNo;
		}
		public String getAddress() {
			return Address;
		}
		public void setAddress(String address) {
			Address = address;
		}
		public int getDonationAmt() {
			return DonationAmt;
		}
		public void setDonationAmt(int donationAmt) {
			DonationAmt = donationAmt;
		}
		
		private String Address;
		private int DonationAmt;
	
		
		
}
