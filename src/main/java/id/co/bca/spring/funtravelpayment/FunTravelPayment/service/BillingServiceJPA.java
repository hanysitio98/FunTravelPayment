package id.co.bca.spring.funtravelpayment.FunTravelPayment.service;

import id.co.bca.spring.funtravelpayment.FunTravelPayment.model.Billing;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.repository.BillingSDJRepository;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.repository.IBillingRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BillingServiceJPA implements IBillingRepository {

    @Autowired
    BillingSDJRepository billingSDJRepository;


    @Override
    public void insert(Billing billing) {
        billingSDJRepository.save(billing);
    }

    @Override
    public void update(Billing billing) {
        billingSDJRepository.save(billing);
    }

    @Override
    public void delete(Billing billing) {
        billingSDJRepository.deleteById(billing.getId());
    }

    @Override
    public Billing findTheBilling(Billing billing) {
        return billingSDJRepository.findBillingById(billing.getId());
    }

    @Override
    public List<Billing> allBillings() {
        return billingSDJRepository.findAllByOrderByInvoiceNumber();
    }
}
