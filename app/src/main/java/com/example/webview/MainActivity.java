package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);

        //enable JS
        webView.getSettings().setJavaScriptEnabled(true);

        //Handle Event (Don't let app go outside and open any further links in browser)
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://github.com/ananddasani");

        //open element from the assets
//        webView.loadUrl("file:///android_assets/privacyPolicy.html");
    }

    //Enable Back press in webView
    @Override
    public void onBackPressed() {

        //Move back in web view only (if any)
        if (webView.canGoBack())
            webView.goBack();
        else
            super.onBackPressed(); // else exit from the app
    }
}