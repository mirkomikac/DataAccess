package com.sep.tim2.da.insurance.serviceimpl;

import org.springframework.stereotype.Service;

import com.sep.tim2.da.insurance.service.NotificationService;
import com.sep.tim2.da.payment.model.Uplata;
import com.sep.tim2.da.payment.service.UplataService;

@Service
public class NotificationServiceImpl implements NotificationService{

	private final UplataService uplataService;
	
	public NotificationServiceImpl(UplataService uplataService) {
		this.uplataService = uplataService;
	}
	
	@Override
	public Uplata notifyStandardParties(Long uplataId) {
		Uplata uplata = uplataService.getUplata(uplataId);
		return uplata;
	}
	
}
