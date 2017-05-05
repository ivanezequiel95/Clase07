package com.example.alumno.clase07;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
/**
 * Created by alumno on 04/05/2017.
 */

public class MyDialog  extends DialogFragment{
    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getContext());

        builder.setTitle("Alerta");
        builder.setMessage("Mensaje nuevo");
        AlertaListener alertaListener = new AlertaListener();
        builder.setPositiveButton("Ok", alertaListener);

        return builder.create();
    }
}
