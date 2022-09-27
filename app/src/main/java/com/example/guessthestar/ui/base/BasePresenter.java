package com.example.guessthestar.ui.base;


public abstract class BasePresenter <View extends BaseView> {

    protected View view;

    protected BasePresenter(View view) {
        this.view = view;
    }

    void onDetach() {
        view = null; //avoid memory leak
    }
}
