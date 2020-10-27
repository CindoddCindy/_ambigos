package ambigoush.bagasee.bagasee_core.core_model;

import java.util.Date;

public class BookingBaggage {

    public  String buyerName;

    public String sellerName;

    public String baggageTo;

    public String baggageFrom;

    public Date dateLeave;

    public  Date dateArrive;

    public String baggageHeavy;

    public String baggagePricebBook;

    public BookingBaggage(String buyerName, String sellerName, String baggageTo, String baggageFrom, Date dateLeave, Date dateArrive, String baggageHeavy, String baggagePricebBook) {
        this.buyerName = buyerName;
        this.sellerName = sellerName;
        this.baggageTo = baggageTo;
        this.baggageFrom = baggageFrom;
        this.dateLeave = dateLeave;
        this.dateArrive = dateArrive;
        this.baggageHeavy = baggageHeavy;
        this.baggagePricebBook = baggagePricebBook;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getBaggageTo() {
        return baggageTo;
    }

    public void setBaggageTo(String baggageTo) {
        this.baggageTo = baggageTo;
    }

    public String getBaggageFrom() {
        return baggageFrom;
    }

    public void setBaggageFrom(String baggageFrom) {
        this.baggageFrom = baggageFrom;
    }

    public Date getDateLeave() {
        return dateLeave;
    }

    public void setDateLeave(Date dateLeave) {
        this.dateLeave = dateLeave;
    }

    public Date getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(Date dateArrive) {
        this.dateArrive = dateArrive;
    }

    public String getBaggageHeavy() {
        return baggageHeavy;
    }

    public void setBaggageHeavy(String baggageHeavy) {
        this.baggageHeavy = baggageHeavy;
    }

    public String getBaggagePricebBook() {
        return baggagePricebBook;
    }

    public void setBaggagePricebBook(String baggagePricebBook) {
        this.baggagePricebBook = baggagePricebBook;
    }
}
