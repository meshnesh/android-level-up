package com.example.antonyng.level_up.home.home.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


/**
 * The type Check network connection.
 */
public final class NetworkConnection {
    /**
     * Checks network/internet connectivity state.
     * @return - true or false depending on network connectivity state
     */
    public static Boolean getConnectionStatus(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        assert connectivityManager != null;

        NetworkInfo activeNetwork = connectivityManager.getActiveNetworkInfo();
        return activeNetwork != null && activeNetwork.isConnectedOrConnecting();
    }
}
