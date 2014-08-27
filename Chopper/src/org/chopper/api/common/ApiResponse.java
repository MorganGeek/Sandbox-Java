package org.chopper.api.common;

import org.chopper.api.common.types.ResultStatus;

public interface ApiResponse<ApiResponseType> {

	public ResultStatus getStatus();
}
