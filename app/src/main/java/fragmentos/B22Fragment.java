package fragmentos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import galacticos.complixlite.R;

import static fragmentos.DialogoPersonalizadoFragment.segmn;


public class B22Fragment extends Fragment {



    private static int rb22_11=0;
    private static int ib22_11=0;

    private static int rb22_21=0;
    private static int ib22_21=0;



    private TextView b22_11;
    private TextView b22_21;


    public B22Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.mb22_layout, container, false);
        instancias(view);
        events();
        return view;
    }

    public void instancias(View view){

        b22_11 = (TextView) view.findViewById(R.id.b22_11);
        if (rb22_11==0&&ib22_11==0){
            b22_11.setText("");
        }
        else {
            b22_11.setText("="+convertirToString(rb22_11) + "+" + convertirToString(ib22_11) + "i");
        }


        b22_21 = (TextView) view.findViewById(R.id.b22_21);
        if (rb22_21==0&&ib22_21==0){
            b22_21.setText("");
        }
        else {
            b22_21.setText(convertirToString(rb22_21) + "+" + convertirToString(ib22_21) + "i");
        }


    }

    private void events() {


        b22_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //numero.setTextColor(numero.getContext().getResources().getColor(R.color.MORADO));
                //a22_11.setBackgroundColor(a22_11.getContext().getResources().getColor(R.color.colorBase3));
                //a22_11.setBackgroundColor(R.color.colorAccent);
                //openDialog();
                dialogoPersonalizado(0);


            }
        });



        b22_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialogoPersonalizado(2);


            }
        });
    }

    public void updateMessage(int idSegmn,int real,int imagi) {
        switch (idSegmn) {
            case 0:
                this.rb22_11= real;
                this.ib22_11 = imagi;
                this.b22_11.setText("="+convertirToString(real)+"+"+convertirToString(imagi)+"i");
                break;
            case 2:
                this.rb22_21= real;
                this.ib22_21 = imagi;
                this.b22_21.setText("="+convertirToString(real)+"+"+convertirToString(imagi)+"i");
                break;
        }
    }


    public int getReal(int ntextviewr) {

        switch (ntextviewr) {

            case 0:
                int real = rb22_11;
                return real;
            case 2:
                int real21 = rb22_21;
                return real21;
        } return 0;

    }

    public int getImagi(int ntextviewi) {

        switch (ntextviewi) {
            case 0:
                int imagi = ib22_11;
                return imagi;
            case 2:
                int imagi21 = ib22_21;
                return imagi21;
        } return 0;

    }


    public void updateMessage(String message) {

        //ra22_11=+convertirToInteger(message);
    }


    public String convertirToString(int variable){
        String variableString =  String.valueOf(variable);
        return variableString;


    }


    public int convertirToInteger(String variable){
        int variableInt =  Integer.parseInt(variable);
        return variableInt;
    }


    public void dialogoPersonalizado(int identiSegmn){
        DialogoPersonalizadoFragment dialogoPersonalizado = new DialogoPersonalizadoFragment();
        dialogoPersonalizado.setContext("b22",identiSegmn);
        dialogoPersonalizado.show(getFragmentManager(), "personalizado");
    }

}

