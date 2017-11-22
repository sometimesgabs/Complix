package fragmentos;


import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import galacticos.complixlite.R;


public class A22Fragment extends Fragment {

/*  private static String ARG_PARAM1 = "HEAAR";
    private static final String ARG_PARAM2 = "param2";
    private static final String TAG = "A22Fragment";

    private String mParam1 ="hear2";
    private String mParam2;*/


//Reales


    private static double ra22_11 = 0;
    private static double ia22_11 = 0;

    private static double ra22_12 = 0;
    private static double ia22_12 = 0;

    private static double ra22_21 = 0;
    private static double ia22_21 = 0;

    private static double ra22_22 = 0;
    private static double ia22_22 = 0;

    private static double rb22_12 = 0;
    private static double ib22_12 = 0;

    private static double rb22_21 = 0;
    private static double ib22_21 = 0;


    private TextView a22_11;
    private TextView a22_12;

    private TextView a22_21;
    private TextView a22_22;

    private TextView b22_12;
    private TextView b22_21;


    public A22Fragment() {
    }

    @Override

/*    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString("hola");
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    public static A22Fragment newInstance(String mParam1, String param2) {
        A22Fragment fragment = new A22Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, "hear4");
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }*/


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.ma22_layout, container, false);
        instancias(view);
        return view;
    }


    public void instancias(View view) {

        a22_11 = (TextView) view.findViewById(R.id.a22_11);
        if (ra22_11 == 0 && ia22_11 == 0) {
            a22_11.setText("");
        } else {
            a22_11.setText(convertirToString(ra22_11) + "+" + convertirToString(ia22_11) + "i");
        }


        a22_12 = (TextView) view.findViewById(R.id.a22_12);
        if (ra22_12 == 0 && ia22_12 == 0) {
            a22_12.setText("");
        } else {
            a22_12.setText(convertirToString(ra22_12) + "+" + convertirToString(ia22_12) + "i");
        }


        a22_21 = (TextView) view.findViewById(R.id.a22_21);
        if (ra22_21 == 0 && ia22_21 == 0) {
            a22_21.setText("");
        } else {
            a22_21.setText(convertirToString(ra22_21) + "+" + convertirToString(ia22_21) + "i");
        }


        a22_22 = (TextView) view.findViewById(R.id.a22_22);
        if (ra22_22 == 0 && ia22_22 == 0) {
            a22_22.setText("");
        } else {
            a22_22.setText(convertirToString(ra22_22) + "+" + convertirToString(ia22_22) + "i");
        }

        b22_12 = (TextView) view.findViewById(R.id.b22_12);
        if (rb22_12 == 0 && ib22_12 == 0) {
            b22_12.setText("");
        } else {
            b22_12.setText(convertirToString(rb22_12) + "+" + convertirToString(ib22_12) + "i");
        }

        b22_21 = (TextView) view.findViewById(R.id.b22_21);
        if (rb22_21 == 0 && ib22_21 == 0) {
            b22_21.setText("");
        } else {
            b22_21.setText(convertirToString(rb22_21) + "+" + convertirToString(ib22_21) + "i");
        }


        events();

    }


    private void events() {


        a22_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //numero.setTextColor(numero.getContext().getResources().getColor(R.color.MORADO));
                //a22_11.setBackgroundColor(a22_11.getContext().getResources().getColor(R.color.colorBase3));
                //a22_11.setBackgroundColor(R.color.colorAccent);
                //openDialog();

                dialogoPersonalizado(0);


            }
        });

        a22_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //numero.setTextColor(numero.getContext().getResources().getColor(R.color.MORADO));
                //a22_11.setBackgroundColor(a22_11.getContext().getResources().getColor(R.color.colorBase3));
                //a22_11.setBackgroundColor(R.color.colorAccent);
                //openDialog();

                dialogoPersonalizado(1);


            }
        });

        a22_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //numero.setTextColor(numero.getContext().getResources().getColor(R.color.MORADO));
                //a22_11.setBackgroundColor(a22_11.getContext().getResources().getColor(R.color.colorBase3));
                //a22_11.setBackgroundColor(R.color.colorAccent);
                //openDialog();

                dialogoPersonalizado(2);


            }
        });

        a22_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //numero.setTextColor(numero.getContext().getResources().getColor(R.color.MORADO));
                //a22_11.setBackgroundColor(a22_11.getContext().getResources().getColor(R.color.colorBase3));
                //a22_11.setBackgroundColor(R.color.colorAccent);
                //openDialog();

                dialogoPersonalizado(3);


            }
        });


        b22_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //numero.setTextColor(numero.getContext().getResources().getColor(R.color.MORADO));
                //a22_11.setBackgroundColor(a22_11.getContext().getResources().getColor(R.color.colorBase3));
                //a22_11.setBackgroundColor(R.color.colorAccent);
                //openDialog();

                dialogoPersonalizado(4);


            }
        });

        b22_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //numero.setTextColor(numero.getContext().getResources().getColor(R.color.MORADO));
                //a22_11.setBackgroundColor(a22_11.getContext().getResources().getColor(R.color.colorBase3));
                //a22_11.setBackgroundColor(R.color.colorAccent);
                //openDialog();

                dialogoPersonalizado(5);


            }
        });


    }

