package com.dani2pix.ro.recipr.authentication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Domnica on 12/2/2016.
 */

public class RequestTokenModel {

    @SerializedName("success")
    private boolean success;
    @SerializedName("expires_at")
    private String expirationDate;
    @SerializedName("request_token")
    private String requestToken;

    public boolean isSuccess() {
        return success;
    }

    public String getRequestToken() {
        return requestToken;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
