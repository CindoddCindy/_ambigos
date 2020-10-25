package ambigoush.bagasee.bagasee_core.core_model;

import java.util.Date;

public class SendBaggage {

    public String SellerBaggageName;

    public String BuyerBaggageName;

    public String BaggageType;

    public String BaggageDestination;

    public String BaggageAcceptBy;

    public String TransportationName;

    public String TransportationType;

    public Date LeaveDate;

    public Date ArrivalDate;

    public  String LeaveTime;

    public  String TimeArrival;

    public String AcceptConfirmation;

    public String AcceptBuyer;

    public SendBaggage(String sellerBaggageName, String buyerBaggageName, String baggageType, String baggageDestination, String baggageAcceptBy, String transportationName, String transportationType, Date leaveDate, Date arrivalDate, String leaveTime, String timeArrival, String acceptConfirmation, String acceptBuyer) {git
        SellerBaggageName = sellerBaggageName;
        BuyerBaggageName = buyerBaggageName;
        BaggageType = baggageType;
        BaggageDestination = baggageDestination;
        BaggageAcceptBy = baggageAcceptBy;
        TransportationName = transportationName;
        TransportationType = transportationType;
        LeaveDate = leaveDate;
        ArrivalDate = arrivalDate;
        LeaveTime = leaveTime;
        TimeArrival = timeArrival;
        AcceptConfirmation = acceptConfirmation;
        AcceptBuyer = acceptBuyer;
    }

    public String getSellerBaggageName() {
        return SellerBaggageName;
    }

    public void setSellerBaggageName(String sellerBaggageName) {
        SellerBaggageName = sellerBaggageName;
    }

    public String getBuyerBaggageName() {
        return BuyerBaggageName;
    }

    public void setBuyerBaggageName(String buyerBaggageName) {
        BuyerBaggageName = buyerBaggageName;
    }

    public String getBaggageType() {
        return BaggageType;
    }

    public void setBaggageType(String baggageType) {
        BaggageType = baggageType;
    }

    public String getBaggageDestination() {
        return BaggageDestination;
    }

    public void setBaggageDestination(String baggageDestination) {
        BaggageDestination = baggageDestination;
    }

    public String getBaggageAcceptBy() {
        return BaggageAcceptBy;
    }

    public void setBaggageAcceptBy(String baggageAcceptBy) {
        BaggageAcceptBy = baggageAcceptBy;
    }

    public String getTransportationName() {
        return TransportationName;
    }

    public void setTransportationName(String transportationName) {
        TransportationName = transportationName;
    }

    public String getTransportationType() {
        return TransportationType;
    }

    public void setTransportationType(String transportationType) {
        TransportationType = transportationType;
    }

    public Date getLeaveDate() {
        return LeaveDate;
    }

    public void setLeaveDate(Date leaveDate) {
        LeaveDate = leaveDate;
    }

    public Date getArrivalDate() {
        return ArrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        ArrivalDate = arrivalDate;
    }

    public String getLeaveTime() {
        return LeaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        LeaveTime = leaveTime;
    }

    public String getTimeArrival() {
        return TimeArrival;
    }

    public void setTimeArrival(String timeArrival) {
        TimeArrival = timeArrival;
    }

    public String getAcceptConfirmation() {
        return AcceptConfirmation;
    }

    public void setAcceptConfirmation(String acceptConfirmation) {
        AcceptConfirmation = acceptConfirmation;
    }

    public String getAcceptBuyer() {
        return AcceptBuyer;
    }

    public void setAcceptBuyer(String acceptBuyer) {
        AcceptBuyer = acceptBuyer;
    }
}
