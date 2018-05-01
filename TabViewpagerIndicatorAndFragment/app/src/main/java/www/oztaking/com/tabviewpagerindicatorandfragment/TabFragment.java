package www.oztaking.com.tabviewpagerindicatorandfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Administrator on 2018-05-01.
 */

public class TabFragment extends Fragment{



    public TabFragment() {
    }

//    public TabFragment(int position) {
//        this.position = position;
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_frament, container, false);
        TextView tv_fragment = (TextView) view.findViewById(R.id.tv_fragment);
        tv_fragment.setText(TabAdapter.TITLE[TabAdapter.pos]);
        return view;
    }
}
