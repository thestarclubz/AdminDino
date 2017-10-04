package com.wiboon.admindino.module.finding;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.wiboon.admindino.R;

public class FindingFragment extends Fragment implements View.OnClickListener{

    private EditText edtNumber;
    private Button btnEnter;

    public FindingFragment() {
        // Required empty public constructor
    }

    public static FindingFragment newInstance() {
        FindingFragment fragment = new FindingFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_finding, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        edtNumber = view.findViewById(R.id.edtNumber);
        btnEnter = view.findViewById(R.id.btnEnter);

        btnEnter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }

}
