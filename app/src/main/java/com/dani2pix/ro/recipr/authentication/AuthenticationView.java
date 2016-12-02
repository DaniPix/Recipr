package com.dani2pix.ro.recipr.authentication;

import com.dani2pix.ro.recipr.view.View;

/**
 * Created by Domnica on 12/2/2016.
 */

public interface AuthenticationView extends View {
    void onAuthenticationSuccess();

    void onAuthenticationFailure();

    void beginAuthenticationProcess();
}
