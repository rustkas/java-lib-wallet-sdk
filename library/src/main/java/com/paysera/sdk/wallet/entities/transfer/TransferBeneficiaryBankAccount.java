package com.paysera.sdk.wallet.entities.transfer;

public class TransferBeneficiaryBankAccount {
    private String iban;
    private String bic;
    private String bankCode;

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
}
