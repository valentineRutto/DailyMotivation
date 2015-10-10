package com.example.valentine.dailymotivaiton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.twitter.sdk.android.tweetui.SearchTimeline;
import com.twitter.sdk.android.tweetui.TweetTimelineListAdapter;

public class Qoutes extends AppCompatActivity {
String tag="Qoutes";
    String SEARCH_QUERY;
    private RecyclerView mRecyclerView;
    private MyRecyclerAdapter adapter;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(tag, "onCreate");
        setContentView(R.layout.activity_qoutes);

        // Initialize recycler view
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        progressBar.setVisibility(View.VISIBLE);


        SEARCH_QUERY = getResources().getString(R.string.twitter_search);
        setUpTimeline();


    }
    private void setUpTimeline() {

        SearchTimeline searchTimeline = new SearchTimeline.Builder().query(SEARCH_QUERY).build();

        final TweetTimelineListAdapter timelineAdapter = new TweetTimelineListAdapter(this, searchTimeline);

        ListView timelineView = (ListView) findViewById(android.R.id.list);
        timelineView.setEmptyView(findViewById(R.id.empty_timeline));
        timelineView.setAdapter(timelineAdapter);

    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(tag, "onRestart");

    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(tag, "onResume");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(tag, "onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(tag, "onStop");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(tag, "onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_qoutes, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
