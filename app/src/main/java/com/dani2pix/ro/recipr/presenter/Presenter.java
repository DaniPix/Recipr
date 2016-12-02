package com.dani2pix.ro.recipr.presenter;

/**
 * Created by Domnica on 12/2/2016.
 */

public interface Presenter<V> {
    void attachView(V view);

    void detachView();
}
