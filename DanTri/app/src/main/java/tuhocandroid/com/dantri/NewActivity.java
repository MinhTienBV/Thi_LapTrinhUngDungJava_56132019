package tuhocandroid.com.dantri;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import tuhocandroid.com.dantri.rss.RssParser;

/**
 * Created by luongnguyen on 3/23/16.
 */
public class NewActivity extends Activity {

    WebView webview;
    String link, title, description, date;
    String detail = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.new_layout);

        webview = (WebView) findViewById(R.id.desc);
        Intent intent = getIntent();
        String duonglink;
        duonglink = getIntent().getStringExtra("link");
        webview.loadUrl(duonglink);
        webview.setWebChromeClient(new WebChromeClient());

    }

}
