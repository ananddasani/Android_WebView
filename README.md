# Android_WebView
Converting Website into Android App

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

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

![WebView App](https://user-images.githubusercontent.com/74413402/192093198-b1382fbd-c1c5-44c1-a230-92a0434c554c.png)
![WebView Code](https://user-images.githubusercontent.com/74413402/192093202-3c48b69a-e3f3-4cb0-abd5-1d4d7e5e973e.png)

