package com.example.kshitij.patentlite;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Objects;


public class HomeFragment extends Fragment {

    private View rootview;
    private int score;
    private ImageView one;
    private ImageView two;
    private ImageView three;
    private ImageView four;
    private ImageView five;
    private ImageView six;
    private ImageView pet;
    private TextView mood;

    public HomeFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootview = inflater.inflate(R.layout.fragment_home, container, false);
        score = Objects.requireNonNull(getActivity()).getIntent().getExtras().getInt("score");
        pet = rootview.findViewById(R.id.pet);
        one = rootview.findViewById(R.id.heart1);
        two = rootview.findViewById(R.id.heart2);
        three = rootview.findViewById(R.id.heart3);
        four = rootview.findViewById(R.id.heart4);
        five = rootview.findViewById(R.id.heart5);
        six = rootview.findViewById(R.id.heart6);
        mood = rootview.findViewById(R.id.mood);
        switch (score) {
            case 0:
                one.setImageResource(R.drawable.ic_heart);
                two.setImageResource(R.drawable.ic_heart);
                three.setImageResource(R.drawable.ic_heart);
                four.setImageResource(R.drawable.ic_heart);
                five.setImageResource(R.drawable.ic_heart);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_cry);
                mood.setText("Gone");
                break;
            case 100:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart);
                three.setImageResource(R.drawable.ic_heart);
                four.setImageResource(R.drawable.ic_heart);
                five.setImageResource(R.drawable.ic_heart);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_cry);
                mood.setText("Crying");
                break;
            case 200:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart2);
                three.setImageResource(R.drawable.ic_heart);
                four.setImageResource(R.drawable.ic_heart);
                five.setImageResource(R.drawable.ic_heart);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_sad);
                mood.setText("Sad");
                break;
            case 300:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart2);
                three.setImageResource(R.drawable.ic_heart2);
                four.setImageResource(R.drawable.ic_heart);
                five.setImageResource(R.drawable.ic_heart);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_wtf);
                mood.setText("Agitated");

                break;
            case 400:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart2);
                three.setImageResource(R.drawable.ic_heart2);
                four.setImageResource(R.drawable.ic_heart2);
                five.setImageResource(R.drawable.ic_heart);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_haha);
                mood.setText("Excited");
                break;
            case 500:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart2);
                three.setImageResource(R.drawable.ic_heart2);
                four.setImageResource(R.drawable.ic_heart2);
                five.setImageResource(R.drawable.ic_heart2);
                six.setImageResource(R.drawable.ic_heart);
                pet.setImageResource(R.drawable.dog_glasses);
                mood.setText("Awesome");
                break;
            case 600:
                one.setImageResource(R.drawable.ic_heart2);
                two.setImageResource(R.drawable.ic_heart2);
                three.setImageResource(R.drawable.ic_heart2);
                four.setImageResource(R.drawable.ic_heart2);
                five.setImageResource(R.drawable.ic_heart2);
                six.setImageResource(R.drawable.ic_heart2);
                pet.setImageResource(R.drawable.dog_love);
                mood.setText("Happy");
                break;

        }
        return rootview;
    }

}
