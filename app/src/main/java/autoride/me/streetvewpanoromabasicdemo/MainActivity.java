package autoride.me.streetvewpanoromabasicdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback;
import com.google.android.gms.maps.StreetViewPanorama;
import com.google.android.gms.maps.SupportStreetViewPanoramaFragment;
import com.google.android.gms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchBasicStreetView(View view) {
        startActivity(new Intent(this,basicStreetViewActivity.class));
    }

    public void launchEventDamo(View view) {
        startActivity(new Intent(this,EventsDemoStreetViewActivity.class));
    }

    public void launchNavigationStreetView(View view) {

        startActivity(new Intent(this,NavigationStreetViewActivity.class));
    }

    public void launchOptionStreetView(View view) {
        startActivity(new Intent(this,OptionsStreetViewActivity.class));

    }

    public void launchStreetViewWithoutFragment(View view) {
        startActivity(new Intent(this,StreetViewWitoutFragment.class));

    }
}
