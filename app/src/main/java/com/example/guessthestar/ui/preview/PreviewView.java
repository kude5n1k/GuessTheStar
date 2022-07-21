package com.example.guessthestar.ui.preview;


import com.example.guessthestar.ui.base.BaseView;


public interface PreviewView extends BaseView {

    void sendMessage(String mess);

    void progressUpdate(int progress);

    void isButtonStartTestEnabled(boolean status);

}
