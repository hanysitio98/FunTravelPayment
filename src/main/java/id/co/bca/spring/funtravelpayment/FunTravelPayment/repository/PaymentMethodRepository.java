package id.co.bca.spring.funtravelpayment.FunTravelPayment.repository;

import id.co.bca.spring.funtravelpayment.FunTravelPayment.model.Billing;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.model.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Integer> {

    PaymentMethod findPaymentMethodById(Integer aInteger);
    List<PaymentMethod> findAllByPaymentMethod();
}
