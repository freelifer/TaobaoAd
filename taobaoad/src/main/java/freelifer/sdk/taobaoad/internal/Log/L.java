package freelifer.sdk.taobaoad.internal.Log;

import android.util.Log;

/**
 * @author kzhu on 2017/11/19.
 */
public class L {

    private static String TAG = "TaobaoAd";
    private static boolean DBG = false;

    public static void init(String tag, boolean isDebug) {
        TAG = tag;
        DBG = isDebug;
    }

    public static void i(String msg, Object... args) {
        if (!DBG) {
            return;
        }
        Log.i(TAG, String.format(msg, args));
    }

    public static void e(String msg, Object... args) {
        if (!DBG) {
            return;
        }
        Log.e(TAG, String.format(msg, args));
    }
}
