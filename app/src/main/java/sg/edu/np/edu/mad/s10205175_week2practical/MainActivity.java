package sg.edu.np.edu.mad.s10205175_week2practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        if(user1.followed == false)
        {
            user1.followed = true;
        }
        else
        {
            user1.followed = false;
        }
        followstatus(user1,followbutton);
    }
};
public class userclass initial(
        {
        userclass initialization = new userclass("name","description",0,false);
        return initialization;
        };

public void followstatus (User userclass, Button button)
        {
        TextView txt = button;
        if(user.followed == false)
        {
        txt.setText("Follow");
        }
        else
        {
        txt.setText("Unfollow");
        }
        }




