package com.daihansci.customcalendar_ios.ui.viewmodel;


import com.daihansci.customcalendar_ios.data.TSLiveData;

import java.util.Calendar;

import androidx.lifecycle.ViewModel;

public class CalendarViewModel extends ViewModel {
    public TSLiveData<Calendar> mCalendar = new TSLiveData<>();

    public void setCalendar(Calendar calendar) {
        this.mCalendar.setValue(calendar);
    }


}
