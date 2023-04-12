package id.co.bca.spring.funtravelpayment.FunTravelPayment.repository;

import id.co.bca.spring.funtravelpayment.FunTravelPayment.model.Billing;

import java.util.List;

public interface IBillingRepository {

    void insert(Billing billing);
    void update(Billing billing);
    void delete(Billing billing);

    Billing findTheBilling(Billing billing);
    List<Billing> allBillings();
}
