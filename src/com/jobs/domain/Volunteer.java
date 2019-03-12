package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		
		//TODO
		if(!(paymentRate==null)) throw new Exception("Volunteers do not charge...");

	}

	
	@Override
	public void pay() {
		//TODO
		totalPaid=null;
		
	}


}
