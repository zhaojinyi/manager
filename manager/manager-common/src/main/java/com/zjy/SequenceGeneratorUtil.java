//package com.csz;
//
//import java.util.Random;
//
///**
// * @Auther: 无聊的人
// * @Date: 2019/9/29
// * @Description: com.zjy
// */
//public class SequenceGeneratorUtil {
//
//    /** 用于随机选的数字 */
//    private static final String BASE_NUMBER = "0123456789";
//    /** 用于随机选的小写字符 */
//    private static final String BASE_CHAR_LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
//    /** 用于随机选的大寫字符 */
//    private static final String BASE_CHAR_UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    /** 用于随机选的字符和数字 */
//    private static final String BASE_CHAR_NUMBER = BASE_CHAR_LOWERCASE + BASE_NUMBER + BASE_CHAR_UPPERCASE;
//
//    public static StringBuffer sequenceGenerator(int length) {
//        Random random=new Random();
//        StringBuffer sb=new StringBuffer();
//        for(int i=0;i<12;i++){
//            int number=random.nextInt(62);
//            sb.append(BASE_CHAR_NUMBER.charAt(number));
//        }
//        return sb;
//    }
//
//}