/*
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }
*/






/*    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.ma22_layout,container,false);

        TextView ma22_11 = (TextView) view.findViewById(R.id.ma22_11);
        ma22_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialog();

            }
        });

        return view;
    }*/

/*    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

*/

/*    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.v(TAG, "onActivityCreated " + mParam1);
        if (!TextUtils.isEmpty(mParam1))
            updateMessage(mParam1);
    }

    public void updateMessage(String message) {

        //ra22_11=+convertirToInteger(message);
        ra22_11 = ra22_11 + convertirToInteger(message);
        String text = convertirToString(ra22_11);
        
        //ra22_11=message;
        a22_11.setText(text);
    }*/

    public void updateMessage(int segmn, double real, double imagi) {
        switch (segmn) {
            case 0:
                this.ra22_11 = real;
                this.ia22_11 = imagi;

                int n = entero(ra22_11);
                int m = entero(ia22_11);
                int r = (int) real;
                int i = (int) imagi;


                if (ra22_11==0 && ia22_11 == 0) {

                    this.a22_11.setText(convertirToString2(r) + "+" + convertirToString2(i) + "i");

                } else


                if (m==1 && ia22_11 == 0) {

                    this.a22_11.setText(convertirToString2(r) + "+" + convertirToString2(i) + "i");

                } else


                if (n == 1 && m == 0) {

                    if (ia22_11 == 0) {
                        ia22_11 = 0;
                        this.a22_11.setText(convertirToString2(r) + "+" + convertirToString(ia22_11) + "i");
                    }

                    if (ia22_11 > 0) {
                        this.a22_11.setText(convertirToString2(r) + "+" + convertirToString(ia22_11) + "i");
                    } else
                        this.a22_11.setText(convertirToString2(r) + convertirToString(imagi) + "i");
                } else





                    if (n == 0 && m == 1) {

                    if (ia22_11 == 0) {
                        ia22_11 = 0;
                        this.a22_11.setText(convertirToString(ra22_11) + "+" + convertirToString2(i) + "i");
                    }

                    if (ia22_11 > 0) {
                        this.a22_11.setText(convertirToString(ra22_11) + "+" + convertirToString2(i) + "i");
                    } else
                        this.a22_11.setText(convertirToString(ra22_11) + convertirToString2(i) + "i");


                } else if (n == 1 && m == 1) {

                    if (ia22_11 == 0) {
                        ia22_11 = 0;
                        this.a22_11.setText(convertirToString2(r) + "+" + convertirToString2(i) + "i");
                    }

                    if (ia22_11 > 0) {
                        this.a22_11.setText(convertirToString2(r) + "+" + convertirToString2(i) + "i");
                    }

                    else this.a22_11.setText(convertirToString2(r) + convertirToString2(i) + "i");

                } else

                    if (n == 0 && m == 0) {


                    if (ia22_11 == 0) {
                        ia22_11 = 0;
                        this.a22_11.setText(convertirToString(ra22_11) + "+" + convertirToString(ia22_11) + "i");
                    }

                    if (ia22_11 > 0) {
                        this.a22_11.setText(convertirToString(ra22_11) + "+" + convertirToString(ia22_11) + "i");
                    } else this.a22_11.setText(convertirToString(ra22_11) + convertirToString(ia22_11) + "i");


                }


                break;
            case 1:

                this.ra22_12 = real;
                this.ia22_12 = imagi;

                asignarValor(ra22_12,a22_12,ia22_12);


                break;
            case 2:
                this.ra22_21 = real;
                this.ia22_21 = imagi;

               asignarValor(ra22_21,a22_21,ia22_21);


                break;
            case 3:

                this.ra22_22 = real;
                this.ia22_22 = imagi;
                asignarValor(ra22_22,a22_22,ia22_22);

                break;


            case 4:

                this.rb22_12 = real;
                this.ib22_12 = imagi;
                asignarValor(rb22_12,b22_12,ib22_12);

                break;

            case 5:

                this.rb22_21 = real;
                this.ib22_21 = imagi;

                asignarValor(rb22_21,b22_21,ib22_21);


                break;


            //rc22_11  =+   convertirToInteger(message);
            //rc22_11 = rc22_11 + convertirToInteger(message); }
        }
    }


    public double getReal(int ntextviewr) {

        switch (ntextviewr) {

            case 0:
                double real11 = ra22_11;
                return real11;

            case 1:
                double real12 = ra22_12;
                return real12;

            case 2:
                double real21 = ra22_21;
                return real21;

            case 3:

                double real22 = ra22_22;
                return real22;


            case 4:

                double breal2 = rb22_12;
                return breal2;


            case 5:

                double breal21 = rb22_21;
                return breal21;

        }
        return 0;

    }


    public void asignarValor(double partereal, TextView textview, double parteimagi) {
/*
        this.ra22_11 = real;
        this.ia22_11 = imagi;*/

        int n = entero(partereal);
        int m = entero(parteimagi);
        int r = (int) partereal;
        int i = (int) parteimagi;


        if (partereal==0 && parteimagi == 0) {

            textview.setText(convertirToString2(r) + "+" + convertirToString2(i) + "i");

        } else


        if (m==1 && parteimagi == 0) {

            textview.setText(convertirToString2(r) + "+" + convertirToString2(i) + "i");

        } else



        if (n == 1 && m == 0) {

            if (parteimagi == 0) {
                parteimagi = 0;
                textview.setText(convertirToString2(r) + "+" + convertirToString(parteimagi) + "i");
            }

            if (parteimagi > 0) {
                textview.setText(convertirToString2(r) + "+" + convertirToString(parteimagi) + "i");
            } else
                textview.setText(convertirToString2(r) + convertirToString(parteimagi) + "i");
        } else

            if (n == 0 && m == 1) {

            if (parteimagi == 0) {
                parteimagi = 0;
                textview.setText(convertirToString(partereal) + "+" + convertirToString2(i) + "i");
            }

            if (parteimagi > 0) {
                textview.setText(convertirToString(partereal) + "+" + convertirToString2(i) + "i");
            } else
                textview.setText(convertirToString(partereal) + convertirToString2(i) + "i");


        } else if (n == 1 && m == 1) {

            if (parteimagi == 0) {
                parteimagi = 0;
                textview.setText(convertirToString2(r) + "+" + convertirToString2(i) + "i");
            }

            if (parteimagi > 0) {
                textview.setText(convertirToString2(r) + "+" + convertirToString2(i) + "i");
            } else textview.setText(convertirToString2(r) + convertirToString2(i) + "i");

        } else

        if (n == 0 && m == 0) {


            if (parteimagi == 0) {
                parteimagi = 0;
                textview.setText(convertirToString(partereal) + "+" + convertirToString(parteimagi) + "i");
            }

            if (parteimagi > 0) {
                textview.setText(convertirToString(partereal) + "+" + convertirToString(parteimagi) + "i");
            } else textview.setText(convertirToString(partereal) + convertirToString(parteimagi) + "i");


        }



    }











