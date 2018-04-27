package com.paysera.sdk.wallet.normalizers;

import com.paysera.sdk.wallet.exceptions.NormalizerException;
import org.json.JSONObject;

public interface NormalizerInterface<T> {
    JSONObject mapFromEntity(T entity) throws NormalizerException;
}
