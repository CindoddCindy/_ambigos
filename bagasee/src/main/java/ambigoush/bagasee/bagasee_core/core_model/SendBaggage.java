package ambigoush.bagasee.bagasee_core.core_model;

import java.util.Date;

public class SendBaggage {

    public String sellerBaggageNameSend;

    public String buyerBaggageNameSend;

    public String baggageTypeSend;

    public String baggageDestinationSend;

    public String baggageAcceptBySend;

    public String transportationNameSend;

    public String transportationTypeSend;

    public Date leaveDateSend;

    public Date arrivalDateSend;

    public  String leaveTimeSend;

    public  String timeArrivalSend;

    public String acceptConfirmationSend;

    public String acceptBuyerSend;

    public SendBaggage(String sellerBaggageNameSend, String buyerBaggageNameSend, String baggageTypeSend, String baggageDestinationSend, String baggageAcceptBySend, String transportationNameSend, String transportationTypeSend, Date leaveDateSend, Date arrivalDateSend, String leaveTimeSend, String timeArrivalSend, String acceptConfirmationSend, String acceptBuyerSend) {
        this.sellerBaggageNameSend = sellerBaggageNameSend;
        this.buyerBaggageNameSend = buyerBaggageNameSend;
        this.baggageTypeSend = baggageTypeSend;
        this.baggageDestinationSend = baggageDestinationSend;
        this.baggageAcceptBySend = baggageAcceptBySend;
        this.transportationNameSend = transportationNameSend;
        this.transportationTypeSend = transportationTypeSend;
        this.leaveDateSend = leaveDateSend;
        this.arrivalDateSend = arrivalDateSend;
        this.leaveTimeSend = leaveTimeSend;
        this.timeArrivalSend = timeArrivalSend;
        this.acceptConfirmationSend = acceptConfirmationSend;
        this.acceptBuyerSend = acceptBuyerSend;
    }

    public String getSellerBaggageNameSend() {
        return sellerBaggageNameSend;
    }

    public void setSellerBaggageNameSend(String sellerBaggageNameSend) {
        this.sellerBaggageNameSend = sellerBaggageNameSend;
    }

    public String getBuyerBaggageNameSend() {
        return buyerBaggageNameSend;
    }

    public void setBuyerBaggageNameSend(String buyerBaggageNameSend) {
        this.buyerBaggageNameSend = buyerBaggageNameSend;
    }

    public String getBaggageTypeSend() {
        return baggageTypeSend;
    }

    public void setBaggageTypeSend(String baggageTypeSend) {
        this.baggageTypeSend = baggageTypeSend;
    }

    public String getBaggageDestinationSend() {
        return baggageDestinationSend;
    }

    public void setBaggageDestinationSend(String baggageDestinationSend) {
        this.baggageDestinationSend = baggageDestinationSend;
    }

    public String getBaggageAcceptBySend() {
        return baggageAcceptBySend;
    }

    public void setBaggageAcceptBySend(String baggageAcceptBySend) {
        this.baggageAcceptBySend = baggageAcceptBySend;
    }

    public String getTransportationNameSend() {
        return transportationNameSend;
    }

    public void setTransportationNameSend(String transportationNameSend) {
        this.transportationNameSend = transportationNameSend;
    }

    public String getTransportationTypeSend() {
        return transportationTypeSend;
    }

    public void setTransportationTypeSend(String transportationTypeSend) {
        this.transportationTypeSend = transportationTypeSend;
    }

    public Date getLeaveDateSend() {
        return leaveDateSend;
    }

    public void setLeaveDateSend(Date leaveDateSend) {
        this.leaveDateSend = leaveDateSend;
    }

    public Date getArrivalDateSend() {
        return arrivalDateSend;
    }

    public void setArrivalDateSend(Date arrivalDateSend) {
        this.arrivalDateSend = arrivalDateSend;
    }

    public String getLeaveTimeSend() {
        return leaveTimeSend;
    }

    public void setLeaveTimeSend(String leaveTimeSend) {
        this.leaveTimeSend = leaveTimeSend;
    }

    public String getTimeArrivalSend() {
        return timeArrivalSend;
    }

    public void setTimeArrivalSend(String timeArrivalSend) {
        this.timeArrivalSend = timeArrivalSend;
    }

    public String getAcceptConfirmationSend() {
        return acceptConfirmationSend;
    }

    public void setAcceptConfirmationSend(String acceptConfirmationSend) {
        this.acceptConfirmationSend = acceptConfirmationSend;
    }

    public String getAcceptBuyerSend() {
        return acceptBuyerSend;
    }

    public void setAcceptBuyerSend(String acceptBuyerSend) {
        this.acceptBuyerSend = acceptBuyerSend;
    }
}
