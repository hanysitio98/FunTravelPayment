package id.co.bca.spring.funtravelpayment.FunTravelPayment.dto;


import java.util.Date;

public class BillingLog {

    private String invoiceNumber;
    private Date invoiceDate;
    private String customerName;
    private String holidayPackage;
    private String paymentMethod;
    private String status;

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getHolidayPackage() {
        return holidayPackage;
    }

    public void setHolidayPackage(String holidayPackage) {
        this.holidayPackage = holidayPackage;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
