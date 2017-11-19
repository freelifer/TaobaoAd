package freelifer.sdk.taobaoad.internal.request;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/**
 * @author kzhu on 2017/11/19.
 */
public class TaobaoHandler implements Handler.Callback {

    private HandlerThread handlerThread = null;

    public TaobaoHandler() {
        HandlerThread handlerThread = new HandlerThread("tb_internal_three");
        final Handler handler = new Handler(handlerThread.getLooper(), this);
        handlerThread.start();
    }


    public void send() {

    }

    public void onDestroy() {
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override
    public boolean handleMessage(Message msg) {
        return false;
    }
}
