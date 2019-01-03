package cn.zachary.addkey;

/**
 * ┌───┐ ┌───┬───┬───┬───┐ ┌───┬───┬───┬───┐ ┌───┬───┬───┬───┐ ┌───┬───┬───┐
 * │Esc│ │ F1│ F2│ F3│ F4│ │ F5│ F6│ F7│ F8│ │ F9│F10│F11│F12│ │P/S│S L│P/B│ ┌┐    ┌┐    ┌┐
 * └───┘ └───┴───┴───┴───┘ └───┴───┴───┴───┘ └───┴───┴───┴───┘ └───┴───┴───┘ └┘    └┘    └┘
 * ┌──┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───┬───────┐┌───┬───┬───┐┌───┬───┬───┬───┐
 * │~`│! 1│@ 2│# 3│$ 4│% 5│^ 6│& 7│* 8│( 9│) 0│_ -│+ =│ BacSp ││Ins│Hom│PUp││N L│ / │ * │ - │
 * ├──┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─────┤├───┼───┼───┤├───┼───┼───┼───┤
 * │Tab │ Q │ W │ E │ R │ T │ Y │ U │ I │ O │ P │{ [│} ]│ | \ ││Del│End│PDn││ 7 │ 8 │ 9 │   │
 * ├────┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴┬──┴─────┤└───┴───┴───┘├───┼───┼───┤ + │
 * │Caps │ A │ S │ D │ F │ G │ H │ J │ K │ L │: ;│" '│ Enter  │             │ 4 │ 5 │ 6 │   │
 * ├─────┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴─┬─┴────────┤    ┌───┐    ├───┼───┼───┼───┤
 * │Shift  │ Z │ X │ C │ V │ B │ N │ M │< ,│> .│? /│  Shift   │    │ ↑ │    │ 1 │ 2 │ 3 │   │
 * ├────┬──┴─┬─┴──┬┴───┴───┴───┴───┴───┴──┬┴───┼───┴┬────┬────┤┌───┼───┼───┐├───┴───┼───┤ E││
 * │Ctrl│Zhou│Alt │         Space         │ Alt│ Li │Feng│Ctrl││ ← │ ↓ │ → ││   0   │ . │←─┘│
 * └────┴────┴────┴───────────────────────┴────┴────┴────┴────┘└───┴───┴───┘└───────┴───┴───┘
 * <p>
 * Author: Zachary46
 * Time: 2018/12/20
 */

/**
 * Created by zachary on 2018/12/20.
 */
import android.os.Build;
import android.support.annotation.RequiresApi;

import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;


/**
 * 签名处理工具类
 *
 * @author haojinlong
 *
 */
public class MyRSAUtils {

    public static final String CHARSET = "utf-8";

    /**
     * RSA私钥签名
     *
     * @param src 客户端传过来的原始参数
     * @param priKey  我们的客户端私钥
     * @return
     * @throws Exception
     */
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String sign (String src, String priKey) {
        try {
            KeyFactory fac = KeyFactory.getInstance("RSA");
            byte[] pribyte = Base64.getDecoder().decode(priKey);
            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(pribyte);
            RSAPrivateKey privateKey = (RSAPrivateKey) fac.generatePrivate(keySpec);

            Signature sigEng = Signature.getInstance("SHA1withRSA");
            sigEng.initSign(privateKey);
            sigEng.update(src.getBytes(MyRSAUtils.CHARSET));

            byte[] signature = sigEng.sign();
            return Base64.getEncoder().encodeToString(signature);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * RSA公钥验证签名
     *
     * @param src  客户端穿过来的原始数据
     * @param sign  签名
     * @param publicKey 我们的客户端公钥
     * @return
     */
    @RequiresApi(api = Build.VERSION_CODES.O)
    public static boolean signVerify (String sign, String src, String publicKey) {
        try {
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");

            //将公钥变为一个字节数组
            byte[] encodedKey = Base64.getDecoder().decode(publicKey);
            //使用秘钥工厂生成一个公钥对象pubKey
            PublicKey pubKey = keyFactory.generatePublic(new X509EncodedKeySpec(encodedKey));

            //使用"SHA1WithRSA"算法,生成签名对象signature
            Signature signature = Signature.getInstance("SHA1WithRSA");
            signature.initVerify(pubKey);
            signature.update(src.getBytes(MyRSAUtils.CHARSET));

            boolean bverify = signature.verify(Base64.getDecoder().decode(sign));
            return bverify;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
