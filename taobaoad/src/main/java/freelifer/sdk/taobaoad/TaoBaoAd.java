package freelifer.sdk.taobaoad;

import freelifer.sdk.taobaoad.internal.Log.L;

/**
 * @author kzhu on 2017/11/19.
 */
public class TaoBaoAd {


    public static void init() {


    }


    public static void main(String[] args) {
        L.init("tag", true);
        L.i("hello %s", "world");
    }
}
