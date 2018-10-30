package com.jettison.usecase;

import java.util.Arrays;
import java.util.List;

import com.jettison.domain.SampleDomainEntity;

public class SampleGetAllUseCase {
	final List<SampleDomainEntity> get(final SampleDomainEntity domain) {
		return Arrays.asList(domain);
	}
}
