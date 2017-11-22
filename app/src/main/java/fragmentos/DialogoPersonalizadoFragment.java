package fragmentos;

import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import galacticos.complixlite.Comunicador;
import galacticos.complixlite.R;

/**
 * Created by nowor_000 on 03/02/2016.
 */
public class DialogoPersonalizadoFragment extends DialogFragment implements View.OnClickListener {


    public TextView tvreal;
    public TextView tvimagi;

    public static String segmn;

    public static int fragment;
    public static int idSegmento;


    public TextView tvSegmn;

    String display = "0";

    public static int flag_real;
    public static int flag_imagi;

    public static int flag_a11=0;
    public static int flag_a12;
    public static int flag_a21;
    public static int flag_a22;
    private static final int NUM_PAGES = 3;



    private int[] indiceSegmn;

/*
    fragmentList = new Fragment[NUM_PAGES];
    fragmentList[0] = a22Fragment;
    fragmentList[1] = b22Fragment;
    fragmentList[2] = c22Fragment;
*/

    public Button btnset;
    public Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9;
    public ImageView btn_done,btn_antSegmn,btn_nextSegmn;
    public Button btn_clear, btn_menos, btn_ret,btn_point;


    Comunicador comunicacion;

/*

    public interface NuevoDialogListener {
        void FinalizaCuadroDialogo(String texto);
    }
*/

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //  btnset = (Button) getActivity().findViewById(R.id.btnset);
        //btnset.setOnClickListener(this);
    }

    // El contructor vacio es requerido para el dialogFragment
    public DialogoPersonalizadoFragment() {}


    public static void setSegmn(String segmn) {
        DialogoPersonalizadoFragment.segmn = segmn;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        getDialog().requestWindowFeature(Window.FEATURE_NO_TITLE);
        View view = inflater.inflate(R.layout.dialogo_personalizado, container);

        comunicacion = (Comunicador) getActivity();


        btn_0 = (Button) view.findViewById(R.id.btn_0);
        btn_1 = (Button) view.findViewById(R.id.btn_1);
        btn_2 = (Button) view.findViewById(R.id.btn_2);
        btn_3 = (Button) view.findViewById(R.id.btn_3);
        btn_4 = (Button) view.findViewById(R.id.btn_4);
        btn_5 = (Button) view.findViewById(R.id.btn_5);
        btn_6 = (Button) view.findViewById(R.id.btn_6);
        btn_7 = (Button) view.findViewById(R.id.btn_7);
        btn_8 = (Button) view.findViewById(R.id.btn_8);
        btn_9 = (Button) view.findViewById(R.id.btn_9);
        btn_ret = (Button) view.findViewById(R.id.btn_ret);
        btn_clear = (Button) view.findViewById(R.id.btn_clear);
        btn_point = (Button) view.findViewById(R.id.btn_point);
        btn_menos = (Button) view.findViewById(R.id.btn_menos_real);

        //comunicacion.identiSegmn(0,segmn);


        btn_done = (ImageView) view.findViewById(R.id.btn_done);
        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double real = convertirToInteger(tvreal.getText().toString().trim());
                double imagi = convertirToInteger(tvimagi.getText().toString().trim());
                comunicacion.setValores(fragment,idSegmento,real,imagi);
        /*        flag_real=1;
                flag_imagi=0;*/
                dismiss();

            }
        });


        btn_antSegmn = (ImageView) view.findViewById(R.id.btn_antSegmn);
        btn_antSegmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvSegmn.setText("a11");

            }
        });

        btn_nextSegmn = (ImageView) view.findViewById(R.id.btn_nextSegmn);
        btn_nextSegmn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvSegmn.setText("a21");

            }
        });




        btn_1.setOnClickListener(this);
        btn_0.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_menos.setOnClickListener(this);
        btn_ret.setOnClickListener(this);
        btn_clear.setOnClickListener(this);
        btn_point.setOnClickListener(this);

        tvreal = (TextView) view.findViewById(R.id.tvreal);
        tvimagi = (TextView) view.findViewById(R.id.tvimagi);
        tvSegmn = (TextView) view.findViewById(R.id.tvsegmn);
        tvSegmn.setText(segmn);



        tvreal.setTextColor(tvreal.getContext().getResources().getColor(R.color.colorLetraRFR));
        tvimagi.setTextColor(tvimagi.getContext().getResources().getColor(R.color.colorLetraRFR_M));
        flag_real=1;
        flag_imagi=0;



        tvimagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag_real=0;
                flag_imagi=1;
                tvreal.setTextColor(tvreal.getContext().getResources().getColor(R.color.colorLetraRFR_M));
                tvimagi.setTextColor(tvimagi.getContext().getResources().getColor(R.color.colorLetraiFR));
                tvimagi.setBackgroundColor(tvreal.getContext().getResources().getColor(R.color.colorBlanco));
                tvreal.setBackgroundColor(tvimagi.getContext().getResources().getColor(R.color.colorGreyDesactivado));
            }

        });


        tvreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag_real=1;
                flag_imagi=0;
                tvreal.setTextColor(tvreal.getContext().getResources().getColor(R.color.colorLetraRFR));
                tvimagi.setTextColor(tvimagi.getContext().getResources().getColor(R.color.colorLetraRFR_M));
                tvreal.setBackgroundColor(tvreal.getContext().getResources().getColor(R.color.colorBlanco));
                tvimagi.setBackgroundColor(tvimagi.getContext().getResources().getColor(R.color.colorGreyDesactivado));
            }

        });

        getDatos();

        return view;



    }




    public String convertirToString(double variable){
        String variableString =  String.valueOf(variable);
        return variableString;


    }

    public double convertirToInteger(String variable){
        double variableInt =  Double.parseDouble(variable);
        return variableInt;
    }

    @Override
    public void onClick(View v) {


        if(flag_real==1&&flag_imagi==0){
            selectFocus(v.getId(), tvreal);
        }

        if (flag_real==0&&flag_imagi==1){
            selectFocus(v.getId(), tvimagi);
        }


   }

    public void selectFocus(int id,TextView textView){

       switch (id){



            case R.id.btn_0:
                if (textView.getText().equals("0")) {
                    textView.setText("0");
                }else
                    if(textView.getText().equals("-0")){
                        textView.setText("-0");
                    }else {textView.setText(textView.getText()+"0");}

                break;

            case R.id.btn_1:
                if (textView.getText().equals("0")) {
                    textView.setText("1");
                }else
                if(textView.getText().equals("-0")){
                    textView.setText("-1");
                }else {textView.setText(textView.getText()+"1");}
                //String real = tvreal.getText().toString().trim();
                //comunicacion.responder("hear");
                //dismiss();
                break;

            case R.id.btn_2:
                if (textView.getText().equals("0")) {
                    textView.setText("2");
                }else
                if(textView.getText().equals("-0")){
                    textView.setText("-2");
                }else {textView.setText(textView.getText()+"2");}
                break;

            case R.id.btn_3:
                if (textView.getText().equals("0")) {
                    textView.setText("3");
                }else
                if(textView.getText().equals("-0")){
                    textView.setText("-3");
                }else {textView.setText(textView.getText()+"3");}
                break;

           case R.id.btn_4:
               if (textView.getText().equals("0")) {
                   textView.setText("4");
               }else
               if(textView.getText().equals("-0")){
                   textView.setText("-4");
               }else {textView.setText(textView.getText()+"4");}
               break;

           case R.id.btn_5:
               if (textView.getText().equals("0")) {
                   textView.setText("5");
               }else
               if(textView.getText().equals("-0")){
                   textView.setText("-5");
               }else {textView.setText(textView.getText()+"5");}
               break;


           case R.id.btn_6:
               if (textView.getText().equals("0")) {
                   textView.setText("6");
               }else
               if(textView.getText().equals("-0")){
                   textView.setText("-6");
               }else {textView.setText(textView.getText()+"6");}
               break;

           case R.id.btn_7:
               if (textView.getText().equals("0")) {
                   textView.setText("7");
               }else
               if(textView.getText().equals("-0")){
                   textView.setText("-7");
               }else {textView.setText(textView.getText()+"7");}
               break;


           case R.id.btn_8:
               if (textView.getText().equals("0")) {
                   textView.setText("8");
               }else
               if(textView.getText().equals("-0")){
                   textView.setText("-8");
               }else {textView.setText(textView.getText()+"8");}
               break;

           case R.id.btn_9:
               if (textView.getText().equals("0")) {
                   textView.setText("9");
               }else
               if(textView.getText().equals("-0")){
                   textView.setText("-9");
               }else {textView.setText(textView.getText()+"9");}
               break;



            case R.id.btn_point:
                if(textView.getText().equals("0"))
                    textView.setText("0.");

                if (textView.getText().equals("-0")) {
                    textView.setText("-0.");
                }else
                       //indexOf es un valor de la clase stream
                    if(String.valueOf(textView.getText()).indexOf(".")<=0){
                        textView.setText(textView.getText()+".");
                    }
                break;


           case R.id.btn_menos_real:
               //indexOf es un valor de la clase stream
                Double temp = convertirToInteger(textView.getText().toString());

               temp= temp*(-1);
                textView.setText(convertirToString(temp));
           break;

            case R.id.btn_clear:
                textView.setText("0");
                //this.acumulador = (double) 0.0;
                //this.operando = (double) 0.0;
                this.display = "0";
                break;

            case R.id.btn_ret:
                String chain = textView.getText().toString();
                if(chain.length()>1){
                    chain = chain.substring(0, chain.length()-1);
                    if (chain.equals("-")){
                        textView.setText("0");
                    }else{ textView.setText(chain); }
                }
                else if (chain.length()<=1){
                    textView.setText("0");
                    this.display = "0";
                }
                break;
        }}


   public static void setContext(String fragmento, int idSegmn) {

        if(fragmento.equals("a22")){
            switch (idSegmn){
                case 0:
                    fragment=0;
                    idSegmento=0;
                    setSegmn("a11");
                break;

                case 1:
                    fragment=0;
                    idSegmento=1;
                    setSegmn("a12");
                break;

                case 2:
                    fragment=0;
                    idSegmento=2;
                    setSegmn("a21");
                break;

                case 3:
                    fragment=0;
                    idSegmento=3;
                    setSegmn("a22");
                break;

                case 4:
                    fragment=0;
                    idSegmento=4;
                    setSegmn("b12");
                    break;

                case 5:
                    fragment=0;
                    idSegmento=5;
                    setSegmn("b21");
                    break;

            }
        }

        if(fragmento.equals("b22")){

            switch (idSegmn){
                case 0:
                    fragment=1;
                    idSegmento=0;
                    setSegmn("b11");
                    break;

                case 2:
                    fragment=1;
                    idSegmento=2;
                    setSegmn("b21");
                    break;
            }
        }







    }


    public void getDatos() {

        if (fragment == 0) {
            switch (idSegmento) {
                case 0:

                    tvreal.setText(convertirToString(comunicacion.getValorReal(0, idSegmento)));
                    tvimagi.setText(convertirToString(comunicacion.getValorImagi(0, idSegmento)));
                      /*
                    int dato = comunicacion.getValorReal(0, idSegmento);
                    if (dato != 0) {
                         setSegmn("a11");
                    }*/
                    break;

                case 1:
                    double dato2 = comunicacion.getValorReal(0, idSegmento);
                    if (dato2 != 0) {
                        tvreal.setText(convertirToString(comunicacion.getValorReal(0, idSegmento)));
                        tvimagi.setText(convertirToString(comunicacion.getValorImagi(0, idSegmento)));
                        //setSegmn("a12");

                    }
                    break;

                case 2:


                    double dato3 = comunicacion.getValorReal(0, idSegmento);
                    if (dato3 != 0) {
                        tvreal.setText(convertirToString(comunicacion.getValorReal(0, idSegmento)));
                        tvimagi.setText(convertirToString(comunicacion.getValorImagi(0, idSegmento)));
                        //setSegmn("a21");
                    }
                    break;

                case 3:
                    double dato4 = comunicacion.getValorReal(0, idSegmento);
                    if (dato4 != 0) {
                        tvreal.setText(convertirToString(comunicacion.getValorReal(0, idSegmento)));
                        tvimagi.setText(convertirToString(comunicacion.getValorImagi(0, idSegmento)));
                        //setSegmn("a22");
                        break;
                    }

                case 4:
                    double dato5 = comunicacion.getValorReal(0, idSegmento);
                    if (dato5 != 0) {
                        tvreal.setText(convertirToString(comunicacion.getValorReal(0, idSegmento)));
                        tvimagi.setText(convertirToString(comunicacion.getValorImagi(0, idSegmento)));
                        //setSegmn("a22");
                        break;
                    }

                case 5:
                    double dato6 = comunicacion.getValorReal(0, idSegmento);
                    if (dato6 != 0) {
                        tvreal.setText(convertirToString(comunicacion.getValorReal(0, idSegmento)));
                        tvimagi.setText(convertirToString(comunicacion.getValorImagi(0, idSegmento)));
                        //setSegmn("a22");
                        break;
                    }


            }

        }
            if (fragment == 1) {
                switch (idSegmento) {
                    case 0:
                        double dato = comunicacion.getValorReal(1, idSegmento);
                        if (dato != 0) {
                            tvreal.setText(convertirToString(comunicacion.getValorReal(1, idSegmento)));
                            tvimagi.setText(convertirToString(comunicacion.getValorImagi(1, idSegmento)));
//                       setSegmn("a11");
                        }
                        break;

                    case 2:
                        double dato2 = comunicacion.getValorReal(1, idSegmento);
                        if (dato2 != 0) {
                            tvreal.setText(convertirToString(comunicacion.getValorReal(1, idSegmento)));
                            tvimagi.setText(convertirToString(comunicacion.getValorImagi(1, idSegmento)));
                            //setSegmn("a12");

                        }
                        break;
                }


        }


        //flag_real=1;


    }


 }


/*
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        // Return input text to activity
        NuevoDialogListener activity = (NuevoDialogListener) getActivity();
        activity.FinalizaCuadroDialogo(mEditText.getText().toString());
        this.dismiss();
        return true;
  }*/

