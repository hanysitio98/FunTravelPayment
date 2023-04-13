package id.co.bca.spring.funtravelpayment.FunTravelPayment.controller;

import id.co.bca.spring.funtravelpayment.FunTravelPayment.model.Billing;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.model.PaymentMethod;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.repository.BillingSDJRepository;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.repository.PaymentMethodRepository;
import id.co.bca.spring.funtravelpayment.FunTravelPayment.service.BillingServiceSDJ;
import org.aspectj.lang.annotation.DeclareError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class RestPaymentController {

    @Autowired
    private BillingServiceSDJ billingServiceJPA;

    @Autowired
    private BillingSDJRepository billingSDJRepository;

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @GetMapping("/billings")
    @ResponseStatus(HttpStatus.OK)
    public List<Billing> findAll(){
        return billingSDJRepository.findAll();
    }

    @GetMapping("/billings/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Billing findBillingById(@PathVariable("id") int id) {
        return billingSDJRepository.findBillingById(id);
    }

    @PostMapping("/billings")
    @ResponseStatus(HttpStatus.OK)
    public Billing addBilling(@RequestBody Billing billing) {
        return billingSDJRepository.save(billing);
    }

    @PutMapping("/billings/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Billing updateBilling(@RequestBody Billing billing, @PathVariable("id") int id){
        return billingSDJRepository.save(billing);
    }

    @DeleteMapping("/billings/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteBilling(@PathVariable("id") int id) {
        billingSDJRepository.deleteById(id);
    }

    @GetMapping("/payment-methods")
    @ResponseStatus(HttpStatus.OK)
    public List<PaymentMethod> findAllPaymentMethod() {
        return paymentMethodRepository.findAll();
    }
}
