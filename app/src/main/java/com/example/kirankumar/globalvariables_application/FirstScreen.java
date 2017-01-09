package com.example.kirankumar.globalvariables_application;

/**
 * Created by kirankumar on 9/1/17.
 */

        import android.os.Bundle;
        import android.view.View;
        import android.view.View.OnClickListener;
        import android.widget.Button;
        import android.app.Activity;
        import android.content.Intent;

public class FirstScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstscreen);

        final Button secondBtn = (Button) findViewById(R.id.second);

        // Calling Application class (see application tag in AndroidManifest.xml)
        final GlobalClass globalVariable = (GlobalClass) getApplicationContext();

        //Set name and email in global/application context
        globalVariable.setName("Android Application class SAMPLE");
        globalVariable.setEmail("AndroidApplicaton@google.com");


        secondBtn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                Intent i = new Intent(getBaseContext(), SecondScreen.class);
                startActivity(i);
            }
        });
    }


}
