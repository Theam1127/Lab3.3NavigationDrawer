package my.edu.tarc.lab33navigationdrawer;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import static android.app.Activity.RESULT_OK;


public class GalleryFragment extends Fragment {
    private ImageView imageViewPhoto;
    private static final int REQUEST_PICK = 1;
    public GalleryFragment() {
        // Required empty public constructor

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_galery, container, false);
        imageViewPhoto = (ImageView)v.findViewById(R.id.imageViewPhoto);
        Button buttonGetFile = (Button)v.findViewById(R.id.buttonGetFile);
        buttonGetFile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_PICK);
                startActivityForResult(intent, REQUEST_PICK);
            }
        });

        return v;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == REQUEST_PICK && resultCode == RESULT_OK) {
            Uri uri = null;
            if(data!=null){
                uri = data.getData();
                imageViewPhoto.setImageURI(uri);
            }
        }

    }
}
