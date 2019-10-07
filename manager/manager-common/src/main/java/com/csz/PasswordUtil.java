//package com.csz;
//
//
//import com.csz.entity.User;
//import org.apache.shiro.crypto.RandomNumberGenerator;
//import org.apache.shiro.crypto.SecureRandomNumberGenerator;
//import org.apache.shiro.crypto.hash.SimpleHash;
//import org.apache.shiro.util.ByteSource;
//
///**
// * @Auther: 无聊的人
// * @Date: 2019/9/29
// * @Description: com.csz
// */
//public class PasswordUtil {
//
//    private RandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
//    public static final String ALGORITHM_NAME = "md5"; // 基础散列算法
//    public static final int HASH_ITERATIONS = 1024; // 自定义散列次数
//
//    public static void encryptPassword(User user) {
//
//        user.setSalt(SequenceGeneratorUtil.sequenceGenerator(12).toString());
//        //  加密算法   密码   盐值  加密次数
//        String newPassword = new SimpleHash(ALGORITHM_NAME, user.getPassword(),
//                ByteSource.Util.bytes(user.getSalt()), HASH_ITERATIONS).toHex();
//        user.setPassword(newPassword);
//    }
//
//}
