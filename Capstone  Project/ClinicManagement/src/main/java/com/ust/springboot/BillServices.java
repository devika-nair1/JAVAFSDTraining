package com.ust.springboot;

import java.util.List;

public interface BillServices {

	List <Bill> getBill();
	void saveBill(Bill bill);
	Bill getBillById(String id);
	void deleteBillById(String id);
}