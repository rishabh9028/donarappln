package com.cg.donation.service;

import com.cg.donation.DTO.DonationDetails;
import com.cg.donation.exception.DonationApplnException;

public interface IDonationService {
	public int addDonationDetails(DonationDetails p) throws DonationApplnException;

}
