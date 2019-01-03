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
//理论上用一对秘钥就好了，不嫌烦可以用两队
public class Constans {
    //服务端私钥
    public static final String SERVER_PRIVATE_KEY="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDrs57RV50ZdTvy" +
            "8cfzaYFlWrB+/6qxbtEGlf7UwXi3JiGYXRppZz2HsX+mlNe9L5hBJ1htTrfTYJQN" +
            "TqDD8GZPW5L1FbtQBdAw7qJKTzjUNYmr5ek3BuSUcG6LLiDx6NOfSreXp0wGk6Md" +
            "TZC8TKknixrRAyH1ny4UW/e/iowpfUBVNbi2Ol2UqN7+fiKA95x142VMQg88Gp1c" +
            "gG6eu648RzIr3qF4tp8pwSwixU1DI6Ow09YC3Lx79OwV8umbZ0e6qt4htT6219kV" +
            "y+KxshdlnJtTvZIXYatZcYFukDBU1gupYfSd0SVT+BYwjvtBFMVefLQw0VU+kfhV" +
            "niHf2PHfAgMBAAECggEANItccmrHuO8rqCNCYf85O3EWO5mfYeLEcmVp4+Almx7D" +
            "CoZm5ux/CQsG3An+dkxv8sZkrimITXUQTE8lA8lJ5ZMSldR8Z4CEQwRP5aT3lEdD" +
            "I7EjZoMA3h6aZiioa4Vt9+reNs6y4hxzloq+I1wrsYcPOV0rauhLi3pdJrQqPu0h" +
            "rn2/xMLX+Yjn2owaPBXfSDpSO/U2IEHUZuOelxBG9yikfcRlV25WD7Wb6p9cW9n2" +
            "kdAd4IqFVkCmbc6M5umM7M2QS26p1HJEf0T7uEniEKX4wyLGc7B0X2Zz8AwJy37M" +
            "4RAQ4XMx/btUPabP0vbNGpjfYFzABdYmcfwMoOmHgQKBgQD2olSAWhhu9K5GtI4M" +
            "WN2H4ZQHvU7XPpjfPb+oFZbkr5neL1cE80fWfCDuL66J6AmGrBTfufhTMsciqnWx" +
            "R0v6qMaSYAapy9jHHEPftrc09RWV5p/oZo4/18+SBIVsdv+bLmbpAatlDffsIRX1" +
            "DP87MmqXeEvOVjqZwzef5v8m/wKBgQD0pwJ5Cwdj+3bxhYyd2Hqan20TOWGShP1V" +
            "QSGc0iBNFNTvOfJ6SSlwk1ktplqpgcAcmhfyCGdFAFJTha9tJmaUWBzEtnNwhbdR" +
            "Tuilonbvkmownd7wwLhdUN8HhB2WNjWdGCx1hdubUf9tyMUChxf05KaGrHbNMlEy" +
            "V+cKRz4VIQKBgF02cttjsbJVtXwxhzIxb+CIKAtYx/BfzyUoUEQ1jKb3mx63I5tS" +
            "Wwc8OLHswXmLgfYtGWKJBcpj+ZEnfX235YZhvVLbCgmoalCuZRSrGMjiC/twg2Ux" +
            "RXfpl6CnJsocm3RJ8EkGAYIa6mWLB6Jq/BeicVi39WaRfmpYtrAvfKV/AoGBAJYQ" +
            "hwTGDg925Ft7Jmh/q5yCY75h+QaNinKr07lEbkm5mG7wpVn63G9QAmhs3LmSe8tP" +
            "fZaZLvb1HopauuMBpfQiI+tJWn/PlUVLWIqYn8mNjpMpkuEr5Spf+525nQhRUgt9" +
            "E3A23iBkaH/noWhOgxRU2AxNZ0WwMnvlzTLRxjPhAoGAUkRARX2lX79qTyp94mwd" +
            "3ScQ7CPs5q0wkvYnl9TXGfwexLenai8MpzShUg9DGNiIYxyQqJLEWuw2d6AeuJAJ" +
            "mGCzTSK9qYBwr8VkvE0wN+rlavXAEiqhuwwXVaWs2KF9/MivDIm7e9J/RrHrpkuh" +
            "7ehIW0+HLARfSY9wogR61TA=";
    //客户端私钥
    public static final String CLIENT_PRIVATE_KEY="MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQDTVOrs5HQhjn5C" +
            "8MA5Tp25k3ErGa8ZQQ01P6/0E3Hv0VuAzJJq18PjUHe8lMtllqnQXSENruFEnA+Y" +
            "rhsv5DTnMvtq39lkwj2A757ae5/b0uWaPjlv7WXJdWKnb0VLsNvBAeexzqFgxmkz" +
            "NoXMatLcuBdrjO05nY5NBYjDNC0E+AqjS1h+tw2z+WfsZbjZFqf0PyGdQqT5avMI" +
            "FlNZ7NciZrZyh4ns4xvCIQB1tSW1t9+7j+1JvayVrOA4y3IqYEVi7oiJ56EAZMRH" +
            "IiN4z4yTFS/xhhbRQYa8qAKheL1/9lyIHvm9HjeLIVvnwLDzs1lG0tJaV7bsMvJB" +
            "q+W6Fr/FAgMBAAECggEBAMjCGNKmTDQ8m3GYJ+PI7UkH6jAZnB+Pjq6RK+PgPRKn" +
            "fhejP0zEYFCndrftWjPNptBMSEQpZ9K3tpFChI1Aa4lfAzyKHoj7hVXhTLUdT8WS" +
            "WY/noMTVbyasnuWUbO30uy5lUue09dVrZzDBkOWabWpEb+s523oqVK6SnVNjU4kt" +
            "J1lEo2d863IWOB3H9P0GwjEefHia9aII2l1cefDPf4GillcGWPH9AO0QpLw40SED" +
            "MgFHvjj5wX73b8OUe01z8QFtMr7RjoZEvOdTuZfNhaLuIug5Sp1e431FGyBxKO2R" +
            "1rVXCXZWXNGWsHdJA9vYAtpBPlIpjrPUorJYOfun5NkCgYEA7XMJ2OAloaxWp7AY" +
            "CLyEmK/IuaDobO4KzZ574Y6qDToFeDauwxUbi3fT0suMWslR6HkuLTFI1ZHStQlZ" +
            "W9nP2bh+QabydjrBFE2w8DaPi4CUkkR2NRsvbZmAas/pXzBphKZn9+hXsOpBuHqi" +
            "NRRn5zstY9xns3H+fmG1GWNiYksCgYEA49eHY+NZ12eG8f1kCYRlySKPoWI5NzWx" +
            "hxP3CAnONuTHBX/DwbfSaDkwfpNU8OCN/LOXoHazpLko0YqQmBAClQJ3O8rioADt" +
            "mTXkoFVj+kLVuaK3M1aeXErl5jwbYcUddVrvc8qgw/ZHvE2wjy2kz6Xu7xcylQAy" +
            "3P8HqfjDnC8CgYEAoD52csoyGz127YvFbH/s7C4VRFD3CixLViCScdIZqPtzHYGp" +
            "xzXDdQfVB/keK1aZ1E2TgCQ2hwr2K/63M2l2//OmISBNmMRl8RHNSw9HKFoJ6fwR" +
            "2h0SkOB67ZqKYBcH3uF+YKuIIni1CY6ZUUEILeCd7TqdMVjI6vl9gjiz+KkCgYBo" +
            "miLGcTJl+lmx76tl0ysH1J4scXPjLPt8EGZxgk7yVMYqeCXfYg1vXBIvimSM0gtd" +
            "4PXT7as8DOX4ja0kovUMhD1JbjPtUX/Dv0JfedSUqOqGd3W0VCgQJzK1KRNJJ74G" +
            "iuE0P+rfDMqSYPiWQ1ZPHtc7XWMTlSvE2jEij9r+cQKBgBoALem3fk+EoHnqJtPD" +
            "e1GiNfFuNgXOo7V7xN8RbMkvvfrRwiTfAT1Gyz9zACYQwGN2EiklWARdWeTLqBAW" +
            "+08lDepKpe9iZzWT1MaXmUWtN8pNCmRJjtb8McnkEcuIfsdSCoimbL8lz/tlhgT1" +
            "XmWcfhAkbSte98tDY4qghGym";
    //服务端公钥
    public static final String SERVER_PUBLIC_KEY="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA67Oe0VedGXU78vHH82mB" +
            "ZVqwfv+qsW7RBpX+1MF4tyYhmF0aaWc9h7F/ppTXvS+YQSdYbU6302CUDU6gw/Bm" +
            "T1uS9RW7UAXQMO6iSk841DWJq+XpNwbklHBuiy4g8ejTn0q3l6dMBpOjHU2QvEyp" +
            "J4sa0QMh9Z8uFFv3v4qMKX1AVTW4tjpdlKje/n4igPecdeNlTEIPPBqdXIBunruu" +
            "PEcyK96heLafKcEsIsVNQyOjsNPWAty8e/TsFfLpm2dHuqreIbU+ttfZFcvisbIX" +
            "ZZybU72SF2GrWXGBbpAwVNYLqWH0ndElU/gWMI77QRTFXny0MNFVPpH4VZ4h39jx" +
            "3wIDAQAB";
    //客户端公钥
    public static final String CLIENT_PUBLIC_KEY="MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA01Tq7OR0IY5+QvDAOU6d" +
            "uZNxKxmvGUENNT+v9BNx79FbgMySatfD41B3vJTLZZap0F0hDa7hRJwPmK4bL+Q0" +
            "5zL7at/ZZMI9gO+e2nuf29Llmj45b+1lyXVip29FS7DbwQHnsc6hYMZpMzaFzGrS" +
            "3LgXa4ztOZ2OTQWIwzQtBPgKo0tYfrcNs/ln7GW42Ran9D8hnUKk+WrzCBZTWezX" +
            "Ima2coeJ7OMbwiEAdbUltbffu4/tSb2slazgOMtyKmBFYu6IieehAGTERyIjeM+M" +
            "kxUv8YYW0UGGvKgCoXi9f/ZciB75vR43iyFb58Cw87NZRtLSWle27DLyQavluha/" +
            "xQIDAQAB";
}
