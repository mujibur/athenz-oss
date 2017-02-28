//
// This file generated by rdl 1.4.10. Do not modify!
//

package com.yahoo.athenz.zts;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// DomainSignedPolicyData - A signed bulk transfer of policies. The data is
// signed with server's private key.
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class DomainSignedPolicyData {
    public SignedPolicyData signedPolicyData;
    public String signature;
    public String keyId;

    public DomainSignedPolicyData setSignedPolicyData(SignedPolicyData signedPolicyData) {
        this.signedPolicyData = signedPolicyData;
        return this;
    }
    public SignedPolicyData getSignedPolicyData() {
        return signedPolicyData;
    }
    public DomainSignedPolicyData setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return signature;
    }
    public DomainSignedPolicyData setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return keyId;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != DomainSignedPolicyData.class) {
                return false;
            }
            DomainSignedPolicyData a = (DomainSignedPolicyData) another;
            if (signedPolicyData == null ? a.signedPolicyData != null : !signedPolicyData.equals(a.signedPolicyData)) {
                return false;
            }
            if (signature == null ? a.signature != null : !signature.equals(a.signature)) {
                return false;
            }
            if (keyId == null ? a.keyId != null : !keyId.equals(a.keyId)) {
                return false;
            }
        }
        return true;
    }
}
