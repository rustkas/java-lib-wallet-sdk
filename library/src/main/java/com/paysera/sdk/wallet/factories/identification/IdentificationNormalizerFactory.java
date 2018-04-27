package com.paysera.sdk.wallet.factories.identification;

import com.paysera.sdk.wallet.normalizers.identification.IdentificationRequestNormalizer;
import com.paysera.sdk.wallet.normalizers.identification.IdentityDocumentNormalizer;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class IdentificationNormalizerFactory {
    public IdentificationRequestNormalizer createIdentificationRequestNormalizer(
        IdentityDocumentNormalizer identityDocumentNormalizer
    ) {
        return new IdentificationRequestNormalizer(identityDocumentNormalizer);
    }

    public IdentityDocumentNormalizer createIdentityDocumentNormalizer() {
        return new IdentityDocumentNormalizer();
    }
}
