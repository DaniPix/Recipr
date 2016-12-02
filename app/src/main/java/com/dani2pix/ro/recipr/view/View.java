package com.dani2pix.ro.recipr.view;

import android.content.Context;

/**
 * Created by Domnica on 12/2/2016.
 */

public interface View {
    Context getContext();

    void showProgressDialog();

    void hideProgressDialog();
}
