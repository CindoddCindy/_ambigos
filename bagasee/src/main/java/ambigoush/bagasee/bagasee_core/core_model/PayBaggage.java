package ambigoush.bagasee.bagasee_core.core_model;

import java.util.Date;

public class PayBaggage {

    public String sellerNamePay;

    public String sellerConfirmationPay;
    public String buyerConfirmationPay;

    public Date baggageArrivalPay;

    public Date baggageTakePay;

    public int priceGetPay;

    public int priceTransPay;

    public PayBaggage(String sellerNamePay, String sellerConfirmationPay, String buyerConfirmationPay, Date baggageArrivalPay, Date baggageTakePay, int priceGetPay, int priceTransPay) {
        this.sellerNamePay = sellerNamePay;
        this.sellerConfirmationPay = sellerConfirmationPay;
        this.buyerConfirmationPay = buyerConfirmationPay;
        this.baggageArrivalPay = baggageArrivalPay;
        this.baggageTakePay = baggageTakePay;
        this.priceGetPay = priceGetPay;
        this.priceTransPay = priceTransPay;
    }

    public String getSellerNamePay() {
        return sellerNamePay;
    }

    public void setSellerNamePay(String sellerNamePay) {
        this.sellerNamePay = sellerNamePay;
    }

    public String getSellerConfirmationPay() {
        return sellerConfirmationPay;
    }

    public void setSellerConfirmationPay(String sellerConfirmationPay) {
        this.sellerConfirmationPay = sellerConfirmationPay;
    }

    public String getBuyerConfirmationPay() {
        return buyerConfirmationPay;
    }

    public void setBuyerConfirmationPay(String buyerConfirmationPay) {
        this.buyerConfirmationPay = buyerConfirmationPay;
    }

    public Date getBaggageArrivalPay() {
        return baggageArrivalPay;
    }

    public void setBaggageArrivalPay(Date baggageArrivalPay) {
        this.baggageArrivalPay = baggageArrivalPay;
    }

    public Date getBaggageTakePay() {
        return baggageTakePay;
    }

    public void setBaggageTakePay(Date baggageTakePay) {
        this.baggageTakePay = baggageTakePay;
    }

    public int getPriceGetPay() {
        return priceGetPay;
    }

    public void setPriceGetPay(int priceGetPay) {
        this.priceGetPay = priceGetPay;
    }

    public int getPriceTransPay() {
        return priceTransPay;
    }

    public void setPriceTransPay(int priceTransPay) {
        this.priceTransPay = priceTransPay;
    }
}
