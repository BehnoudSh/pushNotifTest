package ir.behnoudsh.notiftest;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FirebasePushNotificationClass extends FirebaseMessagingService {

    public FirebasePushNotificationClass() {
        super();
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(() -> Toast.makeText(getApplicationContext(), remoteMessage.getData().toString(), Toast.LENGTH_LONG).show());
    }

    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
        Log.e("newToken", s);

    }
}