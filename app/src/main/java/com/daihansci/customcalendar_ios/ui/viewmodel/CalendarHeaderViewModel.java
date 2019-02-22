package com.daihansci.customcalendar_ios.ui.viewmodel;


import com.daihansci.customcalendar_ios.data.TSLiveData;

import androidx.lifecycle.ViewModel;

public class CalendarHeaderViewModel extends ViewModel {
    public TSLiveData<Long> mHeaderDate = new TSLiveData<>();

    public void setHeaderDate(long headerDate) {
        this.mHeaderDate.setValue(headerDate);
    }
}
