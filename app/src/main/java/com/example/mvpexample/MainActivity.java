package com.example.mvpexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    MainPresenter presenter;
    TextView resultTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTV = (TextView) findViewById(R.id.tv_result);
        presenter = new MainPresenter(this);
    }

    public void doMagic(View view) {
        presenter.generateResult();
    }

    @Override
    public void updateResult(String result) {
        resultTV.setText(result);
    }

}
