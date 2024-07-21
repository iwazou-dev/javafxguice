package org.javafxguice;

import java.time.LocalDateTime;

public class BusinessLogicImpl implements BusinessLogic {

    @Override
    public String getDateTimeString() {
        /*
         * ビジネスロジックの実装
         */
        return LocalDateTime.now().toString();
    }

}
