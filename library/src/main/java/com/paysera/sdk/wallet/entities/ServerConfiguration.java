package com.paysera.sdk.wallet.entities;

public class ServerConfiguration {

    protected int minimumPasswordLength;
    protected String bankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp;

    public int getMinimumPasswordLength() {
        return minimumPasswordLength;
    }

    public void setMinimumPasswordLength(int minimumPasswordLength) {
        this.minimumPasswordLength = minimumPasswordLength;
    }

    public String getBankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp() {
        return bankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp;
    }

    public void setBankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp(String bankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp) {
        this.bankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp = bankTransferUrgentOptionAvailabilityBeneficiaryAccountRegexp;
    }

}
