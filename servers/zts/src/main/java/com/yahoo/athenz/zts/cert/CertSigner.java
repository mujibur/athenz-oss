/**
 * Copyright 2016 Yahoo Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.yahoo.athenz.zts.cert;

public interface CertSigner {

    /**
     * Generate a signed X509 Certificate based on the given request. The
     * signer imposes how long the certificate is valid for. The result
     * must be the certificate in PEM format.
     * @param csr Certificate request
     * @return X509 Certificate in PEM format
     */
    String generateX509Certificate(String csr);

    /**
     * Retrieve the CA certificate in PEM format. This will be returned
     * along with the x509 certificate back to the client.
     * @return the CA Certificate in PEM format
     */
    String getCACertificate();

    /**
     * Close the certSigner signer object and release all
     * allocated resources (if any)
     */
    default void close() {
    }
}
