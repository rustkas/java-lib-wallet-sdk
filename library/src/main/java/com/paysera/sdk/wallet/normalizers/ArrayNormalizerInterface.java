package com.paysera.sdk.wallet.normalizers;

import com.paysera.sdk.wallet.exceptions.NormalizerException;
import org.json.JSONArray;

import java.util.List;

/**
 * @author Vytautas Gimbutas <v.gimbutas@evp.lt>
 */
public interface ArrayNormalizerInterface<T> {
    JSONArray mapFromEntity(List<T> entities) throws NormalizerException;
}
