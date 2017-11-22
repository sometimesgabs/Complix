package fragmentos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class SectionsPageAdapter extends FragmentPagerAdapter {


    private static final String TAG = "SectionsPageAdapter";
    public static final int FRAG_A22 = 0;
    public static final int FRAG_B22 = 1;
    public static final int FRAG_C22 = 2;
    private static final int NUM_PAGES = 3;

    private Fragment[] fragmentList;
    private String messageA;
    private String messageB;
    private String messageC;
    private FragmentManager fragmentManager;

    private A22Fragment a22Fragment = new A22Fragment();
    private B22Fragment b22Fragment = new B22Fragment();
    private C22Fragment c22Fragment = new C22Fragment();


    public SectionsPageAdapter(FragmentManager fm) {
        super(fm);
        this.fragmentManager = fm;
        fragmentList = new Fragment[NUM_PAGES];
        fragmentList[0] = a22Fragment;
        fragmentList[1] = b22Fragment;
        fragmentList[2] = c22Fragment;
    }

/*
    private final List<Fragment> mFragmentList = new ArrayList<>();
    public void addFragment(Fragment fragment) {
        mFragmentList.add(fragment);

}*/


    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case FRAG_A22:
                fragmentList[position] = new A22Fragment();
                return fragmentList[position];
            case FRAG_B22:
                fragmentList[position] = new B22Fragment();
                return fragmentList[position];
            case FRAG_C22:
                fragmentList[position] = new C22Fragment();
                return fragmentList[position];
        }
        return null;
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }


    public void updateFragment(int fragment,int segmn,double real, double imagi)
    {
        switch (fragment)
        {
            case FRAG_A22:
                //messageA= message;
                //((A22Fragment)fragmentList[fragment]  ).updateMessage(message);
                ((A22Fragment)fragmentList[fragment]).updateMessage(segmn,real,imagi);
                break;
            case FRAG_B22:
                //((B22Fragment)fragmentList[fragment]).updateMessage(segmn,real,imagi);
                break;
            case FRAG_C22:
                //messageC= message;
                //((C22Fragment)fragmentList[fragment]).updateMessage(segmn,real,imagi);
                break;
        }
    }

 public double getFragmentReal(int fragment,int ntextviewr) {


        switch (fragment) {

            case FRAG_A22:
            return ((A22Fragment) fragmentList[fragment]).getReal(ntextviewr);

            case FRAG_B22:
            //return ((B22Fragment)fragmentList[fragment]).getReal(ntextviewr);

            case FRAG_C22:
                //return ((C22Fragment)fragmentList[fragment]).getReal();
                break;
        } return 0.0;
 }



public double getFragmentImagi(int fragment,int ntextviewi){

    switch (fragment) {

        case FRAG_A22:
        return ((A22Fragment) fragmentList[fragment]).getImagi(ntextviewi);
        case FRAG_B22:
        //return ((B22Fragment)fragmentList[fragment]).getImagi(ntextviewi);
        case FRAG_C22:
            //return ((C22Fragment)fragmentList[fragment]).getReal();
        break;
    } return 0.0;

    }




    @Override
    public int getCount() {
        return NUM_PAGES;
    }



}

/*    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}*/
