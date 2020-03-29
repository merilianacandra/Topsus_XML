package www.myandroidcode.verifiaction;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentDetail extends Fragment {
    View view;
    public FragmentDetail(){
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @NonNull ViewGroup container, @NonNull Bundle savedInstanceState){
        view = inflater.inflate(R.layout.detail_fragment, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
