package com.example.neo.coursecenterworkshop;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by NEO on 4/6/2018.
 */

public class TheDialod extends AppCompatDialogFragment {

    //private TextView text;
    Context context;
    //private Button btnSure ;
    //private Button btnNo ;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //LayoutInflater inflater = getActivity().getLayoutInflater();
        //View view =inflater.inflate(R.layout.dialog_confirmation,null);

        builder.setMessage(" Do you want to register ! ").setTitle("")
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {


                    }
                }).setPositiveButton("Save", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        // text = view.findViewById(R.id.textViewDialog);
        // view.findViewById(R.id.btnSure);
        // view.findViewById(R.id.btnNo);

        return builder.create();
    }

}
