package com.cg.donation.dao;

import com.cg.donation.DTO.DonationDetails;
import com.cg.donation.exception.DonationApplnException;

public interface IDonationDAO {

	public int addDonationDetails(DonationDetails d) throws DonationApplnException;

	

}
