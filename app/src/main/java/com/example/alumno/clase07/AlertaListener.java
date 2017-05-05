package com.example.alumno.clase07;

import android.content.DialogInterface;
import android.util.Log;

/**
 * Created by alumno on 04/05/2017.
 */

public class AlertaListener implements DialogInterface.OnClickListener{

    @Override
    public void onClick(DialogInterface dialog, int which) {
        if (which == dialog.BUTTON_POSITIVE)
            Log.d("Alert", "Boton OK");
    }
}
