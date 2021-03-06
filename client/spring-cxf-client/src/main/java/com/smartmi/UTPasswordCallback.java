package com.smartmi;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 */

public class UTPasswordCallback implements CallbackHandler {

    private Map<String, String> passwords =
            new HashMap<String, String>();

    public UTPasswordCallback() {
        passwords.put("smartmi-sap-20170103", "6TBXearbh35BnkDkFvPskaq6");

    }

    /**
     * Here, we attempt to get the password from the private
     * alias/passwords map.
     */
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {
            WSPasswordCallback pc = (WSPasswordCallback)callbacks[i];

            String pass = passwords.get(pc.getIdentifier());
            if (pass != null) {
                pc.setPassword(pass);
                return;
            }
        }
    }

    /**
     * Add an alias/password pair to the callback mechanism.
     */
    public void setAliasPassword(String alias, String password) {
        passwords.put(alias, password);
    }
}