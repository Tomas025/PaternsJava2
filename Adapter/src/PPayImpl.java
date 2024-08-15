public class PPayImpl implements PPay {

    private String custCardNo;
    private String cardOwnerName;
    private String cardExpMonthDate;
    private Integer CVVNo;
    private Double totalAmount;

    public String getCustCardNo() {
        return custCardNo;
    }

    public void setCustCardNo(String custCardNo) {
        this.custCardNo = custCardNo;
    }

    public String getCardOwnerName() {
        return cardOwnerName;
    }

    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    public String getCardExpMonthDate() {
        return cardExpMonthDate;
    }

    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpMonthDate = cardExpMonthDate;
    }

    public Integer getCVVNo() {
        return CVVNo;
    }

    public void setCVVNo(Integer cVVNo) {
        CVVNo = cVVNo;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

}