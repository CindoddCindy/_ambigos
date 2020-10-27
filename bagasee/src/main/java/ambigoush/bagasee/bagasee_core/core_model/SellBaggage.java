package ambigoush.bagasee.bagasee_core.core_model;

import java.util.Date;

public class SellBaggage {

    private  Long sellerBaggageIdSell;

    public  String sellerBagageNameSell;

    public Date dateLeaveSell;

    public String timeLeaveSell;

    public Date dateArivalSell;

    public String timeArivalSell;

    public String leaveFromSell;

    public String leaveToSell;

    public String transTypeSell;

    public String transNameSell;

    public int bagageCountSell;

    public  String baggageheavySell;

    public String typeBaggageSell;

    public String priceBaggageSell;

    public SellBaggage(Long sellerBaggageIdSell, String sellerBagageNameSell, Date dateLeaveSell, String timeLeaveSell, Date dateArivalSell, String timeArivalSell, String leaveFromSell, String leaveToSell, String transTypeSell, String transNameSell, int bagageCountSell, String baggageheavySell, String typeBaggageSell, String priceBaggageSell) {
        this.sellerBaggageIdSell = sellerBaggageIdSell;
        this.sellerBagageNameSell = sellerBagageNameSell;
        this.dateLeaveSell = dateLeaveSell;
        this.timeLeaveSell = timeLeaveSell;
        this.dateArivalSell = dateArivalSell;
        this.timeArivalSell = timeArivalSell;
        this.leaveFromSell = leaveFromSell;
        this.leaveToSell = leaveToSell;
        this.transTypeSell = transTypeSell;
        this.transNameSell = transNameSell;
        this.bagageCountSell = bagageCountSell;
        this.baggageheavySell = baggageheavySell;
        this.typeBaggageSell = typeBaggageSell;
        this.priceBaggageSell = priceBaggageSell;
    }

    public Long getSellerBaggageIdSell() {
        return sellerBaggageIdSell;
    }

    public void setSellerBaggageIdSell(Long sellerBaggageIdSell) {
        this.sellerBaggageIdSell = sellerBaggageIdSell;
    }

    public String getSellerBagageNameSell() {
        return sellerBagageNameSell;
    }

    public void setSellerBagageNameSell(String sellerBagageNameSell) {
        this.sellerBagageNameSell = sellerBagageNameSell;
    }

    public Date getDateLeaveSell() {
        return dateLeaveSell;
    }

    public void setDateLeaveSell(Date dateLeaveSell) {
        this.dateLeaveSell = dateLeaveSell;
    }

    public String getTimeLeaveSell() {
        return timeLeaveSell;
    }

    public void setTimeLeaveSell(String timeLeaveSell) {
        this.timeLeaveSell = timeLeaveSell;
    }

    public Date getDateArivalSell() {
        return dateArivalSell;
    }

    public void setDateArivalSell(Date dateArivalSell) {
        this.dateArivalSell = dateArivalSell;
    }

    public String getTimeArivalSell() {
        return timeArivalSell;
    }

    public void setTimeArivalSell(String timeArivalSell) {
        this.timeArivalSell = timeArivalSell;
    }

    public String getLeaveFromSell() {
        return leaveFromSell;
    }

    public void setLeaveFromSell(String leaveFromSell) {
        this.leaveFromSell = leaveFromSell;
    }

    public String getLeaveToSell() {
        return leaveToSell;
    }

    public void setLeaveToSell(String leaveToSell) {
        this.leaveToSell = leaveToSell;
    }

    public String getTransTypeSell() {
        return transTypeSell;
    }

    public void setTransTypeSell(String transTypeSell) {
        this.transTypeSell = transTypeSell;
    }

    public String getTransNameSell() {
        return transNameSell;
    }

    public void setTransNameSell(String transNameSell) {
        this.transNameSell = transNameSell;
    }

    public int getBagageCountSell() {
        return bagageCountSell;
    }

    public void setBagageCountSell(int bagageCountSell) {
        this.bagageCountSell = bagageCountSell;
    }

    public String getBaggageheavySell() {
        return baggageheavySell;
    }

    public void setBaggageheavySell(String baggageheavySell) {
        this.baggageheavySell = baggageheavySell;
    }

    public String getTypeBaggageSell() {
        return typeBaggageSell;
    }

    public void setTypeBaggageSell(String typeBaggageSell) {
        this.typeBaggageSell = typeBaggageSell;
    }

    public String getPriceBaggageSell() {
        return priceBaggageSell;
    }

    public void setPriceBaggageSell(String priceBaggageSell) {
        this.priceBaggageSell = priceBaggageSell;
    }
}
