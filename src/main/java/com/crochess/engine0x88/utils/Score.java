package com.crochess.engine0x88.utils;

import com.crochess.engine0x88.GameState;
import com.crochess.engine0x88.types.Phase;

public class Score {
    public static int MIN_VAL = -200;

    public static int make(int mg, int eg) {
        return ((eg - MIN_VAL) << 16) | (mg - MIN_VAL);
    }

    public static int get(int score) {
        switch (GameState.phase) {
            case MG -> {
                return score & 65535;
            }
            case EG -> {
                return score >> 16;
            }
            default -> {
                return score;
            }
        }
    }
}
