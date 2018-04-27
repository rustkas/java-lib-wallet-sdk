package com.paysera.sdk.wallet.normalizers;

import com.paysera.sdk.wallet.entities.Metadata;
import com.paysera.sdk.wallet.exceptions.NormalizerException;
import org.json.JSONObject;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public class MetadataNormalizer implements DenormalizerInterface<Metadata> {
    public Metadata mapToEntity(JSONObject data) throws NormalizerException {
        Metadata metadata = new Metadata();

        metadata.setLimit(data.getInt("limit"));
        metadata.setOffset(data.getInt("offset"));
        metadata.setTotal(data.getInt("total"));

        return metadata;
    }
}
