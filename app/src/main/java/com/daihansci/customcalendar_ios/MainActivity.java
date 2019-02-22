package com.daihansci.customcalendar_ios;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.daihansci.customcalendar_ios.databinding.CalendarListBinding;
import com.daihansci.customcalendar_ios.ui.adapter.CalendarAdapter;
import com.daihansci.customcalendar_ios.ui.viewmodel.CalendarListViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private CalendarListBinding binding;
    private CalendarListViewModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        model = ViewModelProviders.of(this).get(CalendarListViewModel.class);
        binding.setModel(model);
        binding.setLifecycleOwner(this);

        observe();
        if (model != null) {
            model.initCalendarList();
        }
    }

    private void observe() {
        model.mCalendarList.observe(this, new Observer<ArrayList<Object>>() {
            @Override
            public void onChanged(ArrayList<Object> objects) {
                RecyclerView view = binding.pagerCalendar;
                CalendarAdapter adapter = (CalendarAdapter) view.getAdapter();
                if (adapter != null) {
                    adapter.setCalendarList(objects);
                } else {
                    StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(7, StaggeredGridLayoutManager.VERTICAL);
                    adapter = new CalendarAdapter(objects);
                    view.setLayoutManager(manager);
                    view.setAdapter(adapter);
                    if (model.mCenterPosition >= 0) {
                        view.scrollToPosition(model.mCenterPosition);
                    }
                }
            }
        });
    }
}