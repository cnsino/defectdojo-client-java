// SPDX-FileCopyrightText: the secureCodeBox authors
//
// SPDX-License-Identifier: Apache-2.0

package io.securecodebox.persistence.defectdojo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import io.securecodebox.persistence.defectdojo.config.Config;
import io.securecodebox.persistence.defectdojo.model.Response;
import io.securecodebox.persistence.defectdojo.model.TestType;

public class TestTypeService extends GenericDefectDojoService<TestType> {
  public TestTypeService(Config config) {
    super(config);
  }

  @Override
  protected String getUrlPath() {
    return "test_types";
  }

  @Override
  protected Class<TestType> getModelClass() {
    return TestType.class;
  }

  @Override
  protected Response<TestType> deserializeList(String response) throws JsonProcessingException {
    return this.objectMapper.readValue(response, new TypeReference<>() {
    });
  }
}
