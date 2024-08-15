public class MPayAdapter implements PPay {
    private MPay mPayImpl;

    public MPayAdapter(MPay mPayImpl) {
        this.mPayImpl = mPayImpl;
    }

    @Override
    public String getCustCardNo() {
        return mPayImpl.getCreditCardNo();
    }

    @Override
    public void setCustCardNo(String custCardNo) {
        mPayImpl.setCreditCardNo(custCardNo);
    }

    @Override
    public String getCardOwnerName() {
        return mPayImpl.getCustomerName();
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        mPayImpl.setCustomerName(cardOwnerName);
    }

    @Override
    public String getCardExpMonthDate() {
        return mPayImpl.getCardExpMonth() + "/" + mPayImpl.getCardExpYear();
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        String[] parts = cardExpMonthDate.split("/");
        mPayImpl.setCardExpMonth(parts[0]);
        mPayImpl.setCardExpYear(parts[1]);
    }

    @Override
    public Integer getCVVNo() {
        return mPayImpl.getCardCVVNo().intValue();
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        mPayImpl.setCardCVVNo(cVVNo.shortValue());
    }

    @Override
    public Double getTotalAmount() {
        return mPayImpl.getAmount();
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        mPayImpl.setAmount(totalAmount);
    }

}