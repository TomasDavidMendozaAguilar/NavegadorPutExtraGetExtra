package com.example.navegadorputextra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class navegadorwebver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navegadorwebver);
        WebView ver =(WebView)findViewById(R.id.webVer);
        ver.setWebViewClient(new navegadorwebver.visual());

        Bundle extra = getIntent().getExtras();
        String vi;
        vi = extra.getString("UrlVer");
        ver.getSettings().setLoadsImagesAutomatically(true);
        ver.getSettings().setJavaScriptEnabled(true);
        ver.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        ver.loadUrl("https://"+vi);
    }
    private class visual extends WebViewClient {
        public boolean urlVisual(WebView view, String url){
            view.loadUrl(url);
            return true;
        }
    }
}