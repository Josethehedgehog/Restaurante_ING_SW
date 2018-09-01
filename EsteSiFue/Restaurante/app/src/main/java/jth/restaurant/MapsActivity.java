package jth.restaurant;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng sucursal_1 = new LatLng(6.241326, -75.588001);
        LatLng sucursal_2 = new LatLng(6.241422, -75.590129);
        LatLng sucursal_3 = new LatLng(6.243052, -75.588327);
        LatLng centralPoint = new LatLng(((sucursal_1.latitude + sucursal_2.latitude + sucursal_3.latitude)/3),((sucursal_1.longitude + sucursal_2.longitude + sucursal_3.longitude)/3));
        mMap.addMarker(new MarkerOptions().position(sucursal_1).title("Sede Salida de la UPB"));
        mMap.addMarker(new MarkerOptions().position(sucursal_2).title("Sede Toscana"));
        mMap.addMarker(new MarkerOptions().position(sucursal_3).title("Sede Colegio"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(centralPoint, 17));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
    }
}
