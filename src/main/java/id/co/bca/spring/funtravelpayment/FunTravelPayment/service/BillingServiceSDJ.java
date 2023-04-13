package id.co.bca.spring.funtravelpayment.FunTravelPayment.service;

import id.co.bca.spring.funtravelpayment.FunTravelPayment.model.Billing;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.repository.BillingSDJRepository;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.repository.IBillingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillingServiceSDJ {

    @Autowired
    BillingSDJRepository billingSDJRepository;

}
