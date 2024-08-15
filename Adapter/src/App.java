public class App {
    public static void main(String[] args) throws Exception {
        PPay pPay = new PPayImpl();
        pPay.setCustCardNo("233444");
        pPay.setCardOwnerName("Jane Doe");
        pPay.setCardExpMonthDate("12/2022");
        pPay.setCVVNo(123);
        pPay.setTotalAmount(100.0);

        MPay mPay = new MpayImpl();
        mPay.setCreditCardNo("1234567890123456");
        mPay.setCustomerName("John Doe");
        mPay.setCardExpMonth("12");
        mPay.setCardExpYear("2022");
        mPay.setCardCVVNo((short) 123);
        mPay.setAmount(100.0);

        System.out.println("=================================");
        System.out.println("Mercado Pago Details:");
        System.out.println("=================================");
        System.out.println(mPay.getCreditCardNo());
        System.out.println(mPay.getCustomerName());
        System.out.println(mPay.getCardExpMonth());
        System.out.println(mPay.getCardExpYear());
        System.out.println(mPay.getCardCVVNo());
        System.out.println(mPay.getAmount());
        
        
        PPay pPayAdapter = new MPayAdapter(mPay);

        System.out.println("=================================");
        System.out.println("PayPal Details:");
        System.out.println("=================================");
        testPPay(pPay);
        
        System.out.println("=================================");
        System.out.println("PayPalAdapter Details:");
        System.out.println("=================================");
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