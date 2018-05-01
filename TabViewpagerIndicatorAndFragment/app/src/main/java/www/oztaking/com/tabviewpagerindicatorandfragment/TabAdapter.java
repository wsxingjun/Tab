package www.oztaking.com.tabviewpagerindicatorandfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Administrator on 2018-05-01.
 */

public class TabAdapter extends FragmentPagerAdapter {

    public static int pos;
    public static String[] TITLE = {"课程", "开策", "马宝包", "成绩单", "学习", "问答",};

    public TabAdapter(FragmentManager fm ) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
//        Bundle bundle = new Bundle();
//        bundle.putInt("POS",position);
        pos = position;
        TabFragment tabFragment = new TabFragment();
        return tabFragment;
    }

    @Override
    public int getCount() {
        return TITLE.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TITLE[position];
    }
}
