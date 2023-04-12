package id.co.bca.spring.funtravelpayment.FunTravelPayment.model;

import jakarta.persistence.*;

@Entity
@Table(name = "order_log")
public class OrderLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "customer_name")
    private String customer_name;

    @Column(name = "card_number")
    private int cardNumber;

    @Column(name = "holiday_package")
    private String holiday_package;

    @Column(name = "price")
    private int price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHoliday_package() {
        return holiday_package;
    }

    public void setHoliday_package(String holiday_package) {
        this.holiday_package = holiday_package;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
