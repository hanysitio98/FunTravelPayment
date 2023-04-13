package id.co.bca.spring.funtravelpayment.FunTravelPayment.service;

import id.co.bca.spring.funtravelpayment.FunTravelPayment.model.Billing;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.repository.BillingSDJRepository;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.repository.IBillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingServiceSDJ {

    @Autowired
    BillingSDJRepository billingSDJRepository;

}
