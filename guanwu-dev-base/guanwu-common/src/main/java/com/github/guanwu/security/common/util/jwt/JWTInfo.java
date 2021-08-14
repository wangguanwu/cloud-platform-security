package com.github.guanwu.security.common.util.jwt;

import com.github.guanwu.security.common.util.UUIDUtils;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author guanwu
 * @created on 2021-08-09 21:39:27
 **/
public class JWTInfo implements Serializable, IJWTInfo {

    private String userName;

    private String userId;

    private String name;

    private String tokenId;

    public JWTInfo(String userName, String userId, String name, String tokenId) {
        this.userName = userName;
        this.userId = userId;
        this.name = name;
        this.tokenId = tokenId;
    }

    public JWTInfo(String userName, String userId, String name) {
        this.userName = userName;
        this.userId = userId;
        this.name = name;
        this.tokenId = UUIDUtils.generateShortUuid();
    }

    @Override
    public String getUniqueName() {
        return this.userName;
    }

    @Override
    public String getId() {
        return userId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTokenId() {
        return tokenId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JWTInfo jwtInfo = (JWTInfo) o;
        if (!Objects.equals(userName, jwtInfo.userName)) {
            return false;
        }
        return Objects.equals(userId, jwtInfo.userId);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(userName);
        result = (result << 5) - result + Objects.hashCode(userId);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Objects.hashCode(null));
    }
}
