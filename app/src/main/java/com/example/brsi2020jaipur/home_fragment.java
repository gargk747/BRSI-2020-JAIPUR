package com.example.brsi2020jaipur;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.text.TextUtils;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class home_fragment extends Fragment {

int[]images;
private ViewPager pager;
private ViewPagerAdapter adp;
private static int currentpage=0;
private static int numpage=0;
private CircleIndicator indicator;




    public home_fragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_home_fragment, container, false);


        return v;
    }


    public void clicked_text(String url){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        getView().findViewById(R.id.home_tv11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://mnit.ac.in/admin/director.php");
            }
        });
        getView().findViewById(R.id.home_tv14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("https://www.researchgate.net/profile/Ashok_Pandey5");
            }
        });
        getView().findViewById(R.id.home_tv17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("https://www.aiims.edu/en/faculty-staff.html?id=715");
            }
        });
        getView().findViewById(R.id.home_tv20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://www.institutpascal.uca.fr/index.php/en/members-gepeb?idag=496");
            }
        });
        getView().findViewById(R.id.home_tv23).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("https://www.samirkkhanal.com/");
            }
        });
        getView().findViewById(R.id.home_tv26).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://www.che.ntu.edu.tw/che/?p=379&lang=en");
            }
        });
        getView().findViewById(R.id.home_tv29).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://mnit.ac.in/dept_civil/preprofile.php");
            }
        });
        getView().findViewById(R.id.home_tv32).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://nituk.ac.in/newdir.php");
            }
        });
        getView().findViewById(R.id.home_tv35).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("https://www.linkedin.com/in/vivek-agrawal-28044524/");
            }
        });
        getView().findViewById(R.id.home_tv38).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://mnit.ac.in/dept_cree/preprofile.php");
            }
        });
        getView().findViewById(R.id.image_11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://mnit.ac.in/");
            }
        });
        getView().findViewById(R.id.image_12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://www.cdcindia.org/");
            }
        });
        getView().findViewById(R.id.image_13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://www.brsi.in/");
            }
        });
        getView().findViewById(R.id.image_14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://nituk.ac.in/");
            }
        });
        getView().findViewById(R.id.image_15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://bisr.res.in/");
            }
        });
        getView().findViewById(R.id.image_16).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("https://cees-india.org/");
            }
        });
        getView().findViewById(R.id.image_17).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("https://www.ifibiop.org/");
            }
        });
        getView().findViewById(R.id.image_18).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://icwm.ac.in/");
            }
        });
        getView().findViewById(R.id.image_19).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("https://www.iswa.org/");
            }
        });
        getView().findViewById(R.id.image_20).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked_text("http://www.biotechexpressmag.com/");
            }
        });




        images= new int[]{R.mipmap.jantar_mantar,R.mipmap.jal_mahal,R.mipmap.hawa__mahal,R.mipmap.amer_fort};
        pager =(ViewPager)getView().findViewById(R.id.view_pager);
        adp=new ViewPagerAdapter(getActivity(),images);
        indicator= (CircleIndicator)getView().findViewById(R.id.indicator);
        pager.setAdapter(adp);
        indicator.setViewPager(pager);

        pager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }


            @Override
            public void onPageSelected(int i) {
                currentpage=i;
            }

            @Override
            public void onPageScrollStateChanged(int i) {
                if(i==pager.SCROLL_STATE_IDLE)
                {
                    int pagecount=images.length;
                    if(currentpage==0)
                    {
                        pager.setCurrentItem(1,true);
                    }
                    else if(currentpage==pagecount-1)
                    {
                        pager.setCurrentItem(0,true);
                    }
                }
            }
        });

        final Handler handler= new Handler();
        final Runnable update= new Runnable() {
            @Override
            public void run() {
                if(currentpage==numpage)
                {
                    currentpage=0;
                }
                pager.setCurrentItem(currentpage++,true);
            }
        };
        Timer swipe = new Timer();
        swipe.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(update);
            }
        },4000,2000);



    }




  /*public class  MyTimerTask extends TimerTask{

      @Override
      public void run() {
          home_fragment.this.getActivity().runOnUiThread(new Runnable() {
              @Override
              public void run() {
                  if(pager.getCurrentItem()==0){
                      pager.setCurrentItem(1,true);
                  }
                  else if(pager.getCurrentItem()==1){
                      pager.setCurrentItem(2,true);
                  }
                  else if(pager.getCurrentItem()==2){
                      pager.setCurrentItem(3,true);
                  }
                  else if(pager.getCurrentItem()==3){
                      pager.setCurrentItem(0,true);
                  }
              }
          });
      }
  }*/




}

