package com.example.task8_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class ExampleOne extends AppCompatActivity implements MiddleFragment.FragmentController, LeftFragment.Counter{

    FragmentManager fragmentManager;
    LeftFragment leftFragment;
    RightFragment rightFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_one);
        leftFragment = new LeftFragment();
        rightFragment = new RightFragment();
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.left_fragment_container, leftFragment, "leftfragment")
                .add(R.id.middle_fragment_container, MiddleFragment.class, null)
                .add(R.id.right_fragment_container, rightFragment, "rightfragment").commit();
    }

    @Override
    public void hideFragment(int i) {
        switch (i) {
            case R.id.checkBoxHideFragment1: {
                fragmentManager.beginTransaction().hide(leftFragment).commit();
                break;
            }
            case R.id.checkBoxHideFragment2: {
                fragmentManager.beginTransaction().hide(rightFragment).commit();
                break;
            }
        }
    }

    @Override
    public void showFragment(int i) {
        switch (i) {
            case R.id.checkBoxHideFragment1: {
                fragmentManager.beginTransaction().show(leftFragment).commit();
                break;
            }
            case R.id.checkBoxHideFragment2: {
                fragmentManager.beginTransaction().show(rightFragment).commit();
                break;
            }
        }
    }


    @Override
    public void inc() {
        rightFragment.inc();
    }

    @Override
    public void dec() {
        rightFragment.dec();
    }
}