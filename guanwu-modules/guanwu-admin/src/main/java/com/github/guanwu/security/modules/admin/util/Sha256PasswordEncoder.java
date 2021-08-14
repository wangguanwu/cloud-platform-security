package com.github.guanwu.security.modules.admin.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;

/**
 * @author guanwu
 * @created on 2021-08-10 22:40:17
 **/
public class Sha256PasswordEncoder implements PasswordEncoder {

    private static final Sha256PasswordEncoder instance = new Sha256PasswordEncoder();

    public static Sha256PasswordEncoder getInstance() {
        return instance;
    }

    public Sha256PasswordEncoder() {

    }

    @Override
    public String encode(CharSequence charSequence) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(charSequence.toString().getBytes(StandardCharsets.UTF_8));
            return new String(Base64.getEncoder().encode(digest));
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return StringUtils.equals(this.encode(charSequence.toString()), s);
    }
}
