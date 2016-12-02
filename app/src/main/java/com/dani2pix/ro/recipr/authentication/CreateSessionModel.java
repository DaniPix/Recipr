package com.dani2pix.ro.recipr.authentication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Domnica on 12/2/2016.
 */

public class CreateSessionModel {

    @SerializedName("success")
    private boolean success;
    @SerializedName("session_id")
    private String sessionId;

    public String getSessionId() {
        return sessionId;
    }

    public boolean isSuccess() {
        return success;
    }
}
