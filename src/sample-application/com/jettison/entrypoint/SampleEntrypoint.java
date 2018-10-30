package com.jettison.entrypoint;

import java.util.stream.Stream;

import com.jettison.entrypoint.annotations.JetDelete;
import com.jettison.entrypoint.annotations.JetEntrypoint;
import com.jettison.entrypoint.annotations.JetGet;
import com.jettison.entrypoint.annotations.JetPatch;
import com.jettison.entrypoint.annotations.JetPost;
import com.jettison.entrypoint.model.parameters.GetAllParameters;
import com.jettison.entrypoint.model.parameters.GetParameters;
import com.jettison.entrypoint.model.requests.PostRequest;
import com.jettison.entrypoint.model.responses.SampleResponse;
import com.jettison.usecase.DeleteUseCase;
import com.jettison.usecase.SampleGetAllUseCase;
import com.jettison.usecase.SampleUseCase;
import com.jettison.usecase.SaveUseCase;
import com.jettison.usecase.UpdateUseCase;

@JetEntrypoint
public interface SampleEntrypoint {
	@JetGet(useCase = SampleUseCase.class)
	public SampleResponse getResource(final GetParameters getParameters);
	
	@JetPost(useCase = SaveUseCase.class)
	public SampleResponse postResource(final PostRequest postRequest);
	
	@JetGet(useCase = SampleGetAllUseCase.class)
	public Stream<SampleResponse> getResources(final GetAllParameters getAllParameters);
	
	@JetDelete(useCase = DeleteUseCase.class)
	public void deleteResource(final GetParameters key);
	
	@JetPatch(useCase = UpdateUseCase.class)
	public SampleResponse patchResource(final PostRequest patchRequest);
}
