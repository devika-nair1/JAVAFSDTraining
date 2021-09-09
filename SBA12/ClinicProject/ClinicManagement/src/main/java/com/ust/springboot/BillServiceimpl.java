package com.ust.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service

public class BillServiceimpl implements BillServices{
    @Autowired
    BillRepository billrep;
	@Override
	public List<Bill> getBill() {
		// TODO Auto-generated method stub
		return billrep.findAll();
	}

	@Override
	public void saveBill(Bill bill) {
		// TODO Auto-generated method stub
		this.billrep.save(bill);
		
	}

	@Override
	public Bill getBillById(String id) {
		// TODO Auto-generated method stub
		Optional<Bill> optional = billrep.findById(id);
		Bill bill = null;
		if (optional.isPresent()) {
			bill = optional.get();
		} else {
			throw new RuntimeException(" Bill not found for id :: " + id);
		}
		return bill;
	}

	@Override
	public void deleteBillById(String id) {
		// TODO Auto-generated method stub
		this.billrep.deleteById(id);
	}
	
	
}
