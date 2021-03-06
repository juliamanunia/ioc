package com.miskevich.ioc.testdata;

public class PaymentService {
    private EmailService emailService;
    private int maxAmount;
    private boolean firstCheck;
    private int secondCheck;
    private String thirdCheck;
    private String fourthCheck;

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public int getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(int maxAmount) {
        this.maxAmount = maxAmount;
    }

    public EmailService getEmailService() {
        return emailService;
    }

    public void pay(String from, String to, double amount) {
        emailService.sendEmail("from", "payment successful");
        emailService.sendEmail("to", "payment successful");
    }

    public void paymentInit(){
        setFourthCheck("Payment init-method check");
    }

    public boolean isFirstCheck() {
        return firstCheck;
    }

    public void setFirstCheck(boolean firstCheck) {
        this.firstCheck = firstCheck;
    }

    public int getSecondCheck() {
        return secondCheck;
    }

    public void setSecondCheck(int secondCheck) {
        this.secondCheck = secondCheck;
    }

    public String getThirdCheck() {
        return thirdCheck;
    }

    public void setThirdCheck(String thirdCheck) {
        this.thirdCheck = thirdCheck;
    }

    public String getFourthCheck() {
        return fourthCheck;
    }

    public void setFourthCheck(String fourthCheck) {
        this.fourthCheck = fourthCheck;
    }
}
