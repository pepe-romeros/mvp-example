package com.example.mvpexample;

/**
 * Created by admin on 10/31/17.
 */

public interface MainContract {

    interface View{
        /**
         * Responsible for presenting the result on screen
         * @param result
         */
        void updateResult(String result);
    }

    interface Presenter {

        /**
         * Responsible for calculating the result
         */
        void generateResult();

    }

}
