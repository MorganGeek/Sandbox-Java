package org.chopper.api.senscritique;

import java.util.List;

import org.chopper.api.common.ApiResponse;
import org.chopper.api.common.types.ResultStatus;

public class SCResponse implements ApiResponse<SCResponse> {

	private ResultStatus status;
	private List<SCMovie> movies;

	public SCResponse() {
		this.status = ResultStatus.UNKNOWN;
	}

	@Override
	public ResultStatus getStatus() {
		return status;
	}
	public void setStatus(ResultStatus status) {
		this.status = status;
	}

	public List<SCMovie> getMovies() {
		return movies;
	}

	public void setMovies(List<SCMovie> movies) {
		this.movies = movies;
	}
}
