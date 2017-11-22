package fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import galacticos.complixlite.R;


public class C22Fragment extends Fragment {

    private static int rc22_11=0;
    private static int ic22_11=0;

    private static int rc22_12=0;
    private static int ic22_12=0;

    private static int rc22_21=0;
    private static int ic22_21=0;

    private static int rc22_22=0;
    private static int ic22_22=0;


    private TextView c22_11;
    private TextView c22_12;

    private TextView c22_21;
    private TextView c22_22;


    public C22Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.mc22_layout, container, false);
        instancias(view);
        return view;
    }

    public void instancias(View view){

        c22_11 = (TextView) view.findViewById(R.id.c22_11);
       // c22_11.setText(convertirToString(rc22_11)+"+"+convertirToString(ic22_11)+"i");

        c22_12 = (TextView) view.findViewById(R.id.c22_12);
        //c22_12.setText(convertirToString(rc22_12)+"+"+convertirToString(ic22_12)+"i");

        c22_21 = (TextView) view.findViewById(R.id.c22_21);
        //c22_21.setText(convertirToString(rc22_21)+"+"+convertirToString(ic22_21)+"i");

        c22_22 = (TextView) view.findViewById(R.id.c22_22);
        //c22_22.setText(convertirToString(rc22_22)+"+"+convertirToString(ic22_22)+"i");


    }


    public int getReal(int ntextviewr) {

        switch (ntextviewr) {

            case 0:
                int real = rc22_11;
                return real;

            case 1:
                int real12 = rc22_12;
                return real12;

            case 2:
                int real21 = rc22_21;
                return real21;

            case 3:
                int real22 = rc22_22;
                return real22;

        } return 0;

    }

    public void updateMessage(int segmn,int real,int imagi) {
        switch (segmn) {
            case 0:
                this.rc22_11= real;
                this.ic22_11 = imagi;
                this.c22_11.setText(convertirToString(real)+"+"+convertirToString(imagi)+"i");
                break;
            case 1:
                this.rc22_12= real;
                this.ic22_12 = imagi;
                this.c22_12.setText(convertirToString(real)+"+"+convertirToString(imagi)+"i");
                break;
            case 2:
                this.rc22_21= real;
                this.ic22_21 = imagi;
                this.c22_21.setText(convertirToString(real)+"+"+convertirToString(imagi)+"i");
                break;
            case 4:

                this.rc22_22= real;
                this.ic22_22 = imagi;
                this.c22_11.setText(convertirToString(real)+"+"+convertirToString(imagi)+"i");

                break;

            //rc22_11  =+   convertirToInteger(message);
            //rc22_11 = rc22_11 + convertirToInteger(message); }
        }
    }

    public String convertirToString(int variable){
        String variableString =  String.valueOf(variable);
        return variableString;


    }

    public int convertirToInteger(String variable){
        int variableInt =  Integer.parseInt(variable);
        return variableInt;
    }
}

