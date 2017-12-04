package my.edu.tarc.lab33navigationdrawer;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ImportFragment extends Fragment {
    private TextView textViewMessage;
    public ImportFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_import, container, false);
        textViewMessage = (TextView)v.findViewById(R.id.textViewMessage);
        Button buttonMessage = (Button)v.findViewById(R.id.buttonMessage);
        buttonMessage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                textViewMessage.setText("Hello");
            }
        });
        return v;
    }


}
