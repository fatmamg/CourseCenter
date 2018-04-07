package com.example.neo.coursecenterworkshop.TheFragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.neo.coursecenterworkshop.Main3Activity;
import com.example.neo.coursecenterworkshop.MyReference;
import com.example.neo.coursecenterworkshop.R;
import com.firebase.ui.database.FirebaseListAdapter;

/**
 * Created by NEO on 4/5/2018.
 */

public class Tab3Fragment extends Fragment {
    private static final String TAG = "Tab3Fragment";

    Context context;

    ListView listView;
    Button btn;

    FirebaseListAdapter <MyReference> firebaseListAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab3_fragment, container, false);

        listView = view.findViewById(R.id.listOfRegister);
        btn = view.findViewById(R.id.btnShow);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firebaseListAdapter = new FirebaseListAdapter<MyReference>(context , MyReference.class
                        ,R.layout.register_row, Main3Activity.myRef) {

                    @Override
                    protected void populateView(View v, MyReference model, int position) {
                        TextView roN = v.findViewById(R.id.roomView);
                        TextView subN = v.findViewById(R.id.subjView);
                        TextView dateN = v.findViewById(R.id.dateView);
                        TextView timeFN = v.findViewById(R.id.timeFromView);
                        TextView timeTN = v.findViewById(R.id.timeToView);
                        TextView lecN = v.findViewById(R.id.lecturerView);
                        TextView horN = v.findViewById(R.id.hourNoView);

                        roN.setText(model.getRoomName());
                        subN.setText(model.getSubjectName());
                        dateN.setText("" + model.getDayDate());
                        timeFN.setText("" + model.getTimeFrom());
                        timeTN.setText("" + model.getTimeTo());
                        lecN.setText(model.getLectureName());
                        horN.setText("" + model.getDayHour());
                    }

                };
                listView.setAdapter(firebaseListAdapter);
            }

        });

        return view;
    }

}
