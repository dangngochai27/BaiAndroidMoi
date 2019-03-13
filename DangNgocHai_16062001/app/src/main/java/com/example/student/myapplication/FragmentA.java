package com.example.student.myapplication;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class FragmentA extends Fragment{

    Button btn_A,btn_B,btn_C;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        btn_A =  view.findViewById(R.id.btn_A);
        btn_B =  view.findViewById(R.id.btn_B);
        btn_C =  view.findViewById(R.id.btn_C);

        //Xu Li Su Kien Tren Button
        btn_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentB fragmentB  = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
                if(fragmentB!=null && fragmentB.isInLayout()){
                  fragmentB.txtB.setText("A");
                }else {
                    Intent it = new Intent(getActivity(),MainFragmentBActivity.class);
                    it.putExtra("goidulieu","A");
                    startActivity(it);
                }
            }
        });

        btn_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentB fragmentB  = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
                if(fragmentB!=null && fragmentB.isInLayout()){
                    fragmentB.txtB.setText("B");
                }else {
                    Intent it = new Intent(getActivity(),MainFragmentBActivity.class);
                    it.putExtra("goidulieu","B");
                    startActivity(it);
                }
            }
        });

        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentB fragmentB  = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentB);
                if(fragmentB!=null && fragmentB.isInLayout()){
                    fragmentB.txtB.setText("C");
                }else {
                    Intent it = new Intent(getActivity(),MainFragmentBActivity.class);
                    it.putExtra("goidulieu","C");
                    startActivity(it);
                }
            }
        });
        return  view;

    }
}
