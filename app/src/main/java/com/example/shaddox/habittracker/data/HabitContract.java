package com.example.shaddox.habittracker.data;

import android.provider.BaseColumns;

/**
 * Created by Shaddox on 2017. 05. 31..
 */

public final class HabitContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private HabitContract() {}


    public static final class HabitEntry implements BaseColumns {


        public final static String TABLE_NAME = "habits";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_HABIT_NAME ="name";
        public final static String COLUMN_HABIT_DESCRIPTION = "description";
        public final static String COLUMN_HABIT_REPEAT_TIMES = "number of times repeated";
        public final static String COLUMN_IS_GOAL_ACHIEVED= "is the goal achieved";


        public static final int GOAL_NOT_ACHIEVED = 0;
        public static final int GOAL_ACHIEVED = 1;

    }
}
