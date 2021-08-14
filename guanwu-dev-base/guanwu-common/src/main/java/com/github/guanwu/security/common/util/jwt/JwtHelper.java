package com.github.guanwu.security.common.util.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.guanwu.security.common.constant.CommonConstants;
import com.github.guanwu.security.common.util.StringHelper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;

/**
 * @author guanwu
 * @created on 2021-08-10 12:05:23
 **/
public class JwtHelper {

    private static RsaKeyHelper rsaKeyHelper = new RsaKeyHelper();

    /**
     * 秘钥加密token
     * @param info
     * @param priKeyPath
     * @param expire
     * @return
     * @throws Exception
     */
    public static String generateToken(IJWTInfo info, String priKeyPath, int expire) throws Exception {
        String compactJws = Jwts.builder()
                .setSubject(info.getUniqueName())
                .claim(CommonConstants.JWT_KEY_USER_ID, info.getId())
                .claim(CommonConstants.JWT_KEY_NAME, info.getName())
                .setExpiration(DateTime.now().plusSeconds(expire).toDate())
                .signWith(SignatureAlgorithm.RS256,
                        rsaKeyHelper.getPrivateKey(priKeyPath))
                .compact();
        return compactJws;
    }

    public static String generateToken(IJWTInfo info, byte priKey[], int expire) throws Exception {
        String compactJws = Jwts.builder()
                .setSubject(info.getUniqueName())
                .claim(CommonConstants.JWT_KEY_USER_ID, info.getId())
                .claim(CommonConstants.JWT_KEY_NAME, info.getName())
                .claim(CommonConstants.JWT_ID, info.getTokenId())
                .setExpiration(DateTime.now().plusSeconds(expire).toDate())
                .signWith(SignatureAlgorithm.RS256, rsaKeyHelper.getPrivateKey(priKey))
                .compact();
        return compactJws;
    }

    public static Jws<Claims> parseToken(String token, String publicKeyPath) throws Exception {
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(rsaKeyHelper.getPublicKey(publicKeyPath)).
                parseClaimsJws(token);
        return claimsJws;
    }

    /**
     * 公钥解析token
     * @param token
     * @param pubKey
     * @return
     * @throws Exception
     */
    public static Jws<Claims> parseToken(String token, byte[]pubKey) throws Exception {
        Jws<Claims> claimsJws = Jwts.parser().setSigningKey(rsaKeyHelper.getPublicKey(pubKey))
                .parseClaimsJws(token);
        return claimsJws;
    }

    /**
     * 获取token中的用户信息
     * @param token
     * @param pubKeyPath
     * @return
     * @throws Exception
     */
    public static IJWTInfo getInfoFromToken(String token, String pubKeyPath) throws Exception {
        Jws<Claims> claimsJws = parseToken(token, pubKeyPath);
        Claims body = claimsJws.getBody();
        return new JWTInfo(body.getSubject(), StringHelper.getObjectValue(body.get(CommonConstants.JWT_KEY_USER_ID)),
                StringHelper.getObjectValue(body.get(CommonConstants.JWT_KEY_NAME)));
    }

    /**
     * 获取token中的用户信息
     * @param token
     * @param byteKey
     * @return
     * @throws Exception
     */
    public static IJWTInfo getInfoFromToken(String token, byte[]byteKey) throws Exception {
        if (StringUtils.startsWith(token, "Bearer")) {
            token = token.replace("Bearer ", "");
        }
        Jws<Claims> claimsJws = parseToken(token, byteKey);
        Claims body = claimsJws.getBody();
        return new JWTInfo(body.getSubject(), StringHelper.getObjectValue(body.get(CommonConstants.JWT_KEY_USER_ID)),
                StringHelper.getObjectValue(body.get(CommonConstants.JWT_KEY_NAME)));
    }


    public static void main(String[] args) throws Exception {
        JWTInfo jwtInfo = new JWTInfo("guanwu", "12", "wangguanwu", "123");
     //   RsaKeyHelper.generateKey("publicKey", "com/github/guanwu/security/common/util/jwt/priKey", "haha");
        System.out.println(JwtHelper.class.getClassLoader().getResourceAsStream("priKey"));

        String token = generateToken(jwtInfo, "priKey", 2000);
        System.out.println(token);
        ObjectMapper objectMapper = new ObjectMapper();
        Jws<Claims> claimsJws = parseToken(token, "publicKey");
        System.out.println(claimsJws);
        String s = objectMapper.writeValueAsString(claimsJws);
        System.out.println(s);
    }
}
