package com.example.mvpexample;


public class MainPresenter implements MainContract.Presenter {

    MathModel mathModel;
    MainContract.View mainView;

    public MainPresenter(MainContract.View mainView) {
        this.mainView = mainView;
        mathModel = new MathModel();
    }

    @Override
    public void generateResult() {
        String result = mathModel.increment();
        mainView.updateResult(result);
    }

}
