package com.cg.donation.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.donation.DBUtil.DButil;
import com.cg.donation.DTO.DonationDetails;
import com.cg.donation.exception.DonationApplnException;

public class DonationDAOImpl implements IDonationDAO {
	Connection conn=null;
	@Override
	public int addDonationDetails(DonationDetails d) throws DonationApplnException {
		int result=0;
		try{
			conn=DButil.getConnection();
			String insertQuery="Insert into donationdetails values(donar_seq_id.nextval,?,?,?,?,SYSDATE)";
			PreparedStatement ps=conn.prepareStatement(insertQuery);
			ps.setString(1,d.getDonarName());
			ps.setString(2,d.getPhoneNo());
			ps.setString(3,d.getAddress());
			ps.setInt(4,d.getDonationAmt());
			result = ps.executeUpdate();
			
		}catch (IOException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			
			throw new DonationApplnException(e.getMessage());
		}
		
		return result;
		}
		
	}


