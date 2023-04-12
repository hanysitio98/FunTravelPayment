package id.co.bca.spring.funtravelpayment.FunTravelPayment.repository;

import id.co.bca.spring.funtravelpayment.FunTravelPayment.model.Billing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BillingSDJRepository extends JpaRepository<Billing, Integer> {

    Billing findBillingById(Integer aInteger);
    List<Billing> findAllByOrderByInvoiceNumber();

}
