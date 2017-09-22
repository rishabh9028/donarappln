package com.cg.donation.service;



import com.cg.donation.DTO.DonationDetails;
import com.cg.donation.dao.DonationDAOImpl;
import com.cg.donation.dao.IDonationDAO;
import com.cg.donation.exception.DonationApplnException;

public class DonationServiceImpl implements IDonationService {
	IDonationDAO dao=null;
	@Override
	public int addDonationDetails(DonationDetails d) throws DonationApplnException {
		dao=new DonationDAOImpl();
		return dao.addDonationDetails(d);
		
	}
		
	
}
	