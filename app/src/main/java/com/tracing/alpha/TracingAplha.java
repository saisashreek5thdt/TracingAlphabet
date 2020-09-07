package com.tracing.alpha;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class TracingAplha extends Activity {

    VideoView vid;
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracing_aplha);

        vid = (VideoView)findViewById(R.id.videoView);
        String urlpath ="android.resource://" + getPackageName() + "/" + R.raw.launcher;
        vid.setVideoURI(Uri.parse(urlpath));
        vid.start();


        mHandler.postDelayed(new Runnable() {
            public void run() {
                Intent i = new Intent(TracingAplha.this,Atrace.class);
                startActivity(i);
                finish();

            }
        }, 7000);

        startService(new Intent(getBaseContext(),MyService.class));

    }
}
