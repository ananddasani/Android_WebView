# Android_WebView
Converting Website into Android App

# Code

#### 1st Activity 
```
WebView webView;

webView = findViewById(R.id.webView);

        //enable JS
        webView.getSettings().setJavaScriptEnabled(true);

        //Handle Event (Don't let app go outside and open any further links in browser)
        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://github.com/ananddasani");

        //open element from the assets
//        webView.loadUrl("file:///android_assets/privacyPolicy.html");


    //Enable Back press in webView
    @Override
    public void onBackPressed() {

        //Move back in web view only (if any)
        if (webView.canGoBack())
            webView.goBack();
        else
            super.onBackPressed(); // else exit from the app
    }
```

# App Highlight

<img src="app_images/WebView Code.png" /><br>

<img src="app_images/WebView App.png" width="300" /> <img src="app_images/Enable_Disable Button App2.png" width="300" /><br>
