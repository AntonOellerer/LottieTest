package com.example.aoellerer.lottietest;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtons();


        setAnimation1();
    }

    private void setButtons() {
        setButton1();
        setButton2();
        setButton3();
        setButton4();
        setButton5();
    }

    private void setButton1() {
        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAnimation1();
            }
        });
    }

    private void setButton2() {
        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAnimation2();
            }
        });
    }

    private void setButton3() {
        findViewById(R.id.btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAnimation3();
            }
        });
    }

    private void setButton4() {
        findViewById(R.id.btn_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAnimation4();
            }
        });
    }

    private void setButton5() {
        findViewById(R.id.btn_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setAnimation5();
            }
        });
    }

    private void setAnimation1() {
        final LottieAnimationView animationView = this.findViewById(R.id.animation_view);
        animationView.setAnimation(R.raw.setting_pins);
        animationView.setMinFrame(0);
        animationView.setMaxFrame(100);
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                animationView.setMinFrame(60);
            }
        });
        animationView.setRepeatMode(LottieDrawable.REVERSE);
    }

    private void setAnimation2() {
        final LottieAnimationView animationView = this.findViewById(R.id.animation_view);
        animationView.setAnimation(R.raw.together);
        animationView.setMinFrame(0);
        animationView.setMaxFrame(148);
        animationView.setRepeatMode(LottieDrawable.REVERSE);
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                animationView.setMinFrame(135);
            }
        });
        animationView.playAnimation();
    }

    private void setAnimation3() {
        final LottieAnimationView animationView = this.findViewById(R.id.animation_view);
        animationView.setAnimation(R.raw.save_time);
        animationView.setMinFrame(0);
        animationView.setMaxFrame(108);
        animationView.setRepeatMode(LottieDrawable.REVERSE);
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                animationView.setMinFrame(100);
            }
        });
        animationView.playAnimation();
    }

    private void setAnimation4() {
        final LottieAnimationView animationView = this.findViewById(R.id.animation_view);
        animationView.setAnimation(R.raw.proofs);
        animationView.setMinFrame(0);
        animationView.setMaxFrame(100);
        animationView.setRepeatMode(LottieDrawable.RESTART);
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                animationView.setMinFrame(40);
            }
        });
        animationView.playAnimation();
    }

    private void setAnimation5() {
        final LottieAnimationView animationView = this.findViewById(R.id.animation_view);
        animationView.setAnimation(R.raw.reliable_service);
        animationView.setMinFrame(0);
        animationView.setMaxFrame(105);
        animationView.setRepeatMode(LottieDrawable.REVERSE);
        animationView.addAnimatorListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                animationView.setMinFrame(89);
            }
        });
        animationView.playAnimation();
    }
}
