package ambigoush.bagasee.bagasee_core.core_model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;

public class SellBaggage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long SellerBaggageId;

    @NotBlank
    @Size(max = 15)
    public  String SellerBagageName;

    @NotBlank
    @Size(max = 15)
    public Date DateLeave;

    @NotBlank
    @Size(max = 15)
    public String TimeLeave;

    @NotBlank
    @Size(max = 15)
    public Date DateArival;

    @NotBlank
    @Size(max = 15)
    public String TimeArival;

    @NotBlank
    @Size(max = 15)
    public String LeaveFrom;

    @NotBlank
    @Size(max = 15)
    public String LEaveTo;

    @NotBlank
    @Size(max = 15)
    public String TransType;

    @NotBlank
    @Size(max = 15)
    public String TransName;

    @NotBlank
    @Size(max = 15)
    public int BagageCount;

    @NotBlank
    @Size(max = 15)
    public String TypeBaggage;

    @NotBlank
    @Size(max = 15)
    public int price;

    public SellBaggage(Long sellerBaggageId, @NotBlank @Size(max = 15) String sellerBagageName, @NotBlank @Size(max = 15) Date dateLeave, @NotBlank @Size(max = 15) String timeLeave, @NotBlank @Size(max = 15) Date dateArival, @NotBlank @Size(max = 15) String timeArival, @NotBlank @Size(max = 15) String leaveFrom, @NotBlank @Size(max = 15) String LEaveTo, @NotBlank @Size(max = 15) String transType, @NotBlank @Size(max = 15) String transName, @NotBlank @Size(max = 15) int bagageCount, @NotBlank @Size(max = 15) String typeBaggage, @NotBlank @Size(max = 15) int price) {
        SellerBaggageId = sellerBaggageId;
        SellerBagageName = sellerBagageName;
        DateLeave = dateLeave;
        TimeLeave = timeLeave;
        DateArival = dateArival;
        TimeArival = timeArival;
        LeaveFrom = leaveFrom;
        this.LEaveTo = LEaveTo;
        TransType = transType;
        TransName = transName;
        BagageCount = bagageCount;
        TypeBaggage = typeBaggage;
        this.price = price;
    }

    public Long getSellerBaggageId() {
        return SellerBaggageId;
    }

    public void setSellerBaggageId(Long sellerBaggageId) {
        SellerBaggageId = sellerBaggageId;
    }

    public String getSellerBagageName() {
        return SellerBagageName;
    }

    public void setSellerBagageName(String sellerBagageName) {
        SellerBagageName = sellerBagageName;
    }

    public Date getDateLeave() {
        return DateLeave;
    }

    public void setDateLeave(Date dateLeave) {
        DateLeave = dateLeave;
    }

    public String getTimeLeave() {
        return TimeLeave;
    }

    public void setTimeLeave(String timeLeave) {
        TimeLeave = timeLeave;
    }

    public Date getDateArival() {
        return DateArival;
    }

    public void setDateArival(Date dateArival) {
        DateArival = dateArival;
    }

    public String getTimeArival() {
        return TimeArival;
    }

    public void setTimeArival(String timeArival) {
        TimeArival = timeArival;
    }

    public String getLeaveFrom() {
        return LeaveFrom;
    }

    public void setLeaveFrom(String leaveFrom) {
        LeaveFrom = leaveFrom;
    }

    public String getLEaveTo() {
        return LEaveTo;
    }

    public void setLEaveTo(String LEaveTo) {
        this.LEaveTo = LEaveTo;
    }

    public String getTransType() {
        return TransType;
    }

    public void setTransType(String transType) {
        TransType = transType;
    }

    public String getTransName() {
        return TransName;
    }

    public void setTransName(String transName) {
        TransName = transName;
    }

    public int getBagageCount() {
        return BagageCount;
    }

    public void setBagageCount(int bagageCount) {
        BagageCount = bagageCount;
    }

    public String getTypeBaggage() {
        return TypeBaggage;
    }

    public void setTypeBaggage(String typeBaggage) {
        TypeBaggage = typeBaggage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
