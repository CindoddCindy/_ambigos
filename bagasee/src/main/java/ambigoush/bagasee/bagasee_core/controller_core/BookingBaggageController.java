package ambigoush.bagasee.bagasee_core.controller_core;

public class BookingBaggageController {

    public String BookName;

    public String SellerName;

    public String BaggageDest;

    public String BaggageFrom;

    public String BaggageDateLeave;

    public String BaggageDateArival;

    public String BaggageHeavy;

    public String BaggagePrice;

    public BookingBaggageController(String bookName, String sellerName, String baggageDest, String baggageFrom, String baggageDateLeave, String baggageDateArival, String baggageHeavy, String baggagePrice) {
        BookName = bookName;
        SellerName = sellerName;
        BaggageDest = baggageDest;
        BaggageFrom = baggageFrom;
        BaggageDateLeave = baggageDateLeave;
        BaggageDateArival = baggageDateArival;
        BaggageHeavy = baggageHeavy;
        BaggagePrice = baggagePrice;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public String getSellerName() {
        return SellerName;
    }

    public void setSellerName(String sellerName) {
        SellerName = sellerName;
    }

    public String getBaggageDest() {
        return BaggageDest;
    }

    public void setBaggageDest(String baggageDest) {
        BaggageDest = baggageDest;
    }

    public String getBaggageFrom() {
        return BaggageFrom;
    }

    public void setBaggageFrom(String baggageFrom) {
        BaggageFrom = baggageFrom;
    }

    public String getBaggageDateLeave() {
        return BaggageDateLeave;
    }

    public void setBaggageDateLeave(String baggageDateLeave) {
        BaggageDateLeave = baggageDateLeave;
    }

    public String getBaggageDateArival() {
        return BaggageDateArival;
    }

    public void setBaggageDateArival(String baggageDateArival) {
        BaggageDateArival = baggageDateArival;
    }

    public String getBaggageHeavy() {
        return BaggageHeavy;
    }

    public void setBaggageHeavy(String baggageHeavy) {
        BaggageHeavy = baggageHeavy;
    }

    public String getBaggagePrice() {
        return BaggagePrice;
    }

    public void setBaggagePrice(String baggagePrice) {
        BaggagePrice = baggagePrice;
    }
}
