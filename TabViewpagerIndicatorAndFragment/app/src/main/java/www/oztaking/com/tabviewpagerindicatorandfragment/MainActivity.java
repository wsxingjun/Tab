package www.oztaking.com.tabviewpagerindicatorandfragment;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {

    private TabPageIndicator mVpi_tabPageIndicator;
    private TabAdapter mTabAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        ViewPager vp_viewPager = (ViewPager) findViewById(R.id.vp_viewPager);
        mVpi_tabPageIndicator = (TabPageIndicator)findViewById(R.id.vpi_tabPageIndicator);
        mTabAdapter = new TabAdapter(getSupportFragmentManager());
        vp_viewPager.setAdapter(mTabAdapter);

        mVpi_tabPageIndicator.setViewPager(vp_viewPager);
    }


}
