package com.dani2pix.ro.recipr.authentication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Domnica on 12/2/2016.
 */

public class CreateGuestSessionModel {

    @SerializedName("success")
    private boolean success;
    @SerializedName("guest_session_id")
    private String guestSessionId;
    @SerializedName("expires_at")
    private String expirationDate;

    public boolean isSuccess() {
        return success;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getGuestSessionId() {
        return guestSessionId;
    }
}
