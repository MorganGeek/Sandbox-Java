package org.chopper.api.chkmv;

import org.chopper.api.common.ApiResponse;
import org.chopper.api.common.types.ResultStatus;

public class CKResponse implements ApiResponse<CKResponse> {

	private ResultStatus status;

	public CKResponse() {
		this.status = ResultStatus.UNKNOWN;
	}

	@Override
	public ResultStatus getStatus() {
		return status;
	}
}
