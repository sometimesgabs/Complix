package galacticos.complixlite;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import fragmentos.SectionsPageAdapter;

public class MainActivity extends AppCompatActivity implements Comunicador {


    private static final String TAG = "MainActivity";
    private TextView mTextMessage;
    public TextView tv_test;
    private SectionsPageAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    //public  deleteview;

    public ImageView igualview,deleteview;

    public Button btn_test;

    double acumulaReal;
    double getAcumulaimagi;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
//                    mTextMessage.setText(R.string.title_home);
                    mViewPager.setCurrentItem(0);



                    return true;
                case R.id.navigation_notifications:
                    //mTextMessage.setText(R.string.title_dashboard);
                    mViewPager.setCurrentItem(1);
                    return true;
            }
            return false;
        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewPager = (ViewPager) findViewById(R.id.containermpager);
        mSectionsPagerAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(mSectionsPagerAdapter);


        igualview = (ImageView) findViewById(R.id.igualview);
        igualview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double ra22_11 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,0);
                double ia22_11 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,0);

                double ra22_12 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,1);
                double ia22_12 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,1);

                double ra22_21 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,2);
                double ia22_21 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,2);

                double ra22_22 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,3);
                double ia22_22 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,3);

                double rb22_12 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,4);
                double ib22_12 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,4);

                double rb22_21 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,5);
                double ib22_21 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,5);





                //siste2(0,1,-3,0,4,0,1,-1,-7,2,10,2);

                //siste2(1,-1,3,-2,1,5,0,3,4,-3,4,1);
                //NO siste2(15,-32,34,0,0,27,0,-6,15,0,21,0);
                //siste2(2,1,2,0,1,-1,0,1,1,7,0,0);

                //siste2(ra22_11,ia22_11,ra22_12,ia22_12,ra22_21,ia22_21,ra22_22,ia22_22,1,7,0,0);

                siste2(ra22_11,ia22_11,ra22_12,ia22_12,ra22_21,ia22_21,ra22_22,ia22_22,rb22_12,ib22_12,rb22_21,ib22_21);



                //productoComplejo(4,-0,0,1 );

                //mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,3,complejoconjugado(6,8),0);


            }
        });

        deleteview = (ImageView) findViewById(R.id.deleteview);
        deleteview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,0,0,0);
                mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,1,0,0);
                mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,2,0,0);
                mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,3,0,0);
                mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,4,0,0);
                mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,5,0,0);



            }
        });




       // mTextMessage = (TextView) findViewById(R.id.message);
        tv_test = (TextView) findViewById(R.id.tv_test);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }


    public void igual(){

        double ra22_11 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,0);
        double ia22_11 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,0);

        double ra22_12 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,1);
        double ia22_12 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,1);

        double ra22_21 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,2);
        double ia22_21 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,2);

        double ra22_22 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,3);
        double ia22_22 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,3);

        double rb22_12 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,4);
        double ib22_12 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,4);

        double rb22_21 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,5);
        double ib22_21 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,5);





        //siste2(0,1,-3,0,4,0,1,-1,-7,2,10,2);

        //siste2(1,-1,3,-2,1,5,0,3,4,-3,4,1);
        //NO siste2(15,-32,34,0,0,27,0,-6,15,0,21,0);
        //siste2(2,1,2,0,1,-1,0,1,1,7,0,0);

        //siste2(ra22_11,ia22_11,ra22_12,ia22_12,ra22_21,ia22_21,ra22_22,ia22_22,1,7,0,0);

        siste2(ra22_11,ia22_11,ra22_12,ia22_12,ra22_21,ia22_21,ra22_22,ia22_22,rb22_12,ib22_12,rb22_21,ib22_21);


    }



    @Override
    public void setValores(int fragment, int idSegment, double datos, double datos2) {


        //mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_B22, idSegment, datos, datos2);
        if(fragment==0) {
            switch (idSegment) {
                case 0:
                    mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22, idSegment, datos, datos2);
                    break;
                case 1:
                    mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22, idSegment, datos, datos2);
                    break;
                case 2:
                    mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22, idSegment, datos, datos2);
                    break;
                case 3:
                    mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22, idSegment, datos, datos2);
                    break;

                case 4:
                    mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22, idSegment, datos, datos2);
                    break;
                case 5:
                    mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22, idSegment, datos, datos2);
                    break;

            }}

            if (fragment == 1) {
                switch (idSegment) {
                    case 0:
                        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_B22, idSegment, datos, datos2);
                        break;
                    case 1:
                        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_B22, idSegment, datos, datos2);
                        break;
                    case 2:
                        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_B22, idSegment, datos, datos2);
                        break;
                    case 3:
                        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_B22, idSegment, datos, datos2);
                        break;
                }
            }
        }



    @Override
    public double getValorReal(int fragment,int segmn) {

        double hola =mSectionsPagerAdapter.getFragmentReal(fragment,segmn);
        double hola2 =mSectionsPagerAdapter.getFragmentImagi(fragment,segmn);
        return hola;
    }

    @Override
    public double getValorImagi(int fragment,int segmn) {

        double hola2 =mSectionsPagerAdapter.getFragmentImagi(fragment,segmn);
        return hola2;
    }



    @Override
    public void onBackPressed() {
        if (mViewPager.getCurrentItem() == 0) {
            super.onBackPressed();
        } else {
            mViewPager.setCurrentItem(mViewPager.getCurrentItem() - 1);
        }
    }

    public double complejoconjugado(double real, double imagi){

         double compconj = (real*real)+(real*(-imagi))+(imagi*real)+((imagi*(-imagi))*(-1));



                //6(6) + 6(–8i) + 8i(6) + 8i(–8i);

        return compconj;
    }

    public void productoComplejo(double real1, double imagi1,double real2, double imagi2){

        double real=(real1*real2)+((imagi1*imagi2)*(-1));
        double imagi = (real1*imagi2)+(imagi1*real2);

        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,3,real,imagi);



        /* 6(4) + 6(2i) + 8i(4) + 8i(2i)
        (6 + 8i)(4 + 2i)
        24 + 12i + 32i + 16i2
        24 + 44i + 16i2
        24 + 44i + 16(-1)
        24 + 44i – 16
        8 + 44i*/




    }


    public void siste2(double real1,double imagi1,double real2,double imagi2,double real3,double imagi3,double real4,double imagi4,double zreal1,double zimagi1,double zreal2,double zimagi2){

        double realelim= (real3)*(-1);
        double imagielim = (imagi3)*(-1);

        double realu2=(realelim*real2)+((imagielim*imagi2)*(-1));
        double imagiu2 = (realelim*imagi2)+(imagielim*real2);


        double zrealu1=(realelim*zreal1)+((imagielim*zimagi1)*(-1));
        double zimagiu1 = (realelim*zimagi1)+(imagielim*zreal1);

        ///////////////////////////////////////////////////////////////

        double realu4=(real1*real4)+((imagi1*imagi4)*(-1));
        double imagiu4 = (real1*imagi4)+(imagi1*real4);

        double zrealu2=(real1*zreal2)+((imagi1*zimagi2)*(-1));
        double zimagiu2 = (real1*zimagi2)+(imagi1*zreal2);

        calculaY(realu2,imagiu2,zrealu1,zimagiu1,realu4,imagiu4,zrealu2,zimagiu2);

        //mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,0,real,imagi);
       // mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,0,realu2,imagiu2);
        //mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,1,zrealu1,zimagiu1);

        //mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,2,realu4,imagiu4);
        //mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,3,zrealu2,zimagiu2);







    }


    public void calculaY(double realu2, double imagiu2, double zreal1,double zimagi1,double realu4, double imagiu4, double zrealu2,double zimagiu2){



        double yreal1= (realu2)+(realu4);
        double yimagi1 = (imagiu2)+(imagiu4);
        double yzreal1 = (zreal1) + (zrealu2);
        double yzimagi1 = (zimagi1) + (zimagiu2);

        double yimagi1conj = (yimagi1)*(-1);

        double yfreal= ((yzreal1*yreal1)+(yzimagi1*yimagi1conj)*(-1));
        double yfimagi = (yzreal1*yimagi1conj)+(yzimagi1*yreal1);



        double ydimagi=(yreal1*yreal1)+(yreal1*yimagi1conj)+(yimagi1*yreal1)+((yimagi1*yimagi1conj)*(-1));

        //double y = (yfreal) / (yfimagi);

        //mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,0,realu2,imagiu2);
        //mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,1,zrealu1,zimagiu1);

        //mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,2,yfreal,yfimagi);


        int a = (int) yfreal;
        int b = (int) yfimagi;
        int c = (int) ydimagi;


        tv_test.setText(convertirToString2(a)+"+"+convertirToString2(b)+"i"+"/"+convertirToString2(c));

       //asignarValor(yfreal,tv_test,yfimagi);

        //mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_A22,3,yzreal1,yzimagi1);


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


    public int entero(double x) {
        if (x % 1 == 0) {
            return 1;
        } else {
            return 0;
        }
    }


 public void calculaX(){




 }




    public String convertirToString(double variable){
        String variableString =  String.valueOf(variable);
        return variableString;


    }

    public String convertirToString2(int variable){
        String variableString =  String.valueOf(variable);
        return variableString;


    }



 /*   public void sumaAB(){

        int ra22_11 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,0);
        int rb22_11 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_B22,0);

        int ra22_12 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,1);
        int rb22_12 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_B22,1);

        int ra22_21 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,2);
        int rb22_21 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_B22,2);

        int ra22_22 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,3);
        int rb22_22 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_B22,3);


        int ia22_11 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,0);
        int ib22_11 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_B22,0);

        int ia22_12 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,1);
        int ib22_12 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_B22,1);

        int ia22_21 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,2);
        int ib22_21 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_B22,2);

        int ia22_22 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,3);
        int ib22_22 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_B22,3);

        int rc22_11= ra22_11 + rb22_11;
        int ic22_11= ia22_11 + ib22_11;

        int rc22_12= ra22_12 + rb22_12;
        int ic22_12= ia22_12 + ib22_12;

        int rc22_21= ra22_21 + rb22_21;
        int ic22_21= ia22_21 + ib22_21;

        int rc22_22= ra22_22 + rb22_22;
        int ic22_22= ia22_22 + ib22_22;


        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_C22,0,rc22_11,ic22_11);
        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_C22,1,rc22_12,ic22_12);
        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_C22,2,rc22_21,ic22_21);
        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_C22,3,rc22_22,ic22_22);


    }*/

  /*  public void sumaAB(){

        int ra22_11 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,0);
        int rb22_11 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_B22,0);

        int ra22_12 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,1);
        int rb22_12 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_B22,1);

        int ra22_21 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,2);
        int rb22_21 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_B22,2);

        int ra22_22 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_A22,3);
        int rb22_22 =mSectionsPagerAdapter.getFragmentReal(mSectionsPagerAdapter.FRAG_B22,3);


        int ia22_11 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,0);
        int ib22_11 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_B22,0);

        int ia22_12 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,1);
        int ib22_12 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_B22,1);

        int ia22_21 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,2);
        int ib22_21 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_B22,2);

        int ia22_22 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_A22,3);
        int ib22_22 =mSectionsPagerAdapter.getFragmentImagi(mSectionsPagerAdapter.FRAG_B22,3);

        int rc22_11= ra22_11 + rb22_11;
        int ic22_11= ia22_11 + ib22_11;

        int rc22_12= ra22_12 + rb22_12;
        int ic22_12= ia22_12 + ib22_12;

        int rc22_21= ra22_21 + rb22_21;
        int ic22_21= ia22_21 + ib22_21;

        int rc22_22= ra22_22 + rb22_22;
        int ic22_22= ia22_22 + ib22_22;


        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_C22,0,ra22_11,ia22_11);
        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_C22,1,ra22_12,ia22_12);

        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_C22,2,ra22_21,ia22_21);
        mSectionsPagerAdapter.updateFragment(mSectionsPagerAdapter.FRAG_C22,3,ra22_22,ia22_22);


    }*/



}
