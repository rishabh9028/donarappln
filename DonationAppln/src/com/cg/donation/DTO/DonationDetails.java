package com.cg.donation.DTO;

import java.time.LocalDate;

public class DonationDetails {
		private String DonarId;
		private String DonarName;
		private String PhoneNo;
		
		public DonationDetails()
		{
			
		}
		
		public DonationDetails(String donarId, String donarName, String phoneNo, String address, int donationAmt,
		LocalDate donationDate) {
			super();
			DonarId = donarId;
			DonarName = donarName;
			PhoneNo = phoneNo;
			Address = address;
			DonationAmt = donationAmt;
			DonationDate = donationDate;
		}
		public String getDonarId() {
			return DonarId;
		}
		public void setDonarId(String donarId) {
			DonarId = donarId;
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
		public LocalDate getDonationDate() {
			return DonationDate;
		}
		public void setDonationDate(LocalDate donationDate) {
			DonationDate = donationDate;
		}
		private String Address;
		private int DonationAmt;
		private LocalDate DonationDate;
		
		
}