public double getImagi(int ntextviewi) {

        switch (ntextviewi) {

            case 0:
                double imagi = ia22_11;
                return imagi;

            case 1:
                double imagi12 =ia22_12;
                return imagi12;

            case 2:
                double imagi21 = ia22_21;
                return imagi21;

            case 3:

                double imagi22 = ia22_22;
                return imagi22;

            case 4:

                double bimagi12 = ib22_12;
                return bimagi12;

            case 5:

                double bimagi21 = ib22_21;
                return bimagi21;

        } return 0;

}





/*
    public int getImagi() {
        int imagi = ra22_12;
        return imagi;
    }

*/

    public String convertirToString(double variable){
        String variableString =  String.valueOf(variable);
        return variableString;


    }



    public String convertirToString2(int variable){
        String variableString =  String.valueOf(variable);
        return variableString;


    }



    public int entero(double x) {
        if (x % 1 == 0) {
            return 1;
        } else {
            return 0;
        }
    }



    public double convertirToInteger(String variable){
        double variableInt =  Double.parseDouble(variable);
        return variableInt;
    }

    public int convertirToInteger(double variable){

//        double a = 5.0/2;
        int b = (int)variable;
        return b;
    }

    public void dialogoPersonalizado(int identiSegmn){
        DialogoPersonalizadoFragment dialogoPersonalizado = new DialogoPersonalizadoFragment();
        //dialogoPersonalizado.setContexto("a22",identiSegmn);
        dialogoPersonalizado.setContext("a22",identiSegmn);
        dialogoPersonalizado.show(getFragmentManager(), "personalizado");
   }

/*        android.app.Fragment frag = getFragmentManager().findFragmentByTag("personalizado");

        if (frag != null) {
            getFragmentManager().beginTransaction().remove(frag).commit();
        }
    }*/




    public void pass(View view){
        Toast.makeText(getActivity(), "TESTING BUTTON CLICK 1",Toast.LENGTH_SHORT).show();

    }

}
