/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class DeleteSignatureRequest extends RpcAcsRequest<DeleteSignatureResponse> {
	
	public DeleteSignatureRequest() {
		super("CloudAPI", "2016-07-14", "DeleteSignature", "apigateway");
	}

	private String signatureId;

	public String getSignatureId() {
		return this.signatureId;
	}

	public void setSignatureId(String signatureId) {
		this.signatureId = signatureId;
		putQueryParameter("SignatureId", signatureId);
	}

	@Override
	public Class<DeleteSignatureResponse> getResponseClass() {
		return DeleteSignatureResponse.class;
	}

}
