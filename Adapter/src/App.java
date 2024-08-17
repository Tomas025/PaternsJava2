public class App {
    public static void main(String[] args) {
        PPay pPay = new PPayImpl();
        pPay.setCustCardNo("9999999999999999");
        pPay.setCardOwnerName("Tomas Braz");
        pPay.setCardExpMonthDate("5/2025");
        pPay.setCVVNo(123);
        pPay.setTotalAmount(1200.0);
        System.out.println("PPay:");
        testPPay(pPay);

        MPay mPay = new MpayImpl();
        mPay.setCreditCardNo("9999999999999999");
        mPay.setCustomerName("Tomas Braz");
        mPay.setCardExpMonth("5");
        mPay.setCardExpYear("2025");
        mPay.setCardCVVNo((short) 123);
        mPay.setAmount(1200.0);
        System.out.println("MPay:");
        
        PPay pPayAdapter = new MPayAdapter(mPay);

        testPPay(pPayAdapter);
    }

    public static void testPPay(PPay pp){
        System.out.println(pp.getCardOwnerName());
        System.out.println(pp.getCustCardNo());
        System.out.println(pp.getCardExpMonthDate());
        System.out.println(pp.getCVVNo());
        System.out.println(pp.getTotalAmount());
    }
}