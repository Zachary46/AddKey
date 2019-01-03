package cn.zachary.addkey;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.StringCallback;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import okhttp3.Call;
import okhttp3.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkGo.init(this.getApplication());
        OkGo.getInstance()
                /**
                 * 打开该调试开关,打印级别INFO,并不是异常,是为了显眼,不需要就不要加入该行
                 * 最后的true表示是否打印okgo的内部异常,一般打开方便调试错误
                 */
                .debug("OkGo", Level.INFO, true)

                /**如果使用默认的3秒,以下三行也不需要传*/
                .setConnectTimeout(OkGo.DEFAULT_MILLISECONDS)/**全局的连接超时时间*/
                .setReadTimeOut(OkGo.DEFAULT_MILLISECONDS)/**全局的读取超时时间*/
                .setWriteTimeOut(OkGo.DEFAULT_MILLISECONDS)/**全局的写入超时时间*/

                /**可以全局统一设置缓存模式,默认是不使用缓存,可以不传,具体其他模式看github介绍 https://github.com/jeasonlzy*/
                .setCacheMode(CacheMode.NO_CACHE)

                /**可以全局统一设置缓存时间,默认永不过期*/
                // .setCacheTime(CacheEntity.CACHE_NEVER_EXPIRE)

                /**可以全局统一设置超时重连次数,默认为三次,那么最差的情况会请求4次(一次原始请求,三次重连请求),不需要可以设置为0*/
                .setRetryCount(0)

        /**这两行同上，不需要就不要加入
         .addCommonHeaders(headers)//设置全局公共头
         .addCommonParams(params)//设置全局公共参数*/
        ;


        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                //doPost();
                doTest();
            }
        });
    }

    private void doTest() {
        //初始化密钥
        //生成密钥对
        try {

            Map<String, Object> keyMap = RSACoder.initKey();
            //公钥
            byte[] publicKey = RSACoder.getPublicKey(keyMap);

            //私钥
            byte[] privateKey = RSACoder.getPrivateKey(keyMap);
            Log.i("Zachary","公钥：\n" + Base64.getEncoder().encodeToString(publicKey));
            Log.i("Zachary","私钥：\n" + Base64.getEncoder().encodeToString(privateKey));

            Log.i("Zachary","================密钥对构造完毕,甲方将公钥公布给乙方，开始进行加密数据的传输=============");
            String str = "RSA密码交换算法";
            Log.i("Zachary","\n===========甲方向乙方发送加密数据==============");
            Log.i("Zachary","原文:" + str);
            //甲方进行数据的加密
            byte[] code1 = RSACoder.encryptByPrivateKey(str.getBytes(), privateKey);
            Log.i("Zachary","加密后的数据：" + Base64.getEncoder().encodeToString(code1));
            Log.i("Zachary","===========乙方使用甲方提供的公钥对数据进行解密==============");
            //乙方进行数据的解密
            byte[] decode1 = RSACoder.decryptByPublicKey(code1, publicKey);
            Log.i("Zachary","乙方解密后的数据：" + new String(decode1) + "\n\n");

            Log.i("Zachary","===========反向进行操作，乙方向甲方发送数据==============\n\n");

            str = "乙方向甲方发送数据RSA算法";

            Log.i("Zachary","原文:" + str);

            //乙方使用公钥对数据进行加密
            byte[] code2 = RSACoder.encryptByPublicKey(str.getBytes(), publicKey);
            Log.i("Zachary","===========乙方使用公钥对数据进行加密==============");
            Log.i("Zachary","加密后的数据：" + Base64.getEncoder().encodeToString(code2));

            Log.i("Zachary","=============乙方将数据传送给甲方======================");
            Log.i("Zachary","===========甲方使用私钥对数据进行解密==============");

            //甲方使用私钥对数据进行解密
            byte[] decode2 = RSACoder.decryptByPrivateKey(code2, privateKey);

            Log.i("Zachary","甲方解密后的数据：" + new String(decode2));

        } catch (Exception e) {

        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void doPost() {
        //封装参数
        Map<String, String> paramMap = new ConcurrentHashMap<String, String>();
        paramMap.put("name", "zhoulifeng666");
        paramMap.put("password", "123456");

        //生成客户端签名,注意看,客户端这里生成签名的时候是使用的客户端私钥Constans.CLIENT_PRIVATE_KEY
        String sign = MyRSAUtils.sign(SignUtils.generateSortSign(paramMap), Constans.CLIENT_PRIVATE_KEY);
        Log.i("Zachary", "=====sign======" + sign);
        if (sign != null)
            paramMap.put("sign", sign);

        OkGo.post("http://192.168.10.183:8080/test")
                .params(paramMap, false)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(String s, Call call, Response response) {
                        Log.i("Zachary", "===========" + s);
                    }
                });
    }
}
