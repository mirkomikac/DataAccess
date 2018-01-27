package com.sep.tim2.da.insurance.service;

import com.sep.tim2.da.payment.model.Uplata;

public interface NotificationService {
	Uplata notifyStandardParties(Long uplataId);
}
