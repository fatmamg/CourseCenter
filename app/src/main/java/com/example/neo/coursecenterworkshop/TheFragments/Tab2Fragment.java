package com.example.neo.coursecenterworkshop.TheFragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.neo.coursecenterworkshop.CompleteRegister;
import com.example.neo.coursecenterworkshop.Main3Activity;
import com.example.neo.coursecenterworkshop.MyReference;
import com.example.neo.coursecenterworkshop.R;
import com.example.neo.coursecenterworkshop.TheDialod;

/**
 * Created by NEO on 4/5/2018.
 */

public class Tab2Fragment extends Fragment {

    Context context ;

  /*  private static final String TAG = "Tab2Fragment";

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab2_fragment,container,false);

        textView = view.findViewById(R.id.textView);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Snackbar.make(view,"hello honey",Snackbar.LENGTH_LONG).setAction("Text",null).show();
                textView.setText("hello honey");
            }
        });
        return view;
    } */

    private Button btnDialod;
    EditText roName , lecName , timeFrom , timeTo , subName ,hrNo , dt ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tab2_fragment,container,false);



        lecName = view.findViewById(R.id.lecturerName);
        subName = view.findViewById(R.id.subjectsName);
        roName = view.findViewById(R.id.roomsName);
        timeFrom = view.findViewById(R.id.from);
        timeTo = view.findViewById(R.id.to);
        hrNo = view.findViewById(R.id.hoursNumber);
        dt = view.findViewById(R.id.date);

        btnDialod = view.findViewById(R.id.btnOk);

        btnDialod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!roName.getText().toString().isEmpty() && !lecName.getText().toString().isEmpty()
                        && !subName.getText().toString().isEmpty()&& !dt.getText().toString().isEmpty()
                        && !hrNo.getText().toString().isEmpty() && !timeFrom.getText().toString().isEmpty()
                        && !timeTo.getText().toString().isEmpty()){
                    String mKey;
                    MyReference myReference = new MyReference(roName.getText().toString(),
                            lecName.getText().toString(), subName.getText().toString(),
                            Integer.parseInt(dt.getText().toString()), Double.parseDouble(hrNo.getText().toString()),
                            Double.parseDouble(timeFrom.getText().toString()), Double.parseDouble(timeTo.getText().toString()));
                    mKey = Main3Activity.myRef.push().getKey();
                    Main3Activity.myRef.child(mKey).setValue(myReference);
                    roName.setText("");
                    lecName.setText("");
                    subName.setText("");
                    dt.setText("");
                    hrNo.setText("");
                    timeFrom.setText("");
                    timeTo.setText("");
                    Snackbar.make(view, "Successful registration", Snackbar.LENGTH_LONG).show();
                   // Toast.makeText(context,"Successful registration",Toast.LENGTH_LONG).show();
                }
                else {
                    Snackbar.make(view, "full the form ! ", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }


                }
            //    openDialog();
            }
        );



        return view;
    }

    public void openDialog(){

        TheDialod dialod = new TheDialod();
        dialod.show(getFragmentManager(),"dialog");

   /*     AlertDialog.Builder builder = new AlertDialog.Builder(context);

        View view1 = getLayoutInflater().inflate(R.layout.dialog_confirmation,null);

        TextView text = view1.findViewById(R.id.textViewDialog);
        Button btnSure = view1.findViewById(R.id.btnSure);
        Button btnNo = view1.findViewById(R.id.btnNo);

        btnSure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,CompleteRegister.class);
                startActivity(intent);
            }
        });

        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"press sure to register",Toast.LENGTH_LONG).show();
            }
        });
        builder.setView(view1);
        AlertDialog dialog = builder.create();
        dialog.show();
 */    }
}



