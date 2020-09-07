package com.tracing.alpha;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Exit  extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.activity_numbers_screen,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
        getActivity().stopService(new Intent(getActivity().getBaseContext(), MyService.class));
        System.exit(0);
    }
}
