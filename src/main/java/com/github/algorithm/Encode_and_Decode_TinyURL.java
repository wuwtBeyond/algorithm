package com.github.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wuwentao
 * @date : 2020/4/22
 */
public class Encode_and_Decode_TinyURL {

    private Map<String, String> encode = new HashMap<>();
    private Map<String, String> decode = new HashMap<>();

    private String code = "abcdefghijklmnopqrstuvmxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private String BASE = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if (encode.containsKey(longUrl)) return encode.get(longUrl);

        String shortUrl = null;
        do {
            StringBuilder sb = new StringBuilder();
            for (int i = 0;i < 6;i ++) {
                int index = (int)(Math.random() * 62);
                sb.append(code.substring(index, index+1));
            }
            shortUrl = sb.toString();
        } while (decode.containsKey(shortUrl));

        encode.put(longUrl, shortUrl);
        decode.put(shortUrl, longUrl);

        return BASE + shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        return decode.get(shortUrl.replace(BASE,""));
    }
}
